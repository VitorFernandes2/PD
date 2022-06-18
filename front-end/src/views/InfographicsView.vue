<template>
  <div class="infographics" :class="{ 'side-padding': listVisible }">
    <info-list @changed="listChanged" />
    <app-infographic />
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
import AppInfographic from "../components/Infographic.vue";

export default {
  name: "InfographicsView",
  components: {
    InfoList,
    AppInfographic,
  },
  data() {
    return {
      listVisible: true,
    };
  },
  methods: {
    listChanged(v) {
      console.log(v);
      this.listVisible = v;
    },
  },
};
</script>

<style scoped>
.side-padding {
  padding-left: 200px;
}

span {
  font-weight: 700;
}
</style>