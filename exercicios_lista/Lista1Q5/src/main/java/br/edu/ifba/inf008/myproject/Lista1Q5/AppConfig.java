package br.edu.ifba.inf008.myproject.Lista1Q5;

public class AppConfig {
	private String appName;
	private float version;
	private int maxConnections;
	private int timeoutSeconds;
	private boolean isDebugMode;
	
	public AppConfig() {
		
	}
	
	public AppConfig(String appName) {
		this.appName = appName;
	}
	
	public AppConfig(String appName,float version, int maxConnections) {
		this(appName);
		this.version = version;
		this.maxConnections = maxConnections;
	}
	
	public AppConfig(String appName,float version, int maxConnections, int timeoutSeconds, boolean isDebugMode) {
		this(appName, version, maxConnections);
		this.timeoutSeconds = timeoutSeconds;
		this.isDebugMode = isDebugMode;
	}
	
	public void updateSettings(int maxConnections, int timeoutSeconds)
	{
		System.out.println("update normal");
	}
	
	public void updateSettings(boolean isDebugMode)
	{
		if(isDebugMode == true) {
			System.out.println("configuração validada");
		} else {
			System.out.println("configuração não válida");
		}		
	}
	
	public void validateConfig()
	{
		System.out.println("validação configuração");
		
	}
	
	
}
