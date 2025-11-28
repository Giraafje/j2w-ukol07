package cz.czechitas.java2webapps.ukol7.controller;

import cz.czechitas.java2webapps.ukol7.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {
  private final PostService postService;

  //Connection to the service
  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public ModelAndView list() {
    return new ModelAndView("list").addObject("postList", postService.list());
  }
}
