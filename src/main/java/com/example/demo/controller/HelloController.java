package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

 @GetMapping("/hello")
 public String hello() {
  return "CI/CD Pipeline Working!";
 }
 
 
 @GetMapping("/test")
 public String test() {
  return "CI/CD Pipeline testing!";
 }
 
 @GetMapping("/webhook")
 public String webhook() {
  return "webhook triger working";
 }
 
 @GetMapping("/check")
 public String check() {
	 return "check";
 }
}
