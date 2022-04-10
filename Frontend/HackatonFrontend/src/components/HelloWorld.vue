<template>
  <b-container fluid>
    <Register />
  </b-container>
</template>

<script>
import Register from "./Register.vue";
import axios from "axios";

export default {
  name: "HelloWorld",
  components: { Register },
};
</script>

<style scoped>
</style>
