/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/Jason/Desktop/Settings/src/com/android/location/XT/IXTSrvCb.aidl
 */
package com.android.location.XT;
public interface IXTSrvCb extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.location.XT.IXTSrvCb
{
private static final java.lang.String DESCRIPTOR = "com.android.location.XT.IXTSrvCb";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.location.XT.IXTSrvCb interface,
 * generating a proxy if needed.
 */
public static com.android.location.XT.IXTSrvCb asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.location.XT.IXTSrvCb))) {
return ((com.android.location.XT.IXTSrvCb)iin);
}
return new com.android.location.XT.IXTSrvCb.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_statusChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.statusChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.location.XT.IXTSrvCb
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void statusChanged(boolean status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((status)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_statusChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_statusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void statusChanged(boolean status) throws android.os.RemoteException;
}
