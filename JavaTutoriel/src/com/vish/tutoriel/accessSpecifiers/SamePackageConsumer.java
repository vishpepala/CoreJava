package com.vish.tutoriel.accessSpecifiers;

public class SamePackageConsumer {

	public void xyz(){
		AccessSpecifiersMethods aSM = new AccessSpecifiersMethods();
		
		aSM.protectedMethod();
		aSM.publicMethod();
		aSM.defaultMethod();
		
	}
}
