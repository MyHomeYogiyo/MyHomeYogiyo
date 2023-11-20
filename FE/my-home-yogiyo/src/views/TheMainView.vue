<script setup>
import VIntroduction from "../components/main/VIntroduction.vue";
import SlidingMenuCard from '../components/main/SlidingMenuCard.vue';
</script>

<template>
    <div class="view_container">
        <!-- <img src="../assets/img/index.jpg" alt=""> -->
        <VIntroduction/>
        <SlidingMenuCard/>
    </div>
</template>

<style scoped>
img{
    width : 100%;
    height: 100vh; /* vh : */
    position: absolute;
}
</style>