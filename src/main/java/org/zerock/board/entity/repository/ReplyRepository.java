package org.zerock.board.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.board.entity.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
