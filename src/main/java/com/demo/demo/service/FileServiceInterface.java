package com.demo.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface FileServiceInterface {
   ResponseEntity<?> uploadFile(MultipartFile fileToBeUploaded);
    ResponseEntity<?>  downloadFile(String fileName);
     String saveImage(MultipartFile file);
     Byte [] afficherImage(String filename);
}
