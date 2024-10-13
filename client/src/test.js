import axios from 'axios'

axios.create({
    baseURL: "https://siscandesv10.sispro.com.br/SpRhFun4WebService/rest/SeuRhFuncionario/GetToken?TenantId=1580&Reason={ARH}&Code=APPSEURH_SISPRO&Usuario=09354555829",
    headers: {
        "Content-type": "application/json",
        'isAuthentication':0
    }
});

axios.get().then(e=>{
    console.log(e)
})
