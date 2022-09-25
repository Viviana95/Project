import { defineStore } from "pinia";

export const useCartStore = defineStore ({
    id: 'desserts',
    state: () => ({
       shoppingList: []
    }), 
    //computada debe retorna
    getters:{
      getTotal: state => {
         let total = 0
         state.shoppingList.forEach(item => total += item.price)
         return total
      }
    },
    actions: {
       addDessertToCart(dessert){
        console.log ('pinia', dessert)
        this.shoppingList.push(dessert)
       },
       remove
       
    }
})