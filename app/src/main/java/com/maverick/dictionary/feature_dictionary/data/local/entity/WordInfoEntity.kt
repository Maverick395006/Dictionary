package com.maverick.dictionary.feature_dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.maverick.dictionary.feature_dictionary.domain.model.Meaning
import com.maverick.dictionary.feature_dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val word: String,
    val phonetic: String,
    val meanings: List<Meaning>,
    @PrimaryKey val id: Int? = null,
){
    fun toWordInfo() = WordInfo(
        meanings = meanings,
        phonetic = phonetic,
        word = word
    )
}
