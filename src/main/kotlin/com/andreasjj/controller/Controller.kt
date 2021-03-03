package com.andreasjj.controller

import com.andreasjj.repository.GameRepository
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.server.util.HttpClientAddressResolver
import java.time.Instant
import javax.inject.Inject

@Controller("/ticket")
class TicketController {
    @Inject
    lateinit var gameRepository: GameRepository

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun index(request: HttpRequest<*>): String {
        return "Hello"
    }
}