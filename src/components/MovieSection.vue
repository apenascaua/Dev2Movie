<template>
    <div>
      <h1>Movies Section</h1>
      <Carousel :per-page="6">
        <Slide v-for="movie in movies" :key="movie.id">
          <b-card
          no-body :img-src="movie.banner"
          img-top
          class="mb-2"
          ></b-card>
        </Slide>
      </Carousel>
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
  }
}
</script>
<style scoped>
h1{
  color: antiquewhite;
}
</style>
