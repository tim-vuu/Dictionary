package com.truong_apps.dictionary.domain.repository

import com.truong_apps.dictionary.domain.model.WordItem
import com.truong_apps.dictionary.util.Result
import kotlinx.coroutines.flow.Flow


/**
 * @author Truong Vu
 */

interface DictionaryRepository {
    suspend fun getWordResult(
        word: String
    ): Flow<Result<WordItem>>
}