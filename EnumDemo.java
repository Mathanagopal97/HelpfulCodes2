enum Student
{
 John(11,12), Bella(10,13), Sam(13,23), Viraaj(9,8);
 private int age;   
 private int mark;
 int getMark() {return mark;}                //variable defined in enum Student
 int getage() { return age; }  //method defined in enum Student
 Student(int age,int mark)  //constructor defined in enum Student
 {
  this.age= age;
  this.mark=mark;
 }
}

class EnumDemo
{
 public static void main( String args[] )
 {
  Student S;
  System.out.println("Age of Viraaj is " +Student.Bella.getage()+ " years and marks is "+Student.Viraaj.getMark());
 }
}