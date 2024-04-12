
public class JavaVar {
//datatypes
//class level vars

    public static void main (String[] args) throws Exception {
        // datatypes varName [=value];
        int games = 3;
        double allowance = 40;
        long battlepass; //We define battlepass
        battlepass = 15; //We assign a value to battle pass
        double num_of_battlepass = (long)allowance/battlepass; //Define the amount of battlepass(es) you can buy with your allowance (round the amount because you can't buy 0.6666 of a batllepass)
        double totalCost = num_of_battlepass*battlepass; //Define the total cost of the battlepasses you buy


        
        // Print out our vars values along with a string that explains our values
        System.out.println("Number of Games I own = " + games);
        System.out.println("my monthly allowance = " + allowance);
        System.out.println("cost of a single battlepass = " + battlepass);
        System.out.println("We can buy " + num_of_battlepass + " battlepass(es) with our allowance");
        System.out.println("The total cost of battlepasses = " + totalCost);


        //With our current allowance, how many battle passes will we be able to buy?
        //Comment what you did, and why/how

        //What is the total cost of battle passes
        //Comment what you did, and why/how
    }
}
