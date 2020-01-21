package com.vlgames.trialmemorygame

class CardLogic() {
    enum class CardState(val type: Int) {
        OPENED(0),
        CLOSED(1)
    }
    var cardState: CardState =  CardState.CLOSED
    var Index: Int = 0
}