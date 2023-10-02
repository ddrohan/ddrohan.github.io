void setup() 
{
  size(500,400);
  background(0);
  stroke(255);
  fill(45,45,45); 
}

void draw(){
   ellipse(mouseX, mouseY, 100, 100);
}

void mousePressed(){
   background(0);
}