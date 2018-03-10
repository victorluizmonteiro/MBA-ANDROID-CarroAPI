package com.monteiro.api.carroapi.service

import com.monteiro.api.carroapi.entity.Carro
import com.monteiro.api.carroapi.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarroService {

    @Autowired
    lateinit var carroRepository :CarroRepository

    fun buscarCarroPorMarca(marca:String):List<Carro>{

        return carroRepository.findByMarcaContaining(marca)
    }

    fun buscarCarroPorAno(ano : Int):List<Carro>{

        return carroRepository.findByAno(ano);
    }

    fun buscarCarroPorPlaca(placa : String): List<Carro>{
        return carroRepository.findByPlaca(placa)


    }

    fun buscarTodos():List<Carro>{
        return carroRepository.findAll()
    }

    fun cadastrar(carro : Carro){

        carroRepository.save(carro)

    }
}
