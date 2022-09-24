package com.sparta.project.repository;

import com.sparta.project.entity.Evaluation;
import com.sparta.project.entity.Match;
import com.sparta.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {

    List<Evaluation> findAllByNickname(String nickname);
    boolean existsByMatchAndNicknameAndUser(Match match, String nickname, User user);
}
