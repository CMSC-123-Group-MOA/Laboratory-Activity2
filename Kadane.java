public class Kadane {
    private int[] array;
    private int max_sum;
    public Kadane(int[] array){
        this.array = array;
    }

    public int getMaximumSum(){
        int current_max_sum = array[0];
        max_sum = current_max_sum;
        for(int i = 1; i < array.length; i++){
            current_max_sum = Math.max(array[i], current_max_sum + array[i]);
            max_sum = Math.max(max_sum, current_max_sum);
        }
        return max_sum;
    }
}
