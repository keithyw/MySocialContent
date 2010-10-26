import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;
import org.apache.commons.httpclient.params.HttpMethodParams;
import java.io.*;

public class Junk
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String url = "http://www.yahoo.com";
		HttpClient client = new HttpClient();
		GetMethod method = new GetMethod(url);
		method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(3, false));
		try
		{
			int statusCode = client.executeMethod(method);
			if (statusCode != HttpStatus.SC_OK)
			{
				System.out.println("fail " + method.getStatusLine());
				
			}
			byte[] responseBody = method.getResponseBody();
			System.out.println(new String(responseBody));
		}
		catch (Exception e)
		{
			
		}
		/** 
		 *         HttpClient client = new HttpClient();
        
        try {
          
            
            // Deal with the response.
            // Use caution: ensure correct character encoding and 
            // is not binary data
            System.out.println(new String(responseBody));
            
        } catch (HttpException e) {
            
            System.err.println("Fatal protocol violation: " + e.getMessage());
            e.printStackTrace();
            
        } catch (IOException e) {
            
            System.err.println("Fatal transport error: " + e.getMessage());
            e.printStackTrace();
            
        } finally {
            
            // Release the connection.
            method.releaseConnection();
            
        }
		 */
	}

}
