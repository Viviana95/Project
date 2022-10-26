<script setup>
import { useDessertsStore } from '../stores/desserts';


const props = defineProps({
    id: {
        type: Number, default: null
    },
    image: {
        type: String, default: null
    },
    title: {
        type: String, required: true
    },
    price: {
        type: Number, required: true
    },
    description: {
        type: String, default: null
    }
})
const {deleteDessert} = useDessertsStore()

//methods
 

</script>
<template>
    <!-- <img src="../assets/lista-de-verificacion.gif" alt=""> -->
    <th scope="row">{{id}}</th>
    <td><img :src="image" class="img w-50" alt=""></td>
    <td>{{title}}</td>
    <td>{{description}}</td>
    <td>{{price}}</td>
    <td>
        <!-- <img class="img m" src="../assets/edit.png" alt=""><img src="../assets/delete.png" alt=""> -->
        <button type="button" class="btn btn-info" @click="">Editar</button>
        <button type="button" class="btn btn-danger" @click="deleteDessert()">Eliminar</button>
    </td>



</template>