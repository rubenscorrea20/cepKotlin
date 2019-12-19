package com.feign.feign

import org.omg.CORBA.Object
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping


@FeignClient(value = "cepService", url = "https://viacep.com.br/")
interface FeignCep {

    @RequestMapping("/ws/{cep}/json/")
    fun getCep(@PathVariable cep: String): String

}