/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opsw.uni.cat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author oulis
 */
@NoRepositoryBean
public interface CatEjbJpaBase<T extends Object, ID extends Object> extends JpaRepository<T, ID> 
{
  
}
