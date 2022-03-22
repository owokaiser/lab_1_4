import java.util.Scanner;
class Main {
  public static void main(String[] args) {  
    System.out.println("Podaj A: ");
    Scanner scana = new Scanner(System.in);
    double a = scana.nextDouble();
    System.out.println("Podaj B: ");
    Scanner scanb = new Scanner(System.in);
    double b = scana.nextDouble();
    System.out.println("Podaj liczbe od 1 do 4: ");
    Scanner scany = new Scanner(System.in);
    int y = scana.nextInt();    
    double x;    
    switch(y){
      case 1:
        x=Math.pow(a,b);
        System.out.println(a+" do potęgi "+b+" to: "+x);
        break;
        case 2:
        x=Math.sqrt(a)+Math.sqrt(b);
        System.out.println("suma pierwiastkow "+a+ " i "+b+" to: "+x);
        break;
        case 3:
        x=Math.max(a,b);
        System.out.println("liczba wieksza pomiedzy "+a+ " i "+b+" to: "+x);
        break;
        case 4:
        x=a/b;
        System.out.println("wynik dzielenia "+a+ " przez "+b+" to: "+x);
        break;
    }
  }
}