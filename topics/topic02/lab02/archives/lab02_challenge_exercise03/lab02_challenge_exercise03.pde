//The Processing variables pmouseX and pmouseY store the 
//mouse values from the previous frame. 

void setup() {
  size(400, 400);
  strokeWeight(8);
}

void draw() {
  background(204);
  line(mouseX, mouseY, pmouseX, pmouseY);
}