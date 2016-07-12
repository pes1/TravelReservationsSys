package ui;

import bolag.Company;
import flygResurser.Biljett;
import flygResurser.Flight;
import java.util.ArrayList;
import resurser.FlygMatMenyer;
import java.util.Scanner;

public class Bokning {

    private ArrayList<Flight> flightList;

    //-- följande lade Netbeans till:
//    public Bokning(ArrayList<Flight> flightList) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    //-- Konstruktor ---
    public void Bokning(ArrayList<Flight> flightList){   
        this.flightList = flightList;
            }
    
    
    
    
    public void meny() {
//        Company comp = new Company();
        Scanner sc = new Scanner(System.in);
    
        while (menyVal != 0){
            menyVal = -1;
            System.out.println("\nVälkommen till Blåklints Flygbolag\n");
            System.out.println("\nHuvudmeny");
            System.out.println("=========");
            System.out.println("1. Biljettbokning");
            System.out.println("2. Redovisning\n");
            System.out.println("0. Avsluta\n");
            System.out.print("Mata in index för ditt val: ");
            
            try {
                menyVal = sc.nextInt();
                switch (menyVal){
                    case 0: 
                        System.exit(0);
                    case 1: 
                        printBiljettbokning();
                    break;
                    case 2: 
                        printRedovisning();
                    break;    
                }
            }
            catch(Exception e){
                sc.nextLine();
            }
        }
   }

    public void printBiljettbokning() {
        boolean bRun = false;
        int menyVal = -1;
        Scanner sc = new Scanner(System.in);
    
        while(menyVal != 2){
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
                switch (menyVal){
                    case 0:
                        System.exit(0);

                    //Boka biljett
                    case 1: 
                        
                        bRun = true;
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
                                        bRun = false;
                                        break;
                                    case 2:
                                        //kolla om plats finns i 2:a klass
                                        //Om inte plats finns, fråga om 2:a klass
                                        bRun = false;
                                        break;
                                }
                            } catch (Exception e) {
                                System.out.println("Välj alternativ 1 eller 2");
                                sc.nextLine();
                            }
                        }
                        
                        System.out.print("\nVill du beställa mat? (J/N):");
                        String matFraga = sc.nextLine();
                        if (matFraga.equalsIgnoreCase("J")) {
                            //låt kunden välja maträtt
                        }
                        
                        System.out.print("\nAnge förnamn:");
                        String fname = sc.nextLine();

                        System.out.print("\nAnge efternamn:");
                        String lname = sc.nextLine();

                        Biljett biljett = null;
                        biljett.setFirstName(fname);
                        biljett.setLastName(lname);

                    break;
                    case 2:
                    break;
                }
            }catch (Exception e) {
                sc.nextLine();
            }
        }
    }

    public void printRedovisning() {
        int menyVal = -1;
        Scanner sc = new Scanner(System.in);
        
        while(menyVal != 8){                          
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
            switch (menyVal){
                case 0: System.exit(0);
                //Skriv ut medellön
                case 1:
                    double averageSalary;
                    averageSalary = Statistics.averageSalary(company.getEmployees());
                    System.out.println("Medellönen är: " + averageSalary);
                break;
                //Skriv ut högsta lönen
                case 2:
                    double highestSalary;
                    highestSalary = Statistics.highestSalary(company.getEmployees());
                    System.out.println("Högsta lönen är: " + highestSalary);
                break;
                //Skriv ut lägsta lönen
                case 3: 
                    double lowestSalary;
                    lowestSalary = Statistics.lowestSalary(company.getEmployees());
                    System.out.println("Lägsta lönen är: " + lowestSalary);
                break;
                //Skriv ut total bonus
                case 4: 
                    double totalBonus;
                    totalBonus = Statistics.totalBonus(company.getEmployees());
                    System.out.println("Totala bonusen är: " + totalBonus);
                break;
                case 5:
                    company.listAllEmployeesWithBonus();
                    break;
                //Kvinnor i procent på företaget
                case 6: 
                        int numberOfFemales = Statistics.numberOfFemale(company.getEmployees());
                        int totalEmployees = company.getEmployees().size();
                        double percentFemales = (double)(100*((double)numberOfFemales / (double)totalEmployees));
                        System.out.println("Andelen anställda kvinnor är: " + String.format("%.2f", percentFemales) + "%");
                break;
                //Män i procent i de olika arbetsroll kategorierna
                case 7:
                    //System.out.print("\nAnge yrkeskategori (developer, leader, teacher, cleaner):");
                    //String profession = sc.nextLine();
                    
                    boolean bRun = true;
                    String profession = null;
                        while (bRun) {                            
                            System.out.println("\n");
                            System.out.println("1. cleaner");
                            System.out.println("2. developer");
                            System.out.println("3. leader");
                            System.out.println("4. teacher");
                            System.out.print("\nVälj yrkeskategori:");
                            
                            try {
                                int professionChoice = sc.nextInt();
                                
                                switch (professionChoice) {                                    
                                    case 1:
                                        profession = "cleaner";
                                        bRun = false;
                                        break;
                                    case 2:
                                        profession = "developer";
                                        bRun = false;
                                        break;
                                    case 3:
                                        profession = "leader";
                                        bRun = false;
                                        break;
                                    case 4:
                                        profession = "teacher";
                                        bRun = false;
                                        break;
                                    default: System.out.println("Välj alternativ 1-4");
                                    break;
                                }
                            } catch (Exception e) {
                                System.out.println("Välj alternativ 1-4");
                                sc.nextLine();
                            }
                        }
                    
                    //Räknar bara ut andelen MÄN i olika yrkeskategorier
                    int numberOfMenInProfession = Statistics.numberOfEmployeesWithGenderAndIsATypeOfEmployee(company.getEmployees(), Gender.MALE, profession);
                    double percentMenInProfession = (double)(100 * ((double)numberOfMenInProfession / (double)company.getEmployees().size()));
                    System.out.println("Av alla anställda är " + String.format("%.2f", percentMenInProfession) + "% man och "+ profession);
                break;
                case 8: 
                break;
            
            }
            }
            catch(NullPointerParameterException e) {
                System.out.println("Tyvärr");
            }
        }
    }
    
    
    
//    public static void main(String[] args) {
//        
//    }
}
