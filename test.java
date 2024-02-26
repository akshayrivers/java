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
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }

} 
