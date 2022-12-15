package com.example.recyclerviewtest.model

data class Pokemon(
    var name: String? = null,
    var generatioon: String? = null,
    var thumbnailUrl: String? = null,
    var link: String? = null,
    var listType: List<Type> = listOf(),
)

data class Type (
    var type : String? = null
        )

