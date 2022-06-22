<template>
  <div class="infoList" :class="{ small: !shown }">
    <div @click="change" class="bt" :class="{ rotate: shown }">
      <img :src="`${publicPath}imgs/arrow.png`" />
    </div>
    <div :class="{ show: shown }" class="lista">
      <ul>
        <li v-for="(e, i) in list" @click="infoClicked(i)" :key="e">
          {{ convertDate(e.createdAt) }}
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
      publicPath: process.env.BASE_URL,
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
    convertDate(date) {
      let s = date.split("T");
      let d = s[0];
      let h = s[1].split(".")[0];
      return d + " " + h;
    },
  },
};
</script>

<style scoped>
.infoList {
  position: fixed;
  top: 15%;
  left: 0;
  background-color: #a18a43;
  color: #fff;
  border-radius: 0 10px 10px 0;
  padding: 5px;
  height: 83%;
}

.rotate {
  transform: rotateZ(180deg);
}

.small {
  width: 30px;
}

.bt {
  position: absolute;
  top: 10px;
  right: 10px;
  width: 20px;
  height: 20px;
  text-align: center;
  cursor: pointer;
}

.bt img {
  width: 20px;
  height: 20px;
  filter: brightness(0) invert(1);
}

.lista {
  width: 200px;
  margin-top: 40px;
  left: -220px;
  position: relative;
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

ul {
  padding: 0;
}

li {
  list-style-type: none;
  cursor: pointer;
  margin: 10px;
  text-align: center;
  padding: 5px 0;
  border-radius: 5px;
}

li:hover {
  background-color: #dbc023;
}
</style>