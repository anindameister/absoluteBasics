package experimentingPolymorphism;

public class Main {

	public static void main(String[] args) {
		Dog kutta=new Dog();
		kutta.animalSound();
		Pig suorerBachha=new Pig();
		suorerBachha.animalSound();
		
		OuterClass oc=new OuterClass();
		OuterClass.InnerClass ic=oc.new InnerClass();
		
		System.out.println(oc.x+ic.y);
		
		/*
		 * An inner class can also be static, 
		 * which means that you can access it without creating an object of the outer class:
		 */
		
		StaticInnerClass.InnerClass sic=new StaticInnerClass.InnerClass();
		System.out.println(sic.y);
		
		
		/*
		 * exact repetition of what we did for Java Inner Classes
		 */
	
		
		InnerMethodOfInnerClass occ=new InnerMethodOfInnerClass();
		InnerMethodOfInnerClass.InnerClass icc=occ.new InnerClass();
		
		System.out.println(icc.myInnerMethod());
		
		
		

	}

}
