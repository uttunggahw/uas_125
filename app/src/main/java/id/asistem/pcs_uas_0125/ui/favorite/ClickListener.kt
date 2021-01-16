package id.asistem.pcs_uas_0125.ui.favorite

import id.asistem.pcs_uas_0125.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}