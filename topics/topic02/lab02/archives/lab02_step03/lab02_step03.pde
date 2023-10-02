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
  ellipse(mouseX, mouseY, 100, 100);
 }