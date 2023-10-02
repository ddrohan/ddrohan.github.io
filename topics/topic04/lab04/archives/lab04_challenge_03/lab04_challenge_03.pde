//Drawing a Chess board using the rect method    
//and doing a chequered colour scheme.      

size(400,400);
background(150);
  
for (int i=0; i < 8; i++)
{
  for (int j=0; j < 8; j++)
  { 
    if ((i + j + 1) % 2 == 0)
      fill(0);
    else
      fill(255);
    rect(j*50,i*50,50,50);  ///note that this rect statement is not 
                            //part of the if statement above.  
                            //Can you say why?
  }
}