package johnnyhieu.com.models;


public class AddExercise2NewPinReqMsg extends BaseServiceReqMsg {
	String pinName = "";
	int exerciseId ;
	
	public void setPinName(String pinName) {
		this.pinName = pinName;
	}
	
	public String getPinName() {
		return pinName;
	}
	
	public void setExerciseId(int exerciseId) {
		this.exerciseId = exerciseId;
	}
	
	public int getExerciseId() {
		return exerciseId;
	}

	public void getExerciseByName(String name) {
		
	}
}
