<template>
  <nav>
    <ul>
      <li>
        <router-link :class="{ current: page === 'home' }" to="/"
          >Home</router-link
        >
      </li>
      <li>
        <router-link
          :class="{ current: page === 'infographics' }"
          to="/infographics"
          >Infographics</router-link
        >
      </li>
      <li>
        <router-link :class="{ current: page === 'about' }" to="/about"
          >About</router-link
        >
      </li>
    </ul>
  </nav>
</template>
<script>
export default {
  name: "AppMenu",
  data() {
    return {
      page: "home",
    };
  },
  watch: {
    $route(to) {
      this.page = to.name;
    },
  },
};
</script>
<style scoped>
ul {
  padding: 0;
  margin: auto;
  display: flex;
  justify-content: space-around;
  align-items: center;
  flex-direction: row;
  list-style: none;
  width: 50%;
}

a:link,
a:visited:not(.current) {
  text-decoration: none;
  color: #192723;
  padding: 10px;
  border-radius: 10px;
}

a:hover,
.current {
  color: #fff;
  background-color: #a18a43;
}
</style>