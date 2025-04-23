package com.corhuila.app_movil_g2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.app_movil_g2.Iservice.IMesaService;
import com.corhuila.app_movil_g2.Repository.IBaseRepository;
import com.corhuila.app_movil_g2.Repository.IMesaRepository;
import com.corhuila.app_movil_g2.entity.Mesas;


@Service
public class MesaService extends ABaseService<Mesas> implements IMesaService {

    @Autowired
    IMesaRepository repository;


    @Override
    protected IBaseRepository<Mesas, Long> getRepository() {
      return repository;
    }

}
