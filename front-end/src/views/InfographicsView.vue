<template>
  <div class="infographics">
    <info-list />
    <!-- <div>
      <p>
        <span>Note:</span>This information is relative only to the original Lord
        of the Rings trilogy
      </p>
    </div> -->
  </div>
</template>

<script>
import InfoList from "../components/InfoList.vue";

export default {
  name: "InfographicsView",
  components: {
    InfoList,
  },
};
</script>

<style scoped>
span {
  font-weight: 700;
}
</style>