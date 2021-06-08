package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

   // private static List<String> events = new ArrayList<>();
    private static Map<String, String> events = new HashMap<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
        model.addAttribute("events", events);
        return "events/index";
    }

    @PostMapping("/events/create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @GetMapping ("create")
    //@RequestMapping(value = "/event/create", method = RequestMethod.GET)
    public String processCreateEventForm(@RequestParam(value="eventName") String eventName,@RequestParam(value="description") String description) {
        events.put(eventName,description);
        return "redirect:";
    }

}

