<template>
  <div class="HomeView">
    <h1>Welcome to FlixVue</h1>
    <MovieSection :movies = "movies"/>
    <SeriesSection :series = "series"/>
  </div>
</template>

<script>
import MovieSection from '@/components/MovieSection.vue'
import SeriesSection from '@/components/SeriesSection.vue'
export default {
  name: 'HomeView',
  components: {
    MovieSection,
    SeriesSection
  },
  data () {
    return {
      title: '1231',
      age: 123,
      movies: [
        { id: 1, banner: 'https://br.web.img2.acsta.net/c_310_420/pictures/23/11/09/18/04/2076862.jpg' },
        { id: 2, banner: 'https://br.web.img2.acsta.net/c_310_420/img/3d/a5/3da55e2824a79a6b3ba13b44c551d3b3.jpg' },
        { id: 3, banner: 'https://br.web.img2.acsta.net/c_310_420/pictures/22/12/28/19/29/5948383.jpg' },
        { id: 4, banner: 'https://br.web.img3.acsta.net/c_310_420/img/b0/17/b0173047cc91f385964595cc30cbb975.jpg' },
        { id: 5, banner: 'https://br.web.img3.acsta.net/c_310_420/pictures/24/02/16/19/36/5568619.jpg' },
        { id: 6, banner: 'https://br.web.img3.acsta.net/c_310_420/pictures/24/02/28/15/47/0426941.png' },
        { id: 7, banner: 'https://br.web.img3.acsta.net/c_310_420/pictures/23/11/08/13/46/4065511.png' },
        { id: 8, banner: 'https://br.web.img2.acsta.net/c_310_420/pictures/23/12/18/16/46/0013760.jpg' },
        { id: 9, banner: 'https://br.web.img3.acsta.net/c_310_420/pictures/23/04/25/20/10/1515852.jpg' },
        { id: 10, banner: 'https://br.web.img2.acsta.net/c_310_420/pictures/23/05/17/22/43/4869322.jpg' },
        { id: 11, banner: 'https://br.web.img2.acsta.net/c_310_420/medias/nmedia/18/87/07/40/19871748.jpg' },
        { id: 12, banner: 'https://br.web.img3.acsta.net/c_310_420/pictures/20/03/05/20/58/4942195.jpg' }
      ],
      series: [
        { id: 1, banner: 'https://br.web.img3.acsta.net/c_310_420/pictures/19/07/09/14/34/1532536.jpg?coixp=57&coiyp=52' },
        { id: 2, banner: 'https://br.web.img2.acsta.net/c_310_420/pictures/19/03/21/16/15/4239577.jpg' },
        { id: 3, banner: 'https://br.web.img3.acsta.net/c_310_420/img/64/9b/649b3372132a7d3168068b62fe27314b.jpg' },
        { id: 4, banner: 'https://br.web.img2.acsta.net/c_310_420/pictures/18/11/12/13/38/3629995.jpg' },
        { id: 5, banner: 'https://br.web.img3.acsta.net/c_310_420/pictures/19/07/10/20/01/2331295.jpg' },
        { id: 6, banner: 'https://br.web.img3.acsta.net/c_310_420/pictures/15/03/11/17/20/597260.jpg' },
        { id: 7, banner: 'https://br.web.img2.acsta.net/c_310_420/img/db/f0/dbf0fac641ab0190f9f2c3033c192aa5.jpg' },
        { id: 8, banner: 'https://br.web.img3.acsta.net/c_310_420/pictures/15/10/05/10/33/221403.jpg' },
        { id: 9, banner: 'https://br.web.img3.acsta.net/c_310_420/pictures/210/615/21061587_20131127162723525.jpg' },
        { id: 10, banner: 'https://br.web.img3.acsta.net/c_310_420/pictures/210/032/21003280_20130504002100017.jpg' },
        { id: 11, banner: 'https://br.web.img3.acsta.net/c_310_420/img/70/2c/702c46d22194a7b1a9c8ba13a0d8f3ae.jpg' },
        { id: 12, banner: 'https://br.web.img3.acsta.net/c_310_420/medias/nmedia/18/78/35/82/20303823.jpg' }
      ]
    }
  }
}
</script>

<style>
h1{
  color: red
}

</style>
