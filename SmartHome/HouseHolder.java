package SmartHome;

/**
* SmartHome/HouseHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from House.idl
* 01 April 2017 12:31:01 o'clock IST
*/

public final class HouseHolder implements org.omg.CORBA.portable.Streamable
{
  public SmartHome.House value = null;

  public HouseHolder ()
  {
  }

  public HouseHolder (SmartHome.House initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SmartHome.HouseHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SmartHome.HouseHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SmartHome.HouseHelper.type ();
  }

}