<template>
  <b-col cols="12">
    <b-button pill variant="outline-secondary" class="my-2 answer">
      <b-row>
        <b-col cols="4"> <font-awesome-icon :icon="number" /> </b-col>
        <b-col cols="8">
          <span> {{ answer_text }} </span>
        </b-col>
      </b-row>
    </b-button>
  </b-col>
</template>

<script>
export default {
  props: {
    number: {
      type: String,
      default: "0",
    },
    answer_text: {
      type: String,
      default: "Default answer",
    },
  },
  components: {},
  data() {
    return {};
  },
};
</script>

<style scoped>
.answer {
  width: 100%;
  box-sizing: border-box;
}
</style>
