package com.mygdx.Spritess;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.gamestuff.GameScreen;

public class BodyPhysic extends Sprite{
	
	public World world;
	public Body b2body;
	public int speed = 1;
	protected TextureRegion marioStand;
	
	public BodyPhysic() {
	}
	
	public BodyPhysic(World world, GameScreen gameScreen) {
		super(gameScreen.getAtlas().findRegion("agv"));
        this.world = world;
       
	}
	
	private void setTexture()
	{
		marioStand = new TextureRegion(getTexture(), 0, 0, 32, 32);
        setBounds(0, 0, 32, 32);
        setRegion(marioStand);
	}
	
	public BodyPhysic(World world) {

        this.world = world;
       
	}
	

	public void update(float dt)
	{
		setPosition(b2body.getPosition().x*26/32 - getWidth()/2, b2body.getPosition().y*26/32 - getHeight()/2);
	}
	
	public BodyPhysic(World world, int x, int y,GameScreen gameScreen) 
	{
		this.world = world;
		
	}

	public void defineBody() {
		BodyDef bdef = new BodyDef();
		bdef.position.set(30, 448);
		bdef.type = BodyDef.BodyType.DynamicBody;
		b2body = world.createBody(bdef);

		FixtureDef fdef = new FixtureDef();
		CircleShape shape = new CircleShape();
		shape.setRadius(14);

		fdef.shape = shape;
		b2body.createFixture(fdef);
		shape.dispose();
	}
	
	public void defineAgent(float posX, float posY) {
		BodyDef bdef = new BodyDef();
		bdef.position.set(-posX, posY);
		bdef.type = BodyDef.BodyType.DynamicBody;
		b2body = world.createBody(bdef);

		FixtureDef fdef = new FixtureDef();
		CircleShape shape = new CircleShape();
		shape.setRadius(14);

		fdef.shape = shape;
		b2body.createFixture(fdef);
		shape.dispose();
	}
	
	
	public void HandleInput() {

		if (Gdx.input.isKeyPressed(Input.Keys.W)) {
			if (this.b2body.getLinearVelocity().y <= 99)

				this.b2body.applyLinearImpulse(new Vector2(0, 3f), this.b2body.getWorldCenter(), true);

		} else if (Gdx.input.isKeyPressed(Input.Keys.S)) {
			if (this.b2body.getLinearVelocity().y >= -99)

				this.b2body.applyLinearImpulse(new Vector2(0, -3f), this.b2body.getWorldCenter(), true);
		}

		else if (Gdx.input.isKeyPressed(Input.Keys.A)) {
			if (this.b2body.getLinearVelocity().x >= -99)

				this.b2body.applyLinearImpulse(new Vector2(-3f, 0), this.b2body.getWorldCenter(), true);
		}

		else if (Gdx.input.isKeyPressed(Input.Keys.D)) {
			if (this.b2body.getLinearVelocity().x <= 99)

				this.b2body.applyLinearImpulse(new Vector2(3f, 0), this.b2body.getWorldCenter(), true);
		} else {
			this.b2body.setLinearVelocity(0f, 0f);
		}

	}


}
