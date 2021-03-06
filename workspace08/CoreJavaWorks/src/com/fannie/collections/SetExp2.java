package com.fannie.collections;

import java.util.HashSet;

class Device{
	private int deviceId;
	private String deviceName;
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", deviceName=" + deviceName + "]";
	}
	public Device(int deviceId, String deviceName) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		return this.deviceName.charAt(0);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		Device temp = (Device) obj;
		return this.deviceId==temp.getDeviceId() && this.deviceName.equals(temp.getDeviceName());
	}
	
	
}

public class SetExp2 {
	public static void main(String[] args) {
		HashSet<Device> devices= new HashSet<Device>();
		
		devices.add(new Device(101, "laptop"));
		devices.add(new Device(3432, "computer"));
		devices.add(new Device(333, "computer"));
		devices.add(new Device(333, "laptop"));
		devices.add(new Device(333, "laptop"));
		devices.add(new Device(333, "laptop"));
		devices.add(new Device(333, "laptop"));
		devices.add(new Device(333, "laptop"));
		
		for (Device temp: devices){
			System.out.println(temp+", "+temp.hashCode());
		}
		
	}

}
