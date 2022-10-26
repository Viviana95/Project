<script>
</script>

<template>
  <div class="container">
    <div class="card ">
      <img class="img-fluid " src="../assets/3.png" alt="">
    </div>
    <div class="card">
      <img class="img-fluid " src="../assets/5.png" alt="">
    </div>
    <div class="card">
      <img class="img-fluid " src="../assets/4.png" alt="">
    </div>
  </div>
</template>
<style scoped lang="scss">
.container {
  margin-top: 5%;
  width: 50%;
  height: 30%;
  display: flex;

  .card:hover first-child {
    margin-left: 5rem;
  }

  .card {
    margin-left: -6rem;
    box-shadow: rgb(0 0 0 / 50%) -40px 0px 50px;
    transition: 0.3s;

    img {
      width: 100%;
    }
  }

  .card:hover {
    margin-left: 5rem;
    transform: rotateZ(6deg);
  }
}
</style>