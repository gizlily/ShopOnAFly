package shop.ru.retail.goods;

public class DairyProducts extends Products{

    private String dairyFat;
    private String dairyKindOfPackage;
    private String dairyKindOfMilk;
    public DairyProducts(String name, String dateOfProduction, String bestBefore, String barCode, String price, String dairyFat, String dairyKindOfPackage, String dairyKindOfMilk, String volume) {
        super(name, dateOfProduction, bestBefore, barCode, price);
            }
    public DairyProducts(String name, String dateOfProduction, String bestBefore, String barCode, String price,
                         String dairyFat, String dairyKindOfPackage, String dairyKindOfMilk) {
        super(name, dateOfProduction, bestBefore, barCode, price);
        this.dairyFat = dairyFat;
        this.dairyKindOfPackage = dairyKindOfPackage;
        this.dairyKindOfMilk = dairyKindOfMilk;
    }
    public String getDairyFat() {
        return dairyFat;
    }
    public void setDairyFat(String dairyFat) {
        this.dairyFat = dairyFat;
    }
    public String getDairyKindOfPackage() {
        return dairyKindOfPackage;
    }
    public void setDairyKindOfPackage(String dairyKindOfPackage) {
        this.dairyKindOfPackage = dairyKindOfPackage;
    }
    public String getDairyKindOfMilk() {
        return dairyKindOfMilk;
    }
    public void setDairyKindOfMilk(String dairyKindOfMilk) {
        this.dairyKindOfMilk = dairyKindOfMilk;
    }
    public void checkDairyFat() {};
    public void checkDairyKindOfPackage() {};
    public void checkDairyKindOfMilk() {};
}

