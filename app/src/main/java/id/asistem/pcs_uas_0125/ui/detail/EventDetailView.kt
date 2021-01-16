package id.asistem.pcs_uas_0125.ui.detail


import id.asistem.pcs_uas_0125.data.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}