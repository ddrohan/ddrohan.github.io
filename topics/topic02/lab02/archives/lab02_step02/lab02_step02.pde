// called once
void setup()
{
  size(500,400); 
  background(0);
}

//called continuously
void draw()
{
  stroke(0, 0, 0);
  fill(60, 220, 90);
  ellipse(mouseX, mouseY, 100, 100);
 }