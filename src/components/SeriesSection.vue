<template>
    <div>
      <h1>Series Section</h1>
      <Carousel :per-page="6">
        <Slide v-for="serie in series" :key="serie.id">
          <b-card
          no-body :img-src="serie.banner"
          img-top
          class="mb-2"
          @click="showTrailer(serie.trailerUrl)"
          ></b-card>
        </Slide>
      </Carousel>
      <b-modal
      v-model="showModal"
      title="Your Serie Trailer"
      size="lg"
      hide-footer
    >
      <iframe
        v-if="currentTrailerUrl"
        :src="currentTrailerUrl"
        width="100%"
        height="400px"
        frameborder="0"
        allow="autoplay; encrypted-media"
        allowfullscreen
      ></iframe>
    </b-modal>
    </div>
</template>

<script>
import { Carousel, Slide } from 'vue-carousel'
export default {
  components: {
    Carousel,
    Slide
  },
  props: {
    series: {
      type: Array
    }
  },
  data () {
    return {
      showModal: false,
      currentTrailerUrl: ''
    }
  },
  methods: {
    showTrailer (trailerUrl) {
      this.currentTrailerUrl = trailerUrl
      this.showModal = true
    }
  }
}
</script>
<style scoped>
h1{
  color: antiquewhite;
}
</style>
