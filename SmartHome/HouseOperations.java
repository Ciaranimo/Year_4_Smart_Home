package SmartHome;


/**
* SmartHome/HouseOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from House.idl
* 05 April 2017 10:43:33 o'clock IST
*/

public interface HouseOperations 
{
  String lights (String status);
  String alarm (String status);
  String door (String status);
  String heating (String status);
} // interface HouseOperations
