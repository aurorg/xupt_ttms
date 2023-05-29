<template>
  <div>
    <h1>User Customers</h1>
    <button @click="getUserCustomers">查询数据</button>
    <table v-if="userCustomers.length > 0">
      <thead>
      <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>性别</th>
        <th>电话</th>
        <th>邮箱</th>
        <th>UID</th>
        <th>密码</th>
        <th>支付密码</th>
        <th>余额</th>
        <th>状态</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="(userCustomer, index) in userCustomers" :key="index">
        <td>{{ userCustomer.cusId }}</td>
        <td>{{ userCustomer.cusName }}</td>
        <td>{{ userCustomer.cusGender }}</td>
        <td>{{ userCustomer.cusTelnum }}</td>
        <td>{{ userCustomer.cusEmail }}</td>
        <td>{{ userCustomer.cusUid }}</td>
        <td>{{ userCustomer.cusPwd }}</td>
        <td>{{ userCustomer.cusPayPwd }}</td>
        <td>{{ userCustomer.cusBalance }}</td>
        <td>{{ userCustomer.cusStatus }}</td>
      </tr>
      </tbody>
    </table>
    <p v-else>暂无数据</p>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      userCustomers: []
    };
  },
  methods: {
    getUserCustomers() {
      console.log('开始获取用户数据...');
      axios.get('http://localhost:8888/usercustomersget')
        .then(response => {
          console.log('用户数据获取成功：', response.data.data);
          this.userCustomers = response.data.data;
        })
        .catch(error => {
          console.log('用户数据获取失败：', error);
        });
    }
  },
  created() {
    console.log('组件已加载。');
    this.getUserCustomers();
  }
};
</script>
