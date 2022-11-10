// if the number is 1348 then 1+3+4+8
public class SumOfDigits {
    public static void main(String[] args) {
        int ans=sum(1348);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return(n%10)+sum(n/10);
    }
}

