void setup() {
  size(500,400);
  fill(255, 10, 10);
  stroke(255);
}

void draw() 
{ 
   background(0);

   if (keyPressed)
      if ((key == 'C') || (key == 'c'))
         ellipse (150,150,100,100);
      else
         rect (150,150,100,100);     
}