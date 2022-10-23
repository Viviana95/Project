<script setup>
import { onBeforeMount } from 'vue';
import { useDessertsStore } from '../stores/desserts';
import ListDessert from '../components/ListDessert.vue';
import Form from '../components/Form.vue';


//stores declarar store
const dessertStore = useDessertsStore()


//methods

const getDesserts = async () => {
  await dessertStore.fetchDesserts()
}
const destroyDessert = async(id) => {
 await dessertStore.deleteDessert(id)

}
</script>

<template>
  <div class="container ">
    <div class="row">
      <div class="col">
        <Form />
      </div>
      <div class="col-8">
        <h1>List Dessert </h1>
        <table class="table table-striped table-hover bg-light">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">Image</th>
              <th scope="col">Title</th>
              <th scope="col">Description</th>
              <th scope="col">Price</th>
              <th scope="col end-0">Action</th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="dessert in dessertStore.desserts">
              <ListDessert :id="dessert.id" :image="dessert.image" :title="dessert.title" :price="dessert.price"
                :description="dessert.description" @delete = "destroyDessert" />
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>

</template>

<style lang="scss" scoped>

</style>