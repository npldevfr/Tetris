


class GameBoard(val width: Int, val height: Int) {
    private val board = Array(height) { y -> Array(width) { x -> Cell(x, y) } }
    private var currentTetrimino: Tetrimino = TetriminoFactory.createRandomTetrimino()

    // Vérifie si une cellule est occupée
    fun isCellFilled(x: Int, y: Int): Boolean = board[y][x].filled

    // Logique pour faire descendre, déplacer et pivoter le Tetrimino
    // Logique pour vérifier les collisions et les lignes complétées
    // Logique pour mettre à jour le plateau de jeu et notifier les observateurs
}
