

    public class Main {
        public static void main(String[] args) {

            int number; number = 6;
            int input1; input1 = 4;
            int input2; input2 = 20;
            String name; name = "Micha Farrah Girgis";

            hello(name);
            positiveOrNegative(number);
            postiveOrZeroOrNegativ(number);
            bartender(number);
            sum(input1, input2);

            //insert behaviour//


        }

      //methods section//
  public static void hello(String name){
    System.out.println("Hello, " + name +"!");
  }

  public static void positiveOrNegative(int number){
    if ( number>0 ){
    System.out.println("This number is positive!");}
    else {
    System.out.println("This number is negative!");}
  }

  public static void postiveOrZeroOrNegativ (int number){
    if ( number>0 ){
    System.out.println("This number is positive!");}
    if ( number==0 ){
    System.out.println("This number is zero!");}
    else {
    System.out.println("This number is negative!");}
  }

  public static void bartender (int number){

    switch (number){
    case 1:
    System.out.println("You selected option 1");
    break;
    case 2:
    System.out.println("You selected option 2");
    break;
    case 3:
    System.out.println("You selected option 3");
    break;
    default:
    System.out.println("Invalid choice");}
  }

  public static void sum (int input1, int input2){

    int result = (input1 + input2);
      System.out.println("4 + 20 = " + result);

    }
  }
