public class Arithmetic{
     
     
    //creates the main program (method)
    public static void main(String[] args){
        int sock$ = 3;//dictates # of socks
        double sockCost = 2.58;//price of 1 pair of socks
        
        int glass$ = 6;//# of glasses
        double glassCost = 2.29;//price per glass
        
        int env$ = 1;//# of envelopes
        double envCost = 3.25;//price per envelope
        
        double tax = .06;//tax % for Penn.
        
        double TsockCost = sock$*sockCost;//multiplies # of socks by cost per sock
        double TglassCost = glass$*glassCost;//multiplies # of glasses by cost per glass
        double TenvCost = env$*envCost;//multplies # of envelopes by cost per envelope
        
        double Tprice = TsockCost + TglassCost + TenvCost;//adds the 3 previous totals together
        double Tpaid = Tprice + (tax*Tprice);//adds tax to the total
        
        Tpaid = Math.round(Tpaid*100)/100d;//rounds to 2 decimal places
        
        System.out.println("A pair of socks costs $" + sockCost + ".");//shows cost of a sock
        
        System.out.println("A drinking glass costs $" + glassCost + ".");//shows cost of a glass
        
        System.out.println("An envelope costs $" + envCost + ".");//shows cost of an envelope
        
        System.out.println("I have bought " + sock$ + " pairs of sock(s), " + glass$ + " glasse(s), and " + env$ + " envelope(s).");//shows how many of each we bought
        
        System.out.println("The total price was $" + Tprice + ", and I paid $" + Tpaid + " including tax.");//shows all totals
        
        
        
        
        
        
        
        
    }
}