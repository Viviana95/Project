<script setup>
import { onBeforeMount } from 'vue';
import { useDessertsStore } from '../stores/desserts';
import Dessert from '../components/Dessert.vue';
import { useCartStore } from '../stores/cart';


//stores declarar store
const dessertStore = useDessertsStore()
const cartStore = useCartStore()
//lifecicle
onBeforeMount(() => {
  getDesserts()
})
//methods
const getDesserts = async () => {
  await dessertStore.fetchDesserts()
}
const addDessertCart = (dessertId) => {
  const dessert = dessertStore.getDessertId(dessertId)
  cartStore.addDessertToCart(dessert)
}
</script>

<template>
  <div class="row row-cols-2 row-cols-md-3 g-4" v-for="dessert in dessertStore.desserts">
     <Dessert  :id="dessert.id" :image="dessert.image" :title="dessert.title"
      :price="dessert.price" :description="dessert.description" @addDessertCart="addDessertCart" />    
  </div>

</template>
<style scoped>
#home{
  height: 100vh;
  overflow-y: auto;
  background-color: rgb(116, 116, 137);
} 
</style>
