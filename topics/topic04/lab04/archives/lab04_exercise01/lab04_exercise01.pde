//drawing a chess board using a for loop

size(400,400);
background(150);
  
for (int i=1; i < 9; i++)
{
   //horizontal lines
   line(0,i*50, 400, i*50);
   //vertical lines
   line(i*50,0,i*50,400);
}