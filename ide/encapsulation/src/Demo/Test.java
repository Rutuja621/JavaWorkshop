package Demo;

public class Test {
	//encapsulation is wrapping up a data into single unit
	//it is an combination of data(properties) and function(methods)
	//it impliments data hiding
	Customer n1=new Customer();
	Customer n2=new Customer();
	Customer n3=new Customer();
	Customer n4=new Customer();
	Customer n5=new Customer();
	
	//setter
	public void setData() {
		
		n1.ID="MH1234";
		n1.Cust_Name="Frances";
		n1.Sentiment="Neutral";
		n1.CSAT_score=8;
		n1.callTimestamp=01-01-2024;
		n1.Reason="Billing Question";
		n1.city="Charlestone";
		n1.State="West";
		n1.Channel="chatbot";
		n1.ResponseTime="within SLA";
		n1.CallDuration=14;
		n1.callCenter="Chicago/IL";
		
		
		
		
		
		
		n3.ID="MH1236";
		n3.Cust_Name="Washington";
		n3.Sentiment="Negative";
		n3.CSAT_score=3;
		n3.callTimestamp=01-02-2024;
		n3.Reason="Billing Question";
		n3.city="Dallas";
		n3.State="Texas";
		n3.Channel="Chatbot";
		n3.ResponseTime="within SLA";
		n3.CallDuration=6;
		n3.callCenter="Denver/CA";
		
		
		n4.ID="MH1237";
		n4.Cust_Name="Rafe";
		n4.Sentiment="very Negative";
		n4.CSAT_score=4;
		n4.callTimestamp=01-01-2024;
		n4.Reason="Billing Question";
		n4.city="Fort";
		n4.State="Florida";
		n4.Channel="Email";
		n4.ResponseTime="below SLA";
		n4.CallDuration=26;
		n4.callCenter="Los Angeles/CA";
		
		n5.ID="MH1238";
		n5.Cust_Name="Tris";
		n5.Sentiment="Positive";
		n5.CSAT_score=8;
		n5.callTimestamp=01-02-2024;
		n5.Reason="Billing Question";
		n5.city="Tuscaloosa";
		n5.State="Alabama";
		n5.Channel="web";
		n5.ResponseTime="within SLA";
		n5.CallDuration=26;
		n5.callCenter="Los Angeles/CA";
		
		System.out.println("Data Inserted...");
	}
	//getter
	public  void getData() {
		
		System.out.println("Customer ID:"+n1.ID);
		System.out.println("Cust_Name:"+n1.Cust_Name);
		System.out.println("Sentiment:"+n1.Sentiment);
		System.out.println("CSAT_score:"+n1.CSAT_score);
		System.out.println("callTimestamp: "+n1.callTimestamp);
		System.out.println("Reason:"+n1.Reason);
		System.out.println("city:"+n1.city);
		System.out.println("State:"+n1.State);
		System.out.println("Channel:"+n1.Channel);
		System.out.println("ResponseTime:"+n1.ResponseTime);
		System.out.println("CallDuration:"+n1.CallDuration);
		System.out.println("callCenter"+n1.callCenter);
		
		
		
		System.out.println("Customer ID:"+n2.ID);
		System.out.println("Cust_Name:"+n2.Cust_Name);
		System.out.println("Sentiment:"+n2.Sentiment);
		System.out.println("CSAT_score:"+n2.CSAT_score);
		System.out.println("callTimestamp: "+n2.callTimestamp);
		System.out.println("Reason:"+n2.Reason);
		System.out.println("city:"+n2.city);
		System.out.println("State:"+n2.State);
		System.out.println("Channel:"+n2.Channel);
		System.out.println("ResponseTime:"+n2.ResponseTime);
		System.out.println("CallDuration:"+n2.CallDuration);
		System.out.println("callCenter"+n2.callCenter);
		
		
		
		System.out.println("Customer ID:"+n3.ID);
		System.out.println("Cust_Name:"+n3.Cust_Name);
		System.out.println("Sentiment:"+n3.Sentiment);
		System.out.println("CSAT_score:"+n3.CSAT_score);
		System.out.println("callTimestamp: "+n3.callTimestamp);
		System.out.println("Reason:"+n3.Reason);
		System.out.println("city:"+n3.city);
		System.out.println("State:"+n3.State);
		System.out.println("Channel:"+n3.Channel);
		System.out.println("ResponseTime:"+n3.ResponseTime);
		System.out.println("CallDuration:"+n3.CallDuration);
		System.out.println("callCenter"+n3.callCenter);
		
		
		System.out.println("Customer ID:"+n4.ID);
		System.out.println("Cust_Name:"+n4.Cust_Name);
		System.out.println("Sentiment:"+n4.Sentiment);
		System.out.println("CSAT_score:"+n4.CSAT_score);
		System.out.println("callTimestamp: "+n4.callTimestamp);
		System.out.println("Reason:"+n4.Reason);
		System.out.println("city:"+n4.city);
		System.out.println("State:"+n4.State);
		System.out.println("Channel:"+n4.Channel);
		System.out.println("ResponseTime:"+n4.ResponseTime);
		System.out.println("CallDuration:"+n4.CallDuration);
		System.out.println("callCenter"+n4.callCenter);
		
		
		System.out.println("Customer ID:"+n5.ID);
		System.out.println("Cust_Name:"+n5.Cust_Name);
		System.out.println("Sentiment:"+n5.Sentiment);
		System.out.println("CSAT_score:"+n5.CSAT_score);
		System.out.println("callTimestamp: "+n5.callTimestamp);
		System.out.println("Reason:"+n5.Reason);
		System.out.println("city:"+n5.city);
		System.out.println("State:"+n5.State);
		System.out.println("Channel:"+n5.Channel);
		System.out.println("ResponseTime:"+n5.ResponseTime);
		System.out.println("CallDuration:"+n5.CallDuration);
		System.out.println("callCenter"+n5.callCenter);
		
		
		
	}
	
	
	public static void main(String[] args) {
		Test cs=new Test();
		cs.setData();
		cs.getData();
	}

}
