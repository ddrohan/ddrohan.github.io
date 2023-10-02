float xCoordinate = 250;
float yCoordinate = 300;
boolean bounceUp = false;

void setup() {
  size(500,400);
  fill(255, 10, 10);
  stroke(255);
}

void draw() 
{ 
   background(0);
   ellipse(xCoordinate, yCoordinate, 100, 100);

   if (bounceUp){
     if (yCoordinate > 100)
         yCoordinate = yCoordinate - 1;
     else
         bounceUp = false;
   }
     
   if (!bounceUp){
     if (yCoordinate <= 350)
         yCoordinate = yCoordinate + 1;
     else
         bounceUp = true;
   }
     
}