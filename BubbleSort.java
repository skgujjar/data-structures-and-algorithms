
class BubbleSort{
public static void main(String[] args){
    //System.out.print("Hello world");
    int a[] = {1,4,2,6,3};
    int n = a.length;
    for(int j =0; j<n;j++){
    for(int i = 0; i<n-1-j; i++ )
    { //for(int j=i; j<=i; j++)
        if (a[i] > a[i+1]){
        swap(a,i,i+1);
    }
}

    }
for(int s=0; s<=n-1;s++){
    System.out.println(a[s]);
}
}
public static void swap(int a[], int q, int w){
    int x;
    x = a[q];
    a[q] = a[w];
    a[w] = x;
}

}