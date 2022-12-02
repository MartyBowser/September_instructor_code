<template>
  <form v-on:submit.prevent="saveReporter()">
      <div>
            <label for="reporterName">Reporter Name:</label>
            <input id="reporterName" type="text" v-model="reporter.reporterName" />
      </div>
     <div>
            <label for="location">Location:</label>
            <input id="location" type="text" v-model="reporter.location" />
      </div>
      <div>
            <label for="age">Age:</label>
            <input id="age" type="number" v-model="reporter.age" />
      </div> 
      <input type="submit" value="Save" />
  </form>
</template>

<script>
import ReporterService from '@/services/ReporterService.js'
export default {
    name: "reporter-form",
    data(){
        return {
            reporter: {}
        }
    },
    methods: {
        saveReporter(){
           
            ReporterService.saveReporter(this.reporter)
            .then(
                (response) => {
                        alert(response.status);
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