package src;


import com.jayway.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.post;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RestTest {
    @Test
    public void unregisterUserTest() throws IOException {
        String name = RandomStringUtils.randomAlphabetic(8);
        HttpUriRequest request = new HttpGet("https://api.github.com/users/" + name);

        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        assertThat(response.getStatusLine().getStatusCode(), equalTo(HttpStatus.SC_NOT_FOUND));
    }

    @Test
    public void notFoundRequestTest() throws IOException {

        HttpUriRequest request = new HttpGet("https://api.github.com/users/octocat/orgs");

        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        assertThat(response.getStatusLine().getStatusCode(), equalTo(HttpStatus.SC_NOT_FOUND));
    }

    @Test
    public void mimeTypeTest() throws IOException {
        String jsonMimeType = "application/json";
        HttpUriRequest request = new HttpGet("https://api.github.com/users/eugenp");

        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        String mimeType = ContentType.getOrDefault(response.getEntity()).getMimeType();
        assertEquals(jsonMimeType, mimeType);
    }

    @Test
    public void gitUserTest() {
        RestTemplate restTemplate = new RestTemplate();
        Usver usver = restTemplate.getForObject("https://api.github.com/users/wdhh", Usver.class);
        System.out.println(usver.getName());
        System.out.println(usver.getBlog());
        System.out.println(usver.getEmail());
        System.out.println(usver.getId());
//        System.out.println(restTemplate.getForObject("https://api.github.com/users/wdhh", src.Usver.class));

    }

    @Test
    public void gitIssuesTest() {
        RestTemplate restTemplate = new RestTemplate();
        Issues[] issues = restTemplate.getForObject("https://api.github.com/repos/wdhh/ForFun/issues", Issues[].class);

        for(Issues issues1 : issues){
            System.out.println(issues1.getUser().getMyLoginName());
        }
    }

    @Test
    public void dataResponseTest() {
        Response response = post("sdfsdf");
        Response resp = get("http://restcountries.eu/rest/v1");
//        Response resp = get("http://restcountries.eu/rest/v1/name/ukraine");

        JSONArray jsonResponse = new JSONArray(resp.asString());

        String capital = jsonResponse.getJSONObject(0).getString("capital");

        assertEquals(capital, "Kiev");
    }

    @Test
    public void postRequestTest() throws IOException {
        final String USER_AGENT = "Mozilla/5.0";
        String url = "https://selfsolve.apple.com/wcResults.do";

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);

        // add header
        post.setHeader("User-Agent", USER_AGENT);

        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("sn", "C02G8416DRJM"));
        urlParameters.add(new BasicNameValuePair("cn", ""));
        urlParameters.add(new BasicNameValuePair("locale", ""));
        urlParameters.add(new BasicNameValuePair("caller", ""));
        urlParameters.add(new BasicNameValuePair("num", "12345"));

        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : " +
                response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result.toString());
    }

    @Test
    public void postTest2() throws IOException {
        URL url = new URL("http://example.net/new-message.php");
        Map<String,Object> params = new LinkedHashMap<>();
        params.put("name", "Freddie the Fish");
        params.put("email", "fishie@seamail.example.com");
        params.put("reply_to_thread", 10394);
        params.put("message", "Shark attacks in Botany Bay have gotten out of control. We need more defensive dolphins " +
                "to protect the schools here, but Mayor Porpoise is too busy stuffing his snout with lobsters. He's so shellfish.");

        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String,Object> param : params.entrySet()) {
            if (postData.length() != 0) postData.append('&');
            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }
        byte[] postDataBytes = postData.toString().getBytes("UTF-8");

        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);

        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

        for (int c; (c = in.read()) >= 0;)
            System.out.print((char)c);
    }

}
