//Setting up the display window
size(400,300);
background(100); 

//Setting the stroke weight to 3
strokeWeight(3);

//Dark Green fill on all subsequent shapes
fill(100,150,70);   

//Drawing a rectangle
rect(100,100,200,100);

//Drawing a square
rect(150,200,20,20);

//Drawing a line
line(100,100,300,200);

//Light Green fill on all subsequent shapes 
fill(200,250,70);

//Drawing an ellipse with no stroke
noStroke();
ellipse(200,100,20,60);

//Drawing an circle with a black stroke
stroke(0,0,0);
ellipse(250,130,25,25);