package com.margorp.any.sample.web

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping



@RestController // return json, all method add @ResponseBody
class HelloController {
    @GetMapping("/hello") // = @RequestMapping(method = RequestMethod.GET)
    fun hello():String {
        return "Hello World?"
    }
}