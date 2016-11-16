package com.vish.tutoriel.accessSpecifiers;

public class SamePackageConsumer {

	public void xyz(){
		AccessSpecifiersMethods aSM = new AccessSpecifiersMethods();
		
		aSM.publicMethod();
		aSM.protectedMethod();
		aSM.defaultMethod();
		
	}
}
