<template>
  <b-container fluid>
    <Answers />
    <b-button @click="onClick()"> Click for Axios </b-button>
  </b-container>
</template>

<script>
import Answers from "./Answers.vue";
import axios from "axios";

export default {
  name: "HelloWorld",
  components: { Answers },
  methods: {
    onClick: async function () {
      const data = {
        username: "simkord",
        password: "1234",
      };
      await axios
        .post("localhost:8082/api/v1/students/login", data)
        .then((response) => console.log(response.statusCode));
    },
  },
};
</script>

<style scoped>
</style>
