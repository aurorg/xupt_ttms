<template>
    <div>
        <h1>欢迎来到登录界面</h1>
        <form @submit.prevent="login">
            <label for="student_number">学号:</label>
            <input type="text" id="student_number" v-model="studentNumber">
            <br>
            <label for="pwd">密码:</label>
            <input type="password" id="pwd" v-model="password">
            <br>
            <button type="submit">登录</button>
            <button type="button" @click="register">注册</button>
        </form>
    </div>
</template>

<script>
import axios from 'axios';

export default {
    name: 'Login',
    data() {
        return {
            studentNumber: '',
            password: ''
        };
    },
    methods: {
        login() {
            axios.post('/api/login', { student_number: this.studentNumber, pwd: this.password })
                .then(response => {
                    console.log(response.data);
                    // 处理登录成功的逻辑
                })
                .catch(error => {
                    console.error(error);
                    // 处理登录失败的逻辑
                });
        },
        register() {
            axios.post('/api/register', { student_number: this.studentNumber, pwd: this.password })
                .then(response => {
                    console.log(response.data);
                    // 处理注册成功的逻辑
                })
                .catch(error => {
                    console.error(error);
                    // 处理注册失败的逻辑
                });
        }
    }
};
</script>

<style scoped>
/* 可选的样式定义 */
</style>