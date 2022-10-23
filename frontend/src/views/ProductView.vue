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
  <div class="row row-cols-1 row-cols-md-4 g-4">
  <div class="col" v-for="dessert in dessertStore.desserts">
     <Dessert  :id="dessert.id" :image="dessert.image" :title="dessert.title"
      :price="dessert.price" :description="dessert.description" @addDessertCart="addDessertCart" @deletDessert="deleteDessert"/>    
  </div>
</div>

</template>
<style scoped>

</style>
