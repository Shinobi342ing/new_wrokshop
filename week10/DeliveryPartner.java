package week10;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
  private int partnerId;
  private String name;
  private double basePay;
  public DeliveryPartner(int id, String name, double pay){
      this.partnerId=id;
      this.name=name;
      this.basePay=pay;
  }
  public int getPartnerId(){
      return this.partnerId;
  }
  public String getName(){
      return this.name;
  }
  public double getBasePay(){
      return this.basePay;
  }
  
  public void setPartnerId(int id){
      this.partnerId=id;
  }
  public void setName(String name){
      this.name=name;
  }
  public void setBasePay(double pay){
      this.basePay=pay;
  }
  
  @Override
  public String toString(){
      return "Name="+this.getName()+", id="+this.getPartnerId()+", base pay="+this.getBasePay();
  }
  
  public double calculatePayment(){
      return this.basePay;
  }
}