public class DivideNConquer {
    private int[] array;
    public DivideNConquer(int[] array){
        this.array = array;
    }

    public int getMaximumSum(int left, int right){
        int middle = (left + right)/2;
        int max_sum = 0;  

        if(left >= right){   //base case
            max_sum = array[right];
            return max_sum;
        }

        int leftSide = getLeftMaximum(left, middle); //the "left"
        int rightSide = getRightMaximum(middle + 1, right); //the "right"
        max_sum = Math.max(Math.max(leftSide + rightSide, leftSide), rightSide); //the "center"

        int left_sum = getMaximumSum(left, middle);
        int right_sum = getMaximumSum(middle + 1, right);
        
        max_sum = Math.max(Math.max(max_sum, left_sum), right_sum);
        return max_sum;
    }

    public int getRightMaximum(int left, int right){ // starts from the right of the left substring
        int current_max_sum = array[left];
        int max_sum = current_max_sum;
        for(int i = left; i <= right; i++){
            current_max_sum += array[i];
            if(current_max_sum > max_sum){
                max_sum = current_max_sum;
            }
        }
        return max_sum;
    }

    public int getLeftMaximum(int left, int right){ //starts from the left of the right substring
        int current_max_sum = array[right];
        int max_sum = current_max_sum;
        for(int i = right; i >= left; i--){
            current_max_sum += array[i];
            if(current_max_sum > max_sum){
                max_sum = current_max_sum;
            }
        }
        return max_sum;
    }

    public int getMaximumSum(){
        return getMaximumSum(0, array.length - 1);
    }
}
