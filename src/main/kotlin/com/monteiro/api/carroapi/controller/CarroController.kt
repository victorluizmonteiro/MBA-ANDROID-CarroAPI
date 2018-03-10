package com.monteiro.api.carroapi.controller

import com.monteiro.api.carroapi.entity.Carro
import com.monteiro.api.carroapi.service.CarroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/carro")
class CarroController{
    @Autowired
    lateinit var carroService : CarroService

    @PostMapping
    fun cadastrar(@RequestBody carro: Carro): ResponseEntity<Carro> {
        try{
            carroService.cadastrar(carro)
            return ResponseEntity.ok(carro)
        }catch (e:Exception){
            return ResponseEntity.status(400).body(null)
        }



    }
    @GetMapping
    fun buscarTodos(): List<Carro> {

        return  carroService.buscarTodos()
    }


}