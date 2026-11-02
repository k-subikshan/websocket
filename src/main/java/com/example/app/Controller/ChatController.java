package com.example.app.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import com.example.app.Dto.ChatMessage;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    @MessageMapping("/sendmessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage msg){
        return msg;
    }
    @GetMapping("chat")
    public String chat(){
        return "chat";
    }
}
