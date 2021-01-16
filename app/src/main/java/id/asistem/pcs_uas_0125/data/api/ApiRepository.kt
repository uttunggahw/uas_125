package id.asistem.pcs_uas_0125.data.api

import java.net.URL


class ApiRepository{

    fun doRequest(url: String): String{
        return URL(url).readText()
    }
}