package com.andreasjj.controller

import com.andreasjj.repository.GameRepository
import io.micronaut.http.HttpRequest
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import javax.inject.Inject

@Controller("/")
class Controller {
    @Inject
    lateinit var gameRepository: GameRepository

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun index(request: HttpRequest<*>): String {
        return "Hello"
    }
}