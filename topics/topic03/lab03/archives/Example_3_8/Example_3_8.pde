//https://processing.org/tutorials/interactivity

void setup() {
  size(500,400);
  background(0);
  stroke(255);
  fill(45,45,45);
}

void draw() {
 
  if (mousePressed) {
    background(0);
  }

  //stroke(255);
  //fill(45,45,45);
  ellipse(mouseX, mouseY, 100, 100);
 
}