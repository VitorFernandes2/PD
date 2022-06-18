<template>
  <div class="infographic">
    <p>
      Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quis sem non
      ipsum tempor sollicitudin at sed justo. Suspendisse lobortis turpis purus,
      in mattis turpis consequat nec. Sed sodales orci vitae hendrerit rutrum.
      Donec luctus dui augue, quis bibendum libero ultrices ultricies. Donec vel
      dignissim augue, eget mollis lectus. Class aptent taciti sociosqu ad
      litora torquent per conubia nostra, per inceptos himenaeos. Aenean leo
      enim, commodo dignissim urna faucibus, commodo dapibus nisl. Sed pretium
      ligula erat, non porta justo mollis quis. Duis pellentesque consequat
      velit non blandit.
    </p>
  </div>
</template>

<script>
export default {
  name: "AppInfographic",
  props: {
    data: { type: Object, required: true },
  },
};
</script>

<style scoped>
.infographic {
  background-color: #a18a43;
  color: #fff;
  width: 70%;
  margin: auto;
  padding: 30px;
  border-radius: 50px;
}
</style>