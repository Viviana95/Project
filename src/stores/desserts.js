import { defineStore } from "pinia";

export const useDessertsStore = defineStore ({
    id: 'dessert',
    state: () => ({
        desserts:[]
    }), 
    actions: {
        async fetchDesserts (){
            await fetch('https://fakestoreapi.com/products')
            .then(res =>res.json())
            .then(data=> {
                this.desserts = data
            })
        },
        getDessertId (id) {
            return this.desserts.find(dessert => dessert.id === id)
        }
    }
})