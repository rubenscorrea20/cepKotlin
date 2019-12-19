package com.feign.feign



import org.springframework.http.HttpRequest
import org.springframework.http.client.ClientHttpRequestExecution
import org.springframework.http.client.ClientHttpRequestInterceptor
import org.springframework.http.client.ClientHttpResponse
import org.springframework.stereotype.Component


@Component
class InterceptorCep: ClientHttpRequestInterceptor{
    override fun intercept(request: HttpRequest, body: ByteArray, execution: ClientHttpRequestExecution): ClientHttpResponse {

        var response = execution.execute(request, body)

        response.headers.add("teste", "work")

        return response

    }


}