<!--<template>-->
<!--  <div id="app">-->

<!--    <HelloWorld/>-->


<!--  </div>-->
<!--</template>-->

<!--<script>-->
<!--import HelloWorld from './components/HelloWorld'-->



<!--export default {-->
<!--  name: 'App',-->
<!--  components: {-->
<!--    HelloWorld,-->



<!--  }-->
<!--}-->
<!--</script>-->

<!--<style>-->

<!-- #app {-->
<!--  font-family: 'Avenir', Helvetica, Arial, sans-serif;-->
<!--  -webkit-font-smoothing: antialiased;-->
<!--   -moz-osx-font-smoothing: grayscale;-->
<!--   text-align: center;-->
<!--  color: #2c3e50;-->
<!--   margin-top: 60px;-->
<!-- }-->
<!--</style>-->



<template>
  <div id="app">
    <HelloWorld />
    <UserCustomers />
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import UserCustomers from './components/UserCustomers.vue'

export default {
  name: 'App',
  components: {
    HelloWorld,
    UserCustomers
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
