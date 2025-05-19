
/**
 * Beschreiben Sie hier die Klasse TicTacToe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TicTacToe
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    private Board board;
    /**
     * Konstruktor für Objekte der Klasse TicTacToe
     */
    public TicTacToe()
    {
        // Instanzvariable initialisieren
        board = new Board();
        }

   public void enter( int row, int col){
        board.placeSymbol(row, col);
    }
    
    public void clear(){
    board.clearBoard();
    board.clearScreen();
    board.display();
    }
    
    public void getWinner(){
   System.out.println( board.check());
  }
}
