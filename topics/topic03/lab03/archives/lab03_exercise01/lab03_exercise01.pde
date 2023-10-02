void setup() {
  size(500,400);
  background(0);
}

void draw() {
 
  //only draw the red circle when the mouse is pressed
  if (mousePressed) {
    stroke(255);
    fill(255,0,0);
    ellipse(mouseX, mouseY, 100, 100);
  }
  
}