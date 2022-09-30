package com.sparta.project.dto.message;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class ChatMessageDto {

    private Long match_id; // 방번호
    private String sender; // 메시지 보낸사람
    private String message; // 메시지
    private String type;
    private long createdAt;

}
