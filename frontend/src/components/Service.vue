<template>
  <div class="service">
    <h1>{{ msg }}</h1>
    <h2>REST service call results</h2>

    <button class="Search_button" @click="callRestService()">CALL Spring Boot REST backend service - Test working serwer1</button>

    <h3>Backend response: {{ response }}</h3>

  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'service',
  data () {
    return {
      msg: 'HowTo call REST-Services:',
      response: [],
      errors: []
    }
  },
  methods: {
    // Fetches posts when the component is created.
    callRestService () {
      // console.log('Before Axios.get')
      axios.get('/api/hello')
        .then(response => {
          // console.log('Before parsing')
          // JSON responses are automatically parsed.
          this.response = response.data
          console.log(response.data)
        })
        .catch(error => {
          this.errors.push(error)
        })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }
  ul {
    list-style-type: none;
    padding: 0;
  }
  li {
    display: inline-block;
    margin: 0 10px;
  }
  a {
    color: #42b983;
  }
</style>
