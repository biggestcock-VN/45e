package com.mygdx.Spritess;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
//import com.badlogic.gdx.physics.box2d.Body;
//import com.badlogic.gdx.physics.box2d.BodyDef;
//import com.badlogic.gdx.physics.box2d.CircleShape;
//import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.gamestuff.GameScreen;

public class testAgent extends BodyPhysic {
	//add object of this class to physic world
	private int counter = 0;
	private int previousY;
	private int previousX;

	public testAgent(World world, int x, int y) {
		super(world);
		super.defineAgent(x, y);
		previousY = y;
		previousX = -x;
	}
	public testAgent(World world,int x, int y, GameScreen gameScreen) {
		super(world, gameScreen);
		this.marioStand = new TextureRegion(getTexture(), 31, 0, 32, 32);
        setBounds(31, 0, 32, 32);
        setRegion(this.marioStand);
        super.defineAgent(x, y);
		previousY = y;
		previousX = -x;
	}
	
	public testAgent(World world)
	{
		super(world);
		super.defineBody();
	}

	int xRand = 0;
	//agent left-right
	public void setDisturbTypeLR()
	{
		
		if(counter == 60) 
		    {
			xRand =  (int) (Math.random()* ((1 - 0) + 1)) ;
			counter = 0;
			}
			counter++;
		 if(this.xRand % 2 == 1) 
		 {
			left();
			
		 }
		else if(this.xRand%2 == 0) 
		{
			right();
		}
		
		 
		if(this.b2body.getPosition().y != previousY)
		{
			b2body.setTransform(this.b2body.getPosition().x, previousY, 0);
		}
		  
	}
	//agent up-down
	public void setDisturbTypeUD()
	{
		
		if(counter == 60) 
		    {
			xRand =  (int) (Math.random()* ((1 - 0) + 1)) ;
			counter = 0;
			}
			counter++;
		 if(this.xRand % 2 == 1) 
		 {
			up();
			
		 }
		else if(this.xRand%2 == 0) 
		{
			down();
		}
		
		 
		if(this.b2body.getPosition().x != previousX)
		{
			b2body.setTransform(previousX, this.b2body.getPosition().y, 0);
		}
		  
	}
	
	private void up()
	{
		  this.b2body.applyLinearImpulse(new Vector2(0, 2f), this.b2body.getWorldCenter(), true);
		  
	}
	
	private void down()
	{
		this.b2body.applyLinearImpulse(new Vector2(0, -2f), this.b2body.getWorldCenter(), true);
	}
	
	private void left()
	{
		this.b2body.applyLinearImpulse(new Vector2(-2f, 0), this.b2body.getWorldCenter(), true);
	}
	
	private void right()
	{
		this.b2body.applyLinearImpulse(new Vector2(2f, 0), this.b2body.getWorldCenter(), true);
	}

}


