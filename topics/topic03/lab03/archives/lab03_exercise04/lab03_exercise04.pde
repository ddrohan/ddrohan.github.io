float rColourValue = 0;
float gColourValue = 100;
float bColourValue = 150;

void setup() {
  size(500,400);
  background(0);
  stroke(255);
}

void draw() 
{ 
   fill(rColourValue, gColourValue, bColourValue);
   ellipse(mouseX, mouseY, 100, 100);

   if (rColourValue < 255)
       rColourValue = rColourValue + 1;
   else
       rColourValue = 0;

   if (gColourValue < 255)
       gColourValue = gColourValue + 3;
   else
       gColourValue = 0;
 
   if (bColourValue < 255)
       bColourValue = bColourValue + 6;
   else
       bColourValue = 0;
 
}