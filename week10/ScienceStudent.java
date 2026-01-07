package week10;


/**
 * Write a description of class ScienceStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScienceStudent extends Student {

    public ScienceStudent(int r, String n, int m) {
        super(r, n, m);
    }

    @Override
    public String calculateResult() {
        return  this.getMarks() >= 45 ? "Pass" : "Fail";
    }

    public String calculateResult(int graceMarks) {
        this.setMarks(this.getMarks()+ graceMarks);
        return calculateResult();
    }
}
