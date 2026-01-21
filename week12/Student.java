package week12;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name,phone,group;
    public Student(String name, String num, String group){
        this.name=name;
        this.phone=num;
        this.group=group;
    }
    
      public String getName() { 
          return name; 
        }
    public void setName(String name) { 
        this.name = name;
    }

    public String getGroup() { 
        return group; 
    }
    public void setGroup(String group) { 
        this.group = group;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) { 
        this.phone = phone; 
    }
    @Override
    public String toString() {
        return "name=" + name +  " group="+group + " phone="+phone;
    }
}