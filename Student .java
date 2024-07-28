public class Student {
   private int stuID;
   private CollegeCourse[] courses = new CollegeCourse[5];
   //Getter for stuID
   public int getID(){
       return stuID;
   }
   //setter for stuID
   public void setID(int stuID){
       this.stuID = stuID;
   }
   //Getter for specific college course
   public CollegeCourse getCourse(int index){
       return courses[index];
   }
   //setter for specific college course
   public void setCourse(CollegeCourse course, int index){
       courses[index] = course;
   }
}
