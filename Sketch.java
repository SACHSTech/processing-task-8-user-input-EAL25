import processing.core.PApplet;

public class Sketch extends PApplet {
	
  float circleX = 150;
    float circleY = 150;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
    
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  if (mousePressed) {
      fill(0, 255, 255);
      ellipse(mouseX, mouseY, 25, 25);
    }
    
    ellipse(mouseX, mouseY, 50, 50);

    if (keyPressed){
      if (keyCode == UP){
        circleY--;
      }
      else if (keyCode == DOWN){
        circleY++;
      }
      else if(keyCode == LEFT){
        circleX--;
      }
      else if(keyCode == RIGHT){
        circleX++;
      }
      ellipse(circleX, circleY, 50, 50);
      fill(168, 74, 50);
    }

   

  
  // define other methods down here.
}
  public void mouseDragged(){
      fill(252, 186, 3);
      rect(mouseX, mouseY, 25, 25);
    }

    public void mouseWheel(){
      fill(255, 255, 255);
      rect(mouseX, mouseY, 25, 25);
    }

}
