package com.luhuiguo.archetype.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luhuiguo on 2017/4/13.
 */
@RestController
@RequestMapping("/api")
public class HelloResource {

  @GetMapping("/hello/{name}")
  public ResponseEntity<String> getForDay(@PathVariable String name) {
    return ResponseEntity.ok().body("Hello "+ name);
  }
}
