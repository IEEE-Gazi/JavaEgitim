public Yonetici extends Calisan {
    private int sorumlu_kisi_sayisi;
    public Yonetici(String ad, String soyad, int id,int sorumlu_kisi_sayisi) {
        super(ad,soyad,id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticinin Sorumlu olduğu kişi sayısı : " + sorumlu_kisi_sayisi);
    }
    public void zamYap(int zamMiktarı) {
        System.out.println(getAd() + " çalışanlara " + zamMiktarı + " kadar zam yapıyor...");
    }
}