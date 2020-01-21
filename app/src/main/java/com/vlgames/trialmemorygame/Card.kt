package com.vlgames.trialmemorygame

data class Card(
    var type: CardLogic.CardState,
    var index: Int = CardLogic().Index
)