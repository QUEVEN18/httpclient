import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class mainClas {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet("https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=13981871131");
        HttpResponse response= httpClient.execute(get);
        HttpEntity entity=response.getEntity();
    String entityString = EntityUtils.toString(entity);
    System.out.println(entityString);
    httpClient.close();
    }

    @Test
    @Parameters({"URL"})
    public void testget(String url) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        HttpResponse response= httpClient.execute(get);
        HttpEntity entity=response.getEntity();
        String entityString = EntityUtils.toString(entity);
        System.out.println(entityString);
        httpClient.close();
    }

    public void getURL() throws IOException, InvalidFormatException {
      Workbook book= WorkbookFactory.create(new File(""));
        Sheet sheet =  book.getSheetAt(0);
        int rows=sheet.getPhysicalNumberOfRows();
        int i;
        for(i=0 ; i<rows ;i++ ){

        }

    }
}
