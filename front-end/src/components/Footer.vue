<template>
  <div>
    <p>
      <router-link to="/">Home</router-link> <span></span>
      <router-link to="/infographics">Infographics</router-link> <span></span>
      <router-link to="/about"> About</router-link>
    </p>
    <p>&copy; Copyright Nosso 2022</p>
  </div>
</template>

<script>
export default {
  name: "AppFooter",
};
</script>

<style scoped>
div {
  text-align: center;
}

div p {
  margin: 5px;
}

div p:not(:first-child) {
  font-size: 14px;
}

span {
  width: 40px;
  height: 1px;
  border-bottom: 2px solid #192723;
  display: inline-block;
  transform: translateY(-50%);
  margin: 2px 10px;
}

a:link,
a:visited:not(.current) {
  text-decoration: none;
  color: #192723;
}

a:hover {
  color: #192723;
  text-decoration: underline;
}
</style>