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
        <img :src="image" alt="">
        <p>{{id}}</p>
        <p>{{title}}</p>
        <p>{{price}}</p>
        <button @click="cartDelet">Eliminar</button>
    </div>
</template>


<style lang="scss" scoped>

</style>