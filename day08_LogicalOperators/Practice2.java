package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {

        String firstName = "Conor";
        String lastName = "McNugget";
        int age = 45;
        String citizen1 = "Irland";
        String citizen2 = "USA";
        String fullName = firstName +" "+lastName;

        boolean eligibleAge = age >= 18;

        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";

        boolean eligibleToVote = eligibleAge && usCitizen;

        System.out.println(fullName + " is eligible to vote for Trump: "+ eligibleToVote);



    }
}
