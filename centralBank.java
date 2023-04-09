public class CentralBank {
    int getInterstRate(){
        return 0;
    }
}

class Boc extends CentralBank{

    @Override
    int getInterstRate() {
        return 8;
    }
}

class PeoplesBank extends CentralBank{
    @Override
    int getInterstRate() {
        return 10;
    }
}

class CommercialBank extends CentralBank{
    @Override
    int getInterstRate() {
        return 12;
    }
}
class testOverRiding {
    public static void main(String[] args) {
        Boc Boc =new Boc();
        PeoplesBank peoplesBank = new PeoplesBank();
        CommercialBank commercialBank = new CommercialBank();
        System.out.println("Interest Rate :- "+Boc.getInterstRate() );
        System.out.println("Interest Rate :- "+peoplesBank.getInterstRate() );
        System.out.println("Interest Rate :- "+commercialBank.getInterstRate() );

    }
}