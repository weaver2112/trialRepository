package com.lux.services.itemcatalog;

public class overRideEntry {
	//testIndex, testValue, targetIndex, targetValue
	int testIndex = -1;
	int targetIndex = -1;
	String testValue = "empty";
	String targetValue = "empty";
	
	overRideEntry(){
		testIndex = -1;
		targetIndex = -1;
		testValue = "empty";
		targetValue = "empty";
	}
	overRideEntry(String csvLine)
	{
			String[] tokens = csvLine.split(",");       // Single blank is the separator.
			
			setOverRideInstance(Integer.parseInt(tokens[0]),tokens[1],Integer.parseInt(tokens[2]),tokens[3]);
	}
	
	public void setTestIndex(int incomingTestIndex)
	{
		this.testIndex=incomingTestIndex;
	}
	
	public void setTargetIndex(int incomingTargetIndex)
	{
		this.targetIndex= incomingTargetIndex;
	}

	public void setTestValue(String incomingTestValue)
	{
		this.testValue= incomingTestValue;
	}
	public void setTargetValue(String incomingTargetValue)
	{
		this.targetValue= incomingTargetValue;
	}

	public void setOverRideInstance(int incomingTestIndex, String incomingTestValue ,int incomingTargetIndex, String incomingTargetValue)
	{
		this.testIndex=incomingTestIndex;
		this.targetIndex= incomingTargetIndex;
		this.testValue= incomingTestValue;
		this.targetValue= incomingTargetValue;
	}

	public int getTestIndex()
	{
		return this.testIndex;
	}
	
	public int getTargetIndex()
	{
		return this.targetIndex;
	}

	public String getTestValue()
	{
		return this.testValue;
	}
	public String getTargetValue()
	{
		return this.targetValue;
	}
	
	
	public String getOverRideInstance()
	{
		String allValues="";
		allValues= this.testIndex + "," + this.targetIndex + "," + this.testValue + "," + this.targetValue;
		return allValues;
	}

	
}
