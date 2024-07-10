package com.ohgiraffers.chap06fileupload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class FileUploadController {

    private ResourceLoader resourceLoader;

    @Autowired
    public FileUploadController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @PostMapping("single-file")
    public String singFileUpload(@RequestParam MultipartFile singleFile,String singleFileDescription, Model model) {

        //ㅍㅏ일 저장할 경로를 설정한다.
        Resource resource = resourceLoader.getResource("classpath:static:/img/single");

        String filePath = null;

        //만약 해당 경로가 없다면
        if(!resource.exists()) {
            String root = "src/main/resources/img/single";
            File file = new File(root);

            file.mkdirs();

            filePath = file.getAbsolutePath();
        }
    }

}
