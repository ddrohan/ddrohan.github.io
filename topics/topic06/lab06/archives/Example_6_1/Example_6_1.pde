void setup()
{
  size(100,100);
  noStroke();
}

void draw()
{
  background(204);
  fill(255);
  ellipse(50,50,60,60);    //outer white circle
  fill(0);
  ellipse(50+10, 50, 30, 30);  //black circle
  fill(255);
  ellipse(50+16, 46, 6, 6);  //small, white circle
}