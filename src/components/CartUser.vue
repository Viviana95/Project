<script setup>
    //emits
    const emits = defineEmits(['delete-item'])
    //props
   const props = defineProps({
    id: {
        Number, required: true
    },
    title: {
        type: String, required: true
    },
    price: {
        type: Number, required: true
    },
    image: {
        type: String, default: null
    },
   }) 
   
//methods
const cartDelet = () => {
    emits('delete-item', props.id) 
}
</script>

<template>
    <div>
        <table class="table w-100"> 
  <tbody>
    <tr>
        <th scope="row"></th> 
            <td scope="col-8" class="">  <img class="img-center" :src="image" alt=""> </td>    
        <td scope="col">{{title}}</td>
        <td scope="col">{{price}}</td>
        <td scope="col"><img type="button" class="img center" @click="cartDelet" src="../assets/quitar-del-carrito.png" alt=""></td>
    </tr>
  </tbody>
  </table>
     </div>
</template>


<style lang="scss" scoped>

</style>