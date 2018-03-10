package com.monteiro.api.carroapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
// O ? indica que o atributo pode ser null
data class Carro(@Id var id: String?,
                 var marca: String,
                 var modelo: String,
                 var ano: Int,
                 var placa: String,
                 var urlImage:String) {

}