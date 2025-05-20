package com.example.projetopet.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetopet.R

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
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .size(270.dp)
            )
            Card (
                modifier = Modifier
                    .height(1500.dp)
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
                        text = "Nome*",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(5.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "Email*",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "Senha*",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "Confirma Senha*",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "Palavra Chave*",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "Idade*",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "CPF*",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "Contato*",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "Contato reserva*",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "Estado*",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "Cidade*",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )
                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "Qual o seu interesse?*",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp),
                        border = BorderStroke( width = 1.dp, Color.Black)
                    ){
                        Column (
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(7.dp)
                        ){
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth()
                            ){
                                Icon(
                                    imageVector = Icons.Default.CheckCircle,
                                    contentDescription = ""
                                )
                                Text(
                                    text = "Quero adotar",
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(1.dp)

                                )
                                Spacer( modifier = Modifier .padding(horizontal = 5.dp))
                                Icon(
                                    imageVector = Icons.Default.CheckCircle,
                                    contentDescription = ""
                                )
                                Text(
                                    text = "Quero divulgar",
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(1.dp)

                                )
                            }

                            Spacer( modifier = Modifier .height(6.dp))
                            Row (
                                modifier = Modifier
                                    .fillMaxSize()
                            ){
                                Icon(
                                    imageVector = Icons.Default.CheckCircle,
                                    contentDescription = ""
                                )
                                Text(
                                    text = "Quero divulgar",
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(1.dp)

                                )
                            }

                        }
                    }

                    Spacer( modifier = Modifier .height(7.dp))
                    Text(
                        text = "Cidade*",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer( modifier = Modifier .height(3.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier .fillMaxWidth(),
                        colors = TextFieldDefaults.colors(),
                        shape = RoundedCornerShape(10.dp),
                    )

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