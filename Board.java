import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Board {

  private boolean play;
  public Board() {
    play = true;

  }


  public void play() {
    ArrayList<Integer> availablePositions = new ArrayList<Integer>();
    ArrayList<Integer> takenPositions = new ArrayList<Integer>();

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    boolean moveFlag = false;
    boolean lose = false;

    ArrayList<Tile> existingTiles = new ArrayList<Tile>();

    for (int i = 1; i <= 16; i++) {
      availablePositions.add(i);
    }

    Tile tile1 = new Tile();
    int index = rand.nextInt(availablePositions.size());
    tile1.position = setPosition(availablePositions.get(index));
    takenPositions.add(tile1.position);
    availablePositions.remove(tile1.position);

    Tile tile2 = new Tile();
    index = rand.nextInt(availablePositions.size());
    tile2.position = setPosition(availablePositions.get(index));
    takenPositions.add(tile2.position);
    availablePositions.remove(tile2.position);

    /*for (int i : availablePositions) {
      System.out.println(i);
    }

    for (int i : takenPositions) {
      System.out.println(i);
    }*/ //UNCOMMENT TO TEST CODE

    while (!lose) {
      System.out.println("Which direction would you like to move in? ('left','right','up','down') ");
      String direction = sc.nextLine();
      while (!moveFlag) {
        if (direction.equals("left") || direction.equals("right") || direction.equals("up") || direction.equals("down")) {
          break;
        }
        
        else {
          System.out.println("Please type 'left','right','up', or 'down'. "); //maybe modify this so the while loop doesn't cause issues
        }
      }

      for (Tile tile : existingTiles) {
        if (direction.equals("left")) {
          if (tile.xPosition == 1) {
            continue;
          }
          else if (/*tile.position - 1 is in availablePositions*/ availablePositions.contains(tile.position - 1)) {
            tile.position = tile.position --;
            tile.assignXPosition();
            tile.assignYPosition();
          }
        }
        tile.move(direction);
      }

      Tile tile
    }
    

  }

}
