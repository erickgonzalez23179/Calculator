package CaLC;
import java.util.Scanner;
import static java.lang.Math.*;


  public class Calc {
    double firstNum, lastNum;
  
	    
  public static void CalcInput() {
        @SuppressWarnings("resource")
	    Scanner inputInfo = new Scanner(System.in);
		
        System.out.print("what opperation do you want to execute? [+, -, *, /, ^, |]");
    	char operation = inputInfo.next().charAt(0);
    	
		System.out.print("What is the first number you want to use?");
		double firstNum = inputInfo.nextDouble();
		
  
		
		System.out.print("What is the last number?");
		double lastNum = inputInfo.nextDouble();
		
	    
    	if (operation == '+'){  
    		Addition add = new Addition();
    		add.Addition(firstNum, lastNum);
    		Calc.CalcInput();
        } else if  (operation == '-') {
        	Subtraction sub = new Subtraction();
        	sub.Subtraction(firstNum, lastNum);
        	Calc.CalcInput();
        } else if (operation == '*'){
        	Multiplication mul = new Multiplication();
        	mul.Multiplication(firstNum, lastNum);
        	Calc.CalcInput();
        } else if (operation == '/') {
        	if (lastNum != 0) {
        		Division div = new Division();
            	div.Division(firstNum, lastNum);
            	Calc.CalcInput();
        		} else {
        			System.out.print("you can not divide by 0.");
        			Calc.CalcInput();
        		}
        } else if (operation == '^'){
        	Power pow = new Power();
        	pow.Power(firstNum, lastNum);
        	Calc.CalcInput();
        } else if (operation == '|'){
        	squareRoot sqr = new squareRoot();
        	sqr.squareRoot(firstNum, lastNum);
        	Calc.CalcInput();
        } else {
        
        	System.out.println("Operation does not exist or you have input am invalid operation please use one of these [+, -, *, /, ^, |]");
        	Calc.CalcInput();
        }
    
  }





}



