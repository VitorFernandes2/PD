<template>
  <div class="infographic">
    <div class="dados">
      <section class="info small">
        <p>Books</p>
        <p>
          {{ data.numberBooks }}
        </p>
      </section>
      <section class="info med">
        <p>Movies</p>
        <p>
          {{ data.numberMovies }}
        </p>
      </section>
      <section class="info big">
        <p>Characters</p>
        <p>
          {{ data.numberCharacters }}
        </p>
      </section>
    </div>
    <p>This infographic was obtained at: {{ data.createAt }}</p>
    <img
      alt="Delete this infographic"
      title="Delete this infographic"
      @click="delete data._id"
      :src="`${publicPath}imgs/delete.png`"
    />
  </div>
</template>

<script>
export default {
  name: "AppInfographic",
  props: {
    data: { type: Object, required: true },
  },
  methods: {
    delete(id) {
      console.log(id);
    },
  },
  data() {
    return {
      publicPath: process.env.BASE_URL,
    };
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

.dados {
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
  align-items: flex-start;
  justify-content: center;
}

.info {
  border: 1px solid #dbc023;
  color: #dbc023;
  display: flex;
  flex-direction: column;
  justify-content: space-around;
  align-items: center;
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