package com.monteiro.api.carroapi.repository

import com.monteiro.api.carroapi.entity.Carro
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CarroRepository : MongoRepository<Carro,String> {

    fun findByAno(ano: Int) : List<Carro>
    fun findByMarcaContaining(marca : String): List<Carro>
    fun findByPlaca(placa : String) : List<Carro>
}