package fr.ubo.hello.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import fr.ubo.hello.bean.Greeting;
import junit.framework.Assert;
@SuppressWarnings({ "deprecation", "unused" })
public class GreetingServiceTest {
	
	@Test
	public void badGreeting() throws ClientProtocolException, IOException{
		@SuppressWarnings("resource")
		HttpClient client=new DefaultHttpClient();
		HttpGet mockRequest= new HttpGet("http://localhost:8080/ArchiJEEWSRestTP/greeting");
		//mockRequest.setHeader("http-user",userId);
		HttpResponse mockResponse=(HttpResponse) client.execute(mockRequest);
		Assert.assertEquals(mockResponse.getStatusLine().getStatusCode(), 200);
		BufferedReader rd =new BufferedReader(new InputStreamReader( mockResponse.getEntity().getContent()));
		XmlMapper mapper=new XmlMapper();
		Greeting g=mapper.readValue(rd,Greeting.class);
		Assert.assertNotNull(g);
	    //Assert.assertFalse(g.getMessage().contains("jack"));
		Assert.assertEquals("name est obligatorie. Merci de le renseigner.",g.getMessage());
		
		}

}
