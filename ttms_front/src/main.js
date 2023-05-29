// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
// import Vue from 'vue'
// import App from './App'
//
// Vue.config.productionTip = false
//
// /* eslint-disable no-new */
// new Vue({
//   el: '#app',
//   components: { App },
//   template: '<App/>'
// })


import Vue from 'vue'
import App from './App.vue'
import UserCustomers from './components/UserCustomers.vue' // 导入UserCustomers组件

Vue.config.productionTip = false

Vue.component('user-customers', UserCustomers) // 注册UserCustomers组件

new Vue({
  el: '#app',
  components: { App },
  template: '<App/>'
})




