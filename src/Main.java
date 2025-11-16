public class Main {
    public static void main(String[] args) {
        
        int ticketPrice = 13676;
        int costPerMile = 20;

        int bonusMiles = ticketPrice / costPerMile;

        System.out.println("Стоимость билета: " + ticketPrice + " руб.");
        System.out.println("Количество начисленных бонусных миль: " + bonusMiles);
    }
}
