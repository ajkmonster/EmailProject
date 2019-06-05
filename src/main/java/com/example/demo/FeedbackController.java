package com.example.demo;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.ValidationException;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    private EmailCfg emailCfg;

    public FeedbackController(EmailCfg emailCfg) {
        this.emailCfg = emailCfg;
    }

    @PostMapping
    public void sendFeedback(@RequestBody Feedback feedback, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new ValidationException("Feedback is not valid");
        }

        //Create a mail sender
        JavaMailSender mailSender = new JavaMailSenderImpl();
        mailSender.
    }

}
