class backtracking{
    public static void changearr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            Printarr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changearr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }
    public static void Printarr(int arr[]){
        for( int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,7,7,7,5,33,22,6,7};
        int val=0;
        int i=0;
        changearr(arr, i, val);
        
    }
}