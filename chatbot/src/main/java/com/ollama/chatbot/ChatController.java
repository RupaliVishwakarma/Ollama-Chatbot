package com.ollama.chatbot;

import java.util.Map;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
	private final ChatModel chatmodel;
	
	public ChatController(ChatModel chatmodel) {
		this.chatmodel= chatmodel;

	}
	@PostMapping("/chat")
	public String prompt(@RequestBody Map<String, String> payload) {
	    String message = payload.get("Ask Anything");
	    return chatmodel.call(message);
	}
}
