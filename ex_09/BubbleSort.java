public class BubbleSort implements Strategy{
    
    public void sort(int[] array){
        int temp;
        int size = array.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}