void setup() 
{
   size(100,100);
   background(204);
   fill(126); 
}

void draw(){
   rect(25, 25, 50, 50);
}

void mousePressed(){
          if (mouseButton == LEFT) 
            fill(0);       // black
       else if (mouseButton == RIGHT)
            fill(255);     // white 
   }

void mouseReleased(){
   fill(126); 
}