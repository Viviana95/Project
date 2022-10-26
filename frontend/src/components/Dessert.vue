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
    <div class="card h-100 w-100">
        <img :src="image" class="card-img" alt="...">
        <div class="content">
            <h3 class="card-text">{{title}}</h3>
            <h4 class="card-text">{{price}}</h4>
            <p class="card-text fw-bold">{{description}}
                <button @click="emitDessert" class="btn btn-primary"> <img src="../assets/anadir-al-carrito.png" alt=""> AÑADIR </button>
                </p>
                
        </div>
    </div>
</template>

<style lang="scss" scoped>


.card {
    margin: 50px auto;
    transition: 0.2s;
    overflow: hidden;
    display: flex;
    justify-content: center;
    box-shadow: rgb(0 0 0 / 20%) -40px 0px 50px;
    cursor: pointer;

    .content p {
        display: flex;
        flex-direction: column;
        color: black;        
        margin-bottom: -180px;
        transition: all .25s ease;
    }

    .content p button {
        padding: 8px 18px;
        border-radius: 10px;
        background: transparent;
        border: 4px solid #fff;
        color: rgb(0, 0, 0);
        font-size: .8rem;
        margin-top: 10px;
        margin-left: auto;
        cursor: pointer;
        transition: all .25s ease;
    }
}

.card:hover .content{
 p {
    margin-bottom: 0;
 }
 h3{
    color: black;
 }
 h4{
    color: black;
 }
   
}
.card:hover {
    box-shadow: 0 5px 30px 3px rgb(244, 214, 184);
  
}

.card:hover img {
    transform: scale(1.50);
    opacity: 0.5;
}

.card:after {
    width: 100%;
    content: "";
    left: 0;
    bottom: 0;
    height: 170px;
    position: absolute;
    background: linear-gradient(180deg, rgba(222, 9, 9, 0)0%, rgb(0, 0, 0)130%);
    z-index: 10;
    transition: all .25s ease;


}

.card img {
    height: 110%;
    z-index: 10;
    transition: all .25s ease;

}

.card .content {
    z-index: 30;
    position: absolute;
    bottom: 0;
    color: rgb(255, 255, 255);
    padding: 10px;
    padding-bottom: 20px;
}

.card .content p button:hover {
    background: #fff;
    color: rgb(3, 137, 28);
}
</style>