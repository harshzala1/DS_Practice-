public class mergesortself {
    public static void main(String[] args) {
        int [] a = {9,4,7,6,3,1,5};
        System.out.println("before sort");
        printarray(a);
        System.out.println("after sort");
        mergesort(a, 0, 6);
        printarray(a);

    }
    public static void mergesort(int [] a,int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            mergesort(a, l, mid);
            mergesort(a, mid+1, r);
            merge(a,l,r,mid);
        }
    }
    public static void merge(int [] a ,int l , int r,int mid) {
        int i = l;
        int j=mid+1;
        int [] b = new int [a.length];
        int k =l;
        while(i<=mid&&j<=r){
            if(a[i]<=a[j]){
                b[k]=a[i];
                i++;
            }else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            b[k] = a[i];
            i++;
            k++;
        }

        while (j <= r) {
            b[k] = a[j];
            j++;
            k++;
        }

        for (int m = l; m <= r; m++) {
            a[m] = b[m];
        }

    }
    public static void printarray(int [] a){
        System.out.print("here is your array  ");

        for(int i = 0; i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
}
