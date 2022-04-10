<template>
  <div class="login-box">
    <h2>Login</h2>
    <form>
      <div class="user-box">
        <input type="text" name="" required="" v-model="user.username" />
        <label
          ><font-awesome-icon icon="fa-solid fa-user-astronaut" /> &nbsp;
          Username</label
        >
      </div>
      <div class="user-box">
        <input type="password" name="" required="" v-model="user.password" />
        <label>
          <font-awesome-icon icon="fa-solid fa-fingerprint" />&nbsp;
          Password</label
        >
      </div>
      <b-row>
        <b-col cols="4">
          <md-switch
            v-model="student"
            class="md-primary isTeacher"
            @click="isTeacher"
          >
            {{ student ? "Student" : "Teacher" }}
          </md-switch>
        </b-col>
        <b-col cols="3"></b-col>
        <b-col cols="5">
          <md-button class="md-dense md-primary mt-2" @click="fun()"
            >No account?</md-button
          >
        </b-col>
      </b-row>
      <a @click="login()" href="#">
        <span></span>
        <span></span>
        <span></span>
        <span></span>
        Submit
      </a>
    </form>
  </div>
</template>

<script>
import axios from "axios";
import "../style/form.css";

export default {
  name: "Login",
  data() {
    return {
      student: true,
      user: {
        username: "",
        password: "",
      },
    };
  },
  methods: {
    login: async function () {
      await axios
        .post(
          `http://localhost:8082/api/v1/${
            this.student ? "students" : "teachers"
          }/login`,
          this.user
        )
        .then((response) => console.log(response));
    },
    isTeacher: function () {
      student = !student;
    },
  },
};
</script>

<style scoped>
</style>
