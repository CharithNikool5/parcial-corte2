package com.corhuila.app_movil_g2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.app_movil_g2.Iservice.IClienteService;
import com.corhuila.app_movil_g2.Repository.IBaseRepository;
import com.corhuila.app_movil_g2.Repository.IClienteRepository;
import com.corhuila.app_movil_g2.entity.cliente;

@Service
public class ClienteService extends ABaseService<cliente> implements IClienteService {

     @Autowired
    private IClienteRepository repository;


    @Override
    protected IBaseRepository<cliente, Long> getRepository() {
        return repository;
    }

}
