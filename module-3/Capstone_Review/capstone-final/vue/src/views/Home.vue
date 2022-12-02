<template>
  <div class="home">
    <h1>Home</h1>
    <p>You must be authenticated to see this</p>
    <reporter-form></reporter-form>
    <hr/>
    <h1>Address Verifier:</h1>
    <address-verifier />
  </div>
</template>

<script>
import ReporterForm from '@/components/ReporterForm.vue'
import AddressVerifier from '@/components/AddressVerifier.vue'
export default {
  name: "home",
  components: {
    ReporterForm, AddressVerifier
  }
};
</script>
