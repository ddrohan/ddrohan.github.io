float xCoordinate = 0.0;
float background = 120;
boolean reverseDirection = false;

void setup()
{
    size(300,400);
    background(background);
    strokeWeight(4);
}

void draw()
{
  if (xCoordinate == width){
    reverseDirection = true;
  }
  if (xCoordinate == 0){
    reverseDirection = false;
  }
  
  if (!reverseDirection){  
     background = background + 0.5;
     xCoordinate = xCoordinate + 1; 
  }
  else{
    background = background - 0.5;
    xCoordinate = xCoordinate - 1; 
  }
     
  background(background);
  line (xCoordinate, 0, xCoordinate, height);
}