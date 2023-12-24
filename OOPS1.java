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
    }
    static class BankAccount{
        public String username ;
        private String password;
        public void setpassword(String pwd){
            password=pwd;
        }
    }
    public static void main(String[] args){
        pen p1 =new pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        BankAccount myAccount=new BankAccount();
        myAccount.username="akshay";
        myAccount.setpassword("oogabooga");
        System.out.println(myAccount.username);

        
    }
}