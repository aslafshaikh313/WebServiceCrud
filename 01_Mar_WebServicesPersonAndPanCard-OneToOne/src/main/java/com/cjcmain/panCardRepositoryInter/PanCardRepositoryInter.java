package com.cjcmain.panCardRepositoryInter;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjcmain.model.PanCard;

@Repository
public interface PanCardRepositoryInter extends CrudRepository<PanCard, Integer>{

}
