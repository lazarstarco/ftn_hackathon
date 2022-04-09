<template>
  <b-row>
    <Answer answer_text="Answer 1" number="1" />
    <Answer answer_text="Answer 2" number="2" />
    <Answer answer_text="Answer 3" number="3" />
    <Answer answer_text="Answer 4" number="4" />
  </b-row>
</template>

<script>
import Answer from "./Answer.vue";

export default {
  props: {
    answer_text: {
      type: String,
      default: "Default answer",
    },
  },
  components: { Answer },
};
</script>
