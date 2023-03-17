object GameManager {
    private lateinit var gameBoard: GameBoard
    private lateinit var gameWindow: GameWindow

    fun start() {
        gameBoard = GameBoard()
        gameWindow = GameWindow(gameBoard)
    }
}
