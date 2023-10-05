void setup()
{
  size(100, 100);
  drawLines(10, 4);
}


// For loop approach
/*void drawLines(int x, int num){
  for (int i = 0; i < num; num--)
  {
    line (x, 20, x, 80);
    x += 5;
  }
} */


// Recursive approach
void drawLines(int x, int num) {
  line (x, 20, x, 80);
  if (num > 1)
  {
    drawLines(x+5, num-1);
  }
} 