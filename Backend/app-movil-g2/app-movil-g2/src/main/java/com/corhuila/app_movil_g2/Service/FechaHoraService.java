package com.corhuila.app_movil_g2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.app_movil_g2.Iservice.IFechaHoraService;
import com.corhuila.app_movil_g2.Repository.IBaseRepository;
import com.corhuila.app_movil_g2.Repository.IFechaHoraRepository;
import com.corhuila.app_movil_g2.entity.FechaHora;
@Service
public class FechaHoraService extends ABaseService<FechaHora> implements IFechaHoraService {


    @Autowired
    IFechaHoraRepository repository;

    @Override
    protected IBaseRepository<FechaHora, Long> getRepository() {
        return repository;
    }

}
