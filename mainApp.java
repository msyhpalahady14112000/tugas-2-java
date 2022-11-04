import java.util.Scanner;

public class mainApp{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        siswa siswa=new siswa( 12312,"M syamsul Hady");
        siswa.cetak_siswa();
        System.out.println("=============input data mata pelajaran=============");
        niilai nilai=new niilai();
        System.out.println("kode mata pelajaran =");
        nilai.kdmt=obj.nextLine();
        System.out.println("nama pelajaran");
        nilai.nmmt=obj.nextLine();System.out.println("==================Data Mata pelajaran==================");
        nilai.cetakmt();
        System.out.println("================Data Nilai================");
        System.out.println("julmlah Kehadiran =");
        nilai.nilai_absen=obj.nextInt();
        System.out.println("nilai tugas =");
        nilai.nilai_tugas=obj.nextInt();
        System.out.println("nilai UTS =");
        nilai.nilai_uts=obj.nextInt();
        System.out.println("nilai UAS =");
        nilai.nilai_uas=obj.nextInt();
        nilai.addnnlai();
        System.out.println("================Status Nilai================");
        nilai.getRata_rata();
        nilai.cetak_nilai();
        System.out.println("==============================");
        nilai.cetak_status();

    }
}