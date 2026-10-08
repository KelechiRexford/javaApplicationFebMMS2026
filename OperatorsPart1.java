public class OperatorsPart1{
    public static void main(String[] args){
		//Assignment Operator(=)
		
		int num = 100;
		System.out.printf("Number is %d%n",num);
		
		//Arithmetic Operator(+,-,*,/,%)
		int num1 = 123;
		int num2 = 200;
		
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		int multiplcation = num1 * num2;
		double division = (double)num1 / num2;
		int remainder = num1 % num2;
		
		//compound assignment Operator(+=,-=,*=,/=,%=)
		int number1 = 20;
		int number2 = 2;
		
		number1 -= number2
		
		System.out.println("---------------Arithmetic Output------------------");
		
		System.out.printf("%d + %d =%d%n",num1,num2,addition);
		System.out.printf("%d - %d =%d%n",num1,num2,subtraction);
		System.out.printf("%d * %d =%d%n",num1,num2,multiplcation);
		System.out.printf("%d / %d =%.2f%n",num1,num2,division);
		System.out.printf("%d %% %d =%d%n",num1,num2,remainder);
		System.out.println("---------------------------------");
		
		System.out.println("---------------Compound Output------------------");
		
		//Realtional Operator(>,<, >=, <=, ==, !=)
		int x = 90;
		int y = 51;
		
		boolean isGreater = x > y;
		boolean isLessThan = x < y;
		boolean isGreaterOrEqualTo = x >= y;
		boolean isLessOrEqualTo = x <= y;
		boolean isEqualTo = x == y;
		boolean isNotEqualTo = x != y;
		
		System.out.println("--------------Realtional Output----------");
		System.out.printf("Is %d > %d = %b%n",x,y,isGreater);
		System.out.printf("Is %d < %d = %b%n",x,y,isLessThan);
		System.out.printf("Is %d >= %d = %b%n",x,y,isGreaterOrEqualTo);
		System.out.printf("Is %d <= %d = %b%n",x,y,isLessOrEqualTo);
		System.out.printf("Is %d == %d = %b%n",x,y,isEqualTo);
		System.out.printf("Is %d != %d = %b%n",x,y,isNotEqualTo);
		
		
	}
}