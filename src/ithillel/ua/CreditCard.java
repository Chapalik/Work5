package ithillel.ua;

public class CreditCard {

    public static void main(String[] args) {

        CreditCardTest card1 = new CreditCardTest();

        switch (card1.type){
            case "Visa":
                System.out.println("Dear "+card1.owner+" congratulations, you are using a normal card");
                break;
            case "MASTERCARD":
                System.out.println("Dear "+card1.owner+" congratulations , you are using a normal card");
                break;
            case "MIR":
                System.out.println("Dear "+card1.owner+" went you to f*ck together with his Russian ship");
                break;
            default:
                System.out.println("Unknown card type" +card1.type);
        }
        System.out.println("Glory to Ukraine");
    }
}
