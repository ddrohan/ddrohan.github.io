size(600, 300);
background(100);
noStroke();
 
int yCoordinate = 60;
int i = 0;
while(i < 4)
{
  // Draw horizontal white bars 
  fill(255);
  rect(50, yCoordinate, 500, 10);
  // Draw horizontal red bars 
  fill(255,0,0);
  rect(120, yCoordinate+10, 430, 10);
  yCoordinate+=20;
  i++;
}

int xCoordinate = 60;
int j = 0;
while (j < 4) 
{
  // Draw vertical white bars 
  fill(255);
  rect(xCoordinate, 50, 10, 200);
  // Draw vertical green bars 
  fill(0,255,0);
  rect(xCoordinate+10,130, 10, 120);
  xCoordinate+=20;
  j++;
}