package com.mygdx.gamestuff;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.ai.pfa.GraphPath;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.Spritess.testAGV;
import com.mygdx.Spritess.testAgent;
import com.mygdx.Spritess.testMainPlayer;
import com.mygdx.forAstar.City;
import com.mygdx.forAstar.CityGraph;

public class NodeInitial {
	GameScreen gameScreen;
	testAGV test;
	testAGV test2;
	testMainPlayer testMain;
	testAgent testA;
	testAgent testB;
	
	public  CityGraph cityGraph;
	public GraphPath<City> cityPath1;
	public GraphPath<City> cityPath2;
	public GraphPath<City> cityPath3;
//	public GraphPath<City> cityPath2;
//	public GraphPath<City> cityPath1;
//	public GraphPath<City> cityPath2;
//	
	
	public  ShapeRenderer shapeRenderer;
	public  BitmapFont font;
	public int currentRank = 0;
	private City startCity;
	private City goalCity;
	
	List<GraphPath<City>> cityPath = new ArrayList<GraphPath<City>>(6);
	
	public NodeInitial(GameScreen gameScreen) {
		this.gameScreen = gameScreen;
		 cityGraph = new CityGraph();
	}
	
	public float caly(int i)
	{
		i = 28 - i;
		float scale = 26;
		return i*scale - scale/2;
	}
	
	public float calx(int i)
	{

		float scale = 26;
		return i*scale + scale/2;
	}
	
	public void InitNode() {
		City n1City = new City(calx(1), caly(13), "N1");
		City n2City = new City(calx(1), caly(14), "N2");
		
		City n3City = new City(calx(4), caly(2), "N3");
		City n4City = new City(calx(4), caly(7), "N4");
		City n5City = new City(calx(4), caly(9), "N5");
		City n6City = new City(calx(4), caly(13), "N6");
		City n7City = new City(calx(4), caly(14), "N7");
		City n8City = new City(calx(4), caly(18), "N8");
		City n9City = new City(calx(4), caly(20), "N9");
		City n10City = new City(calx(4), caly(25), "N10");
		
		City n11City = new City(calx(6), caly(7), "N11");
		City n12City = new City(calx(6), caly(9), "N12");
		City n13City = new City(calx(6), caly(18), "N13");
		City n14City = new City(calx(6), caly(20), "N14");
		
		City n15City = new City(calx(8), caly(7), "N15");
		City n16City = new City(calx(8), caly(9), "N16");
		City n17City = new City(calx(8), caly(12), "N17");
		City n18City = new City(calx(8), caly(15), "N18");
		City n19City = new City(calx(8), caly(18), "N19");
		City n20City = new City(calx(8), caly(20), "N20");
		
		City n21City = new City(calx(10), caly(7), "N21");
		City n22City = new City(calx(10), caly(9), "N22");
		City n23City = new City(calx(10), caly(12), "N23");
		City n24City = new City(calx(10), caly(15), "N24");
		City n25City = new City(calx(10), caly(18), "N25");
		City n26City = new City(calx(10), caly(20), "N26");
		
		City n27City = new City(calx(12), caly(7), "N27");
		City n28City = new City(calx(12), caly(9), "N28");
		City n29City = new City(calx(12), caly(18), "N29");
		City n30City = new City(calx(12), caly(20), "N30");
		
		City n31City = new City(calx(15), caly(7), "N31");
		City n32City = new City(calx(15), caly(9), "N32");
		City n33City = new City(calx(15), caly(18), "N33");
		City n34City = new City(calx(15), caly(20), "N34");
		
		City n35City = new City(calx(17), caly(2), "N35");
		City n36City = new City(calx(17), caly(7), "N36");
		City n37City = new City(calx(17), caly(9), "N37");
		City n38City = new City(calx(17), caly(18), "N38");
		City n39City = new City(calx(17), caly(20), "N39");
		City n40City = new City(calx(17), caly(25), "N40");
		
		City n41City = new City(calx(19), caly(2), "N41");
		City n42City = new City(calx(19), caly(7), "N42");
		City n43City = new City(calx(19), caly(9), "N43");
		City n44City = new City(calx(19), caly(18), "N44");
		City n45City = new City(calx(19), caly(20), "N45");
		City n46City = new City(calx(19), caly(25), "N46");
		
		City n47City = new City(calx(21), caly(7), "N47");
		City n48City = new City(calx(21), caly(9), "N48");
		City n49City = new City(calx(21), caly(18), "N49");
		City n50City = new City(calx(21), caly(20), "N50");
		
		City n51City = new City(calx(23), caly(7), "N51");
		City n52City = new City(calx(23), caly(9), "N52");
		City n53City = new City(calx(23), caly(12), "N53");
		City n54City = new City(calx(23), caly(15), "N54");
		City n55City = new City(calx(23), caly(18), "N55");
		City n56City = new City(calx(23), caly(20), "N56");
		
		City n57City = new City(calx(25), caly(7), "N57");
		City n58City = new City(calx(25), caly(9), "N58");
		City n59City = new City(calx(25), caly(12), "N59");
		City n60City = new City(calx(25), caly(15), "N60");
		City n61City = new City(calx(25), caly(18), "N61");
		City n62City = new City(calx(25), caly(20), "N62");
		
		City n63City = new City(calx(27), caly(7), "N63");
		City n64City = new City(calx(27), caly(9), "N64");
		City n65City = new City(calx(27), caly(18), "N65");
		City n66City = new City(calx(27), caly(20), "N66");
		
		City n67City = new City(calx(30), caly(7), "N67");
		City n68City = new City(calx(30), caly(9), "N68");
		City n69City = new City(calx(30), caly(18), "N69");
		City n70City = new City(calx(30), caly(20), "N70");
		
		City n71City = new City(calx(32), caly(2), "N71");
		City n72City = new City(calx(32), caly(7), "N72");
		City n73City = new City(calx(32), caly(9), "N73");
		City n74City = new City(calx(32), caly(18), "N74");
		City n75City = new City(calx(32), caly(20), "N75");
		City n76City = new City(calx(32), caly(25), "N76");
		
		City n77City = new City(calx(34), caly(2), "N77");
		City n78City = new City(calx(34), caly(7), "N78");
		City n79City = new City(calx(34), caly(9), "N79");
		City n80City = new City(calx(34), caly(18), "N80");
		City n81City = new City(calx(34), caly(20), "N81");
		City n82City = new City(calx(34), caly(25), "N82");
		
		City n83City = new City(calx(36), caly(7), "N83");
		City n84City = new City(calx(36), caly(9), "N84");
		City n85City = new City(calx(36), caly(18), "N85");
		City n86City = new City(calx(36), caly(20), "N86");

		City n87City = new City(calx(38), caly(7), "N87");
		City n88City = new City(calx(38), caly(9), "N88");
		City n89City = new City(calx(38), caly(12), "N89");
		City n90City = new City(calx(38), caly(15), "N90");
		City n91City = new City(calx(38), caly(18), "N91");
		City n92City = new City(calx(38), caly(20), "N92");
		
		City n93City = new City(calx(40), caly(7), "N93");
		City n94City = new City(calx(40), caly(9), "N94");
		City n95City = new City(calx(40), caly(12), "N95");
		City n96City = new City(calx(40), caly(15), "N96");
		City n97City = new City(calx(40), caly(18), "N97");
		City n98City = new City(calx(40), caly(20), "N98");
		
		City n99City = new City(calx(42), caly(7), "N99");
		City n100City = new City(calx(42), caly(9), "N100");
		City n101City = new City(calx(42), caly(18), "N101");
		City n102City = new City(calx(42), caly(20), "N102");

		City n103City = new City(calx(45), caly(7), "N103");
		City n104City = new City(calx(45), caly(9), "N104");
		City n105City = new City(calx(45), caly(18), "N105");
		City n106City = new City(calx(45), caly(20), "N106");
		
		City n107City = new City(calx(47), caly(2), "N107");
		City n108City = new City(calx(47), caly(7), "N108");
		City n109City = new City(calx(47), caly(9), "N109");
		City n110City = new City(calx(47), caly(13), "N110");
		City n111City = new City(calx(47), caly(14), "N111");
		City n112City = new City(calx(47), caly(18), "N112");
		City n113City = new City(calx(47), caly(20), "N113");
		City n114City = new City(calx(47), caly(25), "N114");
		
		City n115City = new City(calx(50), caly(13), "N115");
		City n116City = new City(calx(50), caly(14), "N116");
		
		//make a list node
		cityGraph.addCity(n1City);
		cityGraph.addCity(n2City);
		cityGraph.addCity(n3City);
		cityGraph.addCity(n4City);
		cityGraph.addCity(n5City);
		cityGraph.addCity(n6City);
		cityGraph.addCity(n7City);
		cityGraph.addCity(n8City);
		cityGraph.addCity(n9City);
		
		cityGraph.addCity(n10City);
		cityGraph.addCity(n11City);
		cityGraph.addCity(n12City);
		cityGraph.addCity(n13City);
		cityGraph.addCity(n14City);
		cityGraph.addCity(n15City);
		cityGraph.addCity(n16City);
		cityGraph.addCity(n17City);
		cityGraph.addCity(n18City);
		cityGraph.addCity(n19City);
		
		cityGraph.addCity(n20City);
		cityGraph.addCity(n21City);
		cityGraph.addCity(n22City);
		cityGraph.addCity(n23City);
		cityGraph.addCity(n24City);
		cityGraph.addCity(n25City);
		cityGraph.addCity(n26City);
		cityGraph.addCity(n27City);
		cityGraph.addCity(n28City);
		cityGraph.addCity(n29City);
		
		cityGraph.addCity(n30City);
		cityGraph.addCity(n31City);
		cityGraph.addCity(n32City);
		cityGraph.addCity(n33City);
		cityGraph.addCity(n34City);
		cityGraph.addCity(n35City);
		cityGraph.addCity(n36City);
		cityGraph.addCity(n37City);
		cityGraph.addCity(n38City);
		cityGraph.addCity(n39City);
		
		cityGraph.addCity(n40City);
		cityGraph.addCity(n41City);
		cityGraph.addCity(n42City);
		cityGraph.addCity(n43City);
		cityGraph.addCity(n44City);
		cityGraph.addCity(n45City);
		cityGraph.addCity(n46City);
		cityGraph.addCity(n47City);
		cityGraph.addCity(n48City);
		cityGraph.addCity(n49City);
		
		cityGraph.addCity(n50City);
		cityGraph.addCity(n51City);
		cityGraph.addCity(n52City);
		cityGraph.addCity(n53City);
		cityGraph.addCity(n54City);
		cityGraph.addCity(n55City);
		cityGraph.addCity(n56City);
		cityGraph.addCity(n57City);
		cityGraph.addCity(n58City);
		cityGraph.addCity(n59City);
		
		cityGraph.addCity(n60City);
		cityGraph.addCity(n61City);
		cityGraph.addCity(n62City);
		cityGraph.addCity(n63City);
		cityGraph.addCity(n64City);
		cityGraph.addCity(n65City);
		cityGraph.addCity(n66City);
		cityGraph.addCity(n67City);
		cityGraph.addCity(n68City);
		cityGraph.addCity(n69City);
		
		cityGraph.addCity(n70City);
		cityGraph.addCity(n71City);
		cityGraph.addCity(n72City);
		cityGraph.addCity(n73City);
		cityGraph.addCity(n74City);
		cityGraph.addCity(n75City);
		cityGraph.addCity(n76City);
		cityGraph.addCity(n77City);
		cityGraph.addCity(n78City);
		cityGraph.addCity(n79City);
		
		cityGraph.addCity(n80City);
		cityGraph.addCity(n81City);
		cityGraph.addCity(n82City);
		cityGraph.addCity(n83City);
		cityGraph.addCity(n84City);
		cityGraph.addCity(n85City);
		cityGraph.addCity(n86City);
		cityGraph.addCity(n87City);
		cityGraph.addCity(n88City);
		cityGraph.addCity(n89City);
		
		cityGraph.addCity(n90City);
		cityGraph.addCity(n91City);
		cityGraph.addCity(n92City);
		cityGraph.addCity(n93City);
		cityGraph.addCity(n94City);
		cityGraph.addCity(n95City);
		cityGraph.addCity(n96City);
		cityGraph.addCity(n97City);
		cityGraph.addCity(n98City);
		cityGraph.addCity(n99City);
		
		cityGraph.addCity(n100City);
		cityGraph.addCity(n101City);
		cityGraph.addCity(n102City);
		cityGraph.addCity(n103City);
		cityGraph.addCity(n104City);
		cityGraph.addCity(n105City);
		cityGraph.addCity(n106City);
		cityGraph.addCity(n107City);
		cityGraph.addCity(n108City);
		cityGraph.addCity(n109City);
		
		cityGraph.addCity(n110City);
		cityGraph.addCity(n111City);
		cityGraph.addCity(n112City);
		cityGraph.addCity(n113City);
		cityGraph.addCity(n114City);
		cityGraph.addCity(n115City);
		cityGraph.addCity(n116City);
	
		//set all connect lines
		cityGraph.connectCities(n1City, n6City);
		cityGraph.connectCities(n2City, n7City);
		cityGraph.connectCities(n3City, n35City);
		cityGraph.connectCities(n4City, n3City);
		cityGraph.connectCities(n4City, n11City);
		cityGraph.connectCities(n5City, n4City);
		cityGraph.connectCities(n6City, n5City);
		cityGraph.connectCities(n7City, n8City);
		cityGraph.connectCities(n8City, n9City);
		cityGraph.connectCities(n8City, n13City);
		cityGraph.connectCities(n9City, n10City);
		cityGraph.connectCities(n10City, n40City);
		cityGraph.connectCities(n11City, n12City);
		cityGraph.connectCities(n11City, n15City);
		cityGraph.connectCities(n12City, n5City);
		cityGraph.connectCities(n13City, n19City);
		cityGraph.connectCities(n14City, n9City);
		cityGraph.connectCities(n14City, n13City);
		cityGraph.connectCities(n15City, n21City);
		cityGraph.connectCities(n16City, n12City);
		cityGraph.connectCities(n16City, n15City);
		cityGraph.connectCities(n16City, n17City);
		cityGraph.connectCities(n17City, n23City);
		cityGraph.connectCities(n18City, n17City);
		cityGraph.connectCities(n18City, n19City);
		cityGraph.connectCities(n19City, n20City);
		cityGraph.connectCities(n19City, n25City);
		cityGraph.connectCities(n20City, n14City);
		cityGraph.connectCities(n21City, n22City);
		cityGraph.connectCities(n21City, n27City);
		cityGraph.connectCities(n22City, n16City);
		cityGraph.connectCities(n23City, n22City);
		cityGraph.connectCities(n23City, n24City);
		cityGraph.connectCities(n24City, n18City);
		cityGraph.connectCities(n25City, n24City);
		cityGraph.connectCities(n25City, n29City);
		cityGraph.connectCities(n26City, n20City);
		cityGraph.connectCities(n26City, n25City);
		cityGraph.connectCities(n27City, n31City);
		cityGraph.connectCities(n28City, n22City);
		cityGraph.connectCities(n28City, n27City);
		cityGraph.connectCities(n29City, n30City);
		cityGraph.connectCities(n29City, n33City);
		cityGraph.connectCities(n30City, n26City);
		cityGraph.connectCities(n31City, n32City);
		cityGraph.connectCities(n31City, n36City);
		cityGraph.connectCities(n32City, n28City);
		cityGraph.connectCities(n33City, n38City);
		cityGraph.connectCities(n34City, n30City);
		cityGraph.connectCities(n34City, n33City);
		cityGraph.connectCities(n35City, n36City);
		cityGraph.connectCities(n35City, n41City);
		cityGraph.connectCities(n36City, n42City);
		cityGraph.connectCities(n37City, n32City);
		cityGraph.connectCities(n37City, n36City);
		cityGraph.connectCities(n38City, n39City);
		cityGraph.connectCities(n38City, n44City);
		cityGraph.connectCities(n39City, n34City);
		cityGraph.connectCities(n40City, n39City);
		cityGraph.connectCities(n40City, n46City);
		cityGraph.connectCities(n41City, n71City);
		cityGraph.connectCities(n42City, n41City);
		cityGraph.connectCities(n42City, n43City);
		cityGraph.connectCities(n43City, n37City);
		cityGraph.connectCities(n43City, n48City);
		cityGraph.connectCities(n44City, n45City);
		cityGraph.connectCities(n45City, n39City);
		cityGraph.connectCities(n45City, n46City);
		cityGraph.connectCities(n45City, n50City);
		cityGraph.connectCities(n46City, n76City);
		cityGraph.connectCities(n47City, n42City);
		cityGraph.connectCities(n48City, n47City);
		cityGraph.connectCities(n48City, n52City);
		cityGraph.connectCities(n49City, n44City);
		cityGraph.connectCities(n49City, n50City);
		cityGraph.connectCities(n50City, n56City);
		cityGraph.connectCities(n51City, n47City);
		cityGraph.connectCities(n51City, n52City);
		cityGraph.connectCities(n52City, n58City);
		cityGraph.connectCities(n53City, n52City);
		cityGraph.connectCities(n53City, n54City);
		cityGraph.connectCities(n54City, n60City);
		cityGraph.connectCities(n55City, n49City);
		cityGraph.connectCities(n55City, n54City);
		cityGraph.connectCities(n56City, n55City);
		cityGraph.connectCities(n56City, n62City);
		cityGraph.connectCities(n57City, n51City);
		cityGraph.connectCities(n58City, n57City);
		cityGraph.connectCities(n58City, n59City);
		cityGraph.connectCities(n58City, n64City);
		cityGraph.connectCities(n59City, n53City);
		cityGraph.connectCities(n60City, n59City);
		cityGraph.connectCities(n60City, n61City);
		cityGraph.connectCities(n61City, n55City);
		cityGraph.connectCities(n61City, n62City);
		cityGraph.connectCities(n62City, n66City);
		cityGraph.connectCities(n63City, n57City);
		cityGraph.connectCities(n63City, n64City);
		cityGraph.connectCities(n64City, n68City);
		cityGraph.connectCities(n65City, n61City);
		cityGraph.connectCities(n66City, n65City);
		cityGraph.connectCities(n66City, n70City);
		cityGraph.connectCities(n67City, n63City);
		cityGraph.connectCities(n68City, n67City);
		cityGraph.connectCities(n68City, n73City);
		cityGraph.connectCities(n69City, n65City);
		cityGraph.connectCities(n69City, n70City);
		cityGraph.connectCities(n70City, n75City);
		cityGraph.connectCities(n71City, n77City);
		cityGraph.connectCities(n72City, n67City);
		cityGraph.connectCities(n72City, n71City);
		cityGraph.connectCities(n72City, n73City);
		cityGraph.connectCities(n73City, n79City);
		cityGraph.connectCities(n74City, n69City);
		cityGraph.connectCities(n75City, n74City);
		cityGraph.connectCities(n75City, n76City);
		cityGraph.connectCities(n75City, n81City);
		cityGraph.connectCities(n76City, n82City);
		cityGraph.connectCities(n77City, n78City);
		cityGraph.connectCities(n77City, n107City);
		cityGraph.connectCities(n78City, n72City);
		cityGraph.connectCities(n78City, n83City);
		cityGraph.connectCities(n79City, n78City);
		cityGraph.connectCities(n80City, n74City);
		cityGraph.connectCities(n80City, n85City);
		cityGraph.connectCities(n81City, n80City);
		cityGraph.connectCities(n82City, n81City);
		cityGraph.connectCities(n82City, n114City);
		cityGraph.connectCities(n83City, n84City);
		cityGraph.connectCities(n83City, n87City);
		cityGraph.connectCities(n84City, n79City);
		cityGraph.connectCities(n85City, n91City);
		cityGraph.connectCities(n86City, n81City);
		cityGraph.connectCities(n86City, n85City);
		cityGraph.connectCities(n87City, n93City);
		cityGraph.connectCities(n88City, n84City);
		cityGraph.connectCities(n88City, n87City);
		cityGraph.connectCities(n89City, n88City);
		cityGraph.connectCities(n89City, n90City);
		cityGraph.connectCities(n90City, n96City);
		cityGraph.connectCities(n91City, n90City);
		cityGraph.connectCities(n91City, n92City);
		cityGraph.connectCities(n91City, n97City);
		cityGraph.connectCities(n92City, n86City);
		cityGraph.connectCities(n93City, n94City);
		cityGraph.connectCities(n93City, n99City);
		cityGraph.connectCities(n94City, n88City);
		cityGraph.connectCities(n94City, n95City);
		cityGraph.connectCities(n95City, n89City);
		cityGraph.connectCities(n96City, n95City);
		cityGraph.connectCities(n96City, n97City);
		cityGraph.connectCities(n97City, n101City);
		cityGraph.connectCities(n98City, n92City);
		cityGraph.connectCities(n98City, n97City);
		cityGraph.connectCities(n99City, n103City);
		cityGraph.connectCities(n100City, n94City);
		cityGraph.connectCities(n100City, n99City);
		cityGraph.connectCities(n101City, n102City);
		cityGraph.connectCities(n101City, n105City);
		cityGraph.connectCities(n102City, n98City);
		cityGraph.connectCities(n103City, n104City);
		cityGraph.connectCities(n103City, n108City);
		cityGraph.connectCities(n104City, n100City);
		cityGraph.connectCities(n105City, n112City);
		cityGraph.connectCities(n106City, n102City);
		cityGraph.connectCities(n106City, n105City);
		cityGraph.connectCities(n107City, n108City);
		cityGraph.connectCities(n108City, n109City);
		cityGraph.connectCities(n109City, n104City);
		cityGraph.connectCities(n109City, n110City);
		cityGraph.connectCities(n110City, n115City);
		cityGraph.connectCities(n111City, n116City);
		cityGraph.connectCities(n112City, n111City);
		cityGraph.connectCities(n113City, n106City);
		cityGraph.connectCities(n113City, n112City);
		cityGraph.connectCities(n114City, n113City);
		cityGraph.connectCities(n115City, n116City);
		cityGraph.connectCities(n116City, n115City);

		
		
//		startCity = cityGraph.cities.get((int)Math.random()*2);
//        goalCity = cityGraph.cities.get(74);
//        cityPath1 = cityGraph.findPath(startCity, goalCity);
//		gameScreen.test.add(new testAGV(gameScreen.world, cityGraph, startCity,gameScreen.testMain));
//		gameScreen.test.get(0).setGoal(goalCity);
		//cityPath.clear();
		
//		startCity = n1City;
//		goalCity = n16City;
//		cityPath2 = cityGraph.findPath(startCity, goalCity);
//        gameScreen.test.add(new testAGV(gameScreen.world, cityGraph, startCity,gameScreen.testMain));
//		gameScreen.test.get(1).setGoal(goalCity);
//		
//		startCity = cityGraph.cities.get((int)Math.random()*2);;
//		goalCity = n58City;
//		cityPath3 = cityGraph.findPath(startCity, goalCity);
//        gameScreen.test.add(new testAGV(gameScreen.world, cityGraph, startCity,gameScreen.testMain));
//		gameScreen.test.get(2).setGoal(goalCity);
		
	//	setpath();
		startCity = cityGraph.cities.get((int)Math.random()*2);
		goalCity = cityGraph.cities.get(22);
		cityPath.add((cityGraph.findPath(startCity, goalCity)));
		gameScreen.test.add(new testAGV(gameScreen.world, cityGraph, startCity,gameScreen.testMain,gameScreen));
		gameScreen.test.get(0).setGoal(goalCity);
		
		startCity = cityGraph.cities.get((int)Math.random()*2);
		goalCity = cityGraph.cities.get(24);
		cityPath.add((cityGraph.findPath(startCity, goalCity)));
		gameScreen.test.add(new testAGV(gameScreen.world, cityGraph, startCity,gameScreen.testMain,gameScreen));
		gameScreen.test.get(1).setGoal(goalCity);
		
		startCity = cityGraph.cities.get((int)Math.random()*2);
		goalCity = cityGraph.cities.get(30);
		cityPath.add((cityGraph.findPath(startCity, goalCity)));
		gameScreen.test.add(new testAGV(gameScreen.world, cityGraph, startCity,gameScreen.testMain,gameScreen));
		gameScreen.test.get(2).setGoal(goalCity);

		startCity = cityGraph.cities.get((int)Math.random()*2);
		goalCity = cityGraph.cities.get(35);
		cityPath.add((cityGraph.findPath(startCity, goalCity)));
		gameScreen.test.add(new testAGV(gameScreen.world, cityGraph, startCity,gameScreen.testMain,gameScreen));
		gameScreen.test.get(3).setGoal(goalCity);

		startCity = cityGraph.cities.get((int)Math.random()*2);
		goalCity = cityGraph.cities.get(21);
		cityPath.add((cityGraph.findPath(startCity, goalCity)));
		gameScreen.test.add(new testAGV(gameScreen.world, cityGraph, startCity,gameScreen.testMain,gameScreen));
		gameScreen.test.get(4).setGoal(goalCity);

		startCity = cityGraph.cities.get((int)Math.random()*2);
		goalCity = cityGraph.cities.get(67);
		cityPath.add((cityGraph.findPath(startCity, goalCity)));
		gameScreen.test.add(new testAGV(gameScreen.world, cityGraph, startCity,gameScreen.testMain,gameScreen));
		gameScreen.test.get(5).setGoal(goalCity);

	}
	
//    private void setpath()
//    {
//    	for(int i = 0; i < cityPath.size(); i++)
//    	{
//    		startCity = cityGraph.cities.get((int)Math.random()*2);
//    		goalCity = cityGraph.cities.get((int)Math.random()*116);
//    		cityPath.add((cityGraph.findPath(startCity, goalCity)));
//    		gameScreen.test.add(new testAGV(gameScreen.world, cityGraph, startCity,gameScreen.testMain));
//    		gameScreen.test.get(i).setGoal(goalCity);
//    	}
//    }
	

}
