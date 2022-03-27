package by.gsu.lab;


public class Trip {
    public static int bid = 0;
    private String account;
    private int fare;
    private int buisnesDays;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getBuisnesDays() {
        return buisnesDays;
    }

    public void setBuisnesDays(int buisnesDays) {
        this.buisnesDays = buisnesDays;
    }

    public Trip(){
        this.account = "";
        this.fare = 0;
        this.buisnesDays = 0;
    }

    public Trip( String account, int fare, int buisnesDays){
        this.account = account;
        this.fare = fare;
        this.buisnesDays = buisnesDays;
    }

    public void show(){
        System.out.println("Аккаунт = " + account + "\nСтавка = " + (double)bid / 100 + "\nТранспорт = " +
                (double)fare / 100 + "\nДней = " + buisnesDays + "\nВсего = " + toByn() + "\n");
    }

    public String toString() {
        return account + ';' + (double)fare / 100 + ';' + buisnesDays + ';' + toByn();
    }

    public int getTotal(){
        return (fare + bid * buisnesDays);
    }

    public String toByn(){
        return String.format("%.2f", getTotal() / 100.0);
    }
}
