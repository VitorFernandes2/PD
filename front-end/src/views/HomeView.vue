<template>
  <div class="home">
    <div>
      <p>
        "No, thank you! We don’t want any more visitors, well-wishers or distant
        relations!" - <span>Bilbo Baggins</span>
      </p>
      <p>
        This website will show you a bunch of information about the Lord of the
        Rings cinematic universe as well as from the books!
      </p>
      <p>
        This information is presented in the form of infographics that are
        recorded every X time from
        <a href="https://the-one-api.dev/" target="_blanket">this</a> API.
      </p>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
export default {
  name: "HomeView",
};
</script>

<style scoped>
.home div {
  width: 70%;
  margin: auto;
  background-color: #9f6319;
  padding: 30px;
  border-radius: 50px;
  font-size: 18px;
  color: #fff;
}

.home div p:first-child {
  text-align: center;
}

p a:link,
p a:visited {
  color: #192723;
  text-decoration: none;
}

p a:hover {
  color: #e9d83d;
  text-decoration: underline;
}

span {
  font-weight: 700;
}
</style>
