package com.autobots.alcautobotsbe.service;

import com.autobots.alcautobotsbe.entity.CheckList;
import com.autobots.alcautobotsbe.repository.CheckListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CheckListServiceImpl implements CheckListService {
    @Autowired
    CheckListRepository checkListRepository;

    @Override
    public List<CheckList> getMeetingCheckList() {
        return checkListRepository.findAll();
    }

    @Override
    public CheckList getMeetingChecklistById(String id) {
        Optional<CheckList> existData = checkListRepository.findById(id);
        CheckList ch = null;
        if(existData.isPresent()){
            ch = existData.get();
        }
        return ch;
    }

    @Override
    public CheckList addNewMeetingChecklist(CheckList ch) {
        CheckList newCh = null;
        Optional<CheckList> existId = checkListRepository.findById(ch.getId());

        if(existId.isPresent()){
            newCh = existId.get();
            newCh.setId(ch.getId());
            newCh.setSendQuestionnaire(ch.isSendQuestionnaire());
            newCh.setCreateHubPage(ch.isCreateHubPage());
            newCh.setScheduleDeepDiveMeeting(ch.isScheduleDeepDiveMeeting());
            newCh.setDetermineCustomer(ch.isDetermineCustomer());
            newCh.setDisscussAddons(ch.isDisscussAddons());
            newCh.setProxySetting(ch.isProxySetting());
            newCh.setTrendExport(ch.isTrendExport());
            newCh.setExplainCloudMigrationTool(ch.isExplainCloudMigrationTool());
            newCh.setNetworking(ch.isNetworking());
            newCh.setChangeCloud(ch.isChangeCloud());
            newCh.setActionUi(ch.isActionUi());
            newCh.setPatching(ch.isPatching());
            newCh.setSiteBuilder(ch.isSiteBuilder());
            newCh.setWorkArounds(ch.isWorkArounds());
            newCh.setSourceTrees(ch.isSourceTrees());
            newCh.setGap(ch.isGap());
            newCh.setComing(ch.isComing());
            newCh.setPasswordNotify(ch.isPasswordNotify());
            newCh.setMethodToMinimize(ch.isMethodToMinimize());
            newCh.setDetermineNetworking(ch.isDetermineNetworking());
            newCh.setChangeRoute(ch.isChangeRoute());
            newCh.setTestingValidation(ch.isTestingValidation());
            newCh.setTargetDates(ch.isTargetDates());
            newCh.setAddMember(ch.isAddMember());

            newCh.setWebCtrlAccess(ch.isWebCtrlAccess());
            newCh.setWebCtrlKey(ch.isWebCtrlKey());
            newCh.setBacLicenses(ch.isBacLicenses());
            newCh.setUpgradeSystem(ch.isUpgradeSystem());
            newCh.setCleanOutWebRoot(ch.isCleanOutWebRoot());
            newCh.setNotUsingDerby(ch.isNotUsingDerby());
            newCh.setScheduleMigration(ch.isScheduleMigration());

            newCh.setUpdateAllDevice(ch.isUpdateAllDevice());

            newCh.setOrderTosibox(ch.isOrderTosibox());
            newCh.setDigitalNetTicket(ch.isDigitalNetTicket());
            newCh.setStaticIpAddress(ch.isStaticIpAddress());
            newCh.setSwitchPort(ch.isSwitchPort());
            newCh.setFirewallRules(ch.isFirewallRules());
            newCh.setConfigureTosibox(ch.isConfigureTosibox());
            newCh.setShipTosibox(ch.isShipTosibox());
            newCh.setVeryfyTosiboxbyOwner(ch.isVeryfyTosiboxbyOwner());

            newCh.setImplementAwsNetwork(ch.isImplementAwsNetwork());
            newCh.setCreateEmptyAwsSystem(ch.isCreateEmptyAwsSystem());
            newCh.setGiveToolAndPassword(ch.isGiveToolAndPassword());
            newCh.setGiveOwnerWebCtrlUrl(ch.isGiveOwnerWebCtrlUrl());

            newCh.setUpdateBbmd(ch.isUpdateBbmd());
            newCh.setChangeRoute(ch.isChangeRoute());
            newCh.setMakeBbmdDevice(ch.isMakeBbmdDevice());

            checkListRepository.save(newCh);
        }else{
            newCh= new CheckList();
            newCh.setId(ch.getId());
            newCh.setSendQuestionnaire(ch.isSendQuestionnaire());
            newCh.setCreateHubPage(ch.isCreateHubPage());
            newCh.setScheduleDeepDiveMeeting(ch.isScheduleDeepDiveMeeting());
            newCh.setDetermineCustomer(ch.isDetermineCustomer());
            newCh.setDisscussAddons(ch.isDisscussAddons());
            newCh.setProxySetting(ch.isProxySetting());
            newCh.setTrendExport(ch.isTrendExport());
            newCh.setExplainCloudMigrationTool(ch.isExplainCloudMigrationTool());
            newCh.setNetworking(ch.isNetworking());
            newCh.setChangeCloud(ch.isChangeCloud());
            newCh.setActionUi(ch.isActionUi());
            newCh.setPatching(ch.isPatching());
            newCh.setSiteBuilder(ch.isSiteBuilder());
            newCh.setWorkArounds(ch.isWorkArounds());
            newCh.setSourceTrees(ch.isSourceTrees());
            newCh.setGap(ch.isGap());
            newCh.setComing(ch.isComing());
            newCh.setPasswordNotify(ch.isPasswordNotify());
            newCh.setMethodToMinimize(ch.isMethodToMinimize());
            newCh.setDetermineNetworking(ch.isDetermineNetworking());
            newCh.setChangeRoute(ch.isChangeRoute());
            newCh.setTestingValidation(ch.isTestingValidation());
            newCh.setTargetDates(ch.isTargetDates());
            newCh.setAddMember(ch.isAddMember());

            newCh.setWebCtrlAccess(ch.isWebCtrlAccess());
            newCh.setWebCtrlKey(ch.isWebCtrlKey());
            newCh.setBacLicenses(ch.isBacLicenses());
            newCh.setUpgradeSystem(ch.isUpgradeSystem());
            newCh.setCleanOutWebRoot(ch.isCleanOutWebRoot());
            newCh.setNotUsingDerby(ch.isNotUsingDerby());
            newCh.setScheduleMigration(ch.isScheduleMigration());

            newCh.setUpdateAllDevice(ch.isUpdateAllDevice());

            newCh.setOrderTosibox(ch.isOrderTosibox());
            newCh.setDigitalNetTicket(ch.isDigitalNetTicket());
            newCh.setStaticIpAddress(ch.isStaticIpAddress());
            newCh.setSwitchPort(ch.isSwitchPort());
            newCh.setFirewallRules(ch.isFirewallRules());
            newCh.setConfigureTosibox(ch.isConfigureTosibox());
            newCh.setShipTosibox(ch.isShipTosibox());
            newCh.setVeryfyTosiboxbyOwner(ch.isVeryfyTosiboxbyOwner());

            newCh.setImplementAwsNetwork(ch.isImplementAwsNetwork());
            newCh.setCreateEmptyAwsSystem(ch.isCreateEmptyAwsSystem());
            newCh.setGiveToolAndPassword(ch.isGiveToolAndPassword());
            newCh.setGiveOwnerWebCtrlUrl(ch.isGiveOwnerWebCtrlUrl());

            newCh.setUpdateBbmd(ch.isUpdateBbmd());
            newCh.setChangeRoute(ch.isChangeRoute());
            newCh.setMakeBbmdDevice(ch.isMakeBbmdDevice());
            checkListRepository.save(newCh);
        }
        return newCh;
    }

    @Override
    public CheckList editExistingMeetingCheckList(CheckList ch, String id) {
        Optional<CheckList> existData = checkListRepository.findById(id);
        CheckList newCh = null;
        if(existData.isPresent()){
            newCh = existData.get();
            newCh.setId(ch.getId());
            newCh.setSendQuestionnaire(ch.isSendQuestionnaire());
            newCh.setCreateHubPage(ch.isCreateHubPage());
            newCh.setScheduleDeepDiveMeeting(ch.isScheduleDeepDiveMeeting());
            newCh.setDetermineCustomer(ch.isDetermineCustomer());
            newCh.setDisscussAddons(ch.isDisscussAddons());
            newCh.setProxySetting(ch.isProxySetting());
            newCh.setTrendExport(ch.isTrendExport());
            newCh.setExplainCloudMigrationTool(ch.isExplainCloudMigrationTool());
            newCh.setNetworking(ch.isNetworking());
            newCh.setChangeCloud(ch.isChangeCloud());
            newCh.setActionUi(ch.isActionUi());
            newCh.setPatching(ch.isPatching());
            newCh.setSiteBuilder(ch.isSiteBuilder());
            newCh.setWorkArounds(ch.isWorkArounds());
            newCh.setSourceTrees(ch.isSourceTrees());
            newCh.setGap(ch.isGap());
            newCh.setComing(ch.isComing());
            newCh.setPasswordNotify(ch.isPasswordNotify());
            newCh.setMethodToMinimize(ch.isMethodToMinimize());
            newCh.setDetermineNetworking(ch.isDetermineNetworking());
            newCh.setChangeRoute(ch.isChangeRoute());
            newCh.setTestingValidation(ch.isTestingValidation());
            newCh.setTargetDates(ch.isTargetDates());
            newCh.setAddMember(ch.isAddMember());

            newCh.setWebCtrlAccess(ch.isWebCtrlAccess());
            newCh.setWebCtrlKey(ch.isWebCtrlKey());
            newCh.setBacLicenses(ch.isBacLicenses());
            newCh.setUpgradeSystem(ch.isUpgradeSystem());
            newCh.setCleanOutWebRoot(ch.isCleanOutWebRoot());
            newCh.setNotUsingDerby(ch.isNotUsingDerby());
            newCh.setScheduleMigration(ch.isScheduleMigration());

            newCh.setUpdateAllDevice(ch.isUpdateAllDevice());

            newCh.setOrderTosibox(ch.isOrderTosibox());
            newCh.setDigitalNetTicket(ch.isDigitalNetTicket());
            newCh.setStaticIpAddress(ch.isStaticIpAddress());
            newCh.setSwitchPort(ch.isSwitchPort());
            newCh.setFirewallRules(ch.isFirewallRules());
            newCh.setConfigureTosibox(ch.isConfigureTosibox());
            newCh.setShipTosibox(ch.isShipTosibox());
            newCh.setVeryfyTosiboxbyOwner(ch.isVeryfyTosiboxbyOwner());

            newCh.setImplementAwsNetwork(ch.isImplementAwsNetwork());
            newCh.setCreateEmptyAwsSystem(ch.isCreateEmptyAwsSystem());
            newCh.setGiveToolAndPassword(ch.isGiveToolAndPassword());
            newCh.setGiveOwnerWebCtrlUrl(ch.isGiveOwnerWebCtrlUrl());

            newCh.setUpdateBbmd(ch.isUpdateBbmd());
            newCh.setChangeRoute(ch.isChangeRoute());
            newCh.setMakeBbmdDevice(ch.isMakeBbmdDevice());
            checkListRepository.save(newCh);
        }
        return newCh;
    }

    @Override
    public void deleteMeetingCheckList(String id) {
        checkListRepository.deleteById(id);
    }
}
