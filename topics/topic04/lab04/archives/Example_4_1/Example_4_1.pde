//https://processing.org/tutorials/interactivity

void setup() {
  size(500,400);
  background(0);
  stroke(255);
  fill(45,45,45);
}

void draw() {
  int diameter = 100;  //create a new variable
  if (mousePressed) {
    background(0);
  }
  //use diameter variable to set the size of the circle
  ellipse(mouseX, mouseY, diameter, diameter);
 
}