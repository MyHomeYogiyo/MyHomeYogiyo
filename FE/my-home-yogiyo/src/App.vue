<script setup>
import TheHeadingNavbar from "./components/layout/TheHeadingNavbar.vue";
</script>

<template>
  <div id="outer" :class="{backgroud : true}">
    <TheHeadingNavbar></TheHeadingNavbar>
    <router-view></router-view>
  </div>
</template>

<style scoped>
#outer {
  width: 100vw;
  height:100vh;
}

.backgroud{
  background-size: cover;
  background-image: url( "./assets/img/index.jpg" );
}
</style>