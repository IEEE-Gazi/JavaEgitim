public class Daire extends Sekil{
    private int yaricap;
    public Daire(String isim,int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }
    @Override
    public void alanHesapla() {
        System.out.println(getIsim() + "in alanı : " + (Math.PI * yaricap * yaricap));
    }
}
