package sec01.exam03;

public interface RemoteControl {
	
	int MAX_VOLUM = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
