package org.phone;

public class Phone {

  private void phoneInfo(String model, int price) {
	System.out.println("Phone Information:"+'\t'+model +'\t'+ price + "INR");

}	

  private void phoneInfo(String Version, String RAM) {
   System.out.println("Phone Information:"+'\t'+ Version + '\t' + RAM + "TB" );

}
  private void phoneInfo(int number, String Features) {
   System.out.println("Phone Information:"+'\t' + number+ '\t' + Features);	
}
  
  private void phoneInfo( char upgraded, float discount) {
	System.out.println("Phone Information:" +'\t'+ upgraded +'\t'+discount);
	}
  public static void main(String[] args) {
	Phone p = new Phone();
	
	p.phoneInfo("Oneplus", 24999);
	p.phoneInfo("Snapdragon", "2");
	p.phoneInfo(962946821, "Octa-core");
	p.phoneInfo('Y', 25.0f);
}
  
}
