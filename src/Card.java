public class Card extends Payment{
    int number;
    int cvv;
    String date;

    public Card(int id, int number, int cvv, String date){
        super(id);
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }
}
