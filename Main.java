import java.util.Scanner;
class Main {
  public static void main(String[] args) {  
    System.out.println("Podaj A: ");
    Scanner scana = new Scanner(System.in);
    double a = scana.nextDouble();
    System.out.println("Podaj B: ");
    Scanner scanb = new Scanner(System.in);
    double b = scanb.nextDouble();
    System.out.println("Podaj liczbe od 1 do 4: ");
    Scanner scany = new Scanner(System.in);
    int y = scany.nextInt();    
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
        System.out.println("1-dodawanie\n2-odejmowanie\n3-mnozenie\n4-dzielenie ");
        Scanner scanz = new Scanner(System.in);
        int z = scanz.nextInt();
        switch(z){
          case 1:
            x=a+b;
            System.out.println(x);
            break;
            case 2:
            x=a-b;
            System.out.println(x);
            break;
            case 3:
            x=a*b;
            System.out.println(x);
            break;
            case 4:
            if(b!=0){
              x=a+b;
            System.out.println(x);}
            else{
              System.out.println("nie dzielimy przez 0");
            }
            break;
            default:
            System.out.println("blad");
            break;
        }
        break;
        default:
        System.out.println("blad");
        break;
    }
  }
}