<script setup>
import { useCartStore } from '../stores/cart';
import CartUser from '../components/CartUser.vue';

//stores
const cartStore = useCartStore()
//method
const deleteCart = (id) => {
 cartStore.removeDessertToCart(id)
}
  
</script>

<template>
  <div>
  <h1>Mis productos <img class="img-fluid" src="../assets/carrito-de-compras.gif" alt=""></h1>
  <div class="c" v-for="item of cartStore.shoppingList">
    <CartUser :id="item.id" :title="item.title" :price="item.price" :image="item.image" @delete-item="deleteCart"/>
  
  </div>

  </div>
</template>


<style lang="scss" scoped>

</style>
