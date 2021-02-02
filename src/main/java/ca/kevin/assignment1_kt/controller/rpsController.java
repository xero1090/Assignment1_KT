package ca.kevin.assignment1_kt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import ca.kevin.assignment1_kt.domain.Envelope;

@Controller
public class rpsController {
    private final Logger logger = LoggerFactory.getLogger(rpsController.class);

    @GetMapping(value = {"/", "/Input"})
    public String input(){
    logger.trace("Input is called");
    return "Input";
    }

    @GetMapping("/Process")
    public ModelAndView process(@ModelAttribute Envelope envelope){
    logger.trace("Process is called");
    logger.debug("envelope = " + envelope);
    return new ModelAndView("Output", "envelope", envelope);
    }

}
