public class Main {
    public static void main(String[] args) {
        BruteForce bruteForce;
        Kadane kadane;
        DivideNConquer divideNConquer;
        
        //test cases:
        //2, 3, -8, 7, -1, 2, 3 -> 11
        //1000, 2000, -1500, 3000, -500 -> 4500
        //1, -2, 3, 4, -1, 2, 1, -5, 4 -> 9
        //1, -1, 2, -2, 3, -3, 4, -4 -> 4
        //3, -1, -1, 5, 2, -4, 6, 1, -2 -> 11
        //100, -200, 300, -400, 500 -> 500
        //2, 1, -1, 2, 3, -1, 5, -3, 1 -> 11
        
        int[] input_array = {2, 1, -1, 2, 3, -1, 5, -3, 1};
        kadane = new Kadane(input_array);
        bruteForce = new BruteForce(input_array);
        divideNConquer = new DivideNConquer(input_array);

        System.out.println("Kadane: " + kadane.getMaximumSum());
        System.out.println("Brute Force: " + bruteForce.getMaximumSum());
        System.out.println("Divide and Conquer: " + divideNConquer.getMaximumSum());
    }
}
