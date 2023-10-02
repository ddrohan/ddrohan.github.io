//Drawing a Chess board using the rect method      
  
size(400,400);
background(150);
    
for (int i=0; i < 8; i++)
   for (int j=0; j < 8; j++)
      rect(j*50,i*50,50,50);