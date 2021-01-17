package com.larapin.kotlinsub2.event

import com.larapin.kotlinsub2.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}