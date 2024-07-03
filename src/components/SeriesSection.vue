<template>
    <div>
      <h1>Series Section</h1>
      <Carousel :per-page="6">
        <Slide v-for="serie in series" :key="serie.id">
          <b-card
          no-body :img-src="serie.banner"
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
    series: {
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
