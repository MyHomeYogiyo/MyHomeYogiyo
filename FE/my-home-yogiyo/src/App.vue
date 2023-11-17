<script setup>
import TheHeadingNavbar from "./components/layout/TheHeadingNavbar.vue"

</script>

<template>
  <div id="outer">
    <TheHeadingNavbar></TheHeadingNavbar>
    <router-view></router-view>
  </div>
</template>

<style scoped>
#outer{
  width: 100vw;
  height:100vh;
  background-size: cover;
  background-image: url( "./assets/img/index.jpg" ); 
}
</style>