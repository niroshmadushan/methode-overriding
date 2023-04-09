public class Mobile {
    public void displayName(){
        System.out.println("Smart Mobile");
    }
}
class samsung extends Mobile{

    @Override
    public void displayName() {
        System.out.println("Samsung Galaxy Note 22 Ultra");
        super.displayName();
    }
}
class apple extends samsung{
    @Override
    public void displayName() {
        System.out.println("Iphone 14pro Max");
        super.displayName();
    }
}

class Run{
    public static void main(String[] args) {
        samsung s =new samsung();
        apple a =new apple();
        s.displayName();
        a.displayName();
    }
}