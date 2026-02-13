class Dice
{
    public static int Opp(int n)
    {
        //ans stores the number that is meant to be on the opposite face of the dice
        int ans=7-n;
        return ans;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(Opp(n));
    }
}