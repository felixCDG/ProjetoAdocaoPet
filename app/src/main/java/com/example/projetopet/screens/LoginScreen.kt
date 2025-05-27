package com.example.projetopet.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetopet.R
import com.example.projetopet.http.httpAjuda
import com.example.projetopet.model.usuario
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    


    Box(
        modifier = Modifier
            .fillMaxSize()

    ){
        Image(
            painter = painterResource(R.drawable.fundo),
            contentDescription = " Backgroud ",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0x88000000))
        )

        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .size(100.dp)
            )
            Card (
                modifier = Modifier
                    .width(330.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                colors = CardDefaults.cardColors(Color(0x69FFE8C9))
            ){
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(35.dp)
                ){
                    Text(
                        text = "nome",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(5.dp))
                    val editTextNome = OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "email",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    val editTextEmail = OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "senha",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    val editTextSenha = OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "premium",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    val editTextPremium = OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "imagemPerfil",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    val editTextIP = OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "senhaRecuperacao",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    val editTextRS = OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )

                    Spacer( modifier = Modifier .height(18.dp))
                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(3.dp),
                        colors = CardDefaults.cardColors(Color(0xffA46731))
                    ){  }
                    Spacer( modifier = Modifier .height(18.dp))
                    val butaoCadastra = Button(
                        onClick = {
                            val usuario = usuario()
                            usuario.nome = editTextNome.toString()
                            usuario.email = editTextEmail.toString()
                            usuario.senha = editTextSenha.toString()
                            usuario.premium = editTextPremium.toString()
                            usuario.imagemPerfil = editTextIP.toString()
                            usuario.senhaRecuperacao = editTextRS.toString()

                            val gson = Gson()
                            val usuarioJson = gson.toJson(usuario)

                            println("+++++++++++++++:+:+:+:+" + usuarioJson)

                            CoroutineScope(Dispatchers.IO).launch {
                                val http = httpAjuda()
                                http.post(usuarioJson)
                            }


                        },
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(Color(0xffA46731))
                    ) {
                        Text(
                            text = "Cadastrar",
                            fontWeight = FontWeight.ExtraBold
                        )
                    }


                }
            }
        }
    }

}

@Preview
@Composable
private fun LoginScreensPreview() {
    LoginScreen()
}