package Day_31;

public class VotingEligible {
    public static void main(String[] args) throws InvalidAge {
        VotingEligible v= new VotingEligible();
        try{
            v.getVoteValidation(22);
        }
        catch(InvalidAge obj){
            System.out.println(obj.getMessage());
        }
    }

    public void getVoteValidation(int age) throws InvalidAge{
        if(age>18){
            System.out.println("You are eligible for voting");
        }else{
            throw new InvalidAge("You are below 18 years");
        }
    }
}
