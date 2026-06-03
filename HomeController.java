package searchwebsite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/search")
    public String search(@RequestParam String keyword, Model model) {

        String name = "";
        String description = "";
        String habitat = "";
        String image = "";

        if (keyword.equals("珊瑚")) {
            name = "珊瑚";
            description = "珊瑚是一種生活在海洋中的生物，常見於熱帶海域。珊瑚礁可以提供很多魚類和海洋生物棲息。";
            habitat = "熱帶海域、珊瑚礁附近";
            image = "coral.jpg";
        } else if (keyword.equals("鯊魚")) {
            name = "鯊魚";
            description = "鯊魚是海洋中的大型魚類，具有敏銳的嗅覺和強大的游泳能力，是海洋食物鏈中重要的掠食者。";
            habitat = "外海、沿岸海域";
            image = "shark.jpg";
        } else if (keyword.equals("小丑魚")) {
            name = "小丑魚";
            description = "小丑魚通常生活在海葵附近，身體顏色鮮豔，常見於熱帶珊瑚礁海域。";
            habitat = "熱帶珊瑚礁、海葵附近";
            image = "clownfish.jpg";
        } else if (keyword.equals("海龜")) {
            name = "海龜";
            description = "海龜是一種大型海洋爬蟲類，具有堅硬的龜殼，通常生活在溫暖海域中。";
            habitat = "熱帶海洋、海岸附近";
            image = "turtle.jpg";

        } else if (keyword.equals("水母")) {
            name = "水母";
            description = "水母身體透明柔軟，會利用觸手捕食小型海洋生物，有些種類具有毒性。";
            habitat = "海洋表層、沿岸海域";
            image = "jellyfish.jpg";

        } else if (keyword.equals("海豚")) {
            name = "海豚";
            description = "海豚是一種高智商海洋哺乳類動物，喜歡群體活動，游泳速度非常快。";
            habitat = "外海、溫暖海域";
            image = "dolphin.jpg";
        } else {
            name = "查無資料";
            description = "目前網站還沒有這個海洋生物的資料。";
            habitat = "無";
            image = "";
        }

        model.addAttribute("name", name);
        model.addAttribute("description", description);
        model.addAttribute("habitat", habitat);
        model.addAttribute("image", image);

        return "result";
    }
}