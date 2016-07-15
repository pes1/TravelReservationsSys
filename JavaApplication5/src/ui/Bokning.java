package ui;

import bolag.Company;
import flygResurser.Biljett;
import flygResurser.Flight;
import java.util.ArrayList;
import java.util.List;
import resurser.FlygMatMenyer;
import java.util.Scanner;
import resurser.Maträtter;

public class Bokning {

    Maträtter mr = new Maträtter();
    FlygMatMenyer fm;
    int matval;
    Boolean matEllerEj = false;
    private ArrayList<Flight> flightList;
    String klass = "";
    List<FlygMatMenyer> mat;
    Flight flight;
    Biljett biljett;
    Flight fly;
   

    //-- Konstruktor ---
    public Bokning(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }

    public void generateBiljetter() {

        Maträtter mt = new Maträtter();
        //FlygMatMenyer(String food, int price, int klass)
        FlygMatMenyer p = new FlygMatMenyer("Oxfilé", 100, 1);
        fly = flightList.get(0);

        int plats = flightList.get(0).getPlatsFirst();
        biljett = new Biljett(plats, "First class", true, p, "BK1234", "Olle", "Olsson");
        fly.getBiljetter().add(biljett);
        plats = flightList.get(0).getPlatsFirst();
        biljett = new Biljett(plats, "First class", true, p, "BK1234", "Olle", "Olsson");
        fly.getBiljetter().add(biljett);
        plats = flightList.get(0).getPlatsFirst();
        biljett = new Biljett(plats, "First class", true, p, "BK1234", "Olle", "Olsson");
        fly.getBiljetter().add(biljett);
        plats = flightList.get(0).getPlatsFirst();
        biljett = new Biljett(plats, "First class", true, p, "BK1234", "Olle", "Olsson");
        fly.getBiljetter().add(biljett);
        plats = flightList.get(0).getPlatsFirst();
        biljett = new Biljett(plats, "First class", true, p, "BK1234", "Olle", "Olsson");
        fly.getBiljetter().add(biljett);
        System.out.println("Antal " + fly.getBiljetter().size());
        for (Biljett biljett : fly.getBiljetter()) {
            biljett.utskrift();
        }
    }

    public char getChar() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String s;
            do {
                s = sc.nextLine().trim();
            }
            while(s.isEmpty());
            s = sc.nextLine();
            return s.charAt(0);
                    
        }
    }
    
    public int getInt() {
    Scanner sc = new Scanner(System.in);
        while(true) {
            String s;
            do {
                s = sc.nextLine().trim();
            }
            while(s.isEmpty());
            s = sc.nextLine();
            return Integer.parseInt(s);
                    
        }
    
    }
    
    public void meny() {
        int menyVal = -1;
        Scanner sc = new Scanner(System.in);

        while (menyVal != 0) {
            menyVal = -1;
            System.out.println("\nVälkommen till Flygbolag Blåklint\n");
            System.out.println("\nHuvudmeny");
            System.out.println("=========");
            System.out.println("1. Biljettbokning");
            System.out.println("2. Redovisning\n");
            System.out.println("0. Avsluta\n");
            System.out.print("Mata in index för ditt val: ");

            try {
                menyVal = sc.nextInt();
                switch (menyVal) {
                    case 0:
                        System.exit(0);
                    case 1:
                        printBiljettbokning();
                        break;
                    case 2:
                        printRedovisning();
                        break;
                }
            } catch (Exception e) {
                sc.nextLine();
            }
        }
    }

    public void printBiljettbokning() {
        boolean bRun = false;
        int menyVal = -1;
        Scanner sc = new Scanner(System.in);
        int plats = 0;

        while (menyVal != 2) {
            menyVal = -1;
            System.out.println("\nBiljettbokning");
            System.out.println("=================");
            System.out.println("1. Boka biljett");
            System.out.println("2. Återgå till huvudmeny\n");
            System.out.println("0. Avsluta");
            System.out.print("\nMata in index för ditt val: ");

            try {
                menyVal = sc.nextInt();
                sc.nextLine();
                switch (menyVal) {
                    case 0:
                        System.exit(0);
                    //Boka biljett
                    case 1:
                        System.out.println(flightList.get(0).toString());

                        bRun = true;
                        flight = flightList.get(0);

                        while (bRun) {
                            System.out.println("\n");
                            System.out.println("1. Första klass");
                            System.out.println("2. Ekonomi");
                            System.out.print("\nVälj klass:");
                            try {
                                int classChoice = sc.nextInt();
                                
                                switch (classChoice) {
                                    case 1:

                                        //kolla om plats finns i 1:a klass
                                        //Om inte plats finns, fråga om 2:a klass
                                        plats = flight.getPlatsFirst();
                                        if (plats == 0) {
                                           // sc.nextLine();
                                           
                                           Scanner newsc = new Scanner(System.in);
                                            System.out.print("\nTyvärr var det fullt i första klass. Vill du åka i andra klass? (J/N)");
                                            String andraKlassFraga = newsc.nextLine();
                                                                                     
                                            if (andraKlassFraga.equalsIgnoreCase("j")) {
                                                plats = flight.getPlatsSecond();
                                                if (plats != 0) {
                                                    klass = "Second class";
                                                } else {
                                                    System.out.println("Tyvärr fanns ingen plats.");
                                                    break;
                                                }
                                            }
                                            else {
                                             
                                               break; 
                                            }
                                        } else {
                                            klass = "First class";
                                        }
                                        bRun = false;
                                        break;
                                    case 2:                                   
                                        plats = flight.getPlatsSecond();
                                        if (plats == 0) {
                                            System.out.println("Vill du åka i första klass? (J/N)");
                                            String forstaKlassFraga = sc.nextLine();
                                            if (forstaKlassFraga.equalsIgnoreCase("j")) {
                                                plats = flight.getPlatsFirst();
                                                if (plats == 0) {
                                                    System.out.println("Tyvärr fanns ingen plats.");
                                                    break;
                                                } else {
                                                    klass = "First class";
                                                }
                                            }
                                        } else {
                                            klass = "Second class";
                                        }
                                        bRun = false;
                                        break;
                                }
                            } catch (Exception e) {
                                System.out.println("Välj alternativ 1 eller 2");
                                sc.nextLine();
                            }
                        }
                        sc.nextLine();
                        System.out.print("\nVill du beställa mat? (J/N):");
                        String matFraga = sc.nextLine();
                        

                        if (matFraga.equalsIgnoreCase("J")) {
                            matEllerEj = true;
                            //låt kunden välja maträtt
                            // System.out.println("Meny");
                            if (klass.equals("First class")) {
                                mat = mr.getMeny(1);
                            } else {
                                mat = mr.getMeny(2);
                            }

                            for (int i = 0; i < mat.size(); i++) {
                                System.out.println(i + 1 + "." + mat.get(i).getFood());
                            }
                            System.out.print("\nVälj maträtt: ");
                            matval = sc.nextInt();
                            switch (matval) {
                                case 1:
                                    fm = mat.get(0);
                                    break;
                                case 2:
                                    fm = mat.get(1);
                                    break;
                                case 3: 
                                    fm = mat.get(2);
                                    break;
                                default:
                                    fm = null;
                            }
                            sc.nextLine();
                        } else if (matFraga.equalsIgnoreCase("N")) {
                            //sc.nextLine();
                            mat = mr.getMeny(1);
                            fm = mat.get(2);
                            //break;
                        }

                        System.out.print("\nAnge förnamn:");
                        String fname = sc.nextLine();

                        System.out.print("\nAnge efternamn:");
                        String lname = sc.nextLine();

                        String f = flightList.get(0).getFlightNo();
                       
                        biljett = new Biljett(plats, klass, matEllerEj, fm, f, fname, lname);
                        fly = flightList.get(0);
                        fly.getBiljetter().add(biljett);
                        System.out.println("Biljett skapad");
                        System.out.println("");
                        biljett.utskrift();
                        

                        break;
                    case 2:
                        break;
                }
            } catch (Exception e) {
                sc.nextLine();
                e.printStackTrace();
            }
        }

    }

    public void printRedovisning() {
        int menyVal = -1;
        Scanner sc = new Scanner(System.in);
        List<Biljett> blist = fly.getBiljetter();
        int inkomst = 0;
        double vinst = 0;

        while (menyVal != 8) {
            System.out.println("\nRedovisning");
            System.out.println("=========");
            System.out.println("1. Alla bokade biljetter (inkl. pris för mat och biljett)");
            System.out.println("2. Företagets vinst");
            System.out.println("3. Återgå till huvudmeny\n");
            System.out.println("0. Avsluta");
            System.out.print("\nMata in index för ditt val: ");

            try {
                menyVal = sc.nextInt();
                sc.nextLine();
                switch (menyVal) {
                    case 0:
                        System.exit(0);
                    case 1:

                        for (Biljett biljett : blist) {
                            biljett.utskrift();
                        }
                        break;
                    case 2:
                        System.out.println("\nResultat\n================\nAntal resanden: " + blist.size());
                        for (Biljett biljett : blist) {
                            inkomst += biljett.getPris();
                        }
                        vinst = inkomst * 0.3;
                        System.out.println("Inkomst: " + inkomst);
                        System.out.println("Vinst: " + vinst);
                        break;                             
                    case 3:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Tyvärr");
            }
        }
    }
}
