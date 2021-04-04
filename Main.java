import koneksi.Database;
import model.Mahasiswa;
import model.Dosen;
import model.Matakuliah;

public class Main{
  public static void main(String[]args){
    System.out.println("Ini Program Utama");

    Database.hubungkan();
    Mahasiswa.tampilanInfo();
    Dosen.tampilanInfo();
    Matakuliah.tampilanInfo
  }
}