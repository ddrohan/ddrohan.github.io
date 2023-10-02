// called once
void setup()
{
  size(500,400); 
}

//called continuously
void draw()
{
  background(0);
  stroke(0, 0, 0);
  fill(60, 220, 90);
  //ellipse(mouseY, mouseX, 100, 100);
  ellipse(width, mouseY, 100, 100);
 }