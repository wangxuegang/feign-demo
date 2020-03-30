package com.wangxuegang.feign.client;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;


@FeignClient(value = "feign-service")
public interface DemoFeign {
	
	@PostMapping(value="test/uploadFile",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String uploadFile(@RequestPart("file") MultipartFile file,@RequestParam("name") String name);
	
	@PostMapping(value="test/getId",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Map uploadFile(@RequestBody Map map);
}
