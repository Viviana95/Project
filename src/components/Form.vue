<script setup>
import { reactive } from 'vue';
import { useDessertsStore } from '../stores/desserts';
const {addDessert} = useDessertsStore()
 const data = ({
    
    title:"",
    description:"",
    price:"",
    image:""
 })

//methods

</script>
<template>
    <div class="col bg-gradient m-5">
        <h3>Añadir Producto</h3>
        <div class="form-floating mb-3">
            <input v-model="data.title" type="text" class="form-control" id="floatingInput" placeholder="title">
            <label for="floatingInput">Title</label>
        </div>
        <div class="form-floating mb-3">
            <input v-model="data.description" type="text" class="form-control" id="floatingInput" placeholder="description">
            <label for="floatingInput">Description</label>
        </div>
        <div class="form-floating mb-3">
            <input v-model="data.price" type="text" class="form-control" id="floatingInput" placeholder="price">
            <label for="floatingInput">Price</label>
        </div>
        <div class="form-floating mb-3">
            <input v-model="data.image" type="text" class="form-control" id="floatingInput" placeholder="url">
            <label for="floatingInput">Url image</label>
        </div>
        <button type="button" class="btn btn-danger ms-5 ">Deshacer</button>
        <button @click="addDessert(data)" type="button" class="btn btn-info ms-5">Aceptar</button>
       
    </div>
</template>
<style>
</style>