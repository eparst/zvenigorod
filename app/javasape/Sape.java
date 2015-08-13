package javasape;

import javax.inject.Singleton;
import javax.servlet.http.Cookie;

import play.Play;
import play.mvc.Http.Cookies;
@Singleton
public class Sape {
//    private final String sapeUser;
	private static String sapeUser = Play.application().configuration().getString("sapeUser");
	private static String sapeHost = Play.application().configuration().getString("sapeHost");
	private static Sape sape = new Sape(sapeUser, sapeHost, 1000, 5 * 60);
	public static Sape getSape(){
		return sape;
	}
    private final SapeConnection sapePageLinkConnection;

    public Sape(String sapeUser, String host, int socketTimeout, int cacheLifeTime) {
        Sape.sapeUser = sapeUser;
        
        this.sapePageLinkConnection = new SapeConnection(
                "/code.php?user=" + sapeUser + "&host=" + host,
                "SAPE_Client PHP", socketTimeout, cacheLifeTime);
    }
    
    public boolean debug = Play.application().configuration().getBoolean("sapeDebug"); //false;
    
    public SapePageLinks getPageLinks(String requestUri, Cookies cookies) { // Cookie[] cookies from me
        return new SapePageLinks(sapePageLinkConnection, sapeUser, requestUri, cookies, debug);
    }
}
