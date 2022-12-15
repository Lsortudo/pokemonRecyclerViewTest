package com.example.recyclerviewtest.model

data class Pokemon(
    var name: String? = null,
    var generation: String? = null,
    var thumbnailUrl: String? = null,
    var link: String? = null,
    var listType: Array<String>,


    )