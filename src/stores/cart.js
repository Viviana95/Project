import { defineStore } from "pinia";

export const useCartStore = defineStore ({
    id: 'cart',
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
        localStorage.setItem('carrito','guardado')
       },
       removeDessertToCart(id){
         let cartDessert = this.shoppingList.find(item => item.id === id)
         let cartIndex = this.shoppingList.indexOf(cartDessert)
         this.shoppingList.splice(cartIndex, 1 )
       }
       
       
    }
})