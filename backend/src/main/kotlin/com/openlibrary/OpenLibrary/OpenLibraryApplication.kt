package com.openlibrary.OpenLibrary

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpenLibraryApplication

fun main(args: Array<String>) {
	runApplication<OpenLibraryApplication>(*args)
}
