public class Arithmetic{
     
     
    //creates the main program (method)
    public static void main(String[] args){
        int sock$ = 3;
        double sockCost = 2.58;
        int glass$ = 6;
        double glassCost = 2.29;
        int env$ = 1;
        double envCost = 3.25;
        double tax = .06;
        double TsockCost = sock$*sockCost;
        double TglassCost = glass$*glassCost;
        double TenvCost = env$*envCost;
        double Tprice = TsockCost + TglassCost + TenvCost;
        double Tpaid = Tprice + (tax*Tprice);
        Tpaid = Math.round(Tpaid*100)/100d;
        System.out.println("A pair of socks costs $" + sockCost + ".");
        System.out.println("A drinking glass costs $" + glassCost + ".");
        System.out.println("An envelope costs $" + envCost + ".");
        System.out.println("I have bought " + sock$ + " pairs of sock(s), " + glass$ + " glasse(s), and " + env$ + " envelope(s).");
        System.out.println("The total price was $" + Tprice + ", and I paid $" + Tpaid + " including tax.");
        
        
        
        
        
        
        
        
    }
}