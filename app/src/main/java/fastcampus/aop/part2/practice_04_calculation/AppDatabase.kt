package fastcampus.aop.part2.practice_04_calculation

import androidx.room.Database
import androidx.room.RoomDatabase
import fastcampus.aop.part2.practice_04_calculation.dao.HistoryDao
import fastcampus.aop.part2.practice_04_calculation.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao

}
