package week11;


/**
 * Write a description of class Crop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Crop implements Transportable
{   
    
    private String cropName,season;
    private double landArea;
    public double getLandArea(){
        return this.landArea;
    }
    public Crop(String name, String season, double area){
        this.cropName=name;
        this.season=season;
        this.landArea=area;
    }
    abstract double calculateYeild();
    abstract String calculateWaterRequirment();
    public void displayCropInfo(){
        System.out.println("CropName="+this.cropName);
        System.out.println("Season="+this.season);
        System.out.println("LandArea="+this.landArea);
    };

}