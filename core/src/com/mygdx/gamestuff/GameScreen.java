package com.mygdx.gamestuff;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ai.pfa.GraphPath;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.Spritess.PlayerMP;
import com.mygdx.Spritess.testAGV;
import com.mygdx.Spritess.testAgent;
import com.mygdx.Spritess.testMainPlayer;
import com.mygdx.forAstar.City;
import com.mygdx.forAstar.CityGraph;
import com.mygdx.forAstar.Street;
import com.mygdx.game.MyGdxGame;
import com.mygdx.tools.B2WorldCreator;

import NetworkPack.Packet00Login;
import Networking.GameClient;
import Networking.GameServer;



public class GameScreen implements Screen {
    //basic element
	MyGdxGame mygame;
	private TextureAtlas atlas;
	OrthographicCamera camera;
	SpriteBatch batch;
	TileMap tileMap;
	//agents and player
//	testAGV test;
//	testAGV test2;
	List<testAGV> test = new ArrayList<testAGV>(6);
	List<GraphPath<City>> cityPath = new ArrayList<GraphPath<City>>(6);
	//GraphPath<City> cityPath;
	List<testAgent> testAgent = new ArrayList<testAgent>(18);
	testMainPlayer testMain;
//	testAgent testA;
//	testAgent testB;
	public PlayerMP mpPlayer = null;
    //physics world
	public World world;
	private Box2DDebugRenderer b2dr;
    //graph
	public  CityGraph cityGraph;
	public City des;
	public int desclone = 40;
//	public GraphPath<City> cityPath;
	public GraphPath<City> cityPath2;
	public  ShapeRenderer shapeRenderer;
	public  ShapeRenderer shapeRendererclone;
	
	public  BitmapFont font;
	public int currentRank = 0;
	private NodeInitial node;
	//networking
//	public GameClient client;
//	public GameServer server;
//	Packet00Login loginPacket;
//	public boolean canMove = false;

	public GameScreen(MyGdxGame mygame) {
		atlas = new TextureAtlas("hentaiz.pack");
		this.mygame = mygame;
		this.camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		camera.setToOrtho(false, 1670, 900);//TRUE = VE CHUAN, FALSE = VE NGUOC
		
		batch = new SpriteBatch();
		tileMap = new TileMap();
		tileMap.init();
		
		world = new World(new Vector2(0, 0), true);
		b2dr = new Box2DDebugRenderer(
				/*drawBodies*/         false,
                /*drawJoints*/         false,
                /*drawAABBs*/          false,
                /*drawInactiveBodies*/ false,
                /*drawVelocities*/     false,
                /*drawContacts*/       true) ;
		
        new B2WorldCreator(world, tileMap);
       //lrAgent
        testMain = new testMainPlayer(world,this);
		testAgent.add(new testAgent(world,-900, 476*32/26+6,this));
		testAgent.add(new testAgent(world,-300, 476*32/26+6,this));
		testAgent.add(new testAgent(world,-400, 2*32 + 16,this));
		testAgent.add(new testAgent(world,-700, 9*32 + 16,this));
		testAgent.add(new testAgent(world,-2500, 7*32 + 16,this));
		testAgent.add(new testAgent(world,-370, 20*32 + 16,this));
		testAgent.add(new testAgent(world,-750, 25*32 + 16,this));
		testAgent.add(new testAgent(world,-400, 2*32 + 16,this));
		testAgent.add(new testAgent(world,-300, 9*32 + 16,this));
		testAgent.add(new testAgent(world,-660, 7*32 + 16,this));
		testAgent.add(new testAgent(world,-200, 20*32 + 16,this));
		testAgent.add(new testAgent(world,-350, 25*32 + 16,this));

		//UD Agent
		testAgent.add(new testAgent(world,-8*32 - 16, 450,this));
		testAgent.add(new testAgent(world,-10*32 - 16, 460,this));
		testAgent.add(new testAgent(world,-23*32 - 16, 470,this));
		testAgent.add(new testAgent(world,-25*32 - 16, 430,this));
		testAgent.add(new testAgent(world,-38*32 - 16, 420,this));
		testAgent.add(new testAgent(world,-40*32 - 16, 400,this));
		
//        testA = new testAgent(world);
		
	    node = new NodeInitial(this);
        node.InitNode();
        this.cityGraph = node.cityGraph;
        this.cityPath = node.cityPath;
        des = cityGraph.cities.get(desclone);
        
		shapeRenderer = new ShapeRenderer();
	    batch = new SpriteBatch();
	    font = new BitmapFont();
       //init those node on the map, then make reference from cityGraph to them;
//	    node = new NodeInitial(this);
//        node.InitNode();
//        this.cityGraph = node.cityGraph;
//        this.cityPath = node.cityPath;
//		createNode();
//		if(JOptionPane.showConfirmDialog(null, "Do U wana initialize the server ?") == 0) {
//		server = new GameServer(this);
//		server.start();
//		canMove = true;
//		}
//		client = new GameClient(this, "localhost");
//		client.start();
//		loginPacket = new Packet00Login(JOptionPane.showInputDialog(this,"anh thien dep trai vai dai"));
//		loginPacket.writeData(client);
	}
	public TextureAtlas getAtlas()
	{
		return this.atlas;
	}
	@Override
	public void render(float delta) {
		
		world.step(1 / 60f, 6, 2);
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		
		camera.update();
		tileMap.renderer.setView(camera);
		tileMap.renderer.render(); 
		b2dr.render(world, camera.combined);
      // if(canMove == true) 
      // mpPlayer.HandleInput();
		des.render(shapeRenderer, batch, font, true);
		//draw cities or not
//		for (Street street : cityGraph.streets) {
//			street.render(shapeRenderer);
//		}
//		
//		for (City city : cityGraph.cities) {
//			city.render(shapeRenderer, batch, font, false);// Draw all cities blue
//		}
//
//		for (City city : cityPath) {
//			city.render(shapeRenderer, batch, font, true);// Draw cities in path green
//		}
		
       testMain.HandleInput();
       testMain.update(delta);
       
       for(int i = 0; i< this.cityPath.size(); i++)
       {
          test.get(i).update(delta);
       }
       
       for(int i = 0; i< this.testAgent.size(); i++)
       {
          testAgent.get(i).update(delta);
       }
       
		// Rendering code
       for(int i = 0; i < test.size(); i++) {
			cityPath.get(i).get(cityPath.get(i).getCount()-1).render(shapeRenderer, batch, font, false);
			if(i == 0) {
				
				test.get(i).move();
			}
			else {
				if(test.get(i-1).reachend == true)
				{
					//testAGV.counter++;
					test.get(i).move();
				}
			}
			
		}
               for(int i=0; i<=11; i++)
        {
        	testAgent.get(i).setDisturbTypeLR();
        }
        
        for(int i=12; i<18; i++)
        {
        	testAgent.get(i).setDisturbTypeUD();
        }
		
    //  font.draw(batch,  ""+ testAGV.counter + " AGV has came to destination", 1050, 690);
    //  font.draw(batch,  " you have to reach to node No "+(desclone+1), 50, 690);
       // batch.setProjectionMatrix(camera.combined);
        batch.begin();
        font.draw(batch,  ""+ testAGV.counter + " AGV has came to destination", 1050, 690);
        font.draw(batch,  " you have to reach to node No "+(desclone+1), 50, 690);
        testMain.draw(batch);
        
        for(int i = 0; i< this.cityPath.size(); i++)
        {
        	test.get(i).draw(batch);
        }
        
        for(int i = 0; i< this.testAgent.size(); i++)
        {
           testAgent.get(i).draw(batch);
        }
        
        
		batch.end();
		

		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

		tileMap.map.dispose();
		world.dispose();
		b2dr.dispose();
	}

	


}