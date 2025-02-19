import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";

    ArrayList<String> lists = new ArrayList<String>();
    System.out.println("please enter words, enter STOP to stop")

    while (!input.equals("STOP"))
    {
      System.out.println("In the loop. Enter a word");
      input = sc.nextline();

      lists.add(input);

      System.out.println("The Arraylist is now " + lists); 
    }
    
    System.out.println("Exited the loop. ArrayList is now " + lists);
    System.out.println("Removing the last words");
    int LastIndex = words.size()-1;
    words.remove(LastIndex);

    System.out.println("Removed the last word. Arraylist is now " + lists);

    System.out.println ("the soze pf th elist is " + words.size());
    System.out.println("ArrayLists:" + words);
    Starting 
    

  }
}

  