package com.satyam.websocket.chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    public String content;
    private String sender;
    private MessageType type;
}
