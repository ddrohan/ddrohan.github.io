//Setting up the display window
size(550,100);
background(150); 
strokeWeight(2);

//play button
ellipse(100,50,60,60);
fill(0);
triangle(90,35,115,50,90,65);

//pause button
fill(255);
ellipse(180,50,60,60);
fill(0);
rect(165,35,10,30);
rect(185,35,10,30);

//stop button
fill(255);
ellipse(260,50,60,60);
fill(0);
rect(245,35,30,30);

//fast forward button
fill(255);
ellipse(340,50,60,60);
fill(0);
triangle(325,35,350,50,325,65);
triangle(337,35,362,50,337,65);

//rewind button
fill(255);
ellipse(420,50,60,60);
fill(0);
triangle(425,35,400,50,425,65);
triangle(437,35,412,50,437,65);