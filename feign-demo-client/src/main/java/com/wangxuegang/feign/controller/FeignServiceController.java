package com.wangxuegang.feign.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.wangxuegang.feign.client.DemoFeign;

@RestController
@RequestMapping("test")
public class FeignServiceController {
	
	@Autowired
	DemoFeign demoFeign;
	
	@PostMapping(value="/uploadFileClinet",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String uploadFile(@RequestPart("file") MultipartFile file,@RequestParam("name") String name){
		demoFeign.uploadFile(file,name);
		return null;
	}
	
	@PostMapping(value="/getIdClinet",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Map uploadFile(@RequestBody Map map){
		Map mapDate = demoFeign.uploadFile(map);
		mapDate.put("key", "value");
		return mapDate;
	}
}
