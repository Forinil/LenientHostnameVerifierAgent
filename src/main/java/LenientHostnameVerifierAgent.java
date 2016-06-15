import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import java.lang.instrument.Instrumentation;

/**
 * Stworzone przez Konrad Botor dnia 2016-06-09.
 */
public class LenientHostnameVerifierAgent {
    public static void premain(String args, Instrumentation inst) {
        HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
            public boolean verify(String s, SSLSession sslSession) {
                return true;
            }
        });
    }
}
