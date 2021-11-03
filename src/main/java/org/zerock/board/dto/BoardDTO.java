package org.zerock.board.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {
    private Long bno;
    private String title, content, writerEmail, writerName;
    private LocalDateTime regDate, modDate;
    private int replyCount; // 해당 게시글의 댓글 수
}
