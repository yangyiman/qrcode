package com.qrcode.demo.controller;

import com.qrcode.demo.service.QRCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("/qrcode")
public class QRCodeController {
    @Autowired
    QRCodeService qrCodeService;

    @RequestMapping(value="/getQRCode")
    public String getQRCode(Model model) throws IOException {
        String str = qrCodeService.crateQRCode("http://www.pptbz.com/pptpic/UploadFiles_6909/201203/2012031220134655.jpg",200,200);
        System.out.println(str);
        model.addAttribute("name","hello");
        model.addAttribute("str",str);
        return "index";
    }
}
