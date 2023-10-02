//https://processing.org/tutorials/interactivity
int diameter = 100;  //create a new global variable

void setup() {
  size(500,400);
  background(0);
  stroke(255);
  fill(45,45,45);
}

void draw() {
  //int diameter = 100;  //create a new local variable
  if (mousePressed) {
    diameter = diameter - 10;
    background(0);
  }
  //use diameter variable to set the size of the circle
  ellipse(mouseX, mouseY, diameter, diameter);
}