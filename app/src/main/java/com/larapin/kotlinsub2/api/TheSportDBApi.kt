package com.larapin.kotlinsub2.api

import com.larapin.kotlinsub2.BuildConfig

object TheSportDBApi {
    fun getEvent(league: String?, event: String?): String{
        return BuildConfig.BASE_URL + "api/v1/json/${BuildConfig.TSDB_API_KEY}" + "/"+event+".php?id="+league
    }

    fun getEventDetail(eventId: String?): String{
        return BuildConfig.BASE_URL + "api/v1/json/${BuildConfig.TSDB_API_KEY}" + "/lookupevent.php?id="+eventId
    }
 }
}