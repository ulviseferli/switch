//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //Task1
    Scanner scanner = new Scanner(System.in);
    System.out.println("il daxil edin");
    int year = scanner.nextInt();

    if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
        System.out.println("artiq il");
    }
    else{
        System.out.println("artiq il deyil");
    }

    //Task2
    Scanner scanner = new Scanner(System.in);
    System.out.print("ay: ");
    int month = scanner.nextInt();
    System.out.print("il: ");
    int year = scanner.nextInt();
    int day;
    switch (ay) {
        case 2:
            if (il % 400 == 0 || (il % 4 == 0 && il % 100 != 0))
                gun = 29;
            else
                gun = 28;
            break;

        case 4:
        case 6:
        case 9:
        case 11:
            gun = 30;
            break;

        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            gun = 31;
            break;

        default:
            System.out.println("yanlis ay nomresi");
    }


    //Task3
    Scanner scanner = new Scanner(System.in);
    System.out.println("simvol daxil edin");
    char letter = scanner.next().charAt(0);
    switch (letter){
        case 'a', 'ı', 'o', 'u', 'e', 'ə', 'i', 'ö', 'ü' -> System.out.println("saitdir");
        default -> System.out.println("samitdir");
    }

//    //Task4
    Scanner scanner = new Scanner(System.in);
    System.out.println("eded daxil edin");
    int num = scanner.nextInt();
    switch (num){
        case 1 -> System.out.println("Yanvar");
        case 2 -> System.out.println("Fevral");
        case 3 -> System.out.println("Mart");
        case 4 -> System.out.println("Aprel");
        case 5 -> System.out.println("May");
        case 6 -> System.out.println("İyun");
        case 7 -> System.out.println("İyul");
        case 8 -> System.out.println("Avqust");
        case 9 -> System.out.println("Sentyabr");
        case 10 -> System.out.println("Oktyabr");
        case 11 -> System.out.println("Noyabr");
        case 12 -> System.out.println("Dekabr");
        default -> System.out.println("Yanlis ay nomresi");
    }
}
