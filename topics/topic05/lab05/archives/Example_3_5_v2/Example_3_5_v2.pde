void setup() 
{
   size(100,100);
   stroke(255);
   fill(150);
   background(0);
   ellipse(45,45,34,34);     
}

void draw(){
}

void mousePressed(){ 
   background(0);
   rect(45,45,34,34); 
}

void mouseReleased(){
  background(0);
  ellipse(45,45,34,34);     
}