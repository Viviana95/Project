import { createRouter, createWebHistory } from "vue-router";
import ProductView from "../views/ProductView.vue";
import CartView from "../views/CartView.vue"; 
import SectionAdmin  from "../views/SectionAdminView.vue";
import HomeView from "../views/HomeView.vue"


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path:"/",
      name:"home",
      component:HomeView,
    },
    {
      path: "/products",
      name: "products",
      component: ProductView,
    },
    {
      path: "/cart",
      name: "cart",
      component: CartView,
    },
    {
      path:"/admin",
      name:"admin",
      component:SectionAdmin,
    },
  ],
});

export default router;
