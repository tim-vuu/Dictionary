package com.truong_apps.dictionary.domain.model


data class WordItem(
    val word: String,
    val meanings: List<Meaning>,
    val phonetic: String
)