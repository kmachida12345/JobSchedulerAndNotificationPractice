package com.example.jobschedulerandnotificationtest

import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val jobScheduler = getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
            val job = JobInfo.Builder(
                    0,
                    ComponentName(this, MyJobService::class.java)
            )
                    .setMinimumLatency(5000)
                    .setOverrideDeadline(10000)
                    .build()
            jobScheduler.schedule(job)
        }
    }
}