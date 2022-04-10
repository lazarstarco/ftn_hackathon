<template>
  <div>
    <h1>Topics</h1>
    <div class="custom-row">
      <Topic topic="History" order="1" />
      <Topic topic="Maths" order="2" />
      <Topic topic="Science" order="3" />
      <Topic topic="Chemistry" order="4" />
      <Topic topic="Language" order="5" />
      <Topic topic="PE" order="6" />
    </div>
  </div>
</template>

<script>
import Topic from "./Topic.vue";

export default {
  components: {
    Topic,
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