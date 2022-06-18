<template>
  <header>
    <h1>Lord of the Rings Infographics</h1>
    <app-menu />
  </header>
  <main>
    <router-view />
  </main>
  <footer>
    <app-footer />
  </footer>
</template>

<script>
import AppMenu from "./components/Menu.vue";
import AppFooter from "./components/Footer.vue";

export default {
  name: "App",
  components: {
    AppMenu,
    AppFooter,
  },
};
</script>

<style>
html,
body {
  margin: 0;
  padding: 0;
  color: #192723;
  background-color: #f5f0e5;
}

header {
  text-align: center;
}

main {
  margin: 80px 0;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #192723;
  background-color: #f5f0e5;
  margin: 0;
  padding: 0;
  min-height: 95vh;
  display: flex;
  flex-direction: column;
}

footer {
  margin-top: auto;
}
</style>
