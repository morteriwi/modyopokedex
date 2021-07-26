package modyo.pokedex.utils;

public class GetIdUtil {
	public static Integer getIdFromUrl(String url) {
		Integer id = null;
		try {
			if (url != null && !url.isEmpty()) {
				//String idByUrl = url.substring(url.lastIndexOf("/")-1);
				String [] idByUrl = url.split("/");
				id = Integer.parseInt(idByUrl[idByUrl.length-1]);
				//idByUrl.replaceAll("/", "");
				//id = Integer.parseInt(idByUrl);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return id;
	}

}
