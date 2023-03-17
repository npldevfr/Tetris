import javax.swing.JFrame

class GameWindow(gameBoard: GameBoard) : JFrame(), GameBoardObserver() {
    init {
        gameBoard.addObserver(this)
    }

    override fun update() {
        // Mettre à jour l'affichage
    }
}
