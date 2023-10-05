Spot sp;

void setup()
{
  size (100,100);
  noStroke();
  //testing the boundaries in the validation
  //sp = new Spot(-1, -1, 51);
  //sp = new Spot(0, 0, 19);
  sp = new Spot(20, 20, 455);
}

void draw()
{
  background(0);
  ellipse(sp.xCoord, sp.yCoord, sp.diameter, sp.diameter);
}