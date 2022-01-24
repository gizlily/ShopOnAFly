package shop.ru.retail.goods;

public class Cheese extends DairyProducts {
    private String weight;

    public Cheese(String name, String dateOfProduction, String bestBefore, String barCode, String price,
                  String dairyFat, String dairyKindOfPackage, String dairyKindOfMilk, String weight) {
        super(name, dateOfProduction, bestBefore, barCode, price, dairyFat, dairyKindOfPackage,
                dairyKindOfMilk, weight);
    }

    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public void checkWeight() {};


}
