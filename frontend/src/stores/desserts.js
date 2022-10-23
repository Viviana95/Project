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
        getDessertId (id) {
            return this.desserts.find(dessert => dessert.id === id)
        },
        addDessert (dessert) {
            return this.desserts.push({dessert, id:this.id++})
        },
        async deleteDessert(id){
            await fetch('http://localhost:8080/api/products/${id}',{method: 'DELETE'})                
            this.desserts.splice(this.desserts.indexOf(id),1) 
            
        }
    }
})