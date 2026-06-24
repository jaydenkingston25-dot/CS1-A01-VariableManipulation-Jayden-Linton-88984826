public class MySecondProgram {
    
    public static void main(String[] args) {
       String str1 = "Computer";
        String str2 = "Science";

        int num1 = 5;
        double num2 = 3.5;

        char third = str1.charAt(2);

        double sum = num1 + num2;

        String second = str2.substring(0, 1) + str2.substring(1, 2).toUpperCase() + str2.substring(2);

        String password = "" + str2.charAt(0) + str2.charAt(1) + num1 + str1.charAt(str1.length() - 1) + num2 + "/";

        System.out.println("1st String: " + str1);
        System.out.println("2nd String: " + str2);
        System.out.println("1st Number: " + num1);
        System.out.println("2nd Number: " + num2);
        System.out.println("Third Character from " + str1 + ": " + third);
        System.out.println("Sum: " + sum);
        System.out.println("Second: " + second);
        System.out.println("Password: " + password);
    }
}
