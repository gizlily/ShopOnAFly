package shop.ru.retail;

import shop.ru.retail.goods.Cheese;
import shop.ru.retail.goods.DairyProducts;
import shop.ru.retail.goods.Kefir;
import shop.ru.retail.it.system.BarCode;

public class ShopRetailFly {

    private String shopName;

    public ShopRetailFly(String shopName) {
        this.shopName = shopName;
    }

    public String getShopname() {
        return shopName;
    }

    public void setShopname(String shopname) {
        this.shopName = shopName;
    }

    public void checkShopName() {
    }

    public static void main(String[] args) {
        ShopRetailFly shop = new ShopRetailFly("Пятёрочка");

        DairyProducts kefir1 = new Kefir("Родимая сторонка", "16.01.22", "26.01.22",
                "1324", "110", "1,5",
                "Пластиковая бутылка", "Козье молоко", "1,5");

        DairyProducts cheese1 = new Cheese("Ламбер","26.01.22","15.02.22",
                "7635", "350", "50%",
                "вакуум", "коровье молоко", "245гр");
        System.out.println(shop.shopName + kefir1.getName() + cheese1.getName());
    }

}














































