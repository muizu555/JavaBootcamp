public class SelectionSort implements Strategy{
    //fieldいるのかな

    public void sort(int[] array){
        int size = array.length;
        int min;
        int s;
        int temp;
        

        for(int i= 0;i<size-1;i++){
            min = array[i];
            s = i;
            for(int j=i+1;j<size;j++){
                if(array[j]<min){
                    min = array[j];
                    s = j;
                }
            }

            temp = array[i];
            array[i] = array[s];
            array[s] = temp;
        }


    }

}