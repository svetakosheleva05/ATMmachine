
package atmmachine;

public class Bank {   //может тут какую то композицию сделать типо додразделы банка
                      //также тут как то связать человека его карты и типо айди человека может
    private int nextCardNumber;
    private String bankName;

    public Bank(String bankName) {
        this.nextCardNumber = 1000;
        this.bankName = bankName;
    }
    
    private Card makeNewCard() {
        nextCardNumber++;
        return new Card(nextCardNumber,(int) (Math.random() * 900) + 100);
    }
}
