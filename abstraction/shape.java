package java_abstract;

public abstract class shape {
	public abstract void draw();
}
class line extends shape{

	@Override
	public void draw() {
		System.out.println("\ndrawing line :");	
	}
}
class rectangle extends shape{

	@Override
	public void draw() {
		System.out.println("\n drawing rectangle....");
		
	}
	
}
class circle extends shape{

	@Override
	public void draw() {
		System.out.println("\nDrawing circle.....");
		
	}
}