
package atmmachine;

public class Card { //сразу вопрос надо как-то сделать так чтобы номер карты и сивиси код мог задавать только банк да и в целом чтобы карты создавал только банк
    private int number; //эти два поля не изменяемые
    private int cvs;        //а еще где то надо будет заиметь пин код, вопрос где его хранить
                            //сделать тиоп наследников кредит кард и дебетовую

    public Card(int number, int cvs) {
        this.number = number;
        this.cvs = cvs;
    }

}
