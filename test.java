import java.util.*;
public class test {
    // i have commented the useful things along with the improvs required( sorry i couldn't reply before was busy somewhere )
    //function to update our array
    public static int[] updatemarks(int marks[]){
        for (int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
        return marks;
    }
    // function to update the int value
    public static int passvalue(int passbyvalue){
        passbyvalue=10;
        return passbyvalue;
    }
    public static void main(String args[]){
        int marks[] = new int[5];
        int passbyvalue = 5;
        Scanner sc = new Scanner(System.in);

        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        marks[3]= sc.nextInt();
        marks[4]= sc.nextInt();// added it because the array is of size 5 and previously we were taking only four inputs;

        int Physics = marks[0] ;
        int Chem = marks[1] ;
        int Bio = marks[2] ;
        int Math = marks[3] ;
        int English=marks[4];// completed the required subjects too 
      
        // our value we defined in main function
        System.out.println("pass by value = " + passbyvalue);
        //calling the function to update its value
        passvalue(passbyvalue);
        // checking the result 
        System.out.println("pass by value after the function = " + passbyvalue);

        // our marks array before we updated it
        for(int i=0;i<marks.length; i++){
            System.out.print(marks[i]);
    }
        //calling the update function
        updatemarks(marks);
        // marks array after updating the values
        for(int i=0;i<marks.length; i++){
            System.out.print(marks[i]);
    }
}
} 
