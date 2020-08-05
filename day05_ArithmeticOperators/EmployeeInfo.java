package day05_ArithmeticOperators;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Daniel";
        char Gender ='M';
        int age = 128;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120000.50;
        /* Employee' full name is: John Daniel
                        John Daniel' gender is: Male
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false  */

        System.out.println("Employee ' full name is: " +firstName+" "+lastName);
        System.out.println(firstName+" " + lastName+ "' gender is: "  + Gender);
        System.out.println(firstName+" "+lastName+ " 'age is: "+age+" years old");
        System.out.println(firstName+" "+lastName+ " works at: "+ companyName);
        System.out.println(firstName+" "+lastName+" 'Job title is: "+jobTitle);
        System.out.println(firstName+" "+lastName+"'salary is: $"+ salary);
        System.out.println(firstName+" "+lastName+" is full time employee: "+ isFullTime);
        System.out.println(firstName+" " + lastName+ " is married: "+ isMarried);
    }
}
