package shop.ru.retail.goods;

public class Kefir extends DairyProducts{
    private String volume;

    public Kefir(String name, String dateOfProduction, String bestBefore, String barCode, String price, String dairyFat,
                 String dairyKindOfPackage, String dairyKindOfMilk,String volume){
    super(name, dateOfProduction, bestBefore, barCode, price, dairyFat, dairyKindOfPackage, dairyKindOfMilk,
            volume);
        this.volume = volume;

           }

    public String getVolume() {
        return volume;
    }
    public void setVolume(String volume) {
        this.volume = volume;
    }





}

