public class Main {
    public static void main(String[] args) {
        BruteForce bruteForce;
        Kadane kadane;
        DivideNConquer divideNConquer;
        
        int[] input_array = {2, 3, -8, 7, -1, 2, 3};
        kadane = new Kadane(input_array);
        bruteForce = new BruteForce(input_array);
        divideNConquer = new DivideNConquer(input_array);

        System.out.println("Kadane: " + kadane.getMaximumSum());
        System.out.println("Brute Force: " + bruteForce.getMaximumSum());
        System.out.println("Divide and Conquer: " + divideNConquer.getMaximumSum());
    }
}
