package johnnyhieu.com.models;

public class Category {
	String name;
    int code ;
    int subtype ;

    public void  setName(String thematic){
        this.name = thematic;
    }

    public String getName(){
        return name;
    }

    public void setCode(int thematicCode){
        this.code = thematicCode;
    }

    public int getCode(){
        return code;
    }

    public void setSubtype(int subtype){
        this.subtype = subtype;
    }
    
    public int getSubtype() {
		return subtype;
	}
}
