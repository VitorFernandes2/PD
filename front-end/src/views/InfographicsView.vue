<template>
  <div class="infographics" :class="{ 'side-padding': listVisible }">
    <info-list
      @changed="listChanged"
      @clicked_info="infoClicked"
      :list="infographics"
    />
    <app-infographic @deleteInfo="deleteInfo" :data="selected" />
  </div>
</template>

<script>
import InfoList from "../components/InfoList.vue";
import AppInfographic from "../components/Infographic.vue";
const axios = require("axios").default;

const URL_GET = "http://172.22.0.3:8080/infographic";

export default {
  name: "InfographicsView",
  components: {
    InfoList,
    AppInfographic,
  },
  async beforeMount() {
    const d = await axios.get(URL_GET);
    console.log(d.status);
    if (d.status == 200) {
      this.infographics = d.data;
      console.log(d.data);
    }
  },
  data() {
    return {
      listVisible: true,
      mock: [
        {
          id: "fdkjgdflkjgklsçjkflºk",
          createdAt: "2022-06-22T22:13:39.867+00:00",
          numberBooks: 5,
          numberMovies: 5,
          numberCharacters: 20,
          numberQuotes: 9999999,
          books: [
            {
              name: "The Fellowship Of The Ring",
              chapters: ["a", "b", "c"],
            },
            {
              name: "The Fellowship Of The Ring 2",
              chapters: ["a", "b", "c"],
            },
          ],
          movies: [
            {
              name: "The Lord of the Rings Series",
              runtimeInMinutes: 558,
              budgetInMillions: 281,
              boxOfficeRevenueInMillions: 2917,
              academyAwardNominations: 30,
              academyAwardWins: 17,
              rottenTomatoesScore: 94,
            },
            {
              name: "The Lord of the Rings Series 2",
              runtimeInMinutes: 558,
              budgetInMillions: 281,
              boxOfficeRevenueInMillions: 2917,
              academyAwardNominations: 30,
              academyAwardWins: 17,
              rottenTomatoesScore: 94,
            },
          ],
          characters: {
            Human: [
              {
                name: "",
                birth: 6,
                quotes: [],
              },
              {
                name: "",
                birth: 6,
                quotes: [],
              },
            ],
            Elf: [
              {
                name: "",
                birth: 6,
              },
              {
                name: "",
                birth: 6,
              },
            ],
          },
          mostTalkativeCharacters: [
            {
              name: "Tyrion Lannister",
              quotes: 46556,
            },
            {
              name: "Jon Sun",
              quotes: 3655,
            },
            {
              name: "Cercei Lannister",
              quotes: 344,
            },
            {
              name: "Dany Targ",
              quotes: 56,
            },
          ],
          mostSuccessMovies: [
            {
              name: "movie name",
              ratio: 1.6,
            },
            {
              name: "movie name 2",
              ratio: 1.3,
            },
          ],
        },
        {
          id: "fdkjgdflkjgklsçjkflºk",
          createdAt: "2022-06-22T22:13:39.867+00:00",
          numberBooks: 5,
          numberMovies: 5,
          numberCharacters: 20,
          numberQuotes: 9999999,
          books: [
            {
              name: "The Fellowship Of The Ring",
              chapters: ["a", "b", "c"],
            },
            {
              name: "The Fellowship Of The Ring 2",
              chapters: ["a", "b", "c"],
            },
          ],
          movies: [
            {
              name: "The Lord of the Rings Series",
              runtimeInMinutes: 558,
              budgetInMillions: 281,
              boxOfficeRevenueInMillions: 2917,
              academyAwardNominations: 30,
              academyAwardWins: 17,
              rottenTomatoesScore: 94,
            },
            {
              name: "The Lord of the Rings Series 2",
              runtimeInMinutes: 558,
              budgetInMillions: 281,
              boxOfficeRevenueInMillions: 2917,
              academyAwardNominations: 30,
              academyAwardWins: 17,
              rottenTomatoesScore: 94,
            },
          ],
          characters: {
            Human: [
              {
                name: "",
                birth: 6,
                quotes: [],
              },
              {
                name: "",
                birth: 6,
                quotes: [],
              },
            ],
            Elf: [
              {
                name: "",
                birth: 6,
              },
              {
                name: "",
                birth: 6,
              },
            ],
          },
          mostTalkativeCharacters: [
            {
              name: "Tyrion Lannister",
              quotes: 46556,
            },
            {
              name: "Jon Sun",
              quotes: 3655,
            },
            {
              name: "Cercei Lannister",
              quotes: 344,
            },
            {
              name: "Dany Targ",
              quotes: 56,
            },
          ],
          mostSuccessMovies: [
            {
              name: "movie name",
              ratio: 1.6,
            },
            {
              name: "movie name 2",
              ratio: 1.3,
            },
          ],
        },
      ],
      infographics: [],
      selected: {},
    };
  },
  methods: {
    listChanged(v) {
      this.listVisible = v;
    },
    infoClicked(i) {
      this.selected = this.infographics[i];
    },
    deleteInfo(id) {
      let i = this.infographics.findIndex((e) => e.id === id);
      console.log(i);
      if (i > -1) {
        this.infographics.splice(i, 1);
        this.selected = {};
      }
    },
  },
};
</script>

<style scoped>
.side-padding {
  padding-left: 200px;
}

span {
  font-weight: 700;
}
</style>