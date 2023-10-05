class Spot{
  float xCoord, yCoord;
  float diameter;
 
  //Default Constructor
  Spot(){
  }
  
  //A second constructor with a (float, float, float) parameter list
  Spot(float xPos, float yPos, float diamtr){
    
    if (xPos >= 0)
       xCoord = xPos;
    else
       xCoord = 0;
       
    if (yPos >= 0)
       yCoord = yPos;
    else
       yCoord = 0;
       
    if ((diamtr >= 20)  && (diamtr <= 50))
       diameter = diamtr;
    else
       diameter = 20;
  }
  
}