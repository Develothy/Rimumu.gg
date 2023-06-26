package gg.rimumu.common;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum ChampionKey {
    K266("Aatrox"),
    K103("Ahri"),
    K84("Akali"),
    K166("Akshan"),
    K12 ("Alistar"),
    K32 ("Amumu"),
    K34 ("Anivia"),
    K1 ("Annie"),
    K523 ("Aphelios"),
    K22 ("Ashe"),
    K136 ("AurelionSol"),
    K268 ("Azir"),
    K432 ("Bard"),
    K200 ("Belveth"),
    K53 ("Blitzcrank"),
    K63("Brand"),
    K201 ("Braum"),
    K51 ("Caitlyn"),
    K164 ("Camille"),
    K69 ("Cassiopeia"),
    K31 ("Chogath"),
    K42 ("Corki"),
    K122 ("Darius"),
    K131 ("Diana"),
    K119 ("Draven"),
    K36 ("DrMundo"),
    K245 ("Ekko"),
    K60 ("Elise"),
    K28 ("Evelynn"),
    K81 ("Ezreal"),
    K9 ("Fiddlesticks"),
    K114 ("Fiora"),
    K105 ("Fizz"),
    K3 ("Galio"),
    K41 ("Gangplank"),
    K86 ("Garen"),
    K150 ("Gnar"),
    K79 ("Gragas"),
    K104 ("Graves"),
    K887 ("Gwen"),
    K120 ("Hecarim"),
    K74 ("Heimerdinger"),
    K420 ("Illaoi"),
    K39 ("Irelia"),
    K427 ("Ivern"),
    K40 ("Janna"),
    K59 ("JarvanIV"),
    K24 ("Jax"),
    K126 ("Jayce"),
    K202 ("Jhin"),
    K222 ("Jinx"),
    K145 ("Kaisa"),
    K429 ("Kalista"),
    K43 ("Karma"),
    K30 ("Karthus"),
    K38 ("Kassadin"),
    K55 ("Katarina"),
    K10 ("Kayle"),
    K141 ("Kayn"),
    K85 ("Kennen"),
    K121 ("Khazix"),
    K203 ("Kindred"),
    K240 ("Kled"),
    K96 ("KogMaw"),
    K897 ("KSante"),
    K7 ("Leblanc"),
    K64 ("LeeSin"),
    K89 ("Leona"),
    K876 ("Lillia"),
    K127 ("Lissandra"),
    K236 ("Lucian"),
    K117 ("Lulu"),
    K99 ("Lux"),
    K54 ("Malphite"),
    K90 ("Malzahar"),
    K57 ("Maokai"),
    K11 ("MasterYi"),
    K902 ("Milio"),
    K21 ("MissFortune"),
    K62 ("MonkeyKing"),
    K82 ("Mordekaiser"),
    K25 ("Morgana"),
    K267 ("Nami"),
    K75 ("Nasus"),
    K111 ("Nautilus"),
    K518 ("Neeko"),
    K76 ("Nidalee"),
    K895 ("Nilah"),
    K56 ("Nocturne"),
    K20 ("Nunu"),
    K2 ("Olaf"),
    K61 ("Orianna"),
    K516 ("Ornn"),
    K80 ("Pantheon"),
    K78 ("Poppy"),
    K555 ("Pyke"),
    K246 ("Qiyana"),
    K133 ("Quinn"),
    K497 ("Rakan"),
    K33 ("Rammus"),
    K421 ("RekSai"),
    K526 ("Rell"),
    K888 ("Renata"),
    K58 ("Renekton"),
    K107 ("Rengar"),
    K92 ("Riven"),
    K68 ("Rumble"),
    K13 ("Ryze"),
    K360 ("Samira"),
    K113 ("Sejuani"),
    K235 ("Senna"),
    K147 ("Seraphine"),
    K875 ("Sett"),
    K35 ("Shaco"),
    K98 ("Shen"),
    K102 ("Shyvana"),
    K27 ("Singed"),
    K14 ("Sion"),
    K15 ("Sivir"),
    K72 ("Skarner"),
    K37 ("Sona"),
    K16 ("Soraka"),
    K50 ("Swain"),
    K517 ("Sylas"),
    K134 ("Syndra"),
    K223 ("TahmKench"),
    K163 ("Taliyah"),
    K91 ("Talon"),
    K44 ("Taric"),
    K17 ("Teemo"),
    K412 ("Thresh"),
    K18 ("Tristana"),
    K48 ("Trundle"),
    K23 ("Tryndamere"),
    K4 ("TwistedFate"),
    K29 ("Twitch"),
    K77 ("Udyr"),
    K6 ("Urgot"),
    K110 ("Varus"),
    K67 ("Vayne"),
    K45 ("Veigar"),
    K161 ("Velkoz"),
    K711 ("Vex"),
    K254 ("Vi"),
    K234 ("Viego"),
    K112 ("Viktor"),
    K8 ("Vladimir"),
    K106 ("Volibear"),
    K19 ("Warwick"),
    K498 ("Xayah"),
    K101 ("Xerath"),
    K5 ("XinZhao"),
    K157 ("Yasuo"),
    K777 ("Yone"),
    K83 ("Yorick"),
    K350 ("Yuumi"),
    K154 ("Zac"),
    K238 ("Zed"),
    K221 ("Zeri"),
    K115 ("Ziggs"),
    K26 ("Zilean"),
    K142 ("Zoe"),
    K143 ("Zyra");

    private String label;

    ChampionKey(String label) {
    this.label = label;
    }
    public String label() {
    return label;
    }

    public static String addChampion(String key, String label) {
        for (ChampionKey championKey : ChampionKey.values()) {
            if (championKey.name().equalsIgnoreCase(key)) {
                return key + " 이미 존재하는 KEY입니다!";
            }
        }

        ChampionKey championKey = ChampionKey.valueOf(key);
        if (championKey != null) {
            championKey.label = label;
            return key + " 정상 등록 되었습니다!";
        }

        return  key + "등록에 실패했습니다!";
    }

    public static Map<String, String> valuesWithLabel() {
        Map<String, String> championMap = new HashMap<>();
        for (ChampionKey championKey : ChampionKey.values()) {
            championMap.put(championKey.name(), championKey.getLabel());
        }
        return championMap;
    }

}
