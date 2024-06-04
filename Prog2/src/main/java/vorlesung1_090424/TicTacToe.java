package vorlesung1_090424;
/*
 * überall wurde public bzw. private nicht geschrieben,
 * weil sobald da nichts steht ist es automatisch private 
 * und somit auch nur in der package zusehen ist
 * 
 * enum ist eine eigene Klasse von der wir erben
 */
public class TicTacToe {

	enum State {EMPTY, X, O };		//ist ein zusammenhängende Typ bzw sonderfall einer Klasse
	// static final int EMPTY = 0; 	//Konstate initialisieren und deklarieren für einen Leerenfeld
	// static final int RED = 1; 		//Konstate für "auf das Feld hat rot gesetzt"
	// static final int BLACK = 2;		//Konstate für "auf das Feld hat schwarz gesetzt"
	State[][] field; 					// wir verschachteln 2 int-Arrays und diese heißt field(ist unser TicTacToe Spielfeld) 

    TicTacToe() 					//Konstruktor
    {
        field = new State[3][3]; 						//wie groß under Array ist 
        
        for(int row=0; row<field.length; row++) 
        	
            for(int column=0; column<field[row].length; column++)
                field[row][column]=State.EMPTY; 					//die Zelle mit den Koordinaten soll weiß sein
    }

    void makeMove(int i, int j, State player) 						//welche Feld mit welchen Koordinaten und welcher Player spielt 
    {
        if(field[i][j]==State.EMPTY && player!= State.EMPTY)    	//
            field[i][j]=player;										// hier wird auf das Feld rot oder schwarz gesetzt
    }
	
	
	
	
	public static void main(String[] args) {
		TicTacToe ticTacToe = new TicTacToe(); //erstellen eine neue Objekt TicTacToe
		ticTacToe.makeMove(0, 0, TicTacToe.State.X);
		ticTacToe.makeMove(0, 0, TicTacToe.State.O);
	}

}
