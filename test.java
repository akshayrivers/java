import java.util.*;
public class test {
  
    public static void reverse(int numbers[]){
        int temp = 0;
        for (int i=0; i<numbers.length/2; i++){
            temp=numbers[i];
            numbers[i]=numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=temp;

        }
    }
    public static void main(String args[]){
      int arr[]={1,2,3,4,5};
      int i =0;
      System.out.println(arr[i++]);
      System.out.println(arr[++i]);

    } 
}
