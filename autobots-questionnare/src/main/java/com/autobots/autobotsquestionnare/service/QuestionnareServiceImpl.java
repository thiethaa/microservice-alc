package com.autobots.autobotsquestionnare.service;

import com.autobots.autobotsquestionnare.entity.Questionnare;
import com.autobots.autobotsquestionnare.repository.QuestionnareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionnareServiceImpl implements QuestionnareService{
    @Autowired
    private QuestionnareRepository questionnareRepository;

    @Override
    public List<Questionnare> getQuestionnareList() {
        return questionnareRepository.findAll();
    }

    @Override
    public Questionnare getQuestionnareById(String id) {
        Optional<Questionnare> existindData = questionnareRepository.findById(id);
        Questionnare questionnare = null;
        if(existindData.isPresent()){
            questionnare = existindData.get();
        }
        return questionnare;
    }

    @Override
    public Questionnare addNewQuestionnare(Questionnare questionnare) {
        Questionnare newQuestionnare = null;
        Optional<Questionnare> existId = questionnareRepository.findById(questionnare.getId());
        if(existId.isPresent()){
            newQuestionnare= existId.get();
            newQuestionnare.setId(questionnare.getId());
            newQuestionnare.setWebCtrlVersion(questionnare.getWebCtrlVersion());
            newQuestionnare.setWebCtrlIp(questionnare.getWebCtrlIp());
            newQuestionnare.setAddOnsList(questionnare.getAddOnsList());
            newQuestionnare.setOldAddOns(questionnare.getOldAddOns());
            newQuestionnare.setAlertMethod(questionnare.getAlertMethod());
            newQuestionnare.setInNotification(questionnare.getInNotification());
            newQuestionnare.setDbBrandAndVersion(questionnare.getDbBrandAndVersion());
            newQuestionnare.setUsingHierarchial(questionnare.getUsingHierarchial());
            newQuestionnare.setDirectorySize(questionnare.getDirectorySize());
            newQuestionnare.setDbSize(questionnare.getDbSize());
            newQuestionnare.setControllerNo(questionnare.getControllerNo());
            newQuestionnare.setPointsNo(questionnare.getPointsNo());
            newQuestionnare.setSourceNo(questionnare.getSourceNo());
            newQuestionnare.setSampleNo(questionnare.getSampleNo());
            questionnareRepository.save(newQuestionnare);
        }else {
            newQuestionnare = new Questionnare();
            newQuestionnare.setId(questionnare.getId());
            newQuestionnare.setWebCtrlVersion(questionnare.getWebCtrlVersion());
            newQuestionnare.setWebCtrlIp(questionnare.getWebCtrlIp());
            newQuestionnare.setAddOnsList(questionnare.getAddOnsList());
            newQuestionnare.setOldAddOns(questionnare.getOldAddOns());
            newQuestionnare.setAlertMethod(questionnare.getAlertMethod());
            newQuestionnare.setInNotification(questionnare.getInNotification());
            newQuestionnare.setDbBrandAndVersion(questionnare.getDbBrandAndVersion());
            newQuestionnare.setUsingHierarchial(questionnare.getUsingHierarchial());
            newQuestionnare.setDirectorySize(questionnare.getDirectorySize());
            newQuestionnare.setDbSize(questionnare.getDbSize());
            newQuestionnare.setControllerNo(questionnare.getControllerNo());
            newQuestionnare.setPointsNo(questionnare.getPointsNo());
            newQuestionnare.setSourceNo(questionnare.getSourceNo());
            newQuestionnare.setSampleNo(questionnare.getSampleNo());
            questionnareRepository.save(newQuestionnare);
        }
        return newQuestionnare;
    }

    @Override
    public Questionnare editExistingQuestionnare(Questionnare questionnare, String id) {
        Optional<Questionnare> existindData = questionnareRepository.findById(id);
        Questionnare newQuestionnare = null;
        if(existindData.isPresent()){
            newQuestionnare= existindData.get();
            newQuestionnare.setId(questionnare.getId());
            newQuestionnare.setWebCtrlVersion(questionnare.getWebCtrlVersion());
            newQuestionnare.setWebCtrlIp(questionnare.getWebCtrlIp());
            newQuestionnare.setAddOnsList(questionnare.getAddOnsList());
            newQuestionnare.setOldAddOns(questionnare.getOldAddOns());
            newQuestionnare.setAlertMethod(questionnare.getAlertMethod());
            newQuestionnare.setInNotification(questionnare.getInNotification());
            newQuestionnare.setDbBrandAndVersion(questionnare.getDbBrandAndVersion());
            newQuestionnare.setUsingHierarchial(questionnare.getUsingHierarchial());
            newQuestionnare.setDirectorySize(questionnare.getDirectorySize());
            newQuestionnare.setDbSize(questionnare.getDbSize());
            newQuestionnare.setControllerNo(questionnare.getControllerNo());
            newQuestionnare.setPointsNo(questionnare.getPointsNo());
            newQuestionnare.setSourceNo(questionnare.getSourceNo());
            newQuestionnare.setSampleNo(questionnare.getSampleNo());
            questionnareRepository.save(newQuestionnare);
        }
        return newQuestionnare;
    }

    @Override
    public void deleteQuestionnareByid(String id) {
        questionnareRepository.deleteById(id);
    }
}
