class Nterm
{
    public static int AP(int a1,int a2,int n)
    {
        //finding the nth term of the AP
        // Using formula an=(a+(n-1)*d)
        int an=(a1 + (n-1)*(a2-a1));
        return an;
    }
    public static void main(String[] args) {
        int a1=12;
        int a2=24;
        int n=12;
        System.out.println(AP(a1,a2,n));
    }
}