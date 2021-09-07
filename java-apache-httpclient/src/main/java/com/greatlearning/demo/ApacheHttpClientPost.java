package com.greatlearning.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

// For demo of this code, please start the Spring Boot Library Design application
public class ApacheHttpClientPost {

	public static void main(String[] args) {

		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();
			// HttpPost postRequest = new
			// HttpPost("http://localhost:8080/RESTfulExample/json/product/post");
			HttpPost postRequest = new HttpPost(
					"http://localhost:8083/customInfo?courseName=Apache%20Http%20Client&courseType=Information%20Technology&firstName=Samarth&lastname=Narula");
			HttpResponse response = httpClient.execute(postRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			httpClient.getConnectionManager().shutdown();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
