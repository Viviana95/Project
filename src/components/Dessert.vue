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
        type: String, required: true
    },
    description: {
        type: String, default: null
    }
})

</script>

<template>

    <div class="col">
        <div class="card">
            <img :src="image" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">{{title}}</h5>
                <p class="card-text">{{description}}</p>
                <p class="card-text">{{price}}</p>
                <a href="#" class="btn btn-primary">Añadir</a>
            </div>
        </div>
    </div>

</template>


<style lang="scss" scoped>
.col {
    display: grid;
    justify-content: center;
    grid-template-columns: 1fr 2fr;
    height: auto;
}
</style>