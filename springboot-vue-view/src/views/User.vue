<template>
    <div>
        <el-table
                :data="users"
                style="width: 100%">
            <el-table-column
                    prop="username"
                    label="昵称"
                    width="180">
            </el-table-column>
            <el-table-column
                    prop="age"
                    label="年龄"
                    width="180">
            </el-table-column>

            <el-table-column
                    prop="email"
                    label="邮箱">
            </el-table-column>
        </el-table>
        <el-pagination
                       background
                       layout="prev, pager, next"
                       :current-page="currentPage"
                       :page-size="pageSize"
                       :total="total"
                       @current-change=page>
        </el-pagination>
    </div>

</template>

<script>
    export default {
        name:'User',
        data() {
            return {
                users: [],
                currentPage: 1,
                total: 0,
                pageSize: 5
            }
        },
        methods: {
            page(currentPage) {
                const _this = this
                _this.$axios.get("http://localhost:8081/user/list?currentPage=" + currentPage).then(res => {
                    console.log(res)
                    _this.users = res.data.data.records
                    _this.currentPage = res.data.data.current
                    _this.total = res.data.data.total
                    _this.pageSize = res.data.data.size

                })
            }
        },
        created() {
            this.page(1)
        }
    }
</script>