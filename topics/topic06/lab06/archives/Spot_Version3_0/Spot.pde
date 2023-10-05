class Spot{
  float xCoord, yCoord;
  float diameter;
 
  //Default Constructor
  Spot(){
  }
  
  //A second constructor with a (float, float, float) parameter list
  Spot(float xPos, float yPos, float diamtr){
    xCoord = xPos;
    yCoord = yPos;
    diameter = diamtr;
  }
}