<template>
  <div class="infoList" :class="{ small: !shown }">
    <div @click="shown = false" class="bt" v-show="shown">
      <span>&lt;</span>
    </div>
    <div @click="shown = true" class="bt" v-show="!shown">
      <span>&gt;</span>
    </div>
    <div :class="{ show: shown }" class="lista">
      <ul>
        <li>Elemento da lista</li>
        <li v-for="e in lista" :key="e">{{ e }}</li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: "InfoList",
  data() {
    return {
      lista: ["mock", "mock", "mock", "mock"],
      shown: true,
    };
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
  border-radius: 10px;
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
  overflow: scroll;
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