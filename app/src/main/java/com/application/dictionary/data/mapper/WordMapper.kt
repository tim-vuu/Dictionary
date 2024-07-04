package com.truong_apps.dictionary.data.mapper

import com.truong_apps.dictionary.data.dto.DefinitionDto
import com.truong_apps.dictionary.data.dto.MeaningDto
import com.truong_apps.dictionary.data.dto.WordItemDto
import com.truong_apps.dictionary.domain.model.Definition
import com.truong_apps.dictionary.domain.model.Meaning
import com.truong_apps.dictionary.domain.model.WordItem

/**
 * @author Truong Vu
 */


fun WordItemDto.toWordItem() = WordItem (
    word = word ?: "",
    meanings = meanings?.map {
        it.toMeaning()
    } ?: emptyList(),
    phonetic = phonetic ?: ""
)

fun MeaningDto.toMeaning() = Meaning(
    definition = definitionDtoToDefinition(definitions?.get(0)),
    partOfSpeech = partOfSpeech ?: ""
)


fun definitionDtoToDefinition(
    definitionDto: DefinitionDto?
) = Definition(
    definition = definitionDto?.definition ?: "",
    example = definitionDto?.example ?: ""
)














