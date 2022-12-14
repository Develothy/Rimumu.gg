package gg.rimumu.controller;

import gg.rimumu.dto.MatchDetailDto;
import gg.rimumu.service.SummonerService;
import lombok.RequiredArgsConstructor;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class MatchDetailController {

    private final SummonerService summonerService;

    @PostMapping("/summoner/{matchId}")
    public MatchDetailDto matchDetail(@PathVariable("matchId") String matchId) throws IOException, ParseException {

        MatchDetailDto matchDetail = new MatchDetailDto();

        matchDetail = summonerService.matchDtl(matchId);
        System.out.println(matchId+"controller 호출됨");
        return matchDetail;
    }


}
