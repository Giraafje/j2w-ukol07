package cz.czechitas.java2webapps.ukol7.controller;

import cz.czechitas.java2webapps.ukol7.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
  public ModelAndView list(@PageableDefault Pageable pageable) {
    return new ModelAndView("list")
        .addObject("postList", postService.list(PageRequest.of(pageable.getPageNumber(), 20)));
  }

  @GetMapping("/{slug}")
  public ModelAndView showPost(@PathVariable String slug) {
    return new ModelAndView("post").addObject("post", postService.singlePost(slug));
  }
}
