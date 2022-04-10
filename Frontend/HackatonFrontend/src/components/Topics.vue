<template>
  <div>
    <h1>Topics</h1>
    <div class="custom-row">
      <Topic
        v-for="topicc in topics"
        :topic="topicc.topicName"
        :order="topicc.id"
      />
    </div>
  </div>
</template>

<script>
import axios from "axios";
import Topic from "./Topic.vue";

import "../style/background.css";

export default {
  data() {
    return {
      topics: [],
    };
  },
  components: {
    Topic,
  },
  async mounted() {
    await axios.get("http://localhost:8082/api/v1/topics").then((response) => {
      this.topics = response.data;
    });
  },
};
</script>

<style scoped>
h1 {
  font-family: Lato;
  color: white;
  text-align: center;
  padding: 2rem;
  font-weight: 600;
  font-size: 4rem;
}

.custom-row {
  margin: auto;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-evenly;
  width: 75rem;
}
</style>