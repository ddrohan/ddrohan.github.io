void draw()
{
   background(204);
   //drawX();      //Example 3.10 method call
   //drawX(0);     //Example 3.11 method call
   drawX(0,30);    //Example 3.12 method call
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