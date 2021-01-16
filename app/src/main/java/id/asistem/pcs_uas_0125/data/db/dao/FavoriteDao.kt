package id.asistem.pcs_uas_0125.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import id.asistem.pcs_uas_0125.data.db.entities.EventFavorite

@Dao
interface FavoriteDao {

    @Insert
    fun insert(eventFavorite: EventFavorite)

    @Query("SELECT * FROM favorite")
    fun getAll() :List<EventFavorite>

    @Query("DELETE FROM favorite")
    fun deleteAll()

    @Query("SELECT * FROM favorite WHERE eventId = :id")
    fun getByid(id: Int) : List<EventFavorite>
}