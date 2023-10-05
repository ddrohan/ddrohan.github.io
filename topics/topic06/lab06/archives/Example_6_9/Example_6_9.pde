void draw()
{
   background(204);
   for (int i = 0; i < 20; i++){
      drawX(200-i*10, (20-i)*2, i, i/2, 70);
   } 
}

void drawX()
{
  //draw thick, light gray x
  stroke(160);
  strokeWeight(20);
  line(0,5,60,65);
  line(60,5,0,65);
}

void drawX(int gray)
{
  //draw thick x, passing colour as a parameter
  stroke(gray);
  strokeWeight(20);
  line(0,5,60,65);
  line(60,5,0,65);
}

void drawX(int gray, int weight)
{
  //draw X, passing colour and weight
  stroke(gray);
  strokeWeight(weight);
  line(0,5,60,65);
  line(60,5,0,65);
}

void drawX(int gray, int weight, int x, int y, int size)
{
  //draw x, passing colour, weight, coordinates and size
  stroke(gray);
  strokeWeight(weight);
  line(x, y, x+size, y+size);
  line(x+size, y, x, y+size);
}