<template>
  <div class="infographic">
    <div class="select" v-if="hasNoSelect">
      <h1>Select an infographic</h1>
    </div>
    <div v-else class="dados">
      <div class="container">
        <section class="info small">
          <p>Books</p>
          <p>
            {{ data.numberBooks }}
          </p>
        </section>
        <section class="info small">
          <p>Movies</p>
          <p>
            {{ data.numberMovies }}
          </p>
        </section>
        <section class="info small">
          <p>Characters</p>
          <p>
            {{ data.numberCharacters }}
          </p>
        </section>
        <section class="info small">
          <p>Quotes</p>
          <p>{{ data.numberQuotes }}</p>
        </section>
      </div>
      <div class="info full"><p>Books</p></div>
      <div class="container">
        <section class="info" v-for="e in data.books" :key="e.name">
          <p>
            {{ e.name }}
          </p>
          <p>{{ e.chapters.length }} chapters</p>
        </section>
      </div>
      <div class="info full"><p>Movies</p></div>
      <div class="container">
        <section class="info" v-for="e in data.movies" :key="e.name">
          <p>
            {{ e.name }}
          </p>
          <p>Runtime: {{ e.runtimeInMinutes }} mins</p>
          <p>Budget: {{ e.budgetInMillions }}M</p>
          <p>Revenue: {{ e.boxOfficeRevenueInMillions }}M</p>
          <p>Score: {{ e.rottenTomatoesScore }}%</p>
        </section>
      </div>
      <div class="info full"><p>Random Character</p></div>
      <div class="container" v-if="randomChar != null">
        <section class="info">
          <p>Name</p>
          <p>{{ randomChar.name }}</p>
        </section>
        <section class="info">
          <p>Race</p>
          <p>{{ randomChar.race }}</p>
        </section>
        <section class="info">
          <p>Gender</p>
          <p>{{ randomChar.gender }}</p>
        </section>
        <section class="info">
          <p>Birth</p>
          <p>{{ randomChar.birth }}</p>
        </section>
        <section class="info">
          <p>Death</p>
          <p>{{ randomChar.death }}</p>
        </section>
      </div>
    </div>
    <p v-show="!hasNoSelect">
      This infographic was obtained at: {{ data.createAt }}
    </p>
    <p v-show="!hasNoSelect">Scores obtained from Rotten Tomatoes</p>
    <img
      alt="Delete this infographic"
      title="Delete this infographic"
      @click="deleteInfographic(data.id)"
      :src="`${publicPath}imgs/delete.png`"
    />
  </div>
</template>

<script>
const axios = require("axios").default;

const URL_DEL = "http://localhost:8080/infographic";

export default {
  name: "AppInfographic",
  props: {
    data: { type: Object, required: true },
  },
  beforeMount() {
    let keys = Object.keys(this.data.characters);
    let rnd = Math.floor(Math.random() * keys.length);
    let key = keys[rnd];

    rnd = Math.floor(Math.random() * this.data.characters[key].length);
    let obj = this.data.characters[key][rnd];
    this.randomChar = obj;
  },
  methods: {
    async deleteInfographic(id) {
      const r = axios({
        method: "delete",
        url: URL_DEL,
        headers: {},
        data: id,
      });

      console.log(r);
    },
  },
  data() {
    return {
      publicPath: process.env.BASE_URL,
      randomChar: null,
    };
  },
  computed: {
    hasNoSelect() {
      return Object.keys(this.data).length === 0;
    },
  },
};
</script>

<style scoped>
.infographic {
  background-color: #9f6319;
  color: #fff;
  width: 70%;
  margin: auto;
  padding: 30px;
  border-radius: 50px;
  padding-bottom: 50px;
}

.select {
  text-align: center;
}

.dados {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}

.infographic > p {
  font-size: 12px;
}

.container {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: row;
  flex-wrap: wrap;
}

.info {
  border: 1px solid #dbc023;
  color: #dbc023;
  display: flex;
  flex-direction: column;
  justify-content: space-around;
  align-items: center;
  margin: 10px;
  padding: 10px;
}

.full {
  width: 100%;
  text-align: center;
  margin: 5px;
  padding: 5px;
}

.small {
  width: 80px;
  height: 80px;
}

.med {
  width: 120px;
  height: 120px;
}

.big {
  width: 200px;
  height: 200px;
}

img {
  width: 30px;
  float: right;
  cursor: pointer;
}
</style>