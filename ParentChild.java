/**
 * 
 */

/**
 * @author DivyaVipin
 *
 */
class Parent{
	
private void method1(){
System.out.println ("Parent's method1()");
}
public void method2() {
System.out.println ("Parent's method2()");
method1();
}
}
class Child extends Parent {
public void method1() {
System.out.println ("Child's method1()");
}
}
 class ParentChild {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Child();
		p.method2();//Output Parentmethod2() and Parentsmethod1()
	}

}
 
 /*
  *Output:
  * Prints : Parent's method2()
	Parent's method1()
  */
