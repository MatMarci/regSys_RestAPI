<template>
  <div id="app">
    <img src="./assets/logo.png">
    <router-view/>
    <Service/>
  </div>
</template>

<script>
import Service from './components/Service.vue'

export default {
  name: 'App',
  components: {
    Service
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
