package session1;


import java.util.Scanner;

    public class CapitalChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("PLEASE ENTER YOUR COUNTRY");
            String country = scanner.nextLine().toLowerCase();

            String capital = CountriesWithCapitals.findCapital(country);

            if(capital != null){
                System.out.println("THE CAPITAL OF " + country.toUpperCase() + " IS" + capital.toUpperCase());
            }else{
                System.out.println("COUNTRY " + country + "DOSE NOT EXIST");

            }



    }
}
