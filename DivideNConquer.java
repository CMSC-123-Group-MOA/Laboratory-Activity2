public class DivideNConquer {
    private int[] array;
    public DivideNConquer(int[] array){
        this.array = array;
    }

    public int getMaximumSum(int left, int right){
        int current_max_sum = 0;
        int max_sum = 0;  

        if(left >= right){   //base case
            max_sum = array[right];
            return max_sum;
        }

        max_sum = array[left];

        for(int i = left; i <= right; i++){
            current_max_sum += array[i];
            if(current_max_sum > max_sum){
                max_sum = current_max_sum;
            }
        }

        int middle = (left + right)/2;
        int left_sum = getMaximumSum(left, middle);
        int right_sum = getMaximumSum(middle + 1, right);
        System.out.println(max_sum);
        
        max_sum = Math.max(Math.max(max_sum, left_sum), right_sum);
        return max_sum;
    }

    public int getMaximumSum(){
        return getMaximumSum(0, array.length - 1);
    }
}
