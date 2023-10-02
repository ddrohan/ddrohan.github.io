
void setup() {
  size(100, 100);
  noStroke();   
}

void draw() {
  float x = mouseX;
  float y = mouseY;
  background(126);
  fill(255);
  ellipse(x, y, y, y);
}