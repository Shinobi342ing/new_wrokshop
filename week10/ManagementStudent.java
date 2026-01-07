package week10;


/**
 * Write a description of class ManagementStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManagementStudent extends Student {

    public ManagementStudent(int r, String n, int m) {
        super(r, n, m);
    }

    @Override
    public String calculateResult() {
        return super.calculateResult();
    }
    
    public String calculateResult(int graceMarks) {
        this.setMarks(this.getMarks()+graceMarks);
        return calculateResult();
    }
}
