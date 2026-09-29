package iscteiul.ista;

import iscteiul.ista.battleship.Fleet;
import iscteiul.ista.battleship.Tasks;

/**
 * Main application class for the Battleship game.
 * Starts the application and executes the configured game task.
 *
 * @author britoeabreu
 * @author adrianolopes
 * @author miguelgoulao
 */
public class App
{
    /**
     * Main entry point of the Battleship application.
     *
     * @param args command-line arguments
     */
    public static void main( String[] args )
    {

        System.out.printf("\n***  Battleship Game ***\n");

        // Tasks.taskA();
        Tasks.taskB();
        //	Tasks.taskC();
        //	Tasks.taskD();
    }
}
