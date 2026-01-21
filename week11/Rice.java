package week11;


/**
 * Write a description of class Rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rice extends Crop implements Transportable
{
    private static final double yeild=30;
     private static final String waterRequirment="high water requirement";
     private static final String TransportMethod="remote village(trucks)";
    public Rice(double landarea) {
        super("Rice", "Monsoon", landarea);
    }

    @Override
    public double calculateYeild() {
        return this.getLandArea() * yeild; 
    }

    @Override
    public String calculateWaterRequirment(){
        return this.waterRequirment; 
    }
    @Override
    public double calculateTransportCost(){
        return this.getLandArea() * 500;
    }
    @Override
    public String getTransportMethod(){
        return this.TransportMethod;
    }
      public void displayCropInfo(){
        super.displayCropInfo();
         System.out.println("Yeild is="+this.calculateYeild());
            System.out.println("Water requirment="+this.calculateWaterRequirment());
            System.out.println("TransportCost="+this.calculateTransportCost());
            System.out.println("Transport Method="+this.getTransportMethod());
    }
 
}
