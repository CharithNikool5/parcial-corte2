package com.corhuila.app_movil_g2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.app_movil_g2.Iservice.IFechaHoraService;
import com.corhuila.app_movil_g2.entity.FechaHora;

@RestController
@RequestMapping("/api/fechaHora")
public class FechaHoraController extends ABaseController<FechaHora, IFechaHoraService> {

    protected FechaHoraController(IFechaHoraService service) {
        super(service, "FechaHora");
       
    }

}
