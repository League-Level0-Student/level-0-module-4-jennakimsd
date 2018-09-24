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
  Minim minim = new Minim(this);
  woohooSound = minim.loadSample("homer-woohoo.wav"); 
  donkey = loadImage("donkey.jpg");     
  tail = loadImage("tail.png"); 
  size(550, 406); 
  tail.resize(0, 100); 
 }
 void draw(){
   if(dist(0, 0, mouseX, mouseY) > 30){
  background(#000000);   
   }
   else {
   background (donkey);
   }
   rect(0, 0, 30, 30);
   rect(454, 75, 40, 40);
   image(tail, X-10, Y-20);
   if(mousePressed){
     X=mouseX;
     Y=mouseY;
   }
  if(mousePressed){
    if(mouseX>454&&mouseX<494){
      if(mouseY>75&&mouseY<115){
        woohooSound.trigger();
      }
      }
  }
   if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
 }