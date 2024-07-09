<template>
    <div>
        <h1> Be happy with our movies :D</h1>
        <MovieSection :movies = "movies"/>
    </div>
</template>

<script>
import MovieSection from '@/components/MovieSection.vue'
export default {
  name: 'MoviesView',
  components: {
    MovieSection
  },
  data () {
    return {
      title: '1231',
      age: 123,
      movies: [
        { id: 1, banner: 'https://br.web.img2.acsta.net/c_310_420/pictures/23/11/09/18/04/2076862.jpg', trailerUrl: 'https://www.youtube.com/embed/yAZxx8t9zig' },
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
      ]
    }
  }
}
</script>

<style>
/*alinha o H1 no meio para mobile fetio por AGpatrick 09/07/24*/
@media (max-width: 450px){
  h1{
    text-align: center;
  }
}
</style>
