public class MergeSort implements Strategy{
    public int []buff;

    public void sort(int[] array){
        int size = array.length;
        buff = new int[size];

        merge(array,0,size-1);

        buff = null;
    }

    public void merge(int[] a, int left, int right){
        if(left<right){
            int i;
            int center = (left+right)/2;
            int p = 0;
            int j = 0;
            int k = left;

            merge(a,left,center);//前半部をマージソート
            merge(a,center+1,right);//後半部をマージソート

            for(i=left;i<=center;i++){
                buff[p++] = a[i];
            }

            while (i <= right && j < p) {        //後半部分とbuffをマージ ②
                a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++]; 
            }
            while (j < p) {                      //buffに残った要素をaにコピー ③
                a[k++] = buff[j++];
            }

        }
    }
}