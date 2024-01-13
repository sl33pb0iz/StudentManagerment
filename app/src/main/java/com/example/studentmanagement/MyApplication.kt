package com.example.studentmanagement

import android.app.Application
import com.example.studentmanagement.data.StudentDatabase

class MyApplication: Application() {
    val database: StudentDatabase by lazy { StudentDatabase.getDatabase(this) }
}