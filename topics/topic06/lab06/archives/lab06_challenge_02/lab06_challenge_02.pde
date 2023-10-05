Spot sp;

void setup()
{
  size (100,100);
  noStroke();
  //Testing with 6 characters
  //  sp = new Spot( "Spotty", 33, 50, 30);
  //Testing with 7 characters
  //  sp = new Spot( "SpottyS", 33, 50, 30);
  //Testing with 8 characters
    sp = new Spot( "SpottySp", 33, 50, 30);
}

void draw()
{
  background(0);
  ellipse(sp.xCoord, sp.yCoord, sp.diameter, sp.diameter);
  println(sp.spotName);
}