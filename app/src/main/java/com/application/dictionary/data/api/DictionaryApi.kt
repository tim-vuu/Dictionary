package com.truong_apps.dictionary.data.api

import com.truong_apps.dictionary.data.dto.WordResultDto
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @author Truong Vu
 */

interface DictionaryApi {

    @GET("{word}")
    suspend fun getWordResult(
        @Path("word") word: String
    ): WordResultDto?

    companion object {
        const val BASE_URL = "https://api.dictionaryapi.dev/api/v2/entries/en/"
    }

}


















