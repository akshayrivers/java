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
        System.out.print("joke");
       if(System.out.append("hello")==null){
        System.out.println("hello");
       }
       else{
        System.out.println("world");
       }
    }

} 
