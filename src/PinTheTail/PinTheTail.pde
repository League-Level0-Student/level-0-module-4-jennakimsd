import ddf.minim.*;
import ddf.minim.analysis.*;
import ddf.minim.effects.*;
import ddf.minim.signals.*;
import ddf.minim.spi.*;
import ddf.minim.ugens.*;

  import ddf.minim.*;        
  AudioSample woohooSound;        
  boolean playSound = true;  
  PImage donkey;
  PImage tail;
  int X= mouseX;
  int Y= mouseY;
 void setup(){ 
  donkey = loadImage("donkey.jpg");     
  tail = loadImage("tail.png"); 
  size(550, 406); 
  tail.resize(0, 100); 
 }
 void draw(){
   if(mousePressed){
     
   }
   background (donkey);
   rect(0, 0, 30, 30);
   rect(454, 75, 40, 40);
   image(tail, mouseX-10, mouseY-20);

 }