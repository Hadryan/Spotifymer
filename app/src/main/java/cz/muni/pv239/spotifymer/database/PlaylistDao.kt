package cz.muni.pv239.spotifymer.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import cz.muni.pv239.spotifymer.model.Playlist

@Dao
interface PlaylistDao {

    @Query("SELECT * FROM playlists")
    fun getAll(): LiveData<List<Playlist>>

    @Query("SELECT * FROM playlists WHERE id = :id")
    fun get(id: Long): Playlist

    @Insert
    suspend fun insert(playlist: Playlist): Long

    @Delete
    suspend fun delete(playlist: Playlist)
}