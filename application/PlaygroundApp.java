package movingtoylab1.application;

import movingtoylab1.*; // ** I  am importing all classes from movinglab1 package

/**
 * App where the toys play
 * @author Gracielena_home
 *
 */
public class PlaygroundApp {

	public PlaygroundApp() {
		// TODO Auto-generated constructor stub in the constructor of my toy I am creating all the objects
		// tha correspond with my classes creating the objects in my toy
	}

	public static void main(String[] args) {
        System.out.println("Hello Movingtoylab1 ");
        Buttonnumbers buttonnumbers= new Buttonnumbers("Numbers");
        Buttonletter buttonletter= new Buttonletter("Letters");
        Buttonmusic buttonmusic= new Buttonmusic("Music");
        Buttontriangle buttontriangle=new Buttontriangle("Triangle");
        Buttonheart buttonheart= new Buttonheart("Heart");
        Buttonstart buttonStart = new Buttonstart("Start");
        Switch aSwitch  = new Switch("Square");
        Wheels wheels=new Wheels(25, "Black", 15,56);
        SingSensor singSensor= new SingSensor("Silver", 22, 39);
        Lightsensor lightsensor=new Lightsensor("Fiber Glass", 15, 10);
        Movesensor2 movesensor2=new Movesensor2("Silver", 67, 3);
        
        Walkingtoy aToy = new Walkingtoy("Red", "Red Riding Hood","Square", buttonStart, aSwitch, buttonnumbers, buttonletter, buttonmusic, buttonheart,buttontriangle,wheels,singSensor,lightsensor,movesensor2);
        
        		
        System.out.println(aToy.showcolornamepartnumber());
        System.out.println("I'm showing my color name and part" + aToy.showcolornamepartnumber());
        System.out.println("My  wheels  are in good shape and good color Diameter " + aToy.wheels.diameter+"  Color:"+ aToy.wheels.treadcolor+"  Hardness  "+aToy.wheels.hardness+ "   Resistence  "+aToy.wheels.resistence);
        System.out.println("My  Sing Sensor has very good elements Material: " + aToy.singSensor.material+"  AmplifierCapacity: "+ aToy.singSensor.amplifiercapacity+"   Music Tape Quality: "+aToy.singSensor.musictape );
        System.out.println("My  Move Sensor has very good eelements Material : " + aToy.movesensor2.Material+"  Mobility Speed: "+ aToy.movesensor2.movilityspeed+"   Size: "+aToy.movesensor2.size );
        System.out.println("My  Light Sensor has very good eelements Material : " + aToy.lightsensor.material+"  Lummen:A Lumen is the SI (Système international d’unités) unit of luminous flux. This is measurement of the light energy that is emitted from the light source. This depends on the type of the light source "+ aToy.lightsensor.lummen+"   Lux  is The Lux is the unit of illuminance and it is an indication of how much light is incident on a surface : "+aToy.lightsensor.Lux );
        
        
        aToy.buttonStart.turnontoy();
        aToy.aSwitch.selectOperationMode(1);
        aToy.wheels.roll();
        aToy.aSwitch.selectOperationMode(2);
        aToy.aSwitch.selectOperationMode(0);
        aToy.buttonnumbers.disconnectlightsensor();
        aToy.buttonletter.disconnectmovingsensor();
        aToy.buttontriangle.disconnectsingsensor();
        aToy.buttonmusic.disconnecsingsensor();
        aToy.lightsensor.decreaselight();
        aToy.lightsensor.increaselight();
        aToy.singSensor.startsing();
        aToy.singSensor.stopsing();
        aToy.movesensor2.forward();
        aToy.movesensor2.backward();
        aToy.movesensor2.turnrigh();
        aToy.movesensor2.spin();
        aToy.movesensor2.turnrleft();
        aToy.buttonheart.disconnectswitch();
        aToy.buttonStart.turnofftoy();
        
        
        
        
        
        
        
        
        
        
	}

}
