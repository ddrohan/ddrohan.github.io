//Reas, C. & Fry, B. (2014) Processing – A Programming Handbook for Visual Designers and Artists, 2nd Edition, MIT Press, London.

void setup() {
  size(100, 100);
}

void draw() { 
   if (mousePressed){
       if (mouseButton == LEFT) 
            fill(0);     // black
       else if (mouseButton == RIGHT)
            fill(255);   // white
   }        
   else { 
       fill(126);   // gray
    }
    rect(25, 25, 50, 50);
}