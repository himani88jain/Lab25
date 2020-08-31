package co.grandcircus.Lab25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WeatherController {
	
	@Autowired
	ApiService apiServ;


	@RequestMapping("/")
	public String home() {
		return "redirect:/add-data";
	}
	
	@RequestMapping("add-data")
	public String addLatLong() {
		return "add-form";
	}
	
	@RequestMapping("/show-data")
	public String showTextData(@RequestParam("lat") Double latitude,
								@RequestParam("lon") Double longitute,Model model) {
		
		Data data=apiServ.showWeatherForcast(latitude, longitute);
		String cityName=apiServ.showCityName(latitude,longitute);
		String date=apiServ.showDate(latitude, longitute);
		model.addAttribute("cityName",cityName);
		model.addAttribute("data",data);
		model.addAttribute("date",date);
		return "view";
	}
}
