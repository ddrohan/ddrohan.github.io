//source:  https://processing.org/reference/return.html

int value = 30;

void setup() {
  int result = timestwo(value);
  println(result);
}

int timestwo(int val) {
  val = val * 2;
  return val;  
 }
 
 