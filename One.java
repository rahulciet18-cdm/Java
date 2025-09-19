import java.util.Scanner;
class One{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    System.out.println("add/sub/multi/div");
    scan.nextLine();
    String operators=scan.nextLine();
    if(operators.equals("add")){
      System.out.println(a+b);
    }
    else if(operators.equals("sub")){
      System.out.println(a-b);
    }
    else if(operators.equals("multi")){
      System.out.println(a*b);
    }
      else if(operators.equals("div")){
      System.out.println(a/b);
    }
      else{
        System.out.println("error");
      }
  }
}