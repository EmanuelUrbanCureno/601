package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	import flash.events.TimerEvent;
	import flash.utils.Timer;
	
	public class Antagonista extends MovieClip {
		private var vel: int=10;
		private var dir: Number=1;
		private var limite_der: int=520;
		private var limite_izq: int=32;
		private var cambiar: Timer=new Timer(200,0);
		private var tipo: Number;
		public function Antagonista() {
			addEventListener(Event.ENTER_FRAME, actualiza);
			cambiar.addEventListener(TimerEvent.TIMER, cambia_dir)
			cambiar.start();
		}
		public function cambia_dir(e:TimerEvent){
				tipo= Math.floor(Math.random() * 8);
				//trace(tipo);
				switch(tipo){
					case 1:
						dir=1;
						break;
					case 2:
						dir=-2;
						break;
					case 3:
						trace("test");  
						break;
					}
			}
		
		public function actualiza(e: Event){
			x+= vel * dir;
			if(x>= limite_der){
					dir= -1;
				}
			if(x<= limite_izq){
					dir= 1;
				}	
			
			}

	}
	
}
