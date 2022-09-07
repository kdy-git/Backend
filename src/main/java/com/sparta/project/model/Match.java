package com.sparta.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sparta.project.dto.MatchDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Match extends Timestamped{

    @Id
    @Column(name = "match_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String writer;

    @Column
    private String title;

    @Column
    private String contents;

    @Column
    private Long region;

    @Column
    private String sports;

    @Column
    private Long max_user;

    @OneToMany
    @JoinColumn(name = "match_id")
    private List<RequestUserList> requestUserList;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_id")
    private List<UserListInMatch> userListInMatches;

    @Builder
    public Match(MatchDto matchDto) {
        this.writer = matchDto.getWriter();
        this.title = matchDto.getTitle();
        this.contents = matchDto.getContents();
        this.region = matchDto.getRegion();
        this.sports = matchDto.getSports();
        this.max_user = matchDto.getMax_user();
    }

    public void updateMatch(MatchDto matchDto) {
        this.title = matchDto.getTitle();
        this.contents = matchDto.getContents();
        this.region = matchDto.getRegion();
        this.sports = matchDto.getSports();
    }
}
