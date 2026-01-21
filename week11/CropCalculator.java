package week11;


/**
 * Write a description of class CropCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CropCalculator
{
    public static void main(){
        Crop[] crops={ new Rice(30),new Wheat(10),new Maize(5)};
        for(int i=0;i<crops.length;i++){
            crops[i].displayCropInfo();
        }
    }
}