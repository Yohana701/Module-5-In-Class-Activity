public class CollegeCourse {
   private String courseID;
   private int credits;
   private char grade;


   //Getter for course ID
   public String getID() {
       return courseID;
   }


   //Getter for credits
   public int getCredits() {
       return credits;
   }


   //Getter for grade
   public char getGrade() {
       return grade;
   }


   //Setter for course ID
   public void setID(String idNum) {
   this.courseID =idNum;
}
   //Setter for credits
   public void setCredits(int credits) {
       this.credits =credits;
   }
   //Setter for grade
   public void setGrade(char grade) {
       this.grade =grade;
   }


}
