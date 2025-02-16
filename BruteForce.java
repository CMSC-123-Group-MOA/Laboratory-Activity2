public class BruteForce {
    private int[] array;
    private int max_sum;
    public BruteForce(int[] array){
        this.array = array;
    }

    public int getMaximumSum(){
        max_sum = array[0];
        int current_max_sum;
        for(int i = 0; i < array.length; i++){
            current_max_sum = 0;
            for(int j = i; j < array.length; j++){
                current_max_sum += array[j];
                max_sum = Math.max(current_max_sum, max_sum);
            }
        }
        return max_sum;
    }
}
