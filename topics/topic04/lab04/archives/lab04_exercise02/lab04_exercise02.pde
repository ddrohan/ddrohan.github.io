//drawing a chess board using a while loop
size(400,400);
background(150);
  
int i = 1;
while (i < 9)
{
   //horizontal lines
   line(0,i*50, 400, i*50);
   //vertical lines
   line(i*50,0,i*50,400);
   i++;
}