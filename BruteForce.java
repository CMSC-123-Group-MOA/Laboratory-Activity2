public class BruteForce {
    private int[] array;
    private int max_sum;
    public BruteForce(int[] array){
        this.array = array;
    }

    public int getMaximumSum(){
        int current_max_sum = array[0];
        max_sum = current_max_sum;
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                current_max_sum += array[j];
                max_sum = Math.max(current_max_sum, max_sum);
            }
            current_max_sum = array[i];
        }
        return max_sum;
    }
}
