class Spot{
  String spotName;
  float xCoord, yCoord;
  float diameter;

 Spot(String name, float xPos, float yPos, float diamtr){
    
   if (name.length() <= 7)
        spotName = name;
    else
        spotName = name.substring(0,7);
       
    xCoord = xPos;
    yCoord = yPos;
    diameter = diamtr;
  }
}