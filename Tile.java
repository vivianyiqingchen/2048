
import java.lang.Math;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Tile {

  private int number;
  private int position;
  private int xPosition;
  private int yPosition;
  //private static ArrayList<Integer> availablePositions = new ArrayList<Integer>;
  
  public Tile() {
    this.number = 2;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void move(String direction) {

    //no while loop here because it keeps on calling everything with no delay, the while loop will be
    //in Main.java where the actual method is called

    //asking for direction in here for greater program simplicity --> JK that was a bad idea

    /*Scanner sc = new Scanner(System.in);
    System.out.println("Which direction would you like to move in? ");
    String direction = sc.nextLine();*/

    if (direction.equals("left")) {
      xPosition--;
    }
  
    else if (direction.equals("right")) {
      xPosition++;
    }
  
    else if (direction.equals("down")) {
      yPosition++;
    }
  
    else if (direction.equals("up")) {
      yPosition--;
    }
      
    else {
      System.out.println("Please type in 'left', 'right', 'up', or 'down'. ");
    }
    System.out.println("Fuck");

    
  }

  public void assignXPosition() {
    if (position == 1 || position == 5 || position == 9 || position == 13) {
      xPosition = 1;
    }
    
    else if (position == 2 || position == 6 || position == 10 || position == 14) {
      xPosition = 2;
    }

    else if (position == 3 || position == 7 || position == 11 || position == 15) {
      xPosition = 3;
    }

    else {
      xPosition = 4;
    }
  }

  public void assignYPosition() {
    if (position == 1 || position == 2 || position == 3 || position == 4) {
      yPosition = 1;
    }
    
    else if (position == 5 || position == 6 || position == 7 || position == 8) {
      yPosition = 2;
    }

    else if (position == 9 || position == 10 || position == 11 || position == 12) {
      yPosition = 3;
    }

    else {
      yPosition = 4;
    }
  }

  public void assignPosition() {
    if (xPosition == 1) {
      if (yPosition == 1) {
        position = 1;
      }
      else if (yPosition == 2) {
        position = 2;
      }
      else if (yPosition == 3) {
        position = 3;
      }
      else {
        position = 4;
      }
    }

    else if (xPosition == 2) {
      if (yPosition == 1) {
        position = 5;
      }
      else if (yPosition == 2) {
        position = 6;
      }
      else if (yPosition == 3) {
        position = 7;
      }
      else {
        position = 8;
      }
    }

    else if (xPosition == 3) {
      if (yPosition == 1) {
        position = 9;
      }
      else if (yPosition == 2) {
        position = 10;
      }
      else if (yPosition == 3) {
        position = 11;
      }
      else {
        position = 12;
      }
    }

    else if (xPosition == 4) {
      if (yPosition == 1) {
        position = 13;
      }
      else if (yPosition == 2) {
        position = 14;
      }
      else if (yPosition == 3) {
        position = 15;
      }
      else {
        position = 16;
      }
    }
  }
  /*public static void main(String[] args) {
    Tile tile = new Tile();
  }*/

  

}
