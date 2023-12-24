public class OOPS1{
    static class pen {
        String color;
        int tip;
        void setcolor(String newcolor){
            color =newcolor;
        }
        void settip(int newtip){
            tip=newtip;
        }
        String getcolor(){
            return this.color;
        }
        int gettip(){
            return this.tip;
        }
    }
    static class BankAccount{
        public String username ;
        private String password;
        public void setpassword(String pwd){
            password=pwd;
        }
    }
     static class student {
        String name;
        int roll;
        student(){
         System.out.println("hcvdhjwvh");;
        }
    }
    public static void main(String[] args){
        pen p1 =new pen();
        p1.setcolor("orange");
        System.out.println(p1.getcolor());
        System.out.println(p1.gettip());
        p1.settip(3);
        System.out.println(p1.gettip());
        BankAccount myAccount=new BankAccount();
        myAccount.username="akshay";
        myAccount.setpassword("oogabooga");
        System.out.println(myAccount.username);
        student s= new student();
        

        
    }
}