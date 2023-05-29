<!--<template>-->
<!--  <div>-->
<!--    <h2>修改个人信息</h2>-->
<!--    <form @submit.prevent="updateUserInfo">-->
<!--      <<template>-->
<!--      <div>-->
<!--        <h2>修改个人信息</h2>-->
<!--        <form @submit.prevent="updateUserInfo">-->
<!--          <div>-->
<!--            <label for="name">姓名：</label>-->
<!--            <input type="text" id="name" v-model="userInfo.name">-->
<!--          </div>-->
<!--          <div>-->
<!--            <label for="gender">性别：</label>-->
<!--            <input type="radio" id="gender_male" name="gender" value="male" v-model="userInfo.gender">-->
<!--            <label for="gender_male">男</label>-->
<!--            <input type="radio" id="gender_female" name="gender" value="female" v-model="userInfo.gender">-->
<!--            <label for="gender_female">女</label>-->
<!--          </div>-->
<!--          <div>-->
<!--            <label for="phone">电话：</label>-->
<!--            <input type="tel" id="phone" v-model="userInfo.phone">-->
<!--          </div>-->
<!--          <div>-->
<!--            <label for="email">邮箱：</label>-->
<!--            <input type="email" id="email" v-model="userInfo.email">-->
<!--          </div>-->
<!--          <div>-->
<!--            <label for="username">账号：</label>-->
<!--            <input type="text" id="username" v-model="userInfo.username">-->
<!--          </div>-->
<!--          <div>-->
<!--            <label for="password">登录密码：</label>-->
<!--            <input type="password" id="password" v-model="userInfo.password">-->
<!--          </div>-->
<!--          <div>-->
<!--            <label for="payPassword">支付密码：</label>-->
<!--            <input type="password" id="payPassword" v-model="userInfo.payPassword">-->
<!--          </div>-->
<!--          <button type="submit">修改信息</button>-->
<!--        </form>-->
<!--      </div>-->
<!--    </template>-->

<!--      <script>-->
<!--        export default {-->
<!--          data() {-->
<!--            return {-->
<!--              userInfo: {-->
<!--                name: '',-->
<!--                gender: '',-->
<!--                phone: '',-->
<!--                email: '',-->
<!--                username: '',-->
<!--                password: '',-->
<!--                payPassword: ''-->
<!--              }-->
<!--            };-->
<!--          },-->
<!--          methods: {-->
<!--            updateUserInfo() {-->
<!--              // 发送异步请求，请求修改个人信息-->
<!--              axios.put('/users', this.userInfo)-->
<!--                .then(response => {-->
<!--                  // 更新页面上的显示信息-->
<!--                  // ...-->
<!--                })-->
<!--                .catch(error => {-->
<!--                  console.log(error);-->
<!--                });-->
<!--            }-->
<!--          }-->
<!--        };-->
<!--      </script>-->

 
