import java.util.Scanner;

public class PLN{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Selamat Datang di PLN MOBILE =====");
        System.out.println("Masukan besar pemakaian listrik: ");
        double PemakaianListrik = input.nextDouble();

        double Tarif1 = 100;
        double Tarif2 = 150;
        double Tarif3 = 250;
        double Tarif4 = 300;
        double Tagihan;

        if(PemakaianListrik >= 0 && PemakaianListrik <=50){
            Tagihan=PemakaianListrik * Tarif1;
        } else if (PemakaianListrik >= 51 && PemakaianListrik <= 150){
            Tagihan=PemakaianListrik * Tarif2;
        } else if (PemakaianListrik >= 151 && PemakaianListrik <= 250){
            Tagihan=PemakaianListrik * Tarif3;
        } else if (PemakaianListrik > 250){
            Tagihan=PemakaianListrik * Tarif4;
        } else{
            System.out.println("Pemakaian Listrik Diluar Jangkauan");
            return;
        }

        double Total = Tagihan * 0.2;
        System.out.println("Anda terkena biaya tambahan sebesar: "+Total);
        double HargaTotal;
        HargaTotal = Total + Tagihan;
        System.out.println("Total Tagihanu: "+HargaTotal);
        
        input.close();
    }
}