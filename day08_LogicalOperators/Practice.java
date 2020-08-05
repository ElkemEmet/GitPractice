package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 19;
        String citizenShip = "USA";

        boolean eligibleToVote = age >= 18 && citizenShip == "USA";

        String fullName = firstName +" "+lastName;

        System.out.println(fullName+"is eligible To Vote: " + eligibleToVote);

    }
}
