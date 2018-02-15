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
            + "Rattata: =100%, L35+\n"
            + "Vulpix: 96%+, L20+\n"
            + "Jigglypuff: 96%+, L20+\n"
            + "Abra: 96%+, L25+\n"
            + "Machop: 96%+, L20+\n"
            + "Machoke: 90%+\n"
            + "Machamp: All\n"
            + "Bellsprout: 98%+, L30+\n"
            + "Weepinbell: 93%+, L20+\n"
            + "Geodude: 93%+, L25+\n"
            + "Golem: 95%+, L25+\n"
            + "Slowpoke: 96%+, L20+\n"
            + "Farfetch'd: 90%+\n"
            + "Gastly: 96%+, L30+\n"
            + "Haunter: 98%+, L30+\n"
            + "Gengar: 96%+\n"
            + "Onix: 90%+\n"
            + "Hypno: =100%\n"
            + "Exeggcute: 96%+, L30+\n"
            + "Rhyhorn: 93%+, L15+\n"
            + "Chansey: All\n"
            + "Horsea: 96%+, L20+\n"
            + "Scyther: 93%+, L18+\n"
            + "Jynx: 96%+, L20+\n"
            + "Magikarp: 96%+, L20+\n"
            + "Lapras: 90%+\n"
            + "Eevee: 96%+, L20+\n"
            + "Omanyte: 93%+, L15+\n"
            + "Omastar: 90%+, L15+\n"
            + "Dratini: 93%+\n"
            + "Dragonair: 93%+\n"
            + "Dragonite: All\n"
            + "Chikorita: 96%+, L20+\n"
            + "Mareep: 90%+, L20+\n"
            + "Ampharos: 90%+, L20+\n"
            + "Azumarill: 96%+, L20+\n"
            + "Sunkern: 97%+, L30+\n"
            + "Yanma: 95%+, L20+\n"
            + "Murkrow: =100%, L35+\n"
            + "Unown: All\n"
            + "Wobbuffet: 90%+, L18+\n"
            + "Teddiursa: 90%+, L25+\n"
            + "Delibird: 96%+\n"
            + "Blissey: All\n"
            + "Larvitar: 90%+\n"
            + "Pupitar: 90%+, L19+\n"
            + "Treecko: 96%+, L20+\n"
            + "Sceptile: 80%+\n"
            + "Torchic: 95%+, L20+\n"
            + "Mudkip: 93%+, L20+\n"
            + "Poochyena: 96%+, L20+\n"
            + "Zigzagoon: =100%, L30+\n"
            + "Linoone: 93%+, L25+\n"
            + "Wurmple: 98%+, L20+\n"
            + "Lotad: 96%+, L20+\n"
            + "Lombre: 95%+, L20+\n"
            + "Seedot: 96%+, L18+\n"
            + "Ralts: 96%+, L25+\n"
            + "Shroomish: 93%+\n"
            + "Breloom: 93%+\n"
            + "Slakoth: 96%+, L20+\n"
            + "Loudred: =100%, L30+\n"
            + "Makuhita: 95%+, L20+\n"
            + "Hariyama: 90%+\n"
            + "Nosepass: 93%+, L20+\n"
            + "Delcatty: 93%+\n"
            + "Sableye: 95%+\n"
            + "Aron: 93%+, L20+\n"
            + "Aggron: 95%+, L20+\n"
            + "Meditite: 98%+, L20+\n"
            + "Electrike: 95%+, L25+\n"
            + "Plusle: =100%, L20+\n"
            + "Roselia: 96%+, L20+\n"
            + "Gulpin: 98%+, L20+\n"
            + "Carvanha: 95%+, L20+\n"
            + "Wailmer: 90%+\n"
            + "Numel: 98%+, L25+\n"
            + "Torkoal: 90%+, L20+\n"
            + "Trapinch: 95%+, L19+\n"
            + "Cacnea: 96%+, L20+\n"
            + "Cacturne: 95%+, L20+\n"
            + "Zangoose: 90%+\n"
            + "Seviper: 96%+, L24+\n"
            + "Lunatone: 90%+, L20+\n"
            + "Solrock: 93%+\n"
            + "Barboach: 93%+, L25+\n"
            + "Whiscash: 93%+\n"
            + "Corphish: 96%+, L25+\n"
            + "Crawdaunt: 90%+\n"
            + "Baltoy: 98%+, L30+\n"
            + "Claydol: 93%+, L20+\n"
            + "Lileep: 96%+, L20+\n"
            + "Cradily: 95%+, L20+\n"
            + "Anorith: 96%+, L20+\n"
            + "Feebas: 90%+\n"
            + "Shuppet: 98%+, L20+\n"
            + "Duskull: 96%+, L20+\n"
            + "Snorunt: 93%+, L20+";
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
        add(new Pref(  1, 	 "Bulbasaur", 	 95, 	 24));
        add(new Pref(  2, 	   "Ivysaur", 	 95, 	 24));
        add(new Pref(  3, 	  "Venusaur", 	 90, 	 24));
        add(new Pref(  4, 	"Charmander", 	 93, 	 20));
        add(new Pref(  5, 	"Charmeleon", 	 93, 	 20));
        add(new Pref(  6, 	 "Charizard", 	 93, 	 15));
        add(new Pref(  7, 	  "Squirtle", 	 100, 	 20));
        add(new Pref(  8, 	 "Wartortle", 	 100, 	 20));
        add(new Pref(  9, 	 "Blastoise", 	 95, 	 20));
        add(new Pref( 10, 	  "Caterpie", 	 dIV, 	 lvl));
        add(new Pref( 11, 	   "Metapod", 	 dIV, 	 lvl));
        add(new Pref( 12, 	"Butterfree", 	 dIV, 	 lvl));
        add(new Pref( 13, 	    "Weedle", 	 dIV, 	 lvl));
        add(new Pref( 14, 	    "Kakuna", 	 dIV, 	 lvl));
        add(new Pref( 15, 	  "Beedrill", 	 dIV, 	 lvl));
        add(new Pref( 16, 	    "Pidgey", 	 dIV, 	 lvl));
        add(new Pref( 17, 	 "Pidgeotto", 	 dIV, 	 lvl));
        add(new Pref( 18, 	   "Pidgeot", 	 dIV, 	 lvl));
        add(new Pref( 19, 	   "Rattata", 	 100, 	  35));
        add(new Pref( 20, 	  "Raticate", 	 dIV, 	 lvl));
        add(new Pref( 21, 	   "Spearow", 	 dIV, 	 lvl));
        add(new Pref( 22, 	    "Fearow", 	 dIV, 	 lvl));
        add(new Pref( 23, 	     "Ekans", 	 dIV, 	 lvl));
        add(new Pref( 24, 	     "Arbok", 	 dIV, 	 lvl));
        add(new Pref( 25, 	   "Pikachu", 	 95, 	 25));
        add(new Pref( 26, 	    "Raichu", 	 dIV, 	 lvl));
        add(new Pref( 27, 	 "Sandshrew", 	 95, 	 28));
        add(new Pref( 28, 	 "Sandslash", 	 95, 	 25));
        add(new Pref( 29, 	  "Nidoran♀", 	 dIV, 	 lvl));
        add(new Pref( 30, 	  "Nidorina", 	 dIV, 	 lvl));
        add(new Pref( 31, 	 "Nidoqueen", 	 dIV, 	 lvl));
        add(new Pref( 32, 	  "Nidoran♂", 	 dIV, 	 lvl));
        add(new Pref( 33, 	  "Nidorino", 	 dIV, 	 lvl));
        add(new Pref( 34, 	  "Nidoking", 	 dIV, 	 lvl));
        add(new Pref( 35, 	  "Clefairy", 	 dIV, 	 lvl));
        add(new Pref( 36, 	  "Clefable", 	 dIV, 	 lvl));
        add(new Pref( 37, 	    "Vulpix", 	  98, 	  20));
        add(new Pref( 38, 	 "Ninetales", 	  95, 	  25));
        add(new Pref( 39, 	"Jigglypuff", 	  96, 	  20));
        add(new Pref( 40, 	"Wigglytuff", 	 dIV, 	 lvl));
        add(new Pref( 41, 	     "Zubat", 	 dIV, 	 lvl));
        add(new Pref( 42, 	    "Golbat", 	 dIV, 	 lvl));
        add(new Pref( 43, 	    "Oddish", 	 100, 	 29));
        add(new Pref( 44, 	     "Gloom", 	 100, 	 25));
        add(new Pref( 45, 	 "Vileplume", 	  98, 	 25));
        add(new Pref( 46, 	     "Paras", 	 100, 	 29));
        add(new Pref( 47, 	  "Parasect", 	 dIV, 	 lvl));
        add(new Pref( 48, 	   "Venonat", 	 100, 	 29));
        add(new Pref( 49, 	  "Venomoth", 	 dIV, 	 lvl));
        add(new Pref( 50, 	   "Diglett", 	 100, 	 24));
        add(new Pref( 51, 	   "Dugtrio", 	 dIV, 	 lvl));
        add(new Pref( 52, 	    "Meowth", 	 100, 	 29));
        add(new Pref( 53, 	   "Persian", 	 dIV, 	 lvl));
        add(new Pref( 54, 	   "Psyduck", 	 100, 	 29));
        add(new Pref( 55, 	   "Golduck", 	 dIV, 	 lvl));
        add(new Pref( 56, 	    "Mankey", 	 100, 	 29));
        add(new Pref( 57, 	  "Primeape", 	 dIV, 	 lvl));
        add(new Pref( 58, 	 "Growlithe", 	 100, 	 29));
        add(new Pref( 59, 	  "Arcanine", 	 dIV, 	 lvl));
        add(new Pref( 60, 	   "Poliwag", 	 dIV, 	 lvl));
        add(new Pref( 61, 	 "Poliwhirl", 	 dIV, 	 lvl));
        add(new Pref( 62, 	 "Poliwrath", 	 dIV, 	 lvl));
        add(new Pref( 63, 	      "Abra", 	  96, 	  25));
        add(new Pref( 64, 	   "Kadabra", 	  95, 	  25));
        add(new Pref( 65, 	  "Alakazam", 	  95,     25));
        add(new Pref( 66, 	    "Machop", 	  96, 	  20));
        add(new Pref( 67, 	   "Machoke", 	  95,     20));
        add(new Pref( 68, 	   "Machamp", 	+ALL, 	+ALL));
        add(new Pref( 69, 	"Bellsprout", 	  98, 	  30));
        add(new Pref( 70, 	"Weepinbell", 	  93, 	  20));
        add(new Pref( 71, 	"Victreebel", 	 dIV, 	 lvl));
        add(new Pref( 72, 	 "Tentacool", 	 dIV, 	 lvl));
        add(new Pref( 73, 	"Tentacruel", 	 dIV, 	 lvl));
        add(new Pref( 74, 	   "Geodude", 	  95, 	  25));
        add(new Pref( 75, 	  "Graveler", 	  95, 	  25));
        add(new Pref( 76, 	     "Golem", 	  95, 	  25));
        add(new Pref( 77, 	    "Ponyta", 	 100, 	  25));
        add(new Pref( 78, 	  "Rapidash", 	  95, 	  20));
        add(new Pref( 79, 	  "Slowpoke", 	  96, 	  20));
        add(new Pref( 80, 	   "Slowbro", 	 dIV, 	 lvl));
        add(new Pref( 81, 	 "Magnemite", 	 100, 	  25));
        add(new Pref( 82, 	  "Magneton", 	 100,  	  25));
        add(new Pref( 83, 	"Farfetch'd", 	 dIV, 	 lvl));
        add(new Pref( 84, 	     "Doduo", 	 dIV, 	 lvl));
        add(new Pref( 85, 	    "Dodrio", 	 dIV, 	 lvl));
        add(new Pref( 86, 	      "Seel", 	 100, 	  25));
        add(new Pref( 87, 	   "Dewgong", 	 100, 	  25));
        add(new Pref( 88, 	    "Grimer", 	 dIV, 	 lvl));
        add(new Pref( 89, 	       "Muk", 	 dIV, 	 lvl));
        add(new Pref( 90, 	  "Shellder", 	 100, 	  30));
        add(new Pref( 91, 	  "Cloyster", 	 100, 	  25));
        add(new Pref( 92, 	    "Gastly", 	  96, 	  30));
        add(new Pref( 93, 	   "Haunter", 	  98, 	  30));
        add(new Pref( 94, 	    "Gengar", 	  98, 	  25));
        add(new Pref( 95, 	      "Onix", 	  90, 	  20));
        add(new Pref( 96, 	   "Drowzee", 	 100, 	  25));
        add(new Pref( 97, 	     "Hypno", 	 dIV, 	 lvl));
        add(new Pref( 98, 	    "Krabby", 	 dIV, 	 lvl));
        add(new Pref( 99, 	   "Kingler", 	 100, 	  29));
        add(new Pref(100, 	   "Voltorb", 	 100, 	  25));
        add(new Pref(101, 	 "Electrode", 	 100, 	  25));
        add(new Pref(102, 	 "Exeggcute", 	  96, 	  30));
        add(new Pref(103, 	 "Exeggutor", 	 dIV, 	 lvl));
        add(new Pref(104, 	    "Cubone", 	 dIV, 	 lvl));
        add(new Pref(105, 	   "Marowak", 	 dIV, 	 lvl));
        add(new Pref(106, 	 "Hitmonlee", 	  95, 	  25));
        add(new Pref(107, 	"Hitmonchan", 	  95,  	  25));
        add(new Pref(108, 	 "Lickitung", 	  95, 	  29));
        add(new Pref(109, 	   "Koffing", 	 100, 	  28));
        add(new Pref(110, 	   "Weezing", 	 dIV, 	 lvl));
        add(new Pref(111, 	   "Rhyhorn", 	  93, 	  25));
        add(new Pref(112, 	    "Rhydon", 	  95, 	  29));
        add(new Pref(113, 	   "Chansey", 	+ALL, 	+ALL));
        add(new Pref(114, 	   "Tangela", 	 100, 	  29));
        add(new Pref(115, 	"Kangaskhan", 	 dIV, 	 lvl));
        add(new Pref(116, 	    "Horsea", 	  96, 	  20));
        add(new Pref(117, 	    "Seadra", 	 dIV, 	 lvl));
        add(new Pref(118, 	   "Goldeen", 	 dIV, 	 lvl));
        add(new Pref(119, 	   "Seaking", 	 dIV, 	 lvl));
        add(new Pref(120, 	    "Staryu", 	 dIV, 	 lvl));
        add(new Pref(121, 	   "Starmie", 	 dIV, 	 lvl));
        add(new Pref(122, 	  "Mr. Mime", 	 dIV, 	 lvl));
        add(new Pref(123, 	   "Scyther", 	  93, 	  18));
        add(new Pref(124, 	      "Jynx", 	  95, 	  20));
        add(new Pref(125, 	"Electabuzz", 	  95, 	  29));
        add(new Pref(126, 	    "Magmar", 	 100, 	  25));
        add(new Pref(127, 	    "Pinsir", 	  95, 	  25));
        add(new Pref(128, 	    "Tauros", 	 100, 	  28));
        add(new Pref(129, 	  "Magikarp", 	  96, 	  20));
        add(new Pref(130, 	  "Gyarados", 	  85, 	  25));
        add(new Pref(131, 	    "Lapras", 	  90, 	  20));
        add(new Pref(132, 	     "Ditto", 	 dIV, 	 lvl));
        add(new Pref(133, 	     "Eevee", 	  96, 	  20));
        add(new Pref(134, 	  "Vaporeon", 	  95, 	  20));
        add(new Pref(135, 	   "Jolteon", 	  95, 	  20));
        add(new Pref(136, 	   "Flareon", 	  95, 	  20));
        add(new Pref(137, 	   "Porygon", 	  100, 	  25));
        add(new Pref(138, 	   "Omanyte", 	  93, 	  15));
        add(new Pref(139, 	   "Omastar", 	  90, 	  15));
        add(new Pref(140, 	    "Kabuto", 	 dIV, 	 lvl));
        add(new Pref(141, 	  "Kabutops", 	 dIV, 	 lvl));
        add(new Pref(142, 	"Aerodactyl", 	 dIV, 	 lvl));
        add(new Pref(143, 	   "Snorlax", 	 dIV, 	 lvl));
        add(new Pref(144, 	  "Articuno", 	skip, 	skip));
        add(new Pref(145, 	    "Zapdos", 	skip, 	skip));
        add(new Pref(146, 	   "Moltres", 	skip, 	skip));
        add(new Pref(147, 	   "Dratini", 	 dIV, 	 lvl));
        add(new Pref(148, 	 "Dragonair", 	 dIV, 	 lvl));
        add(new Pref(149, 	 "Dragonite", 	+ALL, 	+ALL));
        add(new Pref(150, 	    "Mewtwo", 	 dIV, 	 lvl));
        add(new Pref(151, 	       "Mew", 	 dIV, 	 lvl));
        add(new Pref(152, 	 "Chikorita", 	  96, 	  20));
        add(new Pref(153, 	   "Bayleef", 	 dIV, 	 lvl));
        add(new Pref(154, 	  "Meganium", 	 dIV, 	 lvl));
        add(new Pref(155, 	 "Cyndaquil", 	 dIV, 	 lvl));
        add(new Pref(156, 	   "Quilava", 	 dIV, 	 lvl));
        add(new Pref(157, 	"Typhlosion", 	 dIV, 	 lvl));
        add(new Pref(158, 	  "Totodile", 	 dIV, 	 lvl));
        add(new Pref(159, 	  "Croconaw", 	 dIV, 	 lvl));
        add(new Pref(160, 	"Feraligatr", 	 dIV, 	 lvl));
        add(new Pref(161, 	   "Sentret", 	 dIV, 	 lvl));
        add(new Pref(162, 	    "Furret", 	 dIV, 	 lvl));
        add(new Pref(163, 	  "Hoothoot", 	 dIV, 	 lvl));
        add(new Pref(164, 	   "Noctowl", 	 dIV, 	 lvl));
        add(new Pref(165, 	    "Ledyba", 	 dIV, 	 lvl));
        add(new Pref(166, 	    "Ledian", 	 dIV, 	 lvl));
        add(new Pref(167, 	  "Spinarak", 	 dIV, 	 lvl));
        add(new Pref(168, 	   "Ariados", 	 dIV, 	 lvl));
        add(new Pref(169, 	    "Crobat", 	 dIV, 	 lvl));
        add(new Pref(170, 	  "Chinchou", 	 dIV, 	 lvl));
        add(new Pref(171, 	   "Lanturn", 	 dIV, 	 lvl));
        add(new Pref(172, 	     "Pichu", 	 dIV, 	 lvl));
        add(new Pref(173, 	    "Cleffa", 	 dIV, 	 lvl));
        add(new Pref(174, 	 "Igglybuff", 	 dIV, 	 lvl));
        add(new Pref(175, 	    "Togepi", 	 dIV, 	 lvl));
        add(new Pref(176, 	   "Togetic", 	 dIV, 	 lvl));
        add(new Pref(177, 	      "Natu", 	 dIV, 	 lvl));
        add(new Pref(178, 	      "Xatu", 	 dIV, 	 lvl));
        add(new Pref(179, 	    "Mareep", 	  90, 	  20));
        add(new Pref(180, 	   "Flaaffy", 	 dIV, 	 lvl));
        add(new Pref(181, 	  "Ampharos", 	  90, 	  20));
        add(new Pref(182, 	 "Bellossom", 	 dIV, 	 lvl));
        add(new Pref(183, 	    "Marill", 	 dIV, 	 lvl));
        add(new Pref(184, 	 "Azumarill", 	  96, 	  20));
        add(new Pref(185, 	 "Sudowoodo", 	 dIV, 	 lvl));
        add(new Pref(186, 	  "Politoed", 	 dIV, 	 lvl));
        add(new Pref(187, 	    "Hoppip", 	 dIV, 	 lvl));
        add(new Pref(188, 	  "Skiploom", 	 dIV, 	 lvl));
        add(new Pref(189, 	  "Jumpluff", 	 dIV, 	 lvl));
        add(new Pref(190, 	     "Aipom", 	 dIV, 	 lvl));
        add(new Pref(191, 	   "Sunkern", 	  97, 	  30));
        add(new Pref(192, 	  "Sunflora", 	 dIV, 	 lvl));
        add(new Pref(193, 	     "Yanma", 	  95, 	  20));
        add(new Pref(194, 	    "Wooper", 	 dIV, 	 lvl));
        add(new Pref(195, 	  "Quagsire", 	 dIV, 	 lvl));
        add(new Pref(196, 	    "Espeon", 	 dIV, 	 lvl));
        add(new Pref(197, 	   "Umbreon", 	 dIV, 	 lvl));
        add(new Pref(198, 	   "Murkrow", 	 100, 	  35));
        add(new Pref(199, 	  "Slowking", 	 dIV, 	 lvl));
        add(new Pref(200, 	"Misdreavus", 	 dIV, 	 lvl));
        add(new Pref(201, 	     "Unown", 	+ALL, 	+ALL));
        add(new Pref(202, 	 "Wobbuffet", 	  90, 	  18));
        add(new Pref(203, 	 "Girafarig", 	 dIV, 	 lvl));
        add(new Pref(204, 	    "Pineco", 	 dIV, 	 lvl));
        add(new Pref(205, 	"Forretress", 	 dIV, 	 lvl));
        add(new Pref(206, 	 "Dunsparce", 	 dIV, 	 lvl));
        add(new Pref(207, 	    "Gligar", 	 dIV, 	 lvl));
        add(new Pref(208, 	   "Steelix", 	 dIV, 	 lvl));
        add(new Pref(209, 	  "Snubbull", 	 dIV, 	 lvl));
        add(new Pref(210, 	  "Granbull", 	 dIV, 	 lvl));
        add(new Pref(211, 	  "Qwilfish", 	 dIV, 	 lvl));
        add(new Pref(212, 	    "Scizor", 	 dIV, 	 lvl));
        add(new Pref(213, 	   "Shuckle", 	 dIV, 	 lvl));
        add(new Pref(214, 	 "Heracross", 	 dIV, 	 lvl));
        add(new Pref(215, 	   "Sneasel", 	 dIV, 	 lvl));
        add(new Pref(216, 	 "Teddiursa", 	  90, 	  25));
        add(new Pref(217, 	  "Ursaring", 	 dIV, 	 lvl));
        add(new Pref(218, 	    "Slugma", 	 dIV, 	 lvl));
        add(new Pref(219, 	  "Magcargo", 	 dIV, 	 lvl));
        add(new Pref(220, 	    "Swinub", 	 dIV, 	 lvl));
        add(new Pref(221, 	 "Piloswine", 	 dIV, 	 lvl));
        add(new Pref(222, 	   "Corsola", 	 dIV, 	 lvl));
        add(new Pref(223, 	  "Remoraid", 	 dIV, 	 lvl));
        add(new Pref(224, 	 "Octillery", 	 dIV, 	 lvl));
        add(new Pref(225, 	  "Delibird", 	 dIV, 	 lvl));
        add(new Pref(226, 	   "Mantine", 	 dIV, 	 lvl));
        add(new Pref(227, 	  "Skarmory", 	 dIV, 	 lvl));
        add(new Pref(228, 	  "Houndour", 	 dIV, 	 lvl));
        add(new Pref(229, 	  "Houndoom", 	 dIV, 	 lvl));
        add(new Pref(230, 	   "Kingdra", 	 dIV, 	 lvl));
        add(new Pref(231, 	    "Phanpy", 	 dIV, 	 lvl));
        add(new Pref(232, 	   "Donphan", 	 dIV, 	 lvl));
        add(new Pref(233, 	  "Porygon2", 	 dIV, 	 lvl));
        add(new Pref(234, 	  "Stantler", 	 dIV, 	 lvl));
        add(new Pref(235, 	  "Smeargle", 	 dIV, 	 lvl));
        add(new Pref(236, 	   "Tyrogue", 	 dIV, 	 lvl));
        add(new Pref(237, 	 "Hitmontop", 	 dIV, 	 lvl));
        add(new Pref(238, 	  "Smoochum", 	skip, 	skip));
        add(new Pref(239, 	    "Elekid", 	skip, 	skip));
        add(new Pref(240, 	     "Magby", 	skip, 	skip));
        add(new Pref(241, 	   "Miltank", 	 dIV, 	 lvl));
        add(new Pref(242, 	   "Blissey", 	+ALL, 	+ALL));
        add(new Pref(243, 	    "Raikou", 	skip, 	skip));
        add(new Pref(244, 	     "Entei", 	skip, 	skip));
        add(new Pref(245, 	   "Suicune", 	skip, 	skip));
        add(new Pref(246, 	  "Larvitar", 	 dIV, 	 lvl));
        add(new Pref(247, 	   "Pupitar", 	  90, 	  19));
        add(new Pref(248, 	 "Tyranitar", 	 dIV, 	 lvl));
        add(new Pref(249, 	     "Lugia", 	skip, 	skip));
        add(new Pref(250, 	     "Ho-oh", 	skip, 	skip));
        add(new Pref(251, 	    "Celebi", 	 dIV, 	 lvl));
        add(new Pref(252, 	   "Treecko", 	  96, 	  20));
        add(new Pref(253, 	   "Grovyle", 	 dIV, 	 lvl));
        add(new Pref(254, 	  "Sceptile", 	 dIV, 	 lvl));
        add(new Pref(255, 	   "Torchic", 	  95, 	  20));
        add(new Pref(256, 	 "Combusken", 	 dIV, 	 lvl));
        add(new Pref(257, 	  "Blaziken", 	 dIV, 	 lvl));
        add(new Pref(258, 	    "Mudkip", 	  93, 	  20));
        add(new Pref(259, 	 "Marshtomp", 	 dIV, 	 lvl));
        add(new Pref(260, 	  "Swampert", 	 dIV, 	 lvl));
        add(new Pref(261, 	 "Poochyena", 	  96, 	  20));
        add(new Pref(262, 	 "Mightyena", 	 dIV, 	 lvl));
        add(new Pref(263, 	 "Zigzagoon", 	 100, 	  30));
        add(new Pref(264, 	   "Linoone", 	  93, 	  25));
        add(new Pref(265, 	   "Wurmple", 	  98, 	  20));
        add(new Pref(266, 	   "Silcoon", 	 dIV, 	 lvl));
        add(new Pref(267, 	 "Beautifly", 	 dIV, 	 lvl));
        add(new Pref(268, 	   "Cascoon", 	 dIV, 	 lvl));
        add(new Pref(269, 	    "Dustox", 	 dIV, 	 lvl));
        add(new Pref(270, 	     "Lotad", 	  96, 	  20));
        add(new Pref(271, 	    "Lombre", 	  95, 	  20));
        add(new Pref(272, 	  "Ludicolo", 	 dIV, 	 lvl));
        add(new Pref(273, 	    "Seedot", 	  96, 	  18));
        add(new Pref(274, 	   "Nuzleaf", 	 dIV, 	 lvl));
        add(new Pref(275, 	   "Shiftry", 	 dIV, 	 lvl));
        add(new Pref(276, 	   "Taillow", 	 dIV, 	 lvl));
        add(new Pref(277, 	   "Swellow", 	 dIV, 	 lvl));
        add(new Pref(278, 	   "Wingull", 	 dIV, 	 lvl));
        add(new Pref(279, 	  "Pelipper", 	 dIV, 	 lvl));
        add(new Pref(280, 	     "Ralts", 	  96, 	  25));
        add(new Pref(281, 	    "Kirlia", 	 dIV, 	 lvl));
        add(new Pref(282, 	 "Gardevoir", 	 dIV, 	 lvl));
        add(new Pref(283, 	   "Surskit", 	 dIV, 	 lvl));
        add(new Pref(284, 	"Masquerain", 	 dIV, 	 lvl));
        add(new Pref(285, 	 "Shroomish", 	 dIV, 	 lvl));
        add(new Pref(286, 	   "Breloom", 	 dIV, 	 lvl));
        add(new Pref(287, 	   "Slakoth", 	  96, 	  20));
        add(new Pref(288, 	  "Vigoroth", 	 dIV, 	 lvl));
        add(new Pref(289, 	   "Slaking", 	 dIV, 	 lvl));
        add(new Pref(290, 	   "Nincada", 	 dIV, 	 lvl));
        add(new Pref(291, 	   "Ninjask", 	 dIV, 	 lvl));
        add(new Pref(292, 	  "Shedinja", 	 dIV, 	 lvl));
        add(new Pref(293, 	   "Whismur", 	 dIV, 	 lvl));
        add(new Pref(294, 	   "Loudred", 	 100, 	  30));
        add(new Pref(295, 	   "Exploud", 	 dIV, 	 lvl));
        add(new Pref(296, 	  "Makuhita", 	  95, 	  20));
        add(new Pref(297, 	  "Hariyama", 	 dIV, 	 lvl));
        add(new Pref(298, 	   "Azurill", 	skip, 	skip));
        add(new Pref(299, 	  "Nosepass", 	  93, 	  20));
        add(new Pref(300, 	    "Skitty", 	 dIV, 	 lvl));
        add(new Pref(301, 	  "Delcatty", 	 dIV, 	 lvl));
        add(new Pref(302, 	   "Sableye", 	 dIV, 	 lvl));
        add(new Pref(303, 	    "Mawile", 	 dIV, 	 lvl));
        add(new Pref(304, 	      "Aron", 	  93, 	  20));
        add(new Pref(305, 	    "Lairon", 	 dIV, 	 lvl));
        add(new Pref(306, 	    "Aggron", 	  95, 	  20));
        add(new Pref(307, 	  "Meditite", 	  98, 	  20));
        add(new Pref(308, 	  "Medicham", 	 dIV, 	 lvl));
        add(new Pref(309, 	 "Electrike", 	  95, 	  25));
        add(new Pref(310, 	 "Manectric", 	 dIV, 	 lvl));
        add(new Pref(311, 	    "Plusle", 	 100, 	  20));
        add(new Pref(312, 	     "Minun", 	 dIV, 	 lvl));
        add(new Pref(313, 	   "Volbeat", 	 dIV, 	 lvl));
        add(new Pref(314, 	  "Illumise", 	 dIV, 	 lvl));
        add(new Pref(315, 	   "Roselia", 	  96, 	  20));
        add(new Pref(316, 	    "Gulpin", 	  98, 	  20));
        add(new Pref(317, 	    "Swalot", 	 dIV, 	 lvl));
        add(new Pref(318, 	  "Carvanha", 	  95, 	  20));
        add(new Pref(319, 	  "Sharpedo", 	 dIV, 	 lvl));
        add(new Pref(320, 	   "Wailmer", 	 dIV, 	 lvl));
        add(new Pref(321, 	   "Wailord", 	 dIV, 	 lvl));
        add(new Pref(322, 	     "Numel", 	  98, 	  25));
        add(new Pref(323, 	  "Camerupt", 	 dIV, 	 lvl));
        add(new Pref(324, 	   "Torkoal", 	  90, 	  20));
        add(new Pref(325, 	    "Spoink", 	 dIV, 	 lvl));
        add(new Pref(326, 	   "Grumpig", 	 dIV, 	 lvl));
        add(new Pref(327, 	    "Spinda", 	 dIV, 	 lvl));
        add(new Pref(328, 	  "Trapinch", 	  95, 	  19));
        add(new Pref(329, 	   "Vibrava", 	 dIV, 	 lvl));
        add(new Pref(330, 	    "Flygon", 	 dIV, 	 lvl));
        add(new Pref(331, 	    "Cacnea", 	  96, 	  20));
        add(new Pref(332, 	  "Cacturne", 	  95, 	  20));
        add(new Pref(333, 	    "Swablu", 	 dIV, 	 lvl));
        add(new Pref(334, 	   "Altaria", 	 dIV, 	 lvl));
        add(new Pref(335, 	  "Zangoose", 	 dIV, 	 lvl));
        add(new Pref(336, 	   "Seviper", 	  96, 	  24));
        add(new Pref(337, 	  "Lunatone", 	  90, 	  20));
        add(new Pref(338, 	   "Solrock", 	 dIV, 	 lvl));
        add(new Pref(339, 	  "Barboach", 	  93, 	  25));
        add(new Pref(340, 	  "Whiscash", 	 dIV, 	 lvl));
        add(new Pref(341, 	  "Corphish", 	  96, 	  25));
        add(new Pref(342, 	 "Crawdaunt", 	 dIV, 	 lvl));
        add(new Pref(343, 	    "Baltoy", 	  98, 	  30));
        add(new Pref(344, 	   "Claydol", 	  93, 	  20));
        add(new Pref(345, 	    "Lileep", 	  96, 	  20));
        add(new Pref(346, 	   "Cradily", 	  95, 	  20));
        add(new Pref(347, 	   "Anorith", 	  96, 	  20));
        add(new Pref(348, 	   "Armaldo", 	 dIV, 	 lvl));
        add(new Pref(349, 	    "Feebas", 	 dIV, 	 lvl));
        add(new Pref(350, 	   "Milotic", 	 dIV, 	 lvl));
        add(new Pref(351, 	  "Castform", 	 dIV, 	 lvl));
        add(new Pref(352, 	   "Kecleon", 	 dIV, 	 lvl));
        add(new Pref(353, 	   "Shuppet", 	  98, 	  20));
        add(new Pref(354, 	   "Banette", 	 dIV, 	 lvl));
        add(new Pref(355, 	   "Duskull", 	  96, 	  20));
        add(new Pref(356, 	  "Dusclops", 	 dIV, 	 lvl));
        add(new Pref(357, 	   "Tropius", 	 dIV, 	 lvl));
        add(new Pref(358, 	  "Chimecho", 	 dIV, 	 lvl));
        add(new Pref(359, 	     "Absol", 	 dIV, 	 lvl));
        add(new Pref(360, 	    "Wynaut", 	 dIV, 	 lvl));
        add(new Pref(361, 	   "Snorunt", 	  93, 	  20));
        add(new Pref(362, 	    "Glalie", 	 dIV, 	 lvl));
        add(new Pref(363, 	    "Spheal", 	 dIV, 	 lvl));
        add(new Pref(364, 	    "Sealeo", 	 dIV, 	 lvl));
        add(new Pref(365, 	   "Walrein", 	 dIV, 	 lvl));
        add(new Pref(366, 	  "Clamperl", 	 dIV, 	 lvl));
        add(new Pref(367, 	   "Huntail", 	 dIV, 	 lvl));
        add(new Pref(368, 	  "Gorebyss", 	 dIV, 	 lvl));
        add(new Pref(369, 	 "Relicanth", 	 dIV, 	 lvl));
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

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null || getClass() != object.getClass()) {
                return false;
            }
            Pref pref = (Pref) object;
            return pokedex == pref.pokedex &&
                    iv == pref.iv &&
                    level == pref.level &&
                    pokemon.equalsIgnoreCase(pref.pokemon);
        }
    }
    
    private static final int skip = -1;
    private static final int ALL  = 0;
    private static final int dIV  = 99;
    private static final int lvl  = 29;
    private static final int batL = 25; //battalion member level
    private static final int btIV = 95; //battalion member IV

    public static void main(String[] args) {
        //printSkipSet(UPDATE_PREF);
        printPrefInitForm();
        //printCommand();
        //printAddToList(UPDATE_PREF);
        //printAddToList(getChanged());
        //System.out.println(prepareChangeCommand(getChanged()));
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
    
    
    private static List<Pref> getChanged(){
        Map<String, Pref> existing = new HashMap<>();
        initMap(existing);
        interpretCurrentPref(existing);
        List<Pref> changed = getChanged(existing, UPDATE_PREF);
        return changed;
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
                            String ivStr = ivl[0].trim().replace("%", "").replace("+", "").replace("=","" );
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
    
    private static List<Pref> getChanged(Map<String, Pref> existingMap, List<Pref> updatePrefs){
        List<Pref> changes = new ArrayList<>();
    
        for (Pref pref : updatePrefs) {
            Pref existingPref = existingMap.get(pref.pokemon);
            if(!existingPref.equals(pref)){
                changes.add(pref);
            }
        }
        
        return changes;
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
    
    private static String prepareChangeCommand(List<Pref> changedPrefs) {
        List<String> pokemonSetCommands = new ArrayList<>();
        for (Pref pref : changedPrefs) {
            if (pref.iv != skip) {
                pokemonSetCommands.add(pref.getCommand());
            }
        }
        System.err.println("Changed:" + changedPrefs.size());
        return "!set " + pokemonSetCommands.stream().collect(Collectors.joining(", "));
    }
    private static String prepareCommand(List<Pref> prefs) {
        List<String> pokemonSetCommands = new ArrayList<>();
        int countSpecials = 0;
        for (Pref pref : prefs) {
            if ((pref.iv != dIV || pref.level != lvl)
                    && pref.iv != skip) {
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
