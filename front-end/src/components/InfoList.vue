<template>
  <div class="infoList" :class="{ small: !shown }">
    <div @click="change" class="bt" v-show="shown">
      <span>&lt;</span>
    </div>
    <div @click="change" class="bt" v-show="!shown">
      <span>&gt;</span>
    </div>
    <div :class="{ show: shown }" class="lista">
      <ul>
        <li v-for="(e, i) in list" @click="infoClicked(i)" :key="e">
          {{ e.createdAt }}
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: "InfoList",
  props: {
    list: Array,
  },
  data() {
    return {
      lista: ["mock", "mock", "mock", "mock"],
      shown: true,
    };
  },
  emits: ["changed", "clicked_info"],
  methods: {
    change() {
      this.shown = !this.shown;
      this.$emit("changed", this.shown);
    },
    infoClicked(i) {
      this.$emit("clicked_info", i);
    },
  },
};
</script>

<style scoped>
.infoList {
  position: absolute;
  top: 15%;
  left: 0;
  transition: 0.5s;
  background-color: #a18a43;
  color: #fff;
  border-radius: 0 10px 10px 0;
  padding: 5px;
  height: 83%;
}

.small {
  width: 30px;
}

.bt {
  position: absolute;
  top: 5px;
  right: 5px;
  width: 20px;
  height: 20px;
  text-align: center;
  cursor: pointer;
}

.lista {
  width: 200px;
  margin-top: 40px;
  left: -220px;
  position: relative;
  transition: 0.3s;
  overflow-y: scroll;
  -ms-overflow-style: none; /* IE e Edge */
  scrollbar-width: none; /* Firefox */
}

.lista::-webkit-scrollbar {
  /*Chrome Safari e Opera */
  display: none;
}
.show {
  left: 0;
}

li {
  list-style-type: none;
}
</style>