public class Idman {
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;
    private int burpee_sayisi;

    public Idman(int burpee_sayisi,int pushup_sayisi,int situp_sayisi,int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }
    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }
    public void hareketYap(String hareketTuru,int sayi) {
        if(hareketTuru.equals("Burpee")) {
            burpeeYap(sayi);
        }
        else if(hareketTuru.equals("Pushup")) {
            pushupYap(sayi);
        }
        else if(hareketTuru.equals("Squat")) {
            squatYap(sayi);
        }
        else if(hareketTuru.equals("Situp")) {
            situpYap(sayi);
        }
        else {
            System.out.println("Böyle bir hareket türü yok!");
        }
    }
    public void burpeeYap(int sayi) {
        if(burpee_sayisi == 0) {
            System.out.println("Yapılacak burpee kalmadı!");
        }
        if(burpee_sayisi - sayi < 0 ) {
            System.out.println("Hedeflediğin Burpee sayısını geçtin. Tebrikler!");
            burpee_sayisi = 0;
            System.out.println("Kalan Burpee : " + burpee_sayisi);
        }
        else {
            burpee_sayisi -= sayi;
            System.out.println("Kalan Burpee : " + burpee_sayisi);
        }
    }
    public void pushupYap(int sayi) {
        if(pushup_sayisi == 0) {
            System.out.println("Yapılacak pushup kalmadı!");
        }
        if(pushup_sayisi - sayi < 0 ) {
            System.out.println("Hedeflediğin Pushup sayısını geçtin. Tebrikler!");
            pushup_sayisi = 0;
            System.out.println("Kalan Pushup : " + pushup_sayisi);
        }
        else {
            pushup_sayisi -= sayi;
            System.out.println("Kalan Pushup : " + pushup_sayisi);
        }
    }
    public void squatYap(int sayi) {
        if(squat_sayisi == 0) {
            System.out.println("Yapılacak squat kalmadı!");
        }
        if(squat_sayisi - sayi < 0 ) {
            System.out.println("Hedeflediğin Squat sayısını geçtin. Tebrikler!");
            squat_sayisi = 0;
            System.out.println("Kalan Squat : " + squat_sayisi);
        }
        else {
            squat_sayisi -= sayi;
            System.out.println("Kalan Squat : " + squat_sayisi);
        }
    }
    public void situpYap(int sayi) {
        if(situp_sayisi == 0) {
            System.out.println("Yapılacak situp kalmadı!");
        }
        if(situp_sayisi - sayi < 0 ) {
            System.out.println("Hedeflediğin Situp sayısını geçtin. Tebrikler!");
            situp_sayisi = 0;
            System.out.println("Kalan Situp : " + situp_sayisi);
        }
        else {
            situp_sayisi -= sayi;
            System.out.println("Kalan Situp : " + situp_sayisi);
        }
    }
    public boolean idmanBittiMi() {
        return (burpee_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);
    }
}
