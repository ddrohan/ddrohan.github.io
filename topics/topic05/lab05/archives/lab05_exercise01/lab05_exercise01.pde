void setup()
{
  size(380,340);
  background(20,70,105);
}

void draw()
{
   for (int i = 1; i < 9; i++)
   { 
      drawRedSquare(40, i*40, i*35, 5);
   }
}

void drawRedSquare(int length, int xCoord, int yCoord, int stroke)
{
    strokeWeight(stroke);
    fill(255,0,0);
    rect(xCoord,yCoord, length, length);
}