public class Card extends Payment {
    Integer numberCard;
    String date;
    String cvv;
    String bank;

    public Card(Integer id, Integer numberCard, String date, String cvv, String bank) {
        super(id);
        this.numberCard = numberCard;
        this.date = date;
        this.cvv = cvv;
        this.bank = bank;

    }
}
