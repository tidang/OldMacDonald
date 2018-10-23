class Chick implements Animal
{     
     private String myType;
     private String mySound;

    
     
     public Chick(String type, String soundOne, String soundTwo){
      myType = type;
      
      if((Math.random() > .5)){
      mySound = soundOne;
      }else{
      mySound = soundTwo;
      }
     }
     
     public Chick(){
      myType = "unknown";
      mySound = "unknown";
    
     }
     


      public String getSound(){return mySound;} 
     public String getType(){return myType;}
}
