<template>
  <div class="login-box">
    <h2>Register</h2>
    <form>
      <b-row>
        <b-col cols="6">
          <div class="user-box">
            <input type="text" name="" required="" v-model="user.name" />
            <label
              ><font-awesome-icon icon="fa-solid fa-user-astronaut" /> &nbsp;
              Name</label
            >
          </div>
        </b-col>
        <b-col cols="6">
          <div class="user-box">
            <input type="text" name="" required="" v-model="user.surname" />
            <label
              ><font-awesome-icon icon="fa-solid fa-user-astronaut" /> &nbsp;
              Surname</label
            >
          </div>
        </b-col>
      </b-row>
      <b-row>
        <b-col cols="6">
          <div class="user-box">
            <input type="text" name="" required="" v-model="user.username" />
            <label
              ><font-awesome-icon icon="fa-solid fa-user-astronaut" /> &nbsp;
              Username</label
            >
          </div>
        </b-col>
        <b-col cols="6">
          <div class="user-box">
            <input
              type="password"
              name=""
              required=""
              v-model="user.password"
            />
            <label>
              <font-awesome-icon icon="fa-solid fa-fingerprint" />&nbsp;
              Password</label
            >
          </div>
        </b-col>
      </b-row>
      <div class="user-box">
        <input type="text" name="" required="" v-model="user.email" />
        <label>
          <font-awesome-icon icon="fa-solid fa-fingerprint" />&nbsp;
          Email</label
        >
      </div>
      <div class="user-box">
        <input
          type="text"
          name=""
          required=""
          v-model="user.associatedSchool"
        />
        <label>
          <font-awesome-icon icon="fa-solid fa-fingerprint" />&nbsp; Associated
          school</label
        >
      </div>
      <div v-if="student">
        <div class="user-box">
          <input type="text" name="" required="" v-model="user.grade" />
          <label>
            <font-awesome-icon icon="fa-solid fa-fingerprint" />&nbsp;
            Grade</label
          >
        </div>
      </div>
      <b-row v-else>
        <b-col cols="6">
          <div class="user-box">
            <input type="text" name="" required="" v-model="user.title" />
            <label>
              <font-awesome-icon icon="fa-solid fa-fingerprint" />&nbsp;
              Title</label
            >
          </div>
        </b-col>
        <b-col cols="6">
          <div class="user-box">
            <input type="text" name="" required="" v-model="user.town" />
            <label>
              <font-awesome-icon icon="fa-solid fa-fingerprint" />&nbsp;
              Town</label
            >
          </div>
        </b-col>
      </b-row>
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
        <b-col cols="2"></b-col>
        <b-col cols="6">
          <router-link to="/login" class="md-dense md-primary mt-2"
            >Here by accident?</router-link
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
        name: "",
        surname: "",
        password: "",
        email: "",
        associatedSchool: "",
        grade: "",
        title: "",
        town: "",
      },
    };
  },
  methods: {
    login: async function () {
      await axios
        .post(
          `http://localhost:8082/api/v1/${
            this.student ? "students" : "teachers"
          }/register`,
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
