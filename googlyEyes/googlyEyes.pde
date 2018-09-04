int minX=76;
int maxX=123;
int minY=83;
int maxY=116;
void setup(){
  size(350,200);
}

void draw(){
  fill(#FFFFFF);
  ellipse(100,100,100,70);
  ellipse(250,100,100,70);
  fill(#000000);
  if(mouseX<maxX&&mouseX>minX&&mouseY<maxY&&mouseY>minY){
  ellipse(mouseX,mouseY,25,25);
  ellipse(mouseX+150,mouseY,25,25);
  }
}