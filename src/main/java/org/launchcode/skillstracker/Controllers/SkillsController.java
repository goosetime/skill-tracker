package org.launchcode.skillstracker.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//At 8080 test has h1 with Skills Tracker, h2 and ol with 3 languages
@Controller
public class SkillsController {
//    @RequestMapping(method = {RequestMethod.GET})
    @GetMapping("/")
    @ResponseBody
    public String trackerHome() {
        return "<html>" +
                "<body>" +
                "<h1>Skill Tracker</h1>" +
                "<h2>The skills are on the track. Watch out for skills while you are running the track. They are on the track.</h2>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Funny Joke Tomato Tomato Tomato Tomato Tomato</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET}, value = "form")
    @ResponseBody
    public String form() {
        return "<html>" +
                "<body>" +
                    "<form action = 'form' method = 'post'>" + //submit a request to /form
                    "<input type = 'type' name = 'name'>" +
                    "<label> Favorite Language: " +
                    "<select name = 'firstChoice'>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'JavaScript'>JavaScript</option>" +
                        "<option value = 'Funny Joke'>Funny Joke</option>" +
                    "</select>" +
                    "</label>" +
                    "<label> Second Favorite Language: " +
                    "<select name = 'secondChoice'>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'JavaScript'>JavaScript</option>" +
                        "<option value = 'Funny Joke'>Funny Joke</option>" +
                    "</select>" +
                    "</label>" +
                    "<label> Third Favorite Language: " +
                    "<select name = 'thirdChoice'>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'JavaScript'>JavaScript</option>" +
                        "<option value = 'Funny Joke'>Funny Joke</option>" +
                    "</select>" +
                    "</label>" +
                    "<input type = 'submit' value = 'Submit'>" +
                    "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.POST}, value = "form")
    @ResponseBody
    public String formPost(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        if (name == null) {
            name = "User";
        }
        return "<html>" +
                "<body>" +
                    "<h1>" +
                    name +
                    "'s Languages" +
                    "</h1>" +
                    "<ol>" +
                        "<li>" +
                        firstChoice +
                        "</li>" +
                        "<li>" +
                        secondChoice +
                        "</li>" +
                        "<li>" +
                        thirdChoice +
                        "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
