package com.biplav.FileUpload;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.biplav.FileUpload.controller.FileUploadController;

@SpringBootApplication
@ComponentScan({"com.biplav.FileUpload", "com.biplav.FileUpload.controller"})
public class FileUploadApplication {

	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(FileUploadApplication.class, args);
	}

}

