// print numbers if n=5 print 1
//2
//3
//4
//5
public class prntnumbers {
    public static void main(String[] args) {
        funrev(5);

    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funrev(int n){
        if(n==0){
            return;
        }
        funrev(n-1);
        System.out.println(n);

    }
}

