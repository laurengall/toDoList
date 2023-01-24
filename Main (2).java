import java.util.Scanner; 
import java.util.ArrayList; 
class Main {
  public static void main(String[] args) {
ArrayList<String> list = new ArrayList<String>();
  
  enter(list); 
    
  }

  public static void list(ArrayList<String> list){
    System.out.println();
    System.out.println("To-do List: ");
    int count = 1; 
    for (String i: list){
      System.out.println("Task #" + count + ": " + i);
       count++;
    }
    System.out.println();
    enter(list); 
    
  }

  public static void enter(ArrayList<String> list){
    Scanner input = new Scanner(System.in);
     System.out.println("Type 1 to add to your to-do list."); 
    System.out.println("Type 2 to remove from your to-do list."); 
   String str = input.nextLine(); 
    
    if (str.equals("1")){
      System.out.println("Type in your task:"); 
      list.add(input.nextLine());
      list(list); 
    }

    else if (str.equals("2")){
      remove(list); 
    } else {
      System.out.println("Type 1 or 2."); 
      enter(list); 
    }
  }
  public static void remove(ArrayList<String> list){
    Scanner input = new Scanner(System.in);
      System.out.println("Type in the number of the task you want to remove: "); 
      int number = input.nextInt(); 
      list.remove(number - 1); 
    list(list); 
  }
}