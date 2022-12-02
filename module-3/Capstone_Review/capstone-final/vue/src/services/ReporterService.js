import axios from 'axios';

export default {
    saveReporter(reporter) {
        return axios.post("/reporters", reporter)
    },
    verifyAddress(address) {

        //this is hacky, but just to get it to work now
        address.addressLines = [address.street];

        return axios.post("/verifyAddress", address)
    }
}