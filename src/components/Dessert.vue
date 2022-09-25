<script setup>
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
const emits = defineEmits(['addDessertCart'])

//methods
const emitDessert = () => {
    emits('addDessertCart', props.id)
}
</script>

<template>
    <div class="col">
        <div class="card bg-info" >
            <img :src="image" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">{{title}}</h5>
                <p class="card-text">{{description}}</p>
                <h3 class="card-text">{{price}}</h3>
                <button @click="emitDessert" class="btn btn-primary">Añadir</button>
            </div>
        </div>
    </div>

</template>

<style lang="scss" scoped>
// .col {
//     display: grid;
//     justify-content: center;
//     grid-template-columns: 1fr 2fr;
//     height: auto;
// }
</style>