void setup()
{
  size(400,400);
  noStroke();
}

void draw()
{
}

void mousePressed()
{
  drawTarget(3, 150);
}

void drawTarget(int size, int gray)
{
    for (int i = size; i > 0; i--)
    {
      fill(gray);
      ellipse(mouseX, mouseY, 20*i, 20*i);    
      gray += 30;
    }
}