class Chick implements Animal {     
	private String myType;
	private String mySound, mySound1, mySound2;
	public Chick(String type, String sound){
		myType = type;
		mySound = sound;
	}

	public Chick(String type, String sound1, String sound2){
		myType = type;
		mySound = "";
		mySound1 = sound1;
		mySound2 = sound2;
	}

	public Chick(){
		myType = "unknown";
		mySound = "unknown";
	}
	public String getSound() {
		if (Math.random() < 0.5) {
			mySound = mySound1;
		}
		else {
			mySound = mySound2;
		}
		return mySound;
	}
	public String getType() {
		return myType;
	}     
}
