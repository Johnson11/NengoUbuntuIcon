import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class install2 {

	public static void main(String[] args) {
		Path path = Paths.get("nengo.desktop");
		Charset charset = StandardCharsets.UTF_8;
		String name = System.getProperty("user.name");
		String content = null;
		try {
			content = new String(Files.readAllBytes(path), charset);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		content = content.replaceAll("justin", name);
		try {
			Files.write(path, content.getBytes(charset));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

