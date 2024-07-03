<template>
    <div>
  <b-navbar class="navbar" type="dark" variant="dark">
    <b-navbar-brand href="#">
      <img src="../assets/logomovie.png" class="d-inline-block align-top" alt="Kitten" height="200" >
    </b-navbar-brand>
    <b-navbar-nav>
        <router-link to="/Home" class="nav-link">Home</router-link>
        <router-link to="/movies" class="nav-link">Movies</router-link>
        <router-link to="/series" class="nav-link">Series</router-link>
    </b-navbar-nav>
    <b-navbar-text class="ml-auto author-name">
        Autor: Cauã Cardozo Guimarães
      </b-navbar-text>
  </b-navbar>
  <router-view></router-view>
</div>
</template>

<style>
.navbar {
  background-color: #202020 !important;
}

.nav-link {
  font-size: 1.4rem;
  color: antiquewhite !important;
}

.author-name {
  font-size: 1.0rem;
  color: antiquewhite;
}
</style>
