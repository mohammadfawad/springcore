package com.springframework.springcore.RefType;

/**
*
* @author spring
*/
public class Student {
   private String studentName;
   private Scores scores;

   /**
    * @return the scores
    */
   public Scores getScores() {
       return scores;
   }

   /**
    * @param scores the scores to set
    */
   public void setScores(Scores scores) {
       this.scores = scores;
   }
   
   /**
    * @return the studentName
    */
   public String getStudentName() {
       return studentName;
   }

   /**
    * @param studentName the studentName to set
    */
   public void setStudentName(String studentName) {
       this.studentName = studentName;
   }
   
   @Override
   public String toString(){
       
       return "StudentName : "+ this.getStudentName() + "  Student Scores : "+ scores.toString();
   
   }
}
