<template>
  <div id="app">
    <div class="w-100">
      <hooper :itemsToShow="3" pagination="no" :autoPlay="true" :playSpeed="4000" :infiniteScroll="true">
        <slide style="height: 80vh; flex-direction: column" class="d-flex align-items-center justify-content-center">
          <b-img :src="require('@/assets/img/logo.png')" style="width: 230px"></b-img>
        </slide>
        <slide style="background-color: #ffd17c; color: #3f3f3f; flex-direction: column; height: 90vh" class="d-flex align-items-center justify-content-center">
          <h1 class="mb-5">
            가장 편안해야할 내 집,<br />
            가장 행복해야할 내 집,<br /><br />
            <b>모두가 꿈꾸는 집을 찾아주는 곳</b>
          </h1>
        </slide>
        <slide style="height: 90vh; color: #3f3f3f; flex-direction: column" class="d-flex align-items-center justify-content-center mb-5">
          <h1>
            <b style="line-height: 1.5">
              다양한 서비스를<br />
              이용해보세요.</b
            >
          </h1>
          <b-img :src="require('@/assets/img/section.png')" class="mt-4" style="width: 80%"></b-img>
        </slide>

        <slide style="background-color: #ffd17c; height: 90vh; color: #3f3f3f; flex-direction: column" class="d-flex align-items-center justify-content-center">
          <h1>
            <b>실시간 인기 아파트<img class="mb-3" src="@/assets/img/ranking_02.png" width="10%" /></b>
          </h1>
          <b-card-group class="mt-2" style="padding-left: 3vh" deck>
            <b-card
              border-variant="light"
              v-if="topHits.length > 0"
              footer-tag="footer"
              class="text-center"
              style="width: 40vh; max-width: 250px"
              img-alt="Image"
              :img-src="require('@/assets/img/houses/img0001.png')"
            >
              <b-card-text v-model="topHits[0]" style="font-weight: bold; color: black; list-style: none; font-size: 1.1rem; padding-top: 5px">1. {{ topHits[0].aptName }}</b-card-text>
              <b-card-text v-model="topHits[0]" style="font-weight: bold; color: black; list-style: none">{{ topHits[0].dongName }}</b-card-text>
              <template #footer>
                <div style="font-weight: bold; font-size: 1.1rem">평균 거래금액 : {{ topHits[0].avgAmount | price }}</div>
              </template>
            </b-card>

            <b-card
              border-variant="light"
              v-if="topHits.length > 1"
              footer-tag="footer"
              class="text-center"
              style="width: 40vh; max-width: 250px"
              img-top
              img-alt="Image"
              :img-src="require('@/assets/img/houses/img0002.png')"
            >
              <b-card-text v-model="topHits[1]" style="font-weight: bold; color: black; list-style: none; font-size: 1.1rem; padding-top: 5px">2. {{ topHits[1].aptName }}</b-card-text>
              <b-card-text v-model="topHits[1]" style="font-weight: bold; color: black; list-style: none">{{ topHits[1].dongName }}</b-card-text>
              <template #footer>
                <div style="font-weight: bold; font-size: 1.1rem">평균 거래금액 : {{ topHits[1].avgAmount | price }}</div>
              </template>
            </b-card>
          </b-card-group>
          <b-card-group class="mt-4" style="padding-left: 3vh" deck>
            <b-card
              border-variant="light"
              v-if="topHits.length > 2"
              footer-tag="footer"
              class="text-center"
              style="width: 40vh; max-width: 250px"
              img-alt="Image"
              :img-src="require('@/assets/img/houses/img0001.jpg')"
            >
              <b-card-text v-model="topHits[2]" style="font-weight: bold; color: black; list-style: none; font-size: 1.1rem; padding-top: 5px">3. {{ topHits[2].aptName }}</b-card-text>
              <b-card-text v-model="topHits[2]" style="font-weight: bold; color: black; list-style: none">{{ topHits[2].dongName }}</b-card-text>
              <template #footer>
                <div style="font-weight: bold; font-size: 1.1rem">평균 거래금액 : {{ topHits[2].avgAmount | price }}</div>
              </template>
            </b-card>

            <b-card
              border-variant="light"
              v-if="topHits.length > 3"
              footer-tag="footer"
              class="text-center"
              style="width: 40vh; max-width: 250px"
              img-alt="Image"
              :img-src="require('@/assets/img/houses/img0003.jpg')"
            >
              <b-card-text v-model="topHits[3]" style="font-weight: bold; color: black; list-style: none; font-size: 1.1rem">4. {{ topHits[3].aptName }}</b-card-text>
              <b-card-text v-model="topHits[3]" style="font-weight: bold; color: black; list-style: none">{{ topHits[3].dongName }}</b-card-text>
              <template #footer>
                <div style="font-weight: bold; font-size: 1.1rem">평균 거래금액 : {{ topHits[3].avgAmount | price }}</div>
              </template>
            </b-card>
          </b-card-group>
        </slide>
        <slide style="height: 90vh; color: #3f3f3f; flex-direction: column" class="d-flex align-items-center justify-content-center">
          <h1>
            <b>오늘의 뉴스<img class="mb-3 ml-3" src="@/assets/img/news04.png" width="10%" /></b>
          </h1>
          <b-card-group deck class="mt-4 mr-5">
            <b-card border-variant="light" class="text-left" style="overflow: auto">
              <b-card-text>
                <ul style="color: black; list-style: none; font-size: 1em">
                  <li v-for="(article, index2) in news" :key="index2" style="border-bottom: 1px solid #88ab88; margin: 5px; padding: 8px">
                    <a :href="article.link" v-html="article.title"></a>
                  </li>
                </ul>
              </b-card-text>
            </b-card>
          </b-card-group>
        </slide>
      </hooper>
    </div>
  </div>
</template>

<script>
import { mapMutations } from "vuex";
import { Hooper, Slide } from "hooper";
import "hooper/dist/hooper.css";
import { getNews } from "@/api/news.js";
import { topHits } from "@/api/deal.js";

const dealStore = "dealStore";

export default {
  name: "HomeView",
  props: {
    msg: String,
  },
  data() {
    return {
      news: {
        title: "",
        link: "",
      },
      topHits: [
        {
          dealNum: "",
          aptCode: "",
          aptName: "",
          dongName: "",
          dongCode: "",
          lng: "",
          lat: "",
          avgAmount: "",
        },
      ],
    };
  },
  created() {
    getNews((response) => {
      this.news = response.data;
    });
    topHits((response) => {
      this.topHits = response.data;
      console.log(this.topHits);
      this.SET_TOPHIT_LIST(this.topHits);
    });
  },
  methods: {
    ...mapMutations(dealStore, ["SET_TOPHIT_LIST"]),
  },
  components: {
    Hooper,
    Slide,
  },
  filters: {
    price(value) {
      if (!value) {
        return value;
      }
      let rst = "";
      let tmp = (Math.round(value / 100) * 100) / 10000;
      if (tmp != 0) {
        rst += tmp + "억";
        value -= tmp * 10000;
      } else {
        rst += value;
        rst += "만원";
      }
      return rst.toString();
    },
  },
};
</script>

<style>
.hooper-list {
  overflow: inherit;
}
</style>

<style scoped>
li a {
  font-weight: bold;
  color: #e77920;
}

li a:hover {
  color: orange;
}
#topHit {
  color: orange;
}
.card-body {
  padding: 0.5em;
}

.target {
  -ms-overflow-style: none; /* IE and Edge */
  scrollbar-width: none; /* Firefox */
}
.target::-webkit-scrollbar {
  display: none; /* Chrome, Safari, Opera*/
}
</style>
