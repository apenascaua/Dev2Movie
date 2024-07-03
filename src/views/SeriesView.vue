<template>
    <div>
        <h1> Be happy with our series :D</h1>
        <SeriesSection :series = "series"/>
    </div>
</template>

<script>
import SeriesSection from '@/components/SeriesSection.vue'
export default {
  name: 'SeriesView',
  components: {
    SeriesSection
  },
  data () {
    return {
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
