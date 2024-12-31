package recursion;

//0/1 Knpsack
public class KnapsackRecursive {

// 1 3 5 7
// 2 3 5 10

    public static int knapsack( int [] weight , int [] value , int W , int n){

        // 1.Think of the basecase ( smallest valid input )
        // n==0 ( size ) and W ==0
        if(n==0 || W==0){
            return 0;
        }
        //just start from the end of the array
        //either choose it or accept it and array will decrement by 1 every time from end.
        // if we accept it
        if(weight[n-1]<=W){
          return Math.max(value[n-1] + knapsack(weight,value,W - weight[n-1],n-1) , knapsack(weight,value,W,n-1));
        }
        else if(weight[n-1]>W){
            return knapsack(weight,value,W,n-1);
        }
        return 0;
    }

    public static void main(String[] args) {

        int [] weight ={1,3,5,7};
        int [] value= {2,3,5,10};
        int W=7;
        int n=4;
        System.out.println(knapsack(weight,value,W,n));
    }
}
