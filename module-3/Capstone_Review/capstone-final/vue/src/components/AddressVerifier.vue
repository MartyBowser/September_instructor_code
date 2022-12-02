<template>
<div>
  <form v-on:submit.prevent="verifyAddress()">
      <div>
            <label for="reporterName">Street:</label>
            <input id="reporterName" type="text" v-model="address.street" />
      </div>
     <div>
            <label for="location">City:</label>
            <input id="location" type="text" v-model="address.city" />
      </div>
      <div>
            <label for="age">State:</label>
            <input id="age" type="text" v-model="address.state" />
      </div> 
      <div>
            <label for="age">Zip:</label>
            <input id="age" type="text" v-model="address.zip" />
      </div> 
      <input type="submit" value="Save" />
  </form>
  <div v-if="verification.result" >
      <p>Address Complete: {{verification.result.verdict.addressComplete}}</p>
      <p>Has Inferred Components: {{verification.result.verdict.hasInferredComponents}}</p>
      <p>Has Unconfirmed Components: {{verification.result.verdict.hasUnconfirmedComponents}}</p>
    </div>
</div>
</template>

<script>
import ReporterService from '@/services/ReporterService.js'
export default {
    name: "address-verifier",
    data(){
        return {
            address: {},
            verification: {}
        }
    },
    methods: {
        verifyAddress(){
           
            ReporterService.verifyAddress(this.address)
            .then(
                (response) => {
                       this.verification = response.data;
                }
            )
            .catch(
                (error) => {
                    alert("an error occurred");
                    if(error.response) {
                        alert(error.response.statusText)
                    }
                }
            )
        }
    }
}
</script>

<style>

</style>