package com.truong_apps.dictionary.presentation

/**
 * @author Truong Vu
 */

sealed class MainUiEvents {
    data class OnSearchWordChange(
        val newWord: String
    ) : MainUiEvents()

    object OnSearchClick : MainUiEvents()
}