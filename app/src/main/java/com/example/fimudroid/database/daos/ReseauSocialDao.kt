package com.example.fimudroid.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.fimudroid.database.models.ReseauSocial

@Dao
interface ReseauSocialDao {
    @Query("SELECT * FROM reseaux_sociaux")
    fun getAll(): List<ReseauSocial>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun inserAll(reseaux: List<ReseauSocial>)
}
