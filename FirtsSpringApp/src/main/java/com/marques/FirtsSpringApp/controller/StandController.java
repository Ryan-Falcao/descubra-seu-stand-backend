package com.marques.FirtsSpringApp.controller;

import com.marques.FirtsSpringApp.model.PerfilStand;
import com.marques.FirtsSpringApp.model.StandRequestDTO;
import com.marques.FirtsSpringApp.service.StandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/stand")
public class StandController {
    @Autowired
    private StandService service;

    @PostMapping("/descobrir")
    public ResponseEntity<Map<String, String>> result(@RequestBody StandRequestDTO request){
        PerfilStand perfil = service.descobrirStand(request.getDataNascimento());

        Map<String, String> resposta = new HashMap<>();
        resposta.put("nome", request.getNome());
        resposta.put("carta", perfil.getCarta());
        resposta.put("stand", perfil.getStand());
        resposta.put("descricao", perfil.getDescricao());
        resposta.put("numeroCarta", perfil.getNumero());
        resposta.put("imagem", perfil.getImagem() );

        return ResponseEntity.ok(resposta);
    }
}
