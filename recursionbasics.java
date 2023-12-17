public class recursionbasics {
    public static void decreasingorder(int n){
        if(n==1){
        System.out.print(n);
        return;}
        System.out.print(n+" ");
        decreasingorder(n-1);
    }
    public static void incorder(int n){
        if( n==1){
            System.out.println(n);
            return;
        }
        incorder(n-1);
        System.out.println(n+" ");
    }
    public static int factorial(int n ){
        if(n==0){
            return 1 ;
        }
        return( n*factorial(n-1));
    }   
    public static int sumnatural(int n) {
       if (n ==1){
        return 1;
       }
       return( n+sumnatural(n-1));
    }
    public static int fib(int n ){
        if(n ==0||n==1){
           return n ;
        }
        int fnm1= fib(n-1);
        int fnm2= fib(n-2);
        int fn = fnm1+fnm2;
        return fn ;
    }
public static boolean sorted(int arr[], int i){
    if( i == arr.length-1){
        return true;
    }
    if ( arr[i]>arr[i+1]){
        return false;
    }
    return sorted(arr,i+1);
}
public static int power(int x, int n ){
    if (n==0){
        return 1;
    }
    return x * power(x,n-1);// more optimised code is as following O(n) iska hai 
}
public static int optimisedpower(int x, int n){
    if (n==0){
        return 1;
    }
    int halfpower=optimisedpower(x,n/2);
    int halfpowersq= halfpower*halfpower;
    //n is odd
    if(n%2!=0){
        halfpowersq=x * halfpowersq;
    }
    return halfpowersq;
}
public static int tilingproblem(int n ){
    if(n==0||n==1){
        return 1;
    }
    int fnm1 = tilingproblem(n-1);
    int fnm2 = tilingproblem(n-2);
    int totways=fnm1+fnm2;
    return totways ;
}
public static void removeduplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
    if (idx == str.length()) {
        System.out.print(newStr);
        return;
    }
    char currChar = str.charAt(idx);
    // Adjust to handle both uppercase and lowercase letters
    if (Character.isAlphabetic(currChar) && !map[Character.toLowerCase(currChar) - 'a']) {
        map[Character.toLowerCase(currChar) - 'a'] = true;
        newStr.append(currChar);
    }
    removeduplicates(str, idx + 1, newStr, map);
}
public static int friendspairing(int n){
    if (n==1||n==2){
        return n;
    }
    return friendspairing(n-1)+(n-1)*friendspairing(n-2);
}

    public static void main (String[] args){
    System.out.println(friendspairing(3));
    }
}
