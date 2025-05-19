
/**
 * Beschreiben Sie hier die Klasse Board.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Board
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public char[][] board;
    private int count;
    private char c;
    /**
     * Konstruktor für Objekte der Klasse Board
     */
    public Board()
    {
        // Instanzvariable initialisieren
        board = new char[3][3];
        count=0;
        clearBoard();
        display();
    }

    public void clearBoard(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){ 
                board[i][j] =' ';           
            }
        }
    }

    public void clearScreen(){
        int i=0;
        while(i<30){
            System.out.println();
            i++;
        }
    }

    public void display() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {System.out.println("---|---|---");}
        }
        System.out.println("Enter X or O");
    }

    public boolean isEmpty(int i, int j){
        if(board[i][j]==' ') {return true;}
        else return false;
    }

    public void placeSymbol( int i, int j){
        if(isEmpty(i,j)){
            if(count%2==0){
                c= 'X';

            }
            else { c='O';}
            count++;

            board[i][j]=c;
            clearScreen();
            display();
        }
        else System.out.println("Fehler");

    }

    public String check(){

        // Reihen und Spalten prüfen
        for (int i = 0; i < 3; i++) {
            // Zeile
            if (board[i][0] != ' ' && board[i][0] == board[i][1] &&
            board[i][1] == board[i][2]) {
                return board[i][0] + " won";
            }

            // Spalte
            if (board[0][i] != ' ' &&
            board[0][i] == board[1][i] &&
            board[1][i] == board[2][i]) {
                return board[0][i] + " won";
            }
        }

        // Diagonale 1
        if (board[0][0] != ' ' &&
        board[0][0] == board[1][1] &&
        board[1][1] == board[2][2]) {
            return board[0][0] + " won";
        }

        // Diagonale 2
        if (board[0][2] != ' ' &&
        board[0][2] == board[1][1] &&
        board[1][1] == board[2][0]) {
            return board[0][2] + " won";
        }

        // Falls niemand gewonnen hat
        return "tie";
    }

    public String isFull(){
        boolean b= true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]!=' ') b=true; 
                else b=false;
            }
        }

        if(b) return "is full"; else return "not yet";
    }
}

