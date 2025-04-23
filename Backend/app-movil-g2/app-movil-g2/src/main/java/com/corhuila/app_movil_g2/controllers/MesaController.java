package com.corhuila.app_movil_g2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.app_movil_g2.Iservice.IMesaService;
import com.corhuila.app_movil_g2.entity.Mesas;
@RestController
@RequestMapping("/api/mesas")
public class MesaController extends ABaseController<Mesas, IMesaService> {

    protected MesaController(IMesaService service) {
        super(service, "Mesas");
    }

}
