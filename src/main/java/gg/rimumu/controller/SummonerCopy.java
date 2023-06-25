package gg.rimumu.controller;

import gg.rimumu.dto.SummonerDto;
import gg.rimumu.exception.RimumuException;
import gg.rimumu.service.SummonerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;


@Controller
@RequiredArgsConstructor
public class SummonerCopy {

    private final SummonerService summonerService;


    // 소환사 Summoner(smn) 검색
    @GetMapping("/summoner")
    public String summoner(@RequestParam("smn") String smn, Model model) throws IOException {
        if (smn.isBlank()) {
            return "summoner/nameNull";
        }

        String adjustSmn = smn.strip().length() > 2 ? smn : smn.charAt(0) + " " + smn.charAt(1);

        SummonerDto summonerDto;
        try {
            summonerDto = summonerService.smnSearch(URLEncoder.encode(adjustSmn, StandardCharsets.UTF_8));
        } catch (RimumuException.SummonerNotFoundException e) {
            model.addAttribute("smn", smn);
            return "summoner/nameNull";
        } catch (RimumuException e) {
            throw new RuntimeException(e);
        }

        model.addAttribute("summonerDto", summonerDto);
        return "summoner/smnResult";
    }
}
