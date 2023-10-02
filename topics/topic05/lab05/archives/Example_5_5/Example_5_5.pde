void setup()
{
  size(200,200);
  background(20,70,105);
}

void draw()
{
   for (int i = 1; i < 7; i++)
   { 
      drawRedSquare(25, i*25, i*20);
   }
}

void drawRedSquare(int length, int xCoord, int yCoord)
{
    fill(255,0,0);
    rect(xCoord,yCoord, length, length);
}