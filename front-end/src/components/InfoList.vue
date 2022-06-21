<template>
  <div class="infoList" :class="{ small: !shown }">
    <div @click="change" class="bt" :class="{ rotate: !shown }">
      <img :src="`${publicPath}imgs/arrow.png`" />
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
  },
};
</script>

<style scoped>
.infoList {
  position: absolute;
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
  top: 5px;
  right: 5px;
  width: 20px;
  height: 20px;
  text-align: center;
  cursor: pointer;
}

.bt img {
  width: 20px;
  height: 20px;
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
}
</style>