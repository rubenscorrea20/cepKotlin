package com.feign.feign

import org.omg.CORBA.Object
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CepController {

    @Autowired
    private lateinit var feignCep: FeignCep

    @GetMapping(value = ["/get/{cep}"])
    fun getCep(@PathVariable cep: String): ResponseEntity<String> {
        var cepReturn = feignCep.getCep(cep)

        println(cepReturn)

        return ResponseEntity(cepReturn, HttpStatus.OK)

    }

}