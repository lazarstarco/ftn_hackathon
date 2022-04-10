<template>
  <b-container fluid>
    <Login />
  </b-container>
</template>

<script>
import Login from "./Login.vue";
import axios from "axios";

export default {
  name: "HelloWorld",
  components: { Login },
};
</script>

<style scoped>
</style>
