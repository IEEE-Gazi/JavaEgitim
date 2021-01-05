import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkicilar_listesi = new ArrayList<String>();

    public void sarkicilari_bastir() {
        System.out.println("Şarkıcı listesinde " + sarkicilar_listesi.size() + " kadar şarkıcı var.");
        for(int i = 0; i<sarkicilar_listesi.size(); i++) {
            System.out.println((i+1) + ". şarkıcı : " + sarkicilar_listesi.get(i));
        }
    }
    public void sarkici_ekle(String isim) {
        sarkicilar_listesi.add(isim);
        System.out.println("Şarkıcı listesi güncellendi.");
    }
    public void sarkici_guncelle(String yeni_isim,int pozizyon) {
        sarkicilar_listesi.set(pozizyon-1,yeni_isim);
        System.out.println("Şarkıcı listesi güncellendi");
    }
    public void sarkici_sil(int pozizyon) {
        String isim = sarkicilar_listesi.get(pozizyon);
        sarkicilar_listesi.remove(pozizyon);
        System.out.println(isim + " isimli şarkıcı listeden silindi...");
    }
    public void sarkici_ara(String sarkici_ismi) {
        int pozizyon = sarkicilar_listesi.indexOf(sarkici_ismi);
        if(pozizyon >= 0) {
            System.out.println("Şarkıcı bulundu.");
            System.out.println(sarkici_ismi + " isimli şarkıcı " + (pozizyon + 1) + ". pozisyonda.");
        }
        else {
            System.out.println("Şarkıcı bulunamadı...");
        }
    }
}
