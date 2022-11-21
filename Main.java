import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> sNum = new ArrayList<String>();
    ArrayList<Integer> val = new ArrayList<Integer>();
//
    
    
    boolean option = true;
    while (option == true){
       System.out.println("Press 1 to add an item.\nPress 2 to delete an item.\nPress 3 to update an item.\nPress 4 to show all the items.\nPress 5 to quit the programm.");
        String num = scanner.nextLine();
      if(num.equals("1")){
        System.out.println("Enter the name:");
        String name1 = scanner.nextLine();
        name.add(name1);
        System.out.println("Enter the serial number:");
        String sNum1 = scanner.nextLine();
        sNum.add(sNum1);
        System.out.println("Enter the value in dollars (whole number):");
        int val1 = scanner.nextInt();
        String val1S = scanner.nextLine();
        val.add(val1);
        
      }
      if(num.equals("2")){
        System.out.println("Enter the serial number of the item to delete:");
        String delete = scanner.nextLine();

        int index = name.indexOf(delete);
        name.remove(index);
        sNum.remove(index);
        val.remove(index); 
        
      }
      if(num.equals("3")){
        System.out.println("Enter the serial number of the item to change:");
        String change = scanner.nextLine(); // get serial num
        int index1 = sNum.indexOf(change); // get # index of serial num

        
        System.out.println("Enter the new name:");
        String cname = scanner.nextLine(); // get new name
        name.set(index1, cname);
        System.out.println("Enter the new value in dollars (whole number):");
        int cval = scanner.nextInt();
        String cvalS = scanner.nextLine();
        val.set(index1, cval);
        
        
      }
      if(num.equals("4")){
        for(int i = 0; i < name.size(); i++){
          System.out.println(name.get(i) + "," + sNum.get(i) + "," + val.get(i));
          
        }
      }
      if(num.equals("5")){
        option = false;
      }
      
      }
  }
}