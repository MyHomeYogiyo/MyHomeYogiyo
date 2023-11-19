<script setup>
import Introduction from '../components/main/Introduction.vue';
import SlidingMenuCard from '../components/main/SlidingMenuCard.vue';
</script>

<template>
    <div class="view_container">
        <!-- <img src="../assets/img/index.jpg" alt=""> -->
        <Introduction/>
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