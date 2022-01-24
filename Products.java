package shop.ru.retail.goods;

public class Products {
   private String name;
   private String dateOfProduction;
   private String bestBefore;
   private String barCode ;
   private String price;

   public Products(String name,String dateOfProduction,String bestBefore,String barCode,String price) {
      this.name = name;
      this.dateOfProduction = dateOfProduction;
      this.bestBefore = bestBefore;
      this.barCode = barCode;
      this.price = price;
   }
   public String getName() {
      return name;   }

   public void setName(String name) {
      this.name = name;   }

   public String getBestBefore() {
      return bestBefore;   }

   public void setBestBefore(String bestBefore) {
      this.bestBefore = bestBefore;
   }
   public String getDateOfProduction() {
      return dateOfProduction;
   }
   public void setDateOfProduction(String dateOfProduction) {
      this.dateOfProduction = dateOfProduction;
   }
   public String getBarCode() {
      return barCode;
   }
   public void setBarCode(String barCode) {
      this.barCode = barCode;
   }
   public String getPrice() {
      return price;
   }
   public void setPrice(String price) {
      this.price = price;
   }


   public void checkName() {
      System.out.println(toString());
   }
   @Override
   public String toString(){
      return  name;
   }
   public void checkDateOfProduction() {
      System.out.println(toString());
   }

   public void checkBestBefore() {
      System.out.println(toString()+bestBefore);
   }
   public void checkBarCode() {
      System.out.println(toString()+barCode);
   }
   public void checkPrice() {
      System.out.println(toString()+price);
   }


}


