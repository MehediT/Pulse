package com.toure.pulse.infrastructure.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.toure.pulse.infrastructure.database.dao.UserDao
import com.toure.pulse.infrastructure.database.entity.UserEntity

@Database(entities = [UserEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao() : UserDao

    companion object{
        @Volatile
        private var Instance : AppDatabase? = null

        fun getDatabase(context: Context) : AppDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, AppDatabase::class.java, "pulse_database")
//                    .createFromAsset("database/pulse.db")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }
    }
}