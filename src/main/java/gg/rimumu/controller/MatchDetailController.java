package gg.rimumu.controller;

import gg.rimumu.service.SummonerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MatchDetailController {

    private final SummonerService summonerService;

    /*
    @PostMapping("/summoner/{matchId}")
    public MatchDetailDto matchDetail(@PathVariable("matchId") String matchId) {

        MatchDetailDto matchDetail = new MatchDetailDto();

        try {
            matchDetail = summonerService.matchDtl(matchId);
        } catch (RimumuException.MatchNotFoundException e) {

        }
        System.out.println(matchId+"controller 호출됨");
        return matchDetail;
    }
*/

}
