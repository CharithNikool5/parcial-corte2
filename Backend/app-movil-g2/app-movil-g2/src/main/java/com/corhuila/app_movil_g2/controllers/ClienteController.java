package com.corhuila.app_movil_g2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.app_movil_g2.Iservice.IClienteService;
import com.corhuila.app_movil_g2.entity.cliente;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController extends ABaseController<cliente, IClienteService> {

    protected ClienteController(IClienteService service) {
       super(service, "cliente");
        }

}
