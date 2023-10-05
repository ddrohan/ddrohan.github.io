void draw()
{
   background(204);
   drawX();
}

void drawX()
{
  //draw thick, light gray x
  stroke(160);
  strokeWeight(20);
  line(0,5,60,65);
  line(60,5,0,65);
}