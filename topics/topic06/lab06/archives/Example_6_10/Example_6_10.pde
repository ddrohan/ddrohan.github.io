float farenheit = 451.0;

void setup()
{ 
  float celsius = farenheitToCelsius(farenheit);
  println("Celsius value for " + farenheit + " is " + celsius);
  exit();   //stops the program running and closes the display window
}

float farenheitToCelsius(float farenheit)
{
  return (farenheit - 32.0) * (5.0/9.0);
}