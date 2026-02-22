package week16;


/**
 * Write a description of class Cen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CensusProcessor
{
    public static Student[] parseCSV(String[] csvData){
       Student [] students= new Student[csvData.length-1];
       for(int i=1;i<csvData.length;i++){
            String[] fields=csvData[i].split(",");
            String name = fields[0].trim();
            int age = Integer.parseInt(fields[1].trim());
            String school = fields[2].trim();
            int grade = Integer.parseInt(fields[3].trim());
            String citizenship = fields[4].trim();
            String phone = fields[5].trim();
            students[i - 1] = new Student(name, age, school, grade, citizenship, phone);
        }
        return students;
       }
    public static boolean isValidCitizenship(String cit){
           if(cit.length()==10){
               if(cit.charAt(2)=='-'){
                  if (Character.isDigit(cit.charAt(0)) && Character.isDigit(cit.charAt(1))) {
                         for (int i = 3; i < 10; i++) {
                            if (Character.isDigit(cit.charAt(i))) {
                                
                            }else{
                                return false;
                            }
                        }
                        return true;
                   }else{
                       return false;
                   }
               }else{
                   return false;
               }
           }else{{
               return false;
           }
       }
    }
    public static void findBySchool(Student[] students, String school) {
        for (Student s : students) {
            if (s.getSchool().equalsIgnoreCase(school)) {
                System.out.println(s);
            }
        }
    }
    public static int countByGrade(Student[] students, int grade){
        int n=0;
        for(Student s:students){
            if(s.getGrade()==grade){
                n++;
            }
        }
        return n;
    }
    public static double averageAge(Student[] students) {
        int sum = 0;
        for (Student s : students) {
            sum += s.getAge();
        }
        return (double) sum / students.length;
    }
    public static String findLongestName(Student[] students){
        String name=students[0].getName();
        for( Student s: students){
            if(s.getName().length()>name.length()){
                name=s.getName();
            }
        }
        return name;
    }
    public static String generateCensusReport(Student[] students){
        StringBuilder report = new StringBuilder();
        report.append("===== Nepal School Census Report =====\n\n");
        int total=students.length;
        int validRecords=0;
        int invalidRecord=0;
        for(int i=0;i<students.length;i++){
            if(isValidCitizenship(students[i].getCitizenship())){
                validRecords++;
            }else{
                invalidRecord++;
            }
        }
        
        report.append("Total Students: "+total+" Valid Records: "+validRecords+" Invalid:"+invalidRecord);
        report.append("\n -Student List - \n");
        for(int i=0;i<students.length;i++){
            report.append("\n"+students[i].getNameInitials()+" "+students[i].getName()+" | " + students[i].getAge()+ " | Grade " + students[i].getGrade()+" | "+(isValidCitizenship(students[i].getCitizenship())?"Valid":"Invalid \n"));
        }
        report.append("\n...\n");
        report.append("\n- STATISTICS -\n");
        report.append("Average Age: ").append(averageAge(students)).append("\n");
        report.append("Longest Name: ").append(findLongestName(students)).append("\n");
        int itahariCount = 0;
        int ickCount = 0;
        int icpCount = 0;
        for(Student s:students){
            if (s.getSchool().equalsIgnoreCase("Itahari Int. College")) {
                itahariCount++;
            } else if (s.getSchool().equalsIgnoreCase("ICK College")) {
                ickCount++;
            } else if (s.getSchool().equalsIgnoreCase("ICP College")) {
                icpCount++;
            }
        }
        report.append("Itahari Int. College: ").append(itahariCount).append("\n");
        report.append("ICK College: ").append(ickCount).append("\n");
        report.append("ICP College: ").append(icpCount).append("\n");
        return report.toString();
    }
}
    