void setup() 
{
  size(500,400);
  background(0);
  stroke(255);
  fill(45,45,45); 
}

void draw(){
   }

void mouseMoved(){
   ellipse(mouseX, mouseY, 100, 100);
}

void mouseClicked(){
  background(0);
  ellipse(mouseX, mouseY, 100, 100);
}