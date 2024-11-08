class sort {

    //buble sort
    public static void bubbleSort(int [] a) {
        for(int i = 0 ; i<a.length-1 ; i++){
            for(int j=0 ; j<a.length-1-i; j++){
                if(a[j]>a[j+1]){
                    //swap
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                 }
            }
        }
    }


    //print array 
    public static void printarray(int [] a) {
        System.out.print("here is your array     ");
        for(int i = 0; i<a.length;i++){
            System.out.print(" "+a[i]+ " ");
        }
        System.out.println();
    }

    //insertion sort

    public static void insertionsort(int [] a) {
        for(int i = 1 ; i< a.length ; i++){
            int current = a[i] ;
           int j = i-1;
           while(j>=0&&current<a[j]){
            //create space
            a[j+1]=a[j];
            j--;
           }
           a[j+1]=current;

        }
        
    }


    // selection sort
    public static void selectionsort(int [] a) {
        for(int i = 0 ; i<a.length ; i++){
            int smallest = i;
            for(int j = i+1 ; j<a.length ;j++){
                if(a[j] <a[smallest]){
                    smallest = j;
                }
            }
            int temp = a[i];
            a[i]=a[smallest];
            a[smallest]=temp;
        }
    }

    //merge sort 
    public static void mergesort(int [] a ,int l ,int r){
        if(l<r){
            int mid = (l+r)/2;
            mergesort(a, l,mid);
            mergesort(a, mid+1, r);
            merger(a, l, r, mid);
        }
    }
    public static void merger(int [] a,int l,int r,int mid){
        int i = l;
        int j = mid+1;
        int [] b = new int [a.length];
        int k = l;
        while(i<=mid&&j<=r){
            if(a[i]<a[j]){
                b[k]=a[i];
                i++;
            }else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            b[k]=a[i];
            i++;
            k++;
        }
        while(j<=r){
            b[k]=a[j];
            j++;
            k++;  
        }

        //copy array into real array
        for(int m = l ; m<=r ; m++){
            a[m]=b[m];
        }
    }
}
public class sortingdemo{
    public static void main(String[] args) {

             // Array for testing
             int[] array = {11, 151, 45, 45, 684, 846, 14, 15};

             // Test Bubble Sort
             System.out.println("Bubble Sort:");
             int[] bubbleArray = array.clone();
             sort.printarray(bubbleArray);
             sort.bubbleSort(bubbleArray);
             sort.printarray(bubbleArray);
             System.out.println();
             System.out.println();
     
             // Test Insertion Sort
             System.out.println("Insertion Sort:");
             int[] insertionArray = array.clone();
             sort.printarray(insertionArray);
             sort.insertionsort(insertionArray);
             sort.printarray(insertionArray);
             System.out.println();
             System.out.println();
     
             // Test Selection Sort
             System.out.println("Selection Sort:");
             int[] selectionArray = array.clone();
             sort.printarray(selectionArray);
             sort.selectionsort(selectionArray);
             sort.printarray(selectionArray);
             System.out.println();
             System.out.println();
     
             // Test Merge Sort
             System.out.println("Merge Sort:");
             int[] mergeArray = array.clone();
             sort.printarray(mergeArray);
             sort.mergesort(mergeArray, 0, mergeArray.length - 1);
             sort.printarray(mergeArray);
             System.out.println();
             System.out.println();
    }
}
