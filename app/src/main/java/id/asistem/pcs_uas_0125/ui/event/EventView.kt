package id.asistem.pcs_uas_0125.ui.event

import id.asistem.pcs_uas_0125.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}