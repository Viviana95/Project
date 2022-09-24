<script setup>
import { onBeforeMount } from 'vue';
import { useDessertsStore } from '../stores/desserts';
import Dessert from '../components/Dessert.vue';

//stores declarar store
const dessertStore = useDessertsStore()
//lifecicle
onBeforeMount(() => {
  getDesserts()
})

//methods
const getDesserts = async () => {
  await dessertStore.fetchDesserts()
}
</script>

<template>
  <div id="home">

    <Dessert v-for="dessert in dessertStore.desserts" :image="dessert.image" :title="dessert.title"
      :price="dessert.price" :description="dessert.description" />   
    
  </div>
</template>
<style scoped>
#home{
  height: 100vh;
  overflow-y: auto;
}
</style>
