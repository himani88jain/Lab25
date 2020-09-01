package co.grandcircus.Lab25;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {

	
	private RestTemplate rt;


	// initialization block that runs when a new instance of the class is created
	// loaded before the constructor
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "weather");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public Weather showWeatherForcast(double latitute,double longitute) {
		
		String url="https://forecast.weather.gov/MapClick.php?lat={latitute}&lon={longitute}&FcstType=json";
		
		Weather response=rt.getForObject(url, Weather.class,latitute,longitute);
		
		return response;
		
	}
	
}
