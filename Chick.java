class Chick implements Animal
{     
    private String myType;
    private String mySound;
    public Chick(String type, String sound)
    {
    	myType = type;
    	mySound = sound;
    }
    public Chick(String type, String sound, String sound2)
    {
    	myType = type;
    	mySound = sound;
    	if (Math.random()>.5)
    	{
    		mySound = sound2;
    	}
    }
    public Chick()
    {
    	myType = "unknown";
    	mySound = "unknown";
    }
    public String getSound()
    {
    	return mySound;
    }
    public String getType()
    {
    	return myType;
    }
}
