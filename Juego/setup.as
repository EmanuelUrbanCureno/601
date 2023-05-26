package  {
	
	import flash.display.MovieClip;
	
	
	public class setup extends MovieClip {
			private var fondo_new: fondo=new fondo();
			private var Piso_new: Piso=new Piso();
			private var Protagonista_new: Protagonista=new Protagonista();
			private var Antagonista_new: Antagonista=new Antagonista();
	public function setup() {
			// constructor code
		addChild(fondo_new);
		addChild(Piso_new);
		addChild(Antagonista_new);
		addChild(Protagonista_new);
		
		
		fondo_new.y=0;
		fondo_new.x=2;
		
		Piso_new.y= 345;
		Piso_new.x= 0;
		
		Antagonista_new.y= 50;
		Antagonista_new.x= 250;
		
		Protagonista_new.y= 325;
		Protagonista_new.x= 250;
		}
	}
	
}
