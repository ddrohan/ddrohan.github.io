void setup()
{
  size(200,200);
  background(20,70,105);
}

void draw()
{
   drawRedSquare(60, 70, 40);
}

void drawRedSquare(int length, int xCoord, int yCoord)
{
    fill(255,0,0);
    rect(xCoord,yCoord, length, length);
}