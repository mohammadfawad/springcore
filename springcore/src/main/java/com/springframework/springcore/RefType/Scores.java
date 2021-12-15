package com.springframework.springcore.RefType;

/**
*
* @author spring
*/
class Scores {

   private Double math;
   private Double Physics;
   private Double Chymistery;
   /**
    * @return the math
    */
   public Double getMath() {
       return math;
   }

   /**
    * @param math the math to set
    */
   public void setMath(Double math) {
       this.math = math;
   }

   /**
    * @return the Physics
    */
   public Double getPhysics() {
       return Physics;
   }

   /**
    * @param Physics the Physics to set
    */
   public void setPhysics(Double Physics) {
       this.Physics = Physics;
   }

   /**
    * @return the Chymistery
    */
   public Double getChymistery() {
       return Chymistery;
   }

   /**
    * @param Chymistery the Chymistery to set
    */
   public void setChymistery(Double Chymistery) {
       this.Chymistery = Chymistery;
   }
   @Override
   public String toString(){
       return " Math : "+ this.getMath() + " Physics : "+ this.getPhysics() + " Chymistery : "+ this.getChymistery();
   
   }
   
}
