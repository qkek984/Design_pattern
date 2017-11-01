package hansung.designpatterns.templatemethod.barista;


public abstract class CaffeineBeverageWithHook {
 
	final void prepareRecipe() {
		if(dutch()){
			dutchWater();//터치 커피일때
		}else{
			boilWater();//더치커피 이외에 사용
		}
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
 
	abstract void brew();
 
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("Boiling water");
	}
	void dutchWater(){
		System.out.println("Extract coffee using cold water for a long time");
	}//더치커피 추출

	void pourInCup() {
		System.out.println("Pouring into cup");
	}
 
	boolean customerWantsCondiments() {
		return true;
	}

	boolean dutch(){return false;}//더치커피여부 확인
}
