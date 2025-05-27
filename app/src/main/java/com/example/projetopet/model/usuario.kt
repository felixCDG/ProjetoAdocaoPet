package com.example.projetopet.model

class usuario {

    var nome = ""
    var email = ""
    var senha = ""
    var premium = ""
    var imagemPerfil = ""
    var senhaRecuperacao = ""


    override fun toString(): String {
        return "usuario(nome='$nome', email='$email', senha='$senha', premium='$premium', imagemPerfil='$imagemPerfil', senhaRecuperacao='$senhaRecuperacao')"
    }


}