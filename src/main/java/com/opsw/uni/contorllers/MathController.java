/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opsw.uni.contorllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author oulis
 */

@Controller
@RequestMapping("/maths")
public class MathController
{
  @RequestMapping(value="/mathlist", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
  public String MathsList()
  {
    String results = null;
    
    return results;
  }
}
