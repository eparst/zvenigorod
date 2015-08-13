package controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import play.Logger;
import play.Play;
import play.mvc.Controller;
import play.mvc.Result;

public class CdnAssets  { //extends Controller

	private final static String url = Play.application().configuration().getString("cdnurl");

	public static String changeImageUrl(String s) {
		if (!url.equals("")){
//			String regex = "=[^http://]\"?((\\/[^.]*\\/[^.]*)\\.(png|gif|jpg|jpeg))\"?";			
			String regex = "=[^http://]\"?((\\/?[^.]*\\/[^.]*)\\.(png|gif|jpg|jpeg))\"?";
//			Pattern imagePattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher m = Pattern.compile(regex).matcher(s);
			StringBuilder strb = new StringBuilder(s);
			int offset = 0;//, ind = 1;
			while (m.find()) {
				int start = strb.indexOf(m.group(1), offset);
				int end = start + url.length() + m.group(1).length();
				// Logger.debug(ind + ". m.group(1)=" + m.group(1) + " <" + start +
				// " " + end + ">");
				// strb.replace(start, end, url + m.group(1));
				if (url.endsWith("/") && !m.group(1).startsWith("/") || !url.endsWith("/") && m.group(1).startsWith("/") ){
					strb.insert(start, url);
				}else if (url.endsWith("/") && m.group(1).startsWith("/")){
					strb.insert(start, url.substring(0, url.length() - 1));
				}else{
					strb.insert(start, url + "/");
				}
				offset = end;
//				ind++;
			}
			return strb.toString();// .replace("\"\"", "\"").replace("//",
								// "/").replace("http:/", "http://");
		}else{
			Logger.debug("No CdnUrl found in Aplication.conf");
			return s;
		}
	}

//	public static Result redirImage(String p, String s) {// throws IOException {
	/*
	 * File file = new File(
	 * "http://zv-cdn.appspot.com/static/zv/images/zvenigorod-pomoyka.jpg");
	 * return
	 * ok(org.apache.commons.io.FileUtils.readFileToByteArray(file)).as("image/jpeg"
	 * );
	 */
		// Pattern imagePattern = Pattern.compile("(\\.)(png|gif|jpg|jpeg)$",
		// Pattern.CASE_INSENSITIVE);
		// if (imagePattern.matcher(s).find())
		// return ok(s.replaceAll("(%20)|\\s", "+"));
		// else{
		// Logger.debug("qqq=" + ok("http://zv-cdn.appspot.com/static/zv/" +
		// s).as("image/jpeg").toString());
//		return redirect(url + p + s); add to class extends Controller
		// }

//	}
	/*
	 * public static Result getImageStream(String s) throws IOException { Uri
	 * input =
	 * "http://zv-cdn.appspot.com/static/zv/images/zvenigorod-pomoyka.jpg";
	 * BufferedImage img = ImageIO.read(input);
	 * 
	 * // File file = new File(
	 * "C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/public/images/zvenigorod-pomoyka.jpg"
	 * ); FileInputStream stream = new FileInputStream(file); return
	 * ok(stream).as("image/jpeg"); }
	 */

}
