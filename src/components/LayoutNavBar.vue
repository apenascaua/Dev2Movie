<template>
  <div>
    <b-navbar class="navbar" type="dark" variant="dark">
      <b-navbar-brand href="#">
        <img src="../assets/logomovie.png" class="d-inline-block align-top" alt="Kitten" height="200">
      </b-navbar-brand>
      <!-- Links do Navbar -->
      <b-navbar-nav :class="{'show-mobile-menu': showMenu}">
        <router-link to="/Home" class="nav-link">Home</router-link>
        <router-link to="/movies" class="nav-link">Movies</router-link>
        <router-link to="/series" class="nav-link">Series</router-link>
      </b-navbar-nav>
      <!-- Texto do autor -->
      <b-navbar-text class="ml-auto author-name">
        Autor: Cauã Cardozo Guimarães
      </b-navbar-text>
    </b-navbar>
    <router-view></router-view>
  </div>
</template>
<script>
export default {
  data () {
    return {
      showMenu: false
    }
  },
  methods: {
    toggleMobileMenu () {
      this.showMenu = !this.showMenu
    }
  }
}
</script>
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

.mobile-menu {
  cursor: pointer;
}

.mobile-menu div {
  width: 32px;
  height: 2px;
  background: #fff;
  margin: 8px;
}

@media (max-width: 450px) {
  body {
    overflow-x: hidden;
  }
  .b-navbar {
    width: 100%;
  }

  .author-name {
    display: none;
  }

  .b-navbar-nav {
    display: inline-block;
  }
}
</style>
