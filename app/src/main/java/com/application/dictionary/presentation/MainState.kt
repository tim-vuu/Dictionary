package com.truong_apps.dictionary.presentation

import com.truong_apps.dictionary.domain.model.WordItem

/**
 * @author Truong Vu
 */

data class MainState(
    val isLoading: Boolean = false,
    val searchWord: String = "",

    val wordItem: WordItem? = null
)
