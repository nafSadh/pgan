package com.nafsadh.pgan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PGANSetup {
    
    //region POKEDEX
    private static String POKEDEX = ""
            + "1,Bulbasaur\n"
            + "2,Ivysaur,\n"
            + "3,Venusaur\n"
            + "4,Charmander\n"
            + "5,Charmeleon\n"
            + "6,Charizard\n"
            + "7,Squirtle\n"
            + "8,Wartortle\n"
            + "9,Blastoise\n"
            + "10,Caterpie\n"
            + "11,Metapod\n"
            + "12,Butterfree\n"
            + "13,Weedle\n"
            + "14,Kakuna\n"
            + "15,Beedrill\n"
            + "16,Pidgey\n"
            + "17,Pidgeotto\n"
            + "18,Pidgeot\n"
            + "19,Rattata\n"
            + "20,Raticate\n"
            + "21,Spearow\n"
            + "22,Fearow\n"
            + "23,Ekans\n"
            + "24,Arbok\n"
            + "25,Pikachu\n"
            + "26,Raichu\n"
            + "27,Sandshrew\n"
            + "28,Sandslash\n"
            + "29,Nidoran♀\n"
            + "30,Nidorina\n"
            + "31,Nidoqueen\n"
            + "32,Nidoran♂\n"
            + "33,Nidorino\n"
            + "34,Nidoking\n"
            + "35,Clefairy\n"
            + "36,Clefable\n"
            + "37,Vulpix\n"
            + "38,Ninetales\n"
            + "39,Jigglypuff\n"
            + "40,Wigglytuff\n"
            + "41,Zubat\n"
            + "42,Golbat\n"
            + "43,Oddish\n"
            + "44,Gloom\n"
            + "45,Vileplume\n"
            + "46,Paras\n"
            + "47,Parasect\n"
            + "48,Venonat\n"
            + "49,Venomoth\n"
            + "50,Diglett\n"
            + "51,Dugtrio\n"
            + "52,Meowth\n"
            + "53,Persian\n"
            + "54,Psyduck\n"
            + "55,Golduck\n"
            + "56,Mankey\n"
            + "57,Primeape\n"
            + "58,Growlithe\n"
            + "59,Arcanine\n"
            + "60,Poliwag\n"
            + "61,Poliwhirl\n"
            + "62,Poliwrath\n"
            + "63,Abra\n"
            + "64,Kadabra\n"
            + "65,Alakazam\n"
            + "66,Machop\n"
            + "67,Machoke\n"
            + "68,Machamp\n"
            + "69,Bellsprout\n"
            + "70,Weepinbell\n"
            + "71,Victreebel\n"
            + "72,Tentacool\n"
            + "73,Tentacruel\n"
            + "74,Geodude\n"
            + "75,Graveler\n"
            + "76,Golem\n"
            + "77,Ponyta\n"
            + "78,Rapidash\n"
            + "79,Slowpoke\n"
            + "80,Slowbro\n"
            + "81,Magnemite\n"
            + "82,Magneton\n"
            + "83,Farfetch'd\n"
            + "84,Doduo\n"
            + "85,Dodrio\n"
            + "86,Seel\n"
            + "87,Dewgong\n"
            + "88,Grimer\n"
            + "89,Muk\n"
            + "90,Shellder\n"
            + "91,Cloyster\n"
            + "92,Gastly\n"
            + "93,Haunter\n"
            + "94,Gengar\n"
            + "95,Onix\n"
            + "96,Drowzee\n"
            + "97,Hypno\n"
            + "98,Krabby\n"
            + "99,Kingler\n"
            + "100,Voltorb\n"
            + "101,Electrode\n"
            + "102,Exeggcute\n"
            + "103,Exeggutor\n"
            + "104,Cubone\n"
            + "105,Marowak\n"
            + "106,Hitmonlee\n"
            + "107,Hitmonchan\n"
            + "108,Lickitung\n"
            + "109,Koffing\n"
            + "110,Weezing\n"
            + "111,Rhyhorn\n"
            + "112,Rhydon\n"
            + "113,Chansey\n"
            + "114,Tangela\n"
            + "115,Kangaskhan\n"
            + "116,Horsea\n"
            + "117,Seadra\n"
            + "118,Goldeen\n"
            + "119,Seaking\n"
            + "120,Staryu\n"
            + "121,Starmie\n"
            + "122,Mr. Mime\n"
            + "123,Scyther\n"
            + "124,Jynx\n"
            + "125,Electabuzz\n"
            + "126,Magmar\n"
            + "127,Pinsir\n"
            + "128,Tauros\n"
            + "129,Magikarp\n"
            + "130,Gyarados\n"
            + "131,Lapras\n"
            + "132,Ditto\n"
            + "133,Eevee\n"
            + "134,Vaporeon\n"
            + "135,Jolteon\n"
            + "136,Flareon\n"
            + "137,Porygon\n"
            + "138,Omanyte\n"
            + "139,Omastar\n"
            + "140,Kabuto\n"
            + "141,Kabutops\n"
            + "142,Aerodactyl\n"
            + "143,Snorlax\n"
            + "144,Articuno\n"
            + "145,Zapdos\n"
            + "146,Moltres\n"
            + "147,Dratini\n"
            + "148,Dragonair\n"
            + "149,Dragonite\n"
            + "150,Mewtwo\n"
            + "151,Mew\n"
            + "152,Chikorita\n"
            + "153,Bayleef\n"
            + "154,Meganium\n"
            + "155,Cyndaquil\n"
            + "156,Quilava\n"
            + "157,Typhlosion\n"
            + "158,Totodile\n"
            + "159,Croconaw\n"
            + "160,Feraligatr\n"
            + "161,Sentret\n"
            + "162,Furret\n"
            + "163,Hoothoot\n"
            + "164,Noctowl\n"
            + "165,Ledyba\n"
            + "166,Ledian\n"
            + "167,Spinarak\n"
            + "168,Ariados\n"
            + "169,Crobat\n"
            + "170,Chinchou\n"
            + "171,Lanturn\n"
            + "172,Pichu\n"
            + "173,Cleffa\n"
            + "174,Igglybuff\n"
            + "175,Togepi\n"
            + "176,Togetic\n"
            + "177,Natu\n"
            + "178,Xatu\n"
            + "179,Mareep\n"
            + "180,Flaaffy\n"
            + "181,Ampharos\n"
            + "182,Bellossom\n"
            + "183,Marill\n"
            + "184,Azumarill\n"
            + "185,Sudowoodo\n"
            + "186,Politoed\n"
            + "187,Hoppip\n"
            + "188,Skiploom\n"
            + "189,Jumpluff\n"
            + "190,Aipom\n"
            + "191,Sunkern\n"
            + "192,Sunflora\n"
            + "193,Yanma\n"
            + "194,Wooper\n"
            + "195,Quagsire\n"
            + "196,Espeon\n"
            + "197,Umbreon\n"
            + "198,Murkrow\n"
            + "199,Slowking\n"
            + "200,Misdreavus\n"
            + "201,Unown\n"
            + "202,Wobbuffet\n"
            + "203,Girafarig\n"
            + "204,Pineco\n"
            + "205,Forretress\n"
            + "206,Dunsparce\n"
            + "207,Gligar\n"
            + "208,Steelix\n"
            + "209,Snubbull\n"
            + "210,Granbull\n"
            + "211,Qwilfish\n"
            + "212,Scizor\n"
            + "213,Shuckle\n"
            + "214,Heracross\n"
            + "215,Sneasel\n"
            + "216,Teddiursa\n"
            + "217,Ursaring\n"
            + "218,Slugma\n"
            + "219,Magcargo\n"
            + "220,Swinub\n"
            + "221,Piloswine\n"
            + "222,Corsola\n"
            + "223,Remoraid\n"
            + "224,Octillery\n"
            + "225,Delibird\n"
            + "226,Mantine\n"
            + "227,Skarmory\n"
            + "228,Houndour\n"
            + "229,Houndoom\n"
            + "230,Kingdra\n"
            + "231,Phanpy\n"
            + "232,Donphan\n"
            + "233,Porygon2\n"
            + "234,Stantler\n"
            + "235,Smeargle\n"
            + "236,Tyrogue\n"
            + "237,Hitmontop\n"
            + "238,Smoochum\n"
            + "239,Elekid\n"
            + "240,Magby\n"
            + "241,Miltank\n"
            + "242,Blissey\n"
            + "243,Raikou\n"
            + "244,Entei\n"
            + "245,Suicune\n"
            + "246,Larvitar\n"
            + "247,Pupitar\n"
            + "248,Tyranitar\n"
            + "249,Lugia\n"
            + "250,Ho-oh\n"
            + "251,Celebi\n"
            + "252,Treecko\n"
            + "253,Grovyle\n"
            + "254,Sceptile\n"
            + "255,Torchic\n"
            + "256,Combusken\n"
            + "257,Blaziken\n"
            + "258,Mudkip\n"
            + "259,Marshtomp\n"
            + "260,Swampert\n"
            + "261,Poochyena\n"
            + "262,Mightyena\n"
            + "263,Zigzagoon\n"
            + "264,Linoone\n"
            + "265,Wurmple\n"
            + "266,Silcoon\n"
            + "267,Beautifly\n"
            + "268,Cascoon\n"
            + "269,Dustox\n"
            + "270,Lotad\n"
            + "271,Lombre\n"
            + "272,Ludicolo\n"
            + "273,Seedot\n"
            + "274,Nuzleaf\n"
            + "275,Shiftry\n"
            + "276,Taillow\n"
            + "277,Swellow\n"
            + "278,Wingull\n"
            + "279,Pelipper\n"
            + "280,Ralts\n"
            + "281,Kirlia\n"
            + "282,Gardevoir\n"
            + "283,Surskit\n"
            + "284,Masquerain\n"
            + "285,Shroomish\n"
            + "286,Breloom\n"
            + "287,Slakoth\n"
            + "288,Vigoroth\n"
            + "289,Slaking\n"
            + "290,Nincada\n"
            + "291,Ninjask\n"
            + "292,Shedinja\n"
            + "293,Whismur\n"
            + "294,Loudred\n"
            + "295,Exploud\n"
            + "296,Makuhita\n"
            + "297,Hariyama\n"
            + "298,Azurill\n"
            + "299,Nosepass\n"
            + "300,Skitty\n"
            + "301,Delcatty\n"
            + "302,Sableye\n"
            + "303,Mawile\n"
            + "304,Aron\n"
            + "305,Lairon\n"
            + "306,Aggron\n"
            + "307,Meditite\n"
            + "308,Medicham\n"
            + "309,Electrike\n"
            + "310,Manectric\n"
            + "311,Plusle\n"
            + "312,Minun\n"
            + "313,Volbeat\n"
            + "314,Illumise\n"
            + "315,Roselia\n"
            + "316,Gulpin\n"
            + "317,Swalot\n"
            + "318,Carvanha\n"
            + "319,Sharpedo\n"
            + "320,Wailmer\n"
            + "321,Wailord\n"
            + "322,Numel\n"
            + "323,Camerupt\n"
            + "324,Torkoal\n"
            + "325,Spoink\n"
            + "326,Grumpig\n"
            + "327,Spinda\n"
            + "328,Trapinch\n"
            + "329,Vibrava\n"
            + "330,Flygon\n"
            + "331,Cacnea\n"
            + "332,Cacturne\n"
            + "333,Swablu\n"
            + "334,Altaria\n"
            + "335,Zangoose\n"
            + "336,Seviper\n"
            + "337,Lunatone\n"
            + "338,Solrock\n"
            + "339,Barboach\n"
            + "340,Whiscash\n"
            + "341,Corphish\n"
            + "342,Crawdaunt\n"
            + "343,Baltoy\n"
            + "344,Claydol\n"
            + "345,Lileep\n"
            + "346,Cradily\n"
            + "347,Anorith\n"
            + "348,Armaldo\n"
            + "349,Feebas\n"
            + "350,Milotic\n"
            + "351,Castform\n"
            + "352,Kecleon\n"
            + "353,Shuppet\n"
            + "354,Banette\n"
            + "355,Duskull\n"
            + "356,Dusclops\n"
            + "357,Tropius\n"
            + "358,Chimecho\n"
            + "359,Absol\n"
            + "360,Wynaut\n"
            + "361,Snorunt\n"
            + "362,Glalie\n"
            + "363,Spheal\n"
            + "364,Sealeo\n"
            + "365,Walrein\n"
            + "366,Clamperl\n"
            + "367,Huntail\n"
            + "368,Gorebyss\n"
            + "369,Relicanth\n"
            + "370,Luvdisc\n"
            + "371,Bagon\n"
            + "372,Shelgon\n"
            + "373,Salamence\n"
            + "374,Beldum\n"
            + "375,Metang\n"
            + "376,Metagross\n"
            + "377,Regirock\n"
            + "378,Regice\n"
            + "379,Registeel\n"
            + "380,Latias\n"
            + "381,Latios\n"
            + "382,Kyogre\n"
            + "383,Groudon\n"
            + "384,Rayquaza\n"
            + "385,Jirachi";
    //endregion
    
    //region EXISTING_SETUP
    private static String EXISTING_SETUP = ""
            + "Venusaur: 95%+, L25+\n"
            + "Charizard: 95%+, L23+\n"
            + "Squirtle: 95%+, L23+\n"
            + "Wartortle: 95%+, L25+\n"
            + "Pikachu: 91%+, L19+\n"
            + "Raichu: 95%+, L23+\n"
            + "Alakazam: 95%+, L25+\n"
            + "Machamp: 91%+, L19+\n"
            + "Golem: 91%+, L25+\n"
            + "Farfetch'd: All\n"
            + "Muk: 95%+, L25+\n"
            + "Haunter: 97%+, L25+\n"
            + "Gengar: 95%+, L25+\n"
            + "Exeggutor: 91%+, L25+\n"
            + "Lickitung: 95%+, L25+\n"
            + "Rhydon: 95%+, L25+\n"
            + "Kangaskhan: All\n"
            + "Mr. Mime: All\n"
            + "Jynx: 95%+, L25+\n"
            + "Gyarados: 87%+, L19+\n"
            + "Lapras: 95%+, L25+\n"
            + "Vaporeon: 89%+, L25+\n"
            + "Jolteon: 89%+, L25+\n"
            + "Flareon: 89%+, L25+\n"
            + "Snorlax: 88%+, L25+\n"
            + "Dragonair: 95%+, L27+\n"
            + "Dragonite: 91%+, L19+\n"
            + "Mewtwo: All\n"
            + "Mew: All\n"
            + "Unown: All\n"
            + "Scizor: 95%+, L25+\n"
            + "Corsola: 90%+, L19+\n"
            + "Donphan: 95%+, L25+\n"
            + "Blissey: 95%+, L19+\n"
            + "Larvitar: 95%+, L25+\n"
            + "Pupitar: 93%+, L25+\n"
            + "Tyranitar: 90%+, L19+\n"
            + "Celebi: All\n"
            + "Sceptile: 95%+, L25+\n"
            + "Blaziken: 95%+, L25+\n"
            + "Swampert: 95%+, L25+\n"
            + "Beautifly: 90%+, L19+\n"
            + "Dustox: 90%+, L19+\n"
            + "Shiftry: 95%+, L25+\n"
            + "Gardevoir: 95%+, L25+\n"
            + "Breloom: 95%+, L25+\n"
            + "Slaking: 90%+, L19+\n"
            + "Hariyama: 95%+, L25+\n"
            + "Mawile: 88%+, L20+\n"
            + "Aggron: 95%+, L25+\n"
            + "Carvanha: 95%+, L21+\n"
            + "Sharpedo: 95%+, L25+\n"
            + "Wailord: All\n"
            + "Trapinch: 90%+, L20+\n"
            + "Vibrava: 90%+, L20+\n"
            + "Flygon: 89%+, L19+\n"
            + "Lunatone: 95%+, L19+\n"
            + "Lileep: 95%+, L19+\n"
            + "Cradily: 91%+, L18+\n"
            + "Milotic: 80%+, L15+\n"
            + "Absol: 70%+, L15+\n"
            + "Glalie: 95%+, L25+\n"
            + "Relicanth: 10%+, L10+";
    //endregion
    
    //region SKIP_SET
    private static Set<String> SKIP_SET = new HashSet<>(
            Arrays.asList("Articuno", "Zapdos", "Moltres",
                    "Smoochum", "Elekid", "Magby",
                    "Raikou", "Entei", "Suicune",
                    "Lugia", "Ho-oh",
                    "Azurill",
                    "Regirock", "Regice", "Registeel",
                    "Latias", "Latios",
                    "Kyogre", "Groudon", "Rayquaza"
            ));
    //endregion
    
    //region UPDATE_PREF
    private static List<Pref> UPDATE_PREF = new ArrayList<Pref>() {{
        add(new Pref(  1, 	 "Bulbasaur", 	 dIV, 	 lvl));
        add(new Pref(  2, 	   "Ivysaur", 	 dIV, 	 lvl));
        add(new Pref(  3, 	  "Venusaur", 	  95, 	  25));
        add(new Pref(  4, 	"Charmander", 	 dIV, 	 lvl));
        add(new Pref(  5, 	"Charmeleon", 	 dIV, 	 lvl));
        add(new Pref(  6, 	 "Charizard", 	  95, 	  23));
        add(new Pref(  7, 	  "Squirtle", 	  95, 	  23));
        add(new Pref(  8, 	 "Wartortle", 	  95, 	  25));
        add(new Pref(  9, 	 "Blastoise", 	  98, 	 lvl));
        add(new Pref( 10, 	  "Caterpie", 	 dIV, 	  34));
        add(new Pref( 11, 	   "Metapod", 	 dIV, 	  34));
        add(new Pref( 12, 	"Butterfree", 	 dIV, 	 lvl));
        add(new Pref( 13, 	    "Weedle", 	 dIV, 	 lvl));
        add(new Pref( 14, 	    "Kakuna", 	 dIV, 	 lvl));
        add(new Pref( 15, 	  "Beedrill", 	 dIV, 	 lvl));
        add(new Pref( 16, 	    "Pidgey", 	 dIV, 	  34));
        add(new Pref( 17, 	 "Pidgeotto", 	 dIV, 	  33));
        add(new Pref( 18, 	   "Pidgeot", 	 dIV, 	  32));
        add(new Pref( 19, 	   "Rattata", 	 dIV, 	  34));
        add(new Pref( 20, 	  "Raticate", 	 dIV, 	  34));
        add(new Pref( 21, 	   "Spearow", 	 dIV, 	  34));
        add(new Pref( 22, 	    "Fearow", 	 dIV, 	  33));
        add(new Pref( 23, 	     "Ekans", 	 dIV, 	  33));
        add(new Pref( 24, 	     "Arbok", 	 dIV, 	  33));
        add(new Pref( 25, 	   "Pikachu", 	  91, 	  19));
        add(new Pref( 26, 	    "Raichu", 	  95, 	  23));
        add(new Pref( 27, 	 "Sandshrew", 	 dIV, 	 lvl));
        add(new Pref( 28, 	 "Sandslash", 	 dIV, 	 lvl));
        add(new Pref( 29, 	  "Nidoran♀", 	 dIV, 	  34));
        add(new Pref( 30, 	  "Nidorina", 	 dIV, 	 lvl));
        add(new Pref( 31, 	 "Nidoqueen", 	 dIV, 	 lvl));
        add(new Pref( 32, 	  "Nidoran♂", 	 dIV, 	  34));
        add(new Pref( 33, 	  "Nidorino", 	 dIV, 	 lvl));
        add(new Pref( 34, 	  "Nidoking", 	 dIV, 	 lvl));
        add(new Pref( 35, 	  "Clefairy", 	 dIV, 	  23));
        add(new Pref( 36, 	  "Clefable", 	 dIV, 	  23));
        add(new Pref( 37, 	    "Vulpix", 	 dIV, 	  33));
        add(new Pref( 38, 	 "Ninetales", 	 dIV, 	 lvl));
        add(new Pref( 39, 	"Jigglypuff", 	 dIV, 	  34));
        add(new Pref( 40, 	"Wigglytuff", 	 dIV, 	  33));
        add(new Pref( 41, 	     "Zubat", 	 dIV, 	  34));
        add(new Pref( 42, 	    "Golbat", 	 dIV, 	  34));
        add(new Pref( 43, 	    "Oddish", 	 dIV, 	  33));
        add(new Pref( 44, 	     "Gloom", 	 dIV, 	 lvl));
        add(new Pref( 45, 	 "Vileplume", 	 dIV, 	 lvl));
        add(new Pref( 46, 	     "Paras", 	 dIV, 	  33));
        add(new Pref( 47, 	  "Parasect", 	 dIV, 	  31));
        add(new Pref( 48, 	   "Venonat", 	 dIV, 	  33));
        add(new Pref( 49, 	  "Venomoth", 	 dIV, 	  31));
        add(new Pref( 50, 	   "Diglett", 	 dIV, 	  31));
        add(new Pref( 51, 	   "Dugtrio", 	 dIV, 	  31));
        add(new Pref( 52, 	    "Meowth", 	 dIV, 	 lvl));
        add(new Pref( 53, 	   "Persian", 	 dIV, 	 lvl));
        add(new Pref( 54, 	   "Psyduck", 	 dIV, 	 lvl));
        add(new Pref( 55, 	   "Golduck", 	 dIV, 	 lvl));
        add(new Pref( 56, 	    "Mankey", 	 dIV, 	 lvl));
        add(new Pref( 57, 	  "Primeape", 	 dIV, 	 lvl));
        add(new Pref( 58, 	 "Growlithe", 	 dIV, 	 lvl));
        add(new Pref( 59, 	  "Arcanine", 	 dIV, 	 lvl));
        add(new Pref( 60, 	   "Poliwag", 	 dIV, 	  27));
        add(new Pref( 61, 	 "Poliwhirl", 	 dIV, 	  25));
        add(new Pref( 62, 	 "Poliwrath", 	 dIV, 	  23));
        add(new Pref( 63, 	      "Abra", 	 dIV, 	 lvl));
        add(new Pref( 64, 	   "Kadabra", 	  95, 	 lvl));
        add(new Pref( 65, 	  "Alakazam", 	  95, 	  25));
        add(new Pref( 66, 	    "Machop", 	 dIV, 	 lvl));
        add(new Pref( 67, 	   "Machoke", 	 dIV, 	 lvl));
        add(new Pref( 68, 	   "Machamp", 	  91, 	  19));
        add(new Pref( 69, 	"Bellsprout", 	 dIV, 	 lvl));
        add(new Pref( 70, 	"Weepinbell", 	 dIV, 	 lvl));
        add(new Pref( 71, 	"Victreebel", 	 dIV, 	 lvl));
        add(new Pref( 72, 	 "Tentacool", 	 dIV, 	 lvl));
        add(new Pref( 73, 	"Tentacruel", 	 dIV, 	 lvl));
        add(new Pref( 74, 	   "Geodude", 	 dIV, 	 lvl));
        add(new Pref( 75, 	  "Graveler", 	 dIV, 	  25));
        add(new Pref( 76, 	     "Golem", 	  91, 	  25));
        add(new Pref( 77, 	    "Ponyta", 	 dIV, 	 lvl));
        add(new Pref( 78, 	  "Rapidash", 	 dIV, 	 lvl));
        add(new Pref( 79, 	  "Slowpoke", 	 dIV, 	 lvl));
        add(new Pref( 80, 	   "Slowbro", 	 dIV, 	 lvl));
        add(new Pref( 81, 	 "Magnemite", 	 dIV, 	 lvl));
        add(new Pref( 82, 	  "Magneton", 	 dIV, 	 lvl));
        add(new Pref( 83, 	"Farfetch'd", 	+ALL, 	+ALL));
        add(new Pref( 84, 	     "Doduo", 	 dIV, 	 lvl));
        add(new Pref( 85, 	    "Dodrio", 	 dIV, 	 lvl));
        add(new Pref( 86, 	      "Seel", 	 dIV, 	 lvl));
        add(new Pref( 87, 	   "Dewgong", 	 dIV, 	 lvl));
        add(new Pref( 88, 	    "Grimer", 	  97, 	 lvl));
        add(new Pref( 89, 	       "Muk", 	  95, 	  25));
        add(new Pref( 90, 	  "Shellder", 	 dIV, 	 lvl));
        add(new Pref( 91, 	  "Cloyster", 	 dIV, 	 lvl));
        add(new Pref( 92, 	    "Gastly", 	 dIV, 	 lvl));
        add(new Pref( 93, 	   "Haunter", 	  97, 	  25));
        add(new Pref( 94, 	    "Gengar", 	  95, 	  25));
        add(new Pref( 95, 	      "Onix", 	 dIV, 	 lvl));
        add(new Pref( 96, 	   "Drowzee", 	 dIV, 	 lvl));
        add(new Pref( 97, 	     "Hypno", 	 dIV, 	  25));
        add(new Pref( 98, 	    "Krabby", 	 dIV, 	 lvl));
        add(new Pref( 99, 	   "Kingler", 	 dIV, 	 lvl));
        add(new Pref(100, 	   "Voltorb", 	 dIV, 	  33));
        add(new Pref(101, 	 "Electrode", 	 dIV, 	  33));
        add(new Pref(102, 	 "Exeggcute", 	 dIV, 	 lvl));
        add(new Pref(103, 	 "Exeggutor", 	  91, 	  25));
        add(new Pref(104, 	    "Cubone", 	 dIV, 	 lvl));
        add(new Pref(105, 	   "Marowak", 	 dIV, 	 lvl));
        add(new Pref(106, 	 "Hitmonlee", 	 dIV, 	  25));
        add(new Pref(107, 	"Hitmonchan", 	 dIV, 	  25));
        add(new Pref(108, 	 "Lickitung", 	  95, 	  25));
        add(new Pref(109, 	   "Koffing", 	 dIV, 	 lvl));
        add(new Pref(110, 	   "Weezing", 	 dIV, 	 lvl));
        add(new Pref(111, 	   "Rhyhorn", 	 dIV, 	 lvl));
        add(new Pref(112, 	    "Rhydon", 	  95, 	  25));
        add(new Pref(113, 	   "Chansey", 	  97, 	 lvl));
        add(new Pref(114, 	   "Tangela", 	 dIV, 	 lvl));
        add(new Pref(115, 	"Kangaskhan", 	+ALL, 	+ALL));
        add(new Pref(116, 	    "Horsea", 	 dIV, 	  33));
        add(new Pref(117, 	    "Seadra", 	 dIV, 	 lvl));
        add(new Pref(118, 	   "Goldeen", 	 dIV, 	  33));
        add(new Pref(119, 	   "Seaking", 	 dIV, 	 lvl));
        add(new Pref(120, 	    "Staryu", 	 dIV, 	  33));
        add(new Pref(121, 	   "Starmie", 	 dIV, 	 lvl));
        add(new Pref(122, 	  "Mr. Mime", 	+ALL, 	+ALL));
        add(new Pref(123, 	   "Scyther", 	 dIV, 	 lvl));
        add(new Pref(124, 	      "Jynx", 	  95, 	  25));
        add(new Pref(125, 	"Electabuzz", 	 dIV, 	 lvl));
        add(new Pref(126, 	    "Magmar", 	 dIV, 	 lvl));
        add(new Pref(127, 	    "Pinsir", 	 dIV, 	 lvl));
        add(new Pref(128, 	    "Tauros", 	 dIV, 	 lvl));
        add(new Pref(129, 	  "Magikarp", 	 dIV, 	 lvl));
        add(new Pref(130, 	  "Gyarados", 	  87, 	  19));
        add(new Pref(131, 	    "Lapras", 	  95, 	  25));
        add(new Pref(132, 	     "Ditto", 	 dIV, 	 lvl));
        add(new Pref(133, 	     "Eevee", 	 dIV, 	 lvl));
        add(new Pref(134, 	  "Vaporeon", 	  89, 	  25));
        add(new Pref(135, 	   "Jolteon", 	  89, 	  25));
        add(new Pref(136, 	   "Flareon", 	  89, 	  25));
        add(new Pref(137, 	   "Porygon", 	 dIV, 	 lvl));
        add(new Pref(138, 	   "Omanyte", 	 dIV, 	 lvl));
        add(new Pref(139, 	   "Omastar", 	 dIV, 	 lvl));
        add(new Pref(140, 	    "Kabuto", 	 dIV, 	 lvl));
        add(new Pref(141, 	  "Kabutops", 	 dIV, 	 lvl));
        add(new Pref(142, 	"Aerodactyl", 	 dIV, 	 lvl));
        add(new Pref(143, 	   "Snorlax", 	  88, 	  25));
        add(new Pref(144, 	  "Articuno", 	skip, 	skip));
        add(new Pref(145, 	    "Zapdos", 	skip, 	skip));
        add(new Pref(146, 	   "Moltres", 	skip, 	skip));
        add(new Pref(147, 	   "Dratini", 	  97, 	 lvl));
        add(new Pref(148, 	 "Dragonair", 	  95, 	  27));
        add(new Pref(149, 	 "Dragonite", 	  91, 	  19));
        add(new Pref(150, 	    "Mewtwo", 	+ALL, 	+ALL));
        add(new Pref(151, 	       "Mew", 	+ALL, 	+ALL));
        add(new Pref(152, 	 "Chikorita", 	 dIV, 	 lvl));
        add(new Pref(153, 	   "Bayleef", 	 dIV, 	 lvl));
        add(new Pref(154, 	  "Meganium", 	 dIV, 	 lvl));
        add(new Pref(155, 	 "Cyndaquil", 	 dIV, 	 lvl));
        add(new Pref(156, 	   "Quilava", 	 dIV, 	 lvl));
        add(new Pref(157, 	"Typhlosion", 	 dIV, 	 lvl));
        add(new Pref(158, 	  "Totodile", 	 dIV, 	 lvl));
        add(new Pref(159, 	  "Croconaw", 	 dIV, 	 lvl));
        add(new Pref(160, 	"Feraligatr", 	 dIV, 	 lvl));
        add(new Pref(161, 	   "Sentret", 	 dIV, 	  33));
        add(new Pref(162, 	    "Furret", 	 dIV, 	 lvl));
        add(new Pref(163, 	  "Hoothoot", 	 dIV, 	  33));
        add(new Pref(164, 	   "Noctowl", 	 dIV, 	 lvl));
        add(new Pref(165, 	    "Ledyba", 	 dIV, 	  34));
        add(new Pref(166, 	    "Ledian", 	 dIV, 	  34));
        add(new Pref(167, 	  "Spinarak", 	 dIV, 	  34));
        add(new Pref(168, 	   "Ariados", 	 dIV, 	  34));
        add(new Pref(169, 	    "Crobat", 	 dIV, 	 lvl));
        add(new Pref(170, 	  "Chinchou", 	 dIV, 	 lvl));
        add(new Pref(171, 	   "Lanturn", 	 dIV, 	 lvl));
        add(new Pref(172, 	     "Pichu", 	 dIV, 	 lvl));
        add(new Pref(173, 	    "Cleffa", 	 dIV, 	 lvl));
        add(new Pref(174, 	 "Igglybuff", 	 dIV, 	 lvl));
        add(new Pref(175, 	    "Togepi", 	 dIV, 	 lvl));
        add(new Pref(176, 	   "Togetic", 	 dIV, 	 lvl));
        add(new Pref(177, 	      "Natu", 	 dIV, 	  33));
        add(new Pref(178, 	      "Xatu", 	 dIV, 	 lvl));
        add(new Pref(179, 	    "Mareep", 	 dIV, 	 lvl));
        add(new Pref(180, 	   "Flaaffy", 	 dIV, 	 lvl));
        add(new Pref(181, 	  "Ampharos", 	 dIV, 	  19));
        add(new Pref(182, 	 "Bellossom", 	 dIV, 	 lvl));
        add(new Pref(183, 	    "Marill", 	 dIV, 	 lvl));
        add(new Pref(184, 	 "Azumarill", 	 dIV, 	 lvl));
        add(new Pref(185, 	 "Sudowoodo", 	 dIV, 	  19));
        add(new Pref(186, 	  "Politoed", 	 dIV, 	 lvl));
        add(new Pref(187, 	    "Hoppip", 	 dIV, 	 lvl));
        add(new Pref(188, 	  "Skiploom", 	 dIV, 	 lvl));
        add(new Pref(189, 	  "Jumpluff", 	 dIV, 	 lvl));
        add(new Pref(190, 	     "Aipom", 	 dIV, 	 lvl));
        add(new Pref(191, 	   "Sunkern", 	 dIV, 	 lvl));
        add(new Pref(192, 	  "Sunflora", 	 dIV, 	 lvl));
        add(new Pref(193, 	     "Yanma", 	 dIV, 	 lvl));
        add(new Pref(194, 	    "Wooper", 	 dIV, 	 lvl));
        add(new Pref(195, 	  "Quagsire", 	 dIV, 	 lvl));
        add(new Pref(196, 	    "Espeon", 	 dIV, 	 lvl));
        add(new Pref(197, 	   "Umbreon", 	 dIV, 	 lvl));
        add(new Pref(198, 	   "Murkrow", 	 dIV, 	 lvl));
        add(new Pref(199, 	  "Slowking", 	 dIV, 	 lvl));
        add(new Pref(200, 	"Misdreavus", 	 dIV, 	 lvl));
        add(new Pref(201, 	     "Unown", 	+ALL, 	+ALL));
        add(new Pref(202, 	 "Wobbuffet", 	 dIV, 	  19));
        add(new Pref(203, 	 "Girafarig", 	 dIV, 	  19));
        add(new Pref(204, 	    "Pineco", 	 dIV, 	 lvl));
        add(new Pref(205, 	"Forretress", 	 dIV, 	 lvl));
        add(new Pref(206, 	 "Dunsparce", 	 dIV, 	  19));
        add(new Pref(207, 	    "Gligar", 	 dIV, 	  19));
        add(new Pref(208, 	   "Steelix", 	 dIV, 	 lvl));
        add(new Pref(209, 	  "Snubbull", 	 dIV, 	 lvl));
        add(new Pref(210, 	  "Granbull", 	 dIV, 	 lvl));
        add(new Pref(211, 	  "Qwilfish", 	 dIV, 	  19));
        add(new Pref(212, 	    "Scizor", 	  95, 	  25));
        add(new Pref(213, 	   "Shuckle", 	 dIV, 	  19));
        add(new Pref(214, 	 "Heracross", 	 dIV, 	 lvl));
        add(new Pref(215, 	   "Sneasel", 	 dIV, 	 lvl));
        add(new Pref(216, 	 "Teddiursa", 	 dIV, 	 lvl));
        add(new Pref(217, 	  "Ursaring", 	 dIV, 	  19));
        add(new Pref(218, 	    "Slugma", 	 dIV, 	 lvl));
        add(new Pref(219, 	  "Magcargo", 	 dIV, 	 lvl));
        add(new Pref(220, 	    "Swinub", 	 dIV, 	 lvl));
        add(new Pref(221, 	 "Piloswine", 	 dIV, 	 lvl));
        add(new Pref(222, 	   "Corsola", 	  90, 	  19));
        add(new Pref(223, 	  "Remoraid", 	 dIV, 	 lvl));
        add(new Pref(224, 	 "Octillery", 	 dIV, 	 lvl));
        add(new Pref(225, 	  "Delibird", 	 dIV, 	  11));
        add(new Pref(226, 	   "Mantine", 	 dIV, 	 lvl));
        add(new Pref(227, 	  "Skarmory", 	 dIV, 	 lvl));
        add(new Pref(228, 	  "Houndour", 	 dIV, 	 lvl));
        add(new Pref(229, 	  "Houndoom", 	 dIV, 	 lvl));
        add(new Pref(230, 	   "Kingdra", 	 dIV, 	 lvl));
        add(new Pref(231, 	    "Phanpy", 	 dIV, 	  25));
        add(new Pref(232, 	   "Donphan", 	  95, 	  25));
        add(new Pref(233, 	  "Porygon2", 	 dIV, 	 lvl));
        add(new Pref(234, 	  "Stantler", 	 dIV, 	 lvl));
        add(new Pref(235, 	  "Smeargle", 	 dIV, 	 lvl));
        add(new Pref(236, 	   "Tyrogue", 	 dIV, 	 lvl));
        add(new Pref(237, 	 "Hitmontop", 	 dIV, 	  19));
        add(new Pref(238, 	  "Smoochum", 	skip, 	skip));
        add(new Pref(239, 	    "Elekid", 	skip, 	skip));
        add(new Pref(240, 	     "Magby", 	skip, 	skip));
        add(new Pref(241, 	   "Miltank", 	 dIV, 	  13));
        add(new Pref(242, 	   "Blissey", 	  95, 	  19));
        add(new Pref(243, 	    "Raikou", 	skip, 	skip));
        add(new Pref(244, 	     "Entei", 	skip, 	skip));
        add(new Pref(245, 	   "Suicune", 	skip, 	skip));
        add(new Pref(246, 	  "Larvitar", 	  95, 	  25));
        add(new Pref(247, 	   "Pupitar", 	  93, 	  25));
        add(new Pref(248, 	 "Tyranitar", 	  90, 	  19));
        add(new Pref(249, 	     "Lugia", 	skip, 	skip));
        add(new Pref(250, 	     "Ho-oh", 	skip, 	skip));
        add(new Pref(251, 	    "Celebi", 	+ALL, 	+ALL));
        add(new Pref(252, 	   "Treecko", 	 dIV, 	 lvl));
        add(new Pref(253, 	   "Grovyle", 	 dIV, 	 lvl));
        add(new Pref(254, 	  "Sceptile", 	  95, 	  25));
        add(new Pref(255, 	   "Torchic", 	 dIV, 	 lvl));
        add(new Pref(256, 	 "Combusken", 	 dIV, 	 lvl));
        add(new Pref(257, 	  "Blaziken", 	  95, 	  25));
        add(new Pref(258, 	    "Mudkip", 	 dIV, 	 lvl));
        add(new Pref(259, 	 "Marshtomp", 	 dIV, 	 lvl));
        add(new Pref(260, 	  "Swampert", 	  95, 	  25));
        add(new Pref(261, 	 "Poochyena", 	 dIV, 	 lvl));
        add(new Pref(262, 	 "Mightyena", 	 dIV, 	 lvl));
        add(new Pref(263, 	 "Zigzagoon", 	 dIV, 	 lvl));
        add(new Pref(264, 	   "Linoone", 	 dIV, 	 lvl));
        add(new Pref(265, 	   "Wurmple", 	 dIV, 	 lvl));
        add(new Pref(266, 	   "Silcoon", 	 dIV, 	 lvl));
        add(new Pref(267, 	 "Beautifly", 	  90, 	  19));
        add(new Pref(268, 	   "Cascoon", 	 dIV, 	 lvl));
        add(new Pref(269, 	    "Dustox", 	  90, 	  19));
        add(new Pref(270, 	     "Lotad", 	 dIV, 	  21));
        add(new Pref(271, 	    "Lombre", 	 dIV, 	  19));
        add(new Pref(272, 	  "Ludicolo", 	 dIV, 	  15));
        add(new Pref(273, 	    "Seedot", 	 dIV, 	 lvl));
        add(new Pref(274, 	   "Nuzleaf", 	 dIV, 	 lvl));
        add(new Pref(275, 	   "Shiftry", 	  95, 	  25));
        add(new Pref(276, 	   "Taillow", 	 dIV, 	 lvl));
        add(new Pref(277, 	   "Swellow", 	 dIV, 	 lvl));
        add(new Pref(278, 	   "Wingull", 	 dIV, 	 lvl));
        add(new Pref(279, 	  "Pelipper", 	 dIV, 	 lvl));
        add(new Pref(280, 	     "Ralts", 	 dIV, 	 lvl));
        add(new Pref(281, 	    "Kirlia", 	 dIV, 	 lvl));
        add(new Pref(282, 	 "Gardevoir", 	  95, 	  25));
        add(new Pref(283, 	   "Surskit", 	 dIV, 	 lvl));
        add(new Pref(284, 	"Masquerain", 	 dIV, 	 lvl));
        add(new Pref(285, 	 "Shroomish", 	 dIV, 	 lvl));
        add(new Pref(286, 	   "Breloom", 	  95, 	  25));
        add(new Pref(287, 	   "Slakoth", 	 dIV, 	 lvl));
        add(new Pref(288, 	  "Vigoroth", 	  97, 	 lvl));
        add(new Pref(289, 	   "Slaking", 	  90, 	  19));
        add(new Pref(290, 	   "Nincada", 	 dIV, 	 lvl));
        add(new Pref(291, 	   "Ninjask", 	 dIV, 	 lvl));
        add(new Pref(292, 	  "Shedinja", 	 dIV, 	 lvl));
        add(new Pref(293, 	   "Whismur", 	 dIV, 	 lvl));
        add(new Pref(294, 	   "Loudred", 	 dIV, 	 lvl));
        add(new Pref(295, 	   "Exploud", 	 dIV, 	 lvl));
        add(new Pref(296, 	  "Makuhita", 	 dIV, 	  33));
        add(new Pref(297, 	  "Hariyama", 	  95, 	  25));
        add(new Pref(298, 	   "Azurill", 	skip, 	skip));
        add(new Pref(299, 	  "Nosepass", 	 dIV, 	  33));
        add(new Pref(300, 	    "Skitty", 	 dIV, 	  33));
        add(new Pref(301, 	  "Delcatty", 	 dIV, 	 lvl));
        add(new Pref(302, 	   "Sableye", 	 dIV, 	 lvl));
        add(new Pref(303, 	    "Mawile", 	  88, 	  20));
        add(new Pref(304, 	      "Aron", 	 dIV, 	 lvl));
        add(new Pref(305, 	    "Lairon", 	 dIV, 	 lvl));
        add(new Pref(306, 	    "Aggron", 	  95, 	  25));
        add(new Pref(307, 	  "Meditite", 	 dIV, 	 lvl));
        add(new Pref(308, 	  "Medicham", 	 dIV, 	 lvl));
        add(new Pref(309, 	 "Electrike", 	 dIV, 	 lvl));
        add(new Pref(310, 	 "Manectric", 	 dIV, 	 lvl));
        add(new Pref(311, 	    "Plusle", 	 dIV, 	 lvl));
        add(new Pref(312, 	     "Minun", 	 dIV, 	 lvl));
        add(new Pref(313, 	   "Volbeat", 	 dIV, 	 lvl));
        add(new Pref(314, 	  "Illumise", 	 dIV, 	 lvl));
        add(new Pref(315, 	   "Roselia", 	 dIV, 	  33));
        add(new Pref(316, 	    "Gulpin", 	 dIV, 	 lvl));
        add(new Pref(317, 	    "Swalot", 	 dIV, 	 lvl));
        add(new Pref(318, 	  "Carvanha", 	  95, 	  21));
        add(new Pref(319, 	  "Sharpedo", 	  95, 	  25));
        add(new Pref(320, 	   "Wailmer", 	 dIV, 	 lvl));
        add(new Pref(321, 	   "Wailord", 	+ALL, 	+ALL));
        add(new Pref(322, 	     "Numel", 	 dIV, 	 lvl));
        add(new Pref(323, 	  "Camerupt", 	 dIV, 	 lvl));
        add(new Pref(324, 	   "Torkoal", 	 dIV, 	 lvl));
        add(new Pref(325, 	    "Spoink", 	 dIV, 	 lvl));
        add(new Pref(326, 	   "Grumpig", 	 dIV, 	 lvl));
        add(new Pref(327, 	    "Spinda", 	 dIV, 	 lvl));
        add(new Pref(328, 	  "Trapinch", 	  90, 	  20));
        add(new Pref(329, 	   "Vibrava", 	  90, 	  20));
        add(new Pref(330, 	    "Flygon", 	  89, 	  19));
        add(new Pref(331, 	    "Cacnea", 	 dIV, 	 lvl));
        add(new Pref(332, 	  "Cacturne", 	 dIV, 	 lvl));
        add(new Pref(333, 	    "Swablu", 	 dIV, 	 lvl));
        add(new Pref(334, 	   "Altaria", 	 dIV, 	 lvl));
        add(new Pref(335, 	  "Zangoose", 	 dIV, 	 lvl));
        add(new Pref(336, 	   "Seviper", 	 dIV, 	  34));
        add(new Pref(337, 	  "Lunatone", 	  95, 	  19));
        add(new Pref(338, 	   "Solrock", 	 dIV, 	  19));
        add(new Pref(339, 	  "Barboach", 	 dIV, 	 lvl));
        add(new Pref(340, 	  "Whiscash", 	 dIV, 	 lvl));
        add(new Pref(341, 	  "Corphish", 	 dIV, 	 lvl));
        add(new Pref(342, 	 "Crawdaunt", 	 dIV, 	  15));
        add(new Pref(343, 	    "Baltoy", 	 dIV, 	  33));
        add(new Pref(344, 	   "Claydol", 	 dIV, 	  15));
        add(new Pref(345, 	    "Lileep", 	  95, 	  19));
        add(new Pref(346, 	   "Cradily", 	  91, 	  18));
        add(new Pref(347, 	   "Anorith", 	 dIV, 	 lvl));
        add(new Pref(348, 	   "Armaldo", 	 dIV, 	 lvl));
        add(new Pref(349, 	    "Feebas", 	 dIV, 	 lvl));
        add(new Pref(350, 	   "Milotic", 	  80, 	  15));
        add(new Pref(351, 	  "Castform", 	 dIV, 	 lvl));
        add(new Pref(352, 	   "Kecleon", 	 dIV, 	 lvl));
        add(new Pref(353, 	   "Shuppet", 	 dIV, 	 lvl));
        add(new Pref(354, 	   "Banette", 	 dIV, 	 lvl));
        add(new Pref(355, 	   "Duskull", 	 dIV, 	 lvl));
        add(new Pref(356, 	  "Dusclops", 	 dIV, 	 lvl));
        add(new Pref(357, 	   "Tropius", 	 dIV, 	 lvl));
        add(new Pref(358, 	  "Chimecho", 	 dIV, 	 lvl));
        add(new Pref(359, 	     "Absol", 	  70, 	  15));
        add(new Pref(360, 	    "Wynaut", 	 dIV, 	 lvl));
        add(new Pref(361, 	   "Snorunt", 	 dIV, 	 lvl));
        add(new Pref(362, 	    "Glalie", 	  95, 	  25));
        add(new Pref(363, 	    "Spheal", 	 dIV, 	 lvl));
        add(new Pref(364, 	    "Sealeo", 	 dIV, 	 lvl));
        add(new Pref(365, 	   "Walrein", 	 dIV, 	 lvl));
        add(new Pref(366, 	  "Clamperl", 	 dIV, 	 lvl));
        add(new Pref(367, 	   "Huntail", 	 dIV, 	 lvl));
        add(new Pref(368, 	  "Gorebyss", 	 dIV, 	 lvl));
        add(new Pref(369, 	 "Relicanth", 	  10, 	  10));
        add(new Pref(370, 	   "Luvdisc", 	 dIV, 	 lvl));
        add(new Pref(371, 	     "Bagon", 	 dIV, 	 lvl));
        add(new Pref(372, 	   "Shelgon", 	 dIV, 	 lvl));
        add(new Pref(373, 	 "Salamence", 	 dIV, 	 lvl));
        add(new Pref(374, 	    "Beldum", 	 dIV, 	 lvl));
        add(new Pref(375, 	    "Metang", 	 dIV, 	 lvl));
        add(new Pref(376, 	 "Metagross", 	 dIV, 	 lvl));
        add(new Pref(377, 	  "Regirock", 	skip, 	skip));
        add(new Pref(378, 	    "Regice", 	skip, 	skip));
        add(new Pref(379, 	 "Registeel", 	skip, 	skip));
        add(new Pref(380, 	    "Latias", 	skip, 	skip));
        add(new Pref(381, 	    "Latios", 	skip, 	skip));
        add(new Pref(382, 	    "Kyogre", 	skip, 	skip));
        add(new Pref(383, 	   "Groudon", 	skip, 	skip));
        add(new Pref(384, 	  "Rayquaza", 	skip, 	skip));
        add(new Pref(385, 	   "Jirachi", 	 dIV, 	 lvl));
    }};
    //endregion
    
    private static class Pref {
        int    pokedex;
        String pokemon;
        int    iv;
        int    level;
        
        Pref(int pokedex, String pokemon, int iv, int level) {
            this.pokedex = pokedex;
            this.pokemon = pokemon;
            this.iv = iv;
            this.level = level;
        }
        
        String getCommand() {
            return pokemon + (
                    (iv == 0 && level == 0) ? "" : " " + iv + " L" + level);
        }
        
    }
    
    private static final int skip = -1;
    private static final int ALL  = 0;
    private static final int dIV  = 99;
    private static final int lvl  = 29;
    
    public static void main(String[] args) {
        //printSkipSet(UPDATE_PREF);
        printPrefInitForm();
        //printCommand();
        //printAddToList(UPDATE_PREF);
    }
    
    //region METHODS
    
    private static void printPrefInitForm() {
        Map<String, Pref> map = new HashMap<>();
        initMap(map);
        interpretCurrentPref(map);
        List<Pref> list = map.values().stream()
                .sorted(Comparator.comparingInt(o -> o.pokedex))
                .collect(Collectors.toList());
        printAddToList(list);
    }
    
    private static void initMap(Map<String, Pref> map) {
        System.err.println("Initializing...");
        String[] pokedexLines = POKEDEX.split("\n");
        for (String pokedexLine : pokedexLines) {
            String[] split = pokedexLine.split(",");
            if (split.length == 2) {
                int pokedex = Integer.parseInt(split[0].trim());
                String pokemon = split[1].trim();
                if (SKIP_SET.contains(pokemon)) {
                    map.put(pokemon, new Pref(pokedex, pokemon, skip, skip));
                } else {
                    map.put(pokemon, new Pref(pokedex, pokemon, dIV, lvl));
                }
            } else {
                System.err.println("ERR in " + pokedexLine);
            }
        }
    }
    
    private static void interpretCurrentPref(Map<String, Pref> map) {
        System.err.println("Interpreting...");
        String[] setupLines = EXISTING_SETUP.split("\n");
        for (String setupLine : setupLines) {
            String[] split = setupLine.split(":");
            if (split.length == 2) {
                String pokemon = split[0].trim();
                Pref pref = map.get(pokemon);
                if (pref == null) {
                    System.err.println(pokemon + " not found in Pokedex");
                } else {
                    if (split[1].contains("All") || split[1].contains("all")) {
                        pref.iv = 0;
                        pref.level = 0;
                        map.put(pref.pokemon, pref);
                    } else {
                        String[] ivl = split[1].split(",");
                        if (ivl.length != 2) {
                            System.err.println("Bad IV/Level in " + pokemon);
                        } else {
                            String ivStr = ivl[0].trim().replace("%", "").replace("+", "");
                            pref.iv = Integer.parseInt(ivStr);
                            String lvlStr = ivl[1].trim().replace("L", "").replace("+", "");
                            pref.level = Integer.parseInt(lvlStr);
                            map.put(pref.pokemon, pref);
                        }
                    }
                }
            }
        }
    }
    
    private static void printAddToList(List<Pref> list) {
        for (Pref pref : list) {
            System.out.println(
                    String.format("add(new Pref(%3d, \t%12s, \t%4s, \t%4s));"
                            , pref.pokedex
                            , "\"" + pref.pokemon + "\""
                            , wrap(pref.iv, dIV, "dIV")
                            , wrap(pref.level, lvl, "lvl")));
        }
    }
    
    private static String wrap(int i, int def, String defString) {
        if (i == def) {
            return defString;
        }
        switch (i) {
            case skip:
                return "skip";
            case ALL:
                return "+ALL";
            default:
                return String.valueOf(i);
        }
    }
    
    private static void printSkipSet(List<Pref> prefs) {
        List<String> skips = new ArrayList<>();
        for (Pref pref : prefs) {
            if (pref.iv == skip || pref.level == skip) {
                skips.add("\"" + pref.pokemon + "\"");
            }
        }
        System.out.println(skips.stream().collect(Collectors.joining(",")));
    }
    
    private static void printCommand() {
        System.out.println(prepareCommand(UPDATE_PREF));
    }
    
    private static String prepareCommand(List<Pref> prefs) {
        List<String> pokemonSetCommands = new ArrayList<>();
        int countSpecials = 0;
        for (Pref pref : prefs) {
            if (pref.iv != dIV && pref.level != lvl && pref.iv != -1) {
                countSpecials++;
                pokemonSetCommands.add(pref.getCommand());
            }
        }
        System.err.println("Specially set:" + countSpecials);
        return "!delete all\n"
                + "!set " + dIV + " L" + lvl + "\n"
                + "!set " + pokemonSetCommands.stream().collect(Collectors.joining(", "));
    }
    //endregion
}
