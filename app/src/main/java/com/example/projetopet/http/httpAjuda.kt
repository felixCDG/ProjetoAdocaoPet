package com.example.projetopet.http

import com.google.gson.JsonArray
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody

class httpAjuda {

    fun post (jsonArray: String) : String{

        //URL do servidor
        val URL = "https://back-spider.vercel.app/user/cadastrarUser"

        //definir o cabeçalho
        val headerhttp = MediaType.parse("application/json; charset=utf-8")

        //cria o cliente que vai disparar a requisicao
        val client = OkHttpClient()

        //Cria o body da requisicao
        val body = RequestBody.create(headerhttp,jsonArray)

        //constroi a requisicao POST http para o servidor
        var request = Request.Builder().url(URL).post(body).build()

        //Utiliza o cliente para fazer a requisicao e recerber uma resposta
        val response = client.newCall(request).execute()

        return response.body().toString()

    }

}