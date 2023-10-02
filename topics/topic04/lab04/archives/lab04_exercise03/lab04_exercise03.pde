//Drawing a chess board using the line method 
//regardless of the size of the window

size(600,400);
background(150);
  
for (int i=1; i < 9; i++)
{
   //horizontal lines
   line(0,i*(height/8), width, i*(height/8));
   //vertical lines
   line(i*(width/8),0,i*(width/8),height);
}