class GameBoardObserver {
    private val observers = mutableListOf<GameBoardObserver>()
    // Logique du jeu

    fun addObserver(observer: GameBoardObserver) {
        observers.add(observer)
    }

    private fun notifyObservers() {
        observers.forEach { it.update() }
    }
}