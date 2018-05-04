package com.iqmsoft.charts.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HighChartController {

	@RequestMapping("/graph1")
	public String generateGraph(Model model) {
		Map<String, Integer> techMap = getTechnologyMap();
		model.addAttribute("techMap", techMap);
		return "graph1";
	}

	
	@RequestMapping("/lineChart")
	public String lineXhartGraph(Model model) {
		Map<String, Integer> techMap = getTechnologyMap();
		model.addAttribute("techMap", techMap);
		return "lineChart";
	}

	@RequestMapping("/pie")
	public String generatePieChart(Model model) {
		model.addAttribute("java", 48);
		model.addAttribute("Net", 12);
		model.addAttribute("python", 9);
		model.addAttribute("php", 20);
		
		return "pie";
	}

	

	private Map<String, Integer> getTechnologyMap() {
		
		Map<String, Integer> techMap = Collections.synchronizedMap(new HashMap<>());
		
		synchronized(techMap)
		{
		
			techMap.put("Java", 89);
			techMap.put(".Net", 57);
			techMap.put("Php", 65);
			techMap.put("Python", 45);
		
			
		
		}
		
		
		return techMap;
	}
}