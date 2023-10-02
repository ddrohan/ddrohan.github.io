void setup() {
  size(500,400);
  background(0);
  stroke(255);
}

void draw() 
{ 

  if ((mousePressed) && (mouseButton == LEFT)){
    fill(255,0,0);
    ellipse(mouseX, mouseY, 50, 50);
  }
  else if ((mousePressed) && (mouseButton == RIGHT)){
    fill(0,0,255);
    rect(mouseX, mouseY, 50, 50);
  }
   
}