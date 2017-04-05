package SmartHome;


/**
* SmartHome/_HouseImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from House.idl
* 05 April 2017 10:43:33 o'clock IST
*/

public abstract class _HouseImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements SmartHome.House, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _HouseImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("lights", new java.lang.Integer (0));
    _methods.put ("alarm", new java.lang.Integer (1));
    _methods.put ("door", new java.lang.Integer (2));
    _methods.put ("heating", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // SmartHome/House/lights
       {
         String status = in.read_string ();
         String $result = null;
         $result = this.lights (status);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // SmartHome/House/alarm
       {
         String status = in.read_string ();
         String $result = null;
         $result = this.alarm (status);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // SmartHome/House/door
       {
         String status = in.read_string ();
         String $result = null;
         $result = this.door (status);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // SmartHome/House/heating
       {
         String status = in.read_string ();
         String $result = null;
         $result = this.heating (status);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:SmartHome/House:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _HouseImplBase
