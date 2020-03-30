package com.wangxuegang.feign.controller;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("test")
public class FeignServiceController {
	
	@PostMapping(value="/uploadFile",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String uploadFile(@RequestPart("file") MultipartFile file,@RequestParam("name") String name){
		System.out.println("############# 上传文件名："+file.getOriginalFilename());
		System.out.println("############# 姓名："+name);
		return null;
	}
	
	@PostMapping(value="/getId",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Map uploadFile(@RequestBody Map map){
		return map;
	}
}
