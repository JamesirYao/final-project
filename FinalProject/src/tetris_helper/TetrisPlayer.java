//                         Tetris Game By 
//                    Jamesir Yao and Jerry Shin
//                            _ooOoo_  
//                           o8888888o  
//                           88" . "88  
//                           (| -_- |)  
//                            O\ = /O  
//                        ____/`---'\____  
//                      .   ' \\| |// `.  
//                       / \\||| : |||// \  
//                     / _||||| -:- |||||- \  
//                       | | \\\ - /// | |  
//                     | \_| ''\---/'' | |  
//                      \ .-\__ `-` ___/-. /  
//                   ___`. .' /--.--\ `. . __  
//                ."" '< `.___\_<|>_/___.' >'"".  
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |  
//                 \ \ `-. \_ __\ /__ _/ .-` / /  
//         ======`-.____`-.___\_____/___.-`____.-'======  
//                            `=---='  
//                         佛祖保佑 永无BUG             
//         .............................................  
package tetris_helper;

import java.applet.AudioClip;

import javax.swing.JApplet;



public class TetrisPlayer extends JApplet
{
	static private final String BACKGROUNDMUSIC = "welcome.wav";
	static private final String SOUNDEFFECT = "se.mp3";
	private AudioClip sound1,currentSound;  
	public TetrisPlayer()	
	{
		currentSound = getAudioClip(null," hi.au" );
		
		 
	}
	
	public void playBackgroundMusic()
	{
		
		currentSound.play();// ...
		currentSound.loop();
	}
	
	public void stopBackgroundMusic()
	{
	      currentSound.stop(); // ...
	}
	
	public void playSoundEffect() 
	{
		// ...
	}
}
