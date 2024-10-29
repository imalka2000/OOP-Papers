package version_B;

public class MultimediaControlTest 
{

	public static void main(String[] args) 
	{
		Television tv=new Television();
		SoundSystem sd=new SoundSystem();
		
		
		Command tvOnCommand=new TvOnCommand(tv);
		Command tvOffCommand=new TvOffCommand(tv);			
		Command setChannelCommand=new SetChannelCommand(tv, 101);
		Command soundOnCOmmand=new SoundOnCommand(sd);
		Command increaseVolume=new IncreaseVolumeCommand(sd);
		
		
		RemoteControl remote=RemoteControl.getInstance();
		
		remote.setCommand(0, tvOnCommand);
		remote.setCommand(1, setChannelCommand);
		remote.setCommand(2, soundOnCOmmand);
		remote.setCommand(3, increaseVolume);
		
		
		remote.pressButton(0);
		remote.pressButton(1);
		remote.pressButton(2);
		remote.pressButton(3);

		
		
	}

}
