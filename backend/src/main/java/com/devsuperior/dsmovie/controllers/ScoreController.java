package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping(value = "/scores")
    public class ScoreController {

        @Autowired
        private ScoreService service;

        @PutMapping
        public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
          MovieDTO movieDto = service.saveScore(dto);
          return movieDto;
        }
    }
