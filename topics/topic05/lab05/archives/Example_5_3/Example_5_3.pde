void setup()
{
  size(200,200);
  background(20,70,105);
}

void draw()
{
   drawRedSquare(60);
}

void drawRedSquare(int length)
{
  fill(255,0,0);
  rect(70,70,length, length);
}