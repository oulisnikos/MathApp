/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opsw.uni.repositories;

import com.opsw.uni.cat.CatEjbJpaBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author oulis
 */
@Component
public interface MathRepository extends CatEjbJpaBase<Math, Long>
{
  
}
