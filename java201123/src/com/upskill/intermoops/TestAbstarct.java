package com.upskill.intermoops;

public class TestAbstarct {

//	we cannot instantiate the abtract class
//	CheckmethodAbstarct check = new CheckmethodAbstarct() {
//		
//		@Override
//		int add(int a, int b) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//	}; 
	
	
	
}

abstract class CheckmethodAbstarct{
	
	abstract int add(int a,int b);
}

class overrideAbstract extends CheckmethodAbstarct{
	
	// we need to implement all the abtract methods in checkmethodabstrct
	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

// WE cannot make abstract class as private
//private abstract class CheckPrivateAbstarct{
//	
//	abstract int add(int a,int b);
//}

////WE cannot make abstract class as final
//final abstract class CheckPrivateAbstarct{
//	
//	abstract int add(int a,int b);
//}
//

//WE can make class abstract without having abstract class
abstract class CheckWithoutAbstract{
	
	
	public int add(int a,int b) {
		return a+b;
	}
}




