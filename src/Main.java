import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner Frase = new Scanner(System.in);
        Scanner Chiave = new Scanner(System.in);
        Scanner Menu = new Scanner(System.in);

        System.out.println("Scrivi una frase");
        String dati = Frase.nextLine();

        System.out.println("Scegli il metodo di criptazione : [1] Cesar [2] Xor");
        int scelta = Menu.nextInt();

        if(scelta == 1){
            System.out.println("Inserisci la chiave (int)");
            int key = Chiave.nextInt();
            System.out.print(Cryto.Cesar(dati,key));
        }else if(scelta == 2){
            System.out.println("Inserisci la chiave (String)");
            String key = Chiave.nextLine();
            System.out.print(Cryto.xorAlgo(dati,key));
        }else{
            System.out.print("Errore! Hai inserito un opzione non presente");
        }
    }
}

