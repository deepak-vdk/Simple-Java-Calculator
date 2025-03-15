import java.util.Scanner;

class calculator{
  public int addition(int x,int y){
    int result=x+y;
    return  result;
  }
  public int subtraction(int x,int y){
    int result=x-y;
    return  result;
  }
  public int multiplication(int x,int y){
    int result=x*y;
    return  result;
  }
  public float division(float x,float y){
    if(y==0){
      System.out.println("Enter a valid number");
    }
    float result=x/y;
    return  result;
  }
}
public class calcMain {
  public static void main(String[] args) {

  //Scanner Creation 
  Scanner sc =new Scanner(System.in);

  //object creation
  calculator obj=new calculator();

  //Continue or not
  int Continue =0;


  do { 

    System.out.println("-------------------------");
    System.out.println("SIMPLE CALCULATOR");
    System.out.println("-------------------------");
    System.out.println();


    //getting operation value
    System.out.print("Press What Operation To Do (+,-,*,/): ");
    char symbol=sc.next().charAt(0);

    //getting value
    System.out.print("Enter the First Number: ");
    int x = sc.nextInt();

    System.out.print("Enter the Second Number: ");
    int y = sc.nextInt();

    switch(symbol){
      case '+' :
     
        //methodCalling
        System.out.println("The Addition Of "+x+" & "+y+" is "+ obj.addition(x,y));
        break;

      case '-':
        //methodCalling
        System.out.println("The Subtraction Of "+x+" & "+y+" is "+ obj.subtraction(x, y));
        break;

      case '*':
        //methodCalling
        System.out.println("Multiplication Of "+x+" & "+y+" is "+ obj.multiplication(x, y));
        break;

      case '/':
        //methodCalling
        System.out.println("Division Of "+x+" & "+y+" is "+ obj.division(x, y));
        break;
      default:
        System.out.println("Enter A Valid Option");
    }

  System.out.println("Do You Want To Continue....?");
  System.out.println("Press 1 To Continue  & Press 0 to Exit");
  System.out.print("Whats Your Option: ");
  Continue=sc.nextInt();


  }while(Continue == 1);
  sc.close();
}
}


  
