import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/*
position 1:
- x position = 1
- y position = 1

position 2:
- x position = 2
- y position = 1

position 3:
- x position = 3
- y position = 1

position 4:
- x position = 4
- y position = 1

position 5:
- x position = 1
- y position = 2

position 6:
- x position = 2
- y position = 2

position 7:
- x position = 3
- y position = 2

position 8:
- x position = 4
- y position = 2

position 9:
- x position = 1
- y position = 3

position 10:
- x position = 2
- y position = 3

position 11:
- x position = 3
- y position = 3

position 12:
- x position = 4
- y position = 3

position 13:
- x position = 1
- y position = 4

position 14:
- x position = 2
- y position = 4

position 15:
- x position = 3
- y position = 4

position 16:
- x position = 4
- y position = 4
*/

public class Main {

  public static void main(String[] args){

    boolean start = false;
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    Board board = new Board();
    
    while (true) {
      System.out.println("Welcome to 2048! To start playing, type 'start'. ");
      String startBool = sc.nextLine();

      if (startBool.equals("start")) {
        start = true;
        break;
        board.play();
        
      }
    }


        //randomly give it a position
        /*Random rand = new Random();
        this.position = rand.nextInt(availablePositions.length);
        int index = this.position - 1;
        int takenPosition = availablePositions.remove(index);*/

  }

  
}
