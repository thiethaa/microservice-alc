package com.autobots.autobotsquestionnare.service;

import com.autobots.autobotsquestionnare.entity.Questionnare;

import java.util.List;

public interface QuestionnareService {

    List<Questionnare> getQuestionnareList();

    Questionnare getQuestionnareById(String id);

    Questionnare addNewQuestionnare(Questionnare questionnare);

    Questionnare editExistingQuestionnare(Questionnare questionnare, String id);

    void deleteQuestionnareByid(String id);
}
