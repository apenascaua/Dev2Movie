import Vue from 'vue'
import VueRouter from 'vue-router'
import LayoutNavBar from '@/components/LayoutNavBar.vue'
import HomeView from '@/views/HomeView.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'LayoutNavBar',
    component: LayoutNavBar,
    children: [
      {
        path: '/home',
        name: 'Home',
        component: HomeView
      },
      {
        path: '/series',
        name: 'Serie',
        component: () => import(/* webpackChunkName: "series" */ '../views/SeriesView.vue')
      },
      {
        path: '/movies',
        name: 'Movies',
        component: () => import(/* webpackChunkName: "movies" */ '../views/MoviesView.vue')
      }
    ]
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
