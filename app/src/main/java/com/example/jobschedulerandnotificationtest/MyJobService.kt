package com.example.jobschedulerandnotificationtest

import android.app.job.JobParameters
import android.app.job.JobService
import android.widget.Toast

class MyJobService : JobService(){
    override fun onStartJob(params: JobParameters?): Boolean {
        Toast.makeText(this, "hoge", Toast.LENGTH_LONG).show()
        return true
    }

    override fun onStopJob(params: JobParameters?): Boolean {
        return false
    }
}