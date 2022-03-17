package androidhttpweb;

import java.util.Calendar;
import java.util.HashMap;

/**
 * Directly accessed with reflection by @TinyWebServer
 */
public class WebApi {

    public WebApi(){ }

    public String time(HashMap qparms){
        String json = "{\"now\":\""+ Calendar.getInstance().getTime().toString() + "\"}";
        return json.toString();
    }
}