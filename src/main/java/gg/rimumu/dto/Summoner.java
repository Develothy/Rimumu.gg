package gg.rimumu.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class Summoner {

    private String id;
    private String puuid;
    private String name;
    private int summonerLevel;
    // 아이콘 이미지 주소
    private int profileIconId;
    private String iconImgUrl;

    // 솔랭 기록
    private String soloTier = "Unranked";
    private String soloRank;
    private String soloLeaguePoints;
    private String soloWins;
    private String soloLosses;

    // 자유랭크 기록
    private String flexTier = "Unranked";
    private String flexRank;
    private String flexLeaguePoints;
    private String flexWins;
    private String flexLosses;

    // 현재 게임중인 기록 (current)
    private boolean isCurrent = false; // 게임 여부 true false
    private String queueId;
    private String curChamp; // champ
    private String curChampUrl; // champ 이미지

    // 검색한 소환사 최근 전적 승률 KDA
    private int recentWin;
    private int recentLose;
    private int recentKill;
    private int recentDeath;
    private int recentAssist;
    private int recentTotal;
    private String recentAvg;

    // matchId list
    private List<String> matchIdList = new ArrayList<>();

    private List<Match> matchList = new ArrayList<>();




}
