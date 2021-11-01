public class AppDTO{

	private String appName;
	private double appInMb;
	private String appType;

	public void setAppName(String appName){
	    this.appName = appName;
	}
	public String getAppName(){
	    return appName;
	}

	public void setAppInMb(double appInMb){
	    this.appInMb = appInMb;
	}
	public double getAppInMb(){
	    return appInMb;
	}

	public void setAppType(String appType){
	    this.appType = appType;
	}
	public String getAppType(){
	    return appType;
	}
}