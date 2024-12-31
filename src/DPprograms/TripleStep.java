package DPprograms;

/*
A child is running up a staircase with n steps and can hop either 1 step , 2 steps , or 3 steps at a time.
Implement a method to count how many possible ways the child can run up the stairs
 */
public class TripleStep {

    public static void main(String[] args) {

        int n=2;
        System.out.println("ways : "+step(3));

        // if n=2  , w= 2 ( 1 step or 2 step)
        // if n=3 , ( 1, 1, 1 or 1,2 or 3 )
        //if n=4 , ( 1,1,1,1 or 1,1,2 or 2,2 or 1,3 )

    }

    public static int step(int n) {
        int[] rem = new int[n+1]; //O(n)

        rem[0]=1;
        rem[1]=1;
        rem[2]=2;
        // O(n)
        for (int i = 3; i <=n; i++){
            rem[i]=rem[i-1]+rem[i-2]+rem[i-3];
        }
        return rem[n];
    }




}
