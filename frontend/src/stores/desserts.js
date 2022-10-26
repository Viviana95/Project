import { defineStore } from "pinia";

export const useDessertsStore = defineStore ({
    id: 'dessert',
    state: () => ({
        desserts:[]
    }), 
    
    actions: {
        async fetchDesserts (){
            await fetch('http://localhost:8080/api/products')
            .then(res =>res.json())
            .then(data=> {
                this.desserts = data
            })
        },
         async addDessert (dessert) {
            await fetch('http://localhost:8080/api/products',{method: 'POST'})
            this.desserts.push(dessert)
        }, 
        async getDessertId (id) {
            await fetch('http://localhost:8080/api/products/${id}',{method: 'PUT'})
             this.desserts.find(dessert => dessert.id === id)
        },
        async deleteDessert(id){
            await fetch('http://localhost:8080/api/products/${id}',{method: 'DELETE'})                
           this.desserts.splice(this.desserts.indexOf(id,1)) 
            
        }
    }
})