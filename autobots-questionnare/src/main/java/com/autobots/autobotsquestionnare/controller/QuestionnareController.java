package com.autobots.autobotsquestionnare.controller;

import com.autobots.autobotsquestionnare.entity.Questionnare;
import com.autobots.autobotsquestionnare.service.QuestionnareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class QuestionnareController {
    @Autowired
    private QuestionnareService questionnareService;

    @GetMapping("/questionnare-list")
    public List<Questionnare> getQuestionnareList(){
        return questionnareService.getQuestionnareList();
    }

    @GetMapping("/questionnare/{id}")
    public Questionnare getQuestionnareById(@PathVariable("id") String id){
        return questionnareService.getQuestionnareById(id);
    }

    @PostMapping("/add-questionnare")
    public Questionnare addNewQuestionnare(@RequestBody Questionnare questionnare){
        return questionnareService.addNewQuestionnare(questionnare);
    }

    @PutMapping("/edit-questionnare/{id}")
    public Questionnare editExistQuestionnare(@RequestBody Questionnare questionnare, @PathVariable("id")String id){
        return questionnareService.editExistingQuestionnare(questionnare,id);
    }

    @DeleteMapping("/delete-questionnare/{id}")
    public void deleteQuestionnare(@PathVariable ("id") String id){
        questionnareService.deleteQuestionnareByid(id);
    }
}
