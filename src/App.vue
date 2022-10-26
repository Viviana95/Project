<script setup>
import { RouterLink, RouterView } from "vue-router";

</script>

<template> 
<div>
  <header>     
        
  <nav class="navbar navbar-expand-lg bg-light" >
    <div class="container-fluid">
      <!-- <h1 class="navbar-brand" href="#">DESSERT</h1> -->
      <img src="./assets/logo.png" class="img w-15px mb-4 " alt="">
    <button class="navbar-toggler " type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav d-flex">
        <a class="nav-link"> <RouterLink to="/">Home</RouterLink></a>
        <a class="nav-link"> <RouterLink to="/products">Products</RouterLink></a>
        <a class="nav-link"><RouterLink to="/cart">Carrito</RouterLink></a>
        <a class="nav-link"><RouterLink to="/admin">Admin</RouterLink></a>       
      </div>
    </div>
  </div>    
  </nav>
     <!--  <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/about">About</RouterLink>
        <RouterLink to="/class">prueba</RouterLink>
      </nav> -->
     
  </header>
  <div class="container">  
  <RouterView />
</div>
</div>
</template>

<style>
 

nav { 
  
  background-image: linear-gradient(to bottom, transparent, #ffffff), url(./assets/banner.png);  
  background-repeat:no-repeat; 
  background-size: cover;
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  font-variant: small-caps;


}
img{
  width: 10%;
}

nav a.router-link-exact-active {
  color: rgb(237, 36, 53);
}



nav a {
  display: inline-block;
  padding: 0 1rem;
  border-left: 1px solid rgb(233, 172, 226);
}



@media (min-width: 1024px) {
  


}  
</style>
