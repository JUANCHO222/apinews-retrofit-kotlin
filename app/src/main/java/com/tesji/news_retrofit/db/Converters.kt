package com.tesji.news_retrofit.db

import androidx.room.TypeConverter
import com.tesji.news_retrofit.models.Source

class Converters {
    @TypeConverter
    fun from(source: Source): String{
        return source.name
    }
    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}