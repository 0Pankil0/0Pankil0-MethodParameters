import java.util.Scanner;
class Main {
  public static void main (String[] args){
  //Taking first input...
    Scanner input1 = new Scanner(System.in);
    System.out.println( "Hey, How are you?");
    String n1 = input1.nextLine();
    System.out.println( n1 + "That's good.");
  //Taking second input...
    System.out.println( "Please input your first value.");
    Scanner input2 = new Scanner(System.in);
    double n2 = input2.nextDouble();
  //Taking third input...
    System.out.println( "Please add second value.");
    Scanner input3 = new Scanner(System.in);
    double n3 = input3.nextDouble();
  //Asking about triangle or rectangle...
    System.out.println("Is it a rectangle or triangle ?");
    Scanner input4 = new Scanner(System.in);
    String n4 = input4.nextLine();
  //Cheking is it triangle or rectangle...
    if(n4.equalsIgnoreCase("rectangle")) {
      double result = areaOfRectangle(n2, n3);
      System.out.println("Area of rectangle is" +result);
    }
    else if(n4.equalsIgnoreCase("triangle")){
      areaOfTriangle(n2, n3);
    }
  //Closing all inputs...
    input1.close();
    input2.close();
    input3.close();
    input4.close();

  //Ending program...
  System.out.println("This is the end of programm...");
}
  //Calling method number 1...
  public static double areaOfRectangle(double n2, double n3){
    double result = n2  * n3;
    return result;
    //When printline is not here then type variable after 
    // restern otherwise it will print 0.0
  }
  //Calling method 2...
  public static double areaOfTriangle(double n2, double n3){
    double result = n2  * n3 * 0.5;
    System.out.println("Area of Triangle is" + result);
    return 0.0;
    //When printline is here then type 0.0 after restern 
    //otherwise it will not perfprm see rectangle method

  }
}