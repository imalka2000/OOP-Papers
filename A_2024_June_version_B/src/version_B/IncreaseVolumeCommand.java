package version_B;

public class IncreaseVolumeCommand implements Command 
{	
	SoundSystem soundSystem;
	
	public IncreaseVolumeCommand(SoundSystem soundSystem) 
	{
		super();
		this.soundSystem = soundSystem;
	}
	
	@Override
	public void execute() 
	{ 
		soundSystem.increaseVolume();
	}

}
