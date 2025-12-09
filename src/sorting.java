public class sorting {
    void bubbleSort(int a[],int n){
        for(int i=1; i<n;i++){
            for(int j=0; j<n-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
    }

    void insertionSOrt(int b[],int n){
        int i,j,temp;
        for(i=1;i<n;i++) {
            temp = b[i];
            j = i - 1;
            while (j >= 0 && b[j] > temp) {
                b[j + 1] = b[j];
                j--;
            }
            b[j + 1] = temp;
        }

    }
    void selectionSort(int c[],int n){
        int small;
        for(int i=0;i<n-1;i++){
            small=i;
            for(int j=i+1;j<n;j++){
                if(c[j]<c[small]){
                    small=j;
                }
            }int temp=c[small];
            c[small]=c[i];
            c[i]=temp;
        }
    }

    void mergesort(int a[], int l,int r){
        if(l<r){
            int m=(l+r)/2;
            mergesort(a ,l,m-1);
            mergesort(a ,m,r);
            merge(a,l,m,r);
        }
    }
    void merge(int a[],int l,int m,int r) {
        int n1 = m - l, n2 = r - m;
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        for (int i = l; i < m; i++) {
            a1[i] = a[i];
        }
        for (int i = l; i < m; i++) {
            a2[i] = a[i];
        }
        int c[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (a1[i] <= a2[j]) {
                c[k] = a1[i];
                i++;
            } else {
                c[k] = a2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            c[k] = a1[i];
            i++;
            k++;
        }
        while (j < n2) {
            c[k] = a2[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        sorting sort = new sorting();
        int a[] = {5, 4, 3, 2, 1};
        int n = a.length;
        System.out.println("Bubble Sort:");
        sort.bubbleSort(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n-----------------------");
        System.out.println("Insertion Sort:");
        int b[] = {6, 7, 8, 9, 1};
        sort.insertionSOrt(b, n);
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\n-----------------------");
        System.out.println("Selection Sort:");
        int c[] = {10, 19, 18, 7, 16};
        sort.selectionSort(c, n);
        for (int i = 0; i < n; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println("\n-----------------------");
        System.out.println("Merge Sort:");
        int d[] = {12, 11, 13, 5, 6, 7};
        int m = d.length;
        sort.mergesort(d, 0, m - 1);
        for (int i = 0; i < m; i++) {
            System.out.print(d[i] + " ");
        }
    }
}
