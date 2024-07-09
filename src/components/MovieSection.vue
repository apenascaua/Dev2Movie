<template>
    <div>
      <h1>Movies Section</h1>
      <Carousel :per-page="6">
        <Slide v-for="movie in movies" :key="movie.id">
          <b-card
          no-body :img-src="movie.banner"
          img-top
          class="mb-2"
          @dblclick="showTrailer(movie.trailerUrl)"
          ></b-card>
        </Slide>
      </Carousel>
      <b-modal
      v-model="showModal"
      title="Your Movie Trailer"
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
    movies: {
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
