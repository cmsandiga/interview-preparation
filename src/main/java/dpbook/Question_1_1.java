package dpbook;

public class Question_1_1 {

    public int fact(int n){

        if(n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
