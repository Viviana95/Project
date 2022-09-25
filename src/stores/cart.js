import { defineStore } from "pinia";

export const useCartStore = defineStore ({
    id: 'desserts',
    state: () => ({
       shoppingList: []
    }), 
    actions: {
       addDessertToCart(dessert){
        console.log ('pinia', dessert)
        this.shoppingList.push(dessert)

       }
    }
})