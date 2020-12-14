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
            newCh.setDefaultRoute(ch.isDefaultRoute());
            newCh.setMakeBbmdDevice(ch.isMakeBbmdDevice());

            newCh.setAutomatedTestPotential(ch.isAutomatedTestPotential());
            newCh.setDbTrendSetting(ch.isDbTrendSetting());
            newCh.setRngTrendNo(ch.isRngTrendNo());
            newCh.setProgramToDownload(ch.isProgramToDownload());
            newCh.setCreateAlarm(ch.isCreateAlarm());
            newCh.setJordanToSoap(ch.isJordanToSoap());
            newCh.setAskSteveForAutoTest(ch.isAskSteveForAutoTest());

            newCh.setWebCtrlOwnerAction(ch.isWebCtrlOwnerAction());
            newCh.setDisableLdap(ch.isDisableLdap());
            newCh.setStopControllerConnection(ch.isStopControllerConnection());
            newCh.setSystemShutDown(ch.isSystemShutDown());
            newCh.setRunCloudTool(ch.isRunCloudTool());
            newCh.setDanDocSize(ch.isDanDocSize());
            newCh.setCopyAndRunTool(ch.isCopyAndRunTool());
            newCh.setCopyArtifact(ch.isCopyArtifact());
            newCh.setFileToEfs(ch.isFileToEfs());
            newCh.setNavigateToEsfFile(ch.isNavigateToEsfFile());
            newCh.setRunAwsS3(ch.isRunAwsS3());

            newCh.setImportAndConfigData(ch.isImportAndConfigData());
            newCh.setEditContainerProps(ch.isEditContainerProps());
            newCh.setStopWebCtrlTask(ch.isStopWebCtrlTask());

            newCh.setTestSystemWithStopConn(ch.isTestSystemWithStopConn());
            newCh.setVerifyAddons(ch.isVerifyAddons());
            newCh.setChangeProxySet(ch.isChangeProxySet());
            newCh.setCheckTrendExport(ch.isCheckTrendExport());
            newCh.setWalkThroughUi(ch.isWalkThroughUi());
            newCh.setClickStatisticBtn(ch.isClickStatisticBtn());
            newCh.setCheckOperator(ch.isCheckOperator());
            newCh.setViewAlarms(ch.isViewAlarms());
            newCh.setRunSecurity(ch.isRunSecurity());
            newCh.setViewOneTrend(ch.isViewOneTrend());
            newCh.setConfimServiceStatus(ch.isConfimServiceStatus());
            newCh.setExportTrend(ch.isExportTrend());
            newCh.setDanPingBbmd(ch.isDanPingBbmd());

            newCh.setChangeIpSetting(ch.isChangeIpSetting());
            newCh.setKeepOnlyPort(ch.isKeepOnlyPort());
            newCh.setForceRegistration(ch.isForceRegistration());
            newCh.setEnableDevice(ch.isEnableDevice());
            newCh.setDontUseBackUpBbmd(ch.isDontUseBackUpBbmd());
            newCh.setTuning(ch.isTuning());
            newCh.setTimeOut6s(ch.isTimeOut6s());
            newCh.setAttempts10(ch.isAttempts10());
            newCh.setSync72m(ch.isSync72m());
            newCh.setRegisterFd(ch.isRegisterFd());

            newCh.setStartConn(ch.isStartConn());

            newCh.setConfirmConnectivity(ch.isConfirmConnectivity());
            newCh.setSeeColors(ch.isSeeColors());
            newCh.setRunModstat(ch.isRunModstat());
            newCh.setSeeDataOnEquipment(ch.isSeeDataOnEquipment());
            newCh.setCaptureTrendCount(ch.isCaptureTrendCount());
            newCh.setShowDbValues(ch.isShowDbValues());
            newCh.setPointLockAlarm(ch.isPointLockAlarm());
            newCh.setConfigureTrend1m(ch.isConfigureTrend1m());
            newCh.setEnableTrendHistorian(ch.isEnableTrendHistorian());
            newCh.setForceAlarm(ch.isForceAlarm());
            newCh.setVerifyDeviceBind(ch.isVerifyDeviceBind());

            newCh.setPostLaunchWebCtrl(ch.isPostLaunchWebCtrl());
            newCh.setChangeServerEmail(ch.isChangeServerEmail());
            newCh.setChangeMailSetup(ch.isChangeMailSetup());
            newCh.setChangePort(ch.isChangePort());
            newCh.setSecureTsl(ch.isSecureTsl());
            newCh.setAddMailUser(ch.isAddMailUser());
            newCh.setChangeEmailAddress(ch.isChangeEmailAddress());

            newCh.setTestSystemWithOwner(ch.isTestSystemWithOwner());
            newCh.setEmailNotification(ch.isEmailNotification());

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
            newCh.setDefaultRoute(ch.isDefaultRoute());
            newCh.setMakeBbmdDevice(ch.isMakeBbmdDevice());

            newCh.setAutomatedTestPotential(ch.isAutomatedTestPotential());
            newCh.setDbTrendSetting(ch.isDbTrendSetting());
            newCh.setRngTrendNo(ch.isRngTrendNo());
            newCh.setProgramToDownload(ch.isProgramToDownload());
            newCh.setCreateAlarm(ch.isCreateAlarm());
            newCh.setJordanToSoap(ch.isJordanToSoap());
            newCh.setAskSteveForAutoTest(ch.isAskSteveForAutoTest());

            newCh.setWebCtrlOwnerAction(ch.isWebCtrlOwnerAction());
            newCh.setDisableLdap(ch.isDisableLdap());
            newCh.setStopControllerConnection(ch.isStopControllerConnection());
            newCh.setSystemShutDown(ch.isSystemShutDown());
            newCh.setRunCloudTool(ch.isRunCloudTool());
            newCh.setDanDocSize(ch.isDanDocSize());
            newCh.setCopyAndRunTool(ch.isCopyAndRunTool());
            newCh.setCopyArtifact(ch.isCopyArtifact());
            newCh.setFileToEfs(ch.isFileToEfs());
            newCh.setNavigateToEsfFile(ch.isNavigateToEsfFile());
            newCh.setRunAwsS3(ch.isRunAwsS3());

            newCh.setImportAndConfigData(ch.isImportAndConfigData());
            newCh.setEditContainerProps(ch.isEditContainerProps());
            newCh.setStopWebCtrlTask(ch.isStopWebCtrlTask());

            newCh.setTestSystemWithStopConn(ch.isTestSystemWithStopConn());
            newCh.setVerifyAddons(ch.isVerifyAddons());
            newCh.setChangeProxySet(ch.isChangeProxySet());
            newCh.setCheckTrendExport(ch.isCheckTrendExport());
            newCh.setWalkThroughUi(ch.isWalkThroughUi());
            newCh.setClickStatisticBtn(ch.isClickStatisticBtn());
            newCh.setCheckOperator(ch.isCheckOperator());
            newCh.setViewAlarms(ch.isViewAlarms());
            newCh.setRunSecurity(ch.isRunSecurity());
            newCh.setViewOneTrend(ch.isViewOneTrend());
            newCh.setConfimServiceStatus(ch.isConfimServiceStatus());
            newCh.setExportTrend(ch.isExportTrend());
            newCh.setDanPingBbmd(ch.isDanPingBbmd());

            newCh.setChangeIpSetting(ch.isChangeIpSetting());
            newCh.setKeepOnlyPort(ch.isKeepOnlyPort());
            newCh.setForceRegistration(ch.isForceRegistration());
            newCh.setEnableDevice(ch.isEnableDevice());
            newCh.setDontUseBackUpBbmd(ch.isDontUseBackUpBbmd());
            newCh.setTuning(ch.isTuning());
            newCh.setTimeOut6s(ch.isTimeOut6s());
            newCh.setAttempts10(ch.isAttempts10());
            newCh.setSync72m(ch.isSync72m());
            newCh.setRegisterFd(ch.isRegisterFd());

            newCh.setStartConn(ch.isStartConn());

            newCh.setConfirmConnectivity(ch.isConfirmConnectivity());
            newCh.setSeeColors(ch.isSeeColors());
            newCh.setRunModstat(ch.isRunModstat());
            newCh.setSeeDataOnEquipment(ch.isSeeDataOnEquipment());
            newCh.setCaptureTrendCount(ch.isCaptureTrendCount());
            newCh.setShowDbValues(ch.isShowDbValues());
            newCh.setPointLockAlarm(ch.isPointLockAlarm());
            newCh.setConfigureTrend1m(ch.isConfigureTrend1m());
            newCh.setEnableTrendHistorian(ch.isEnableTrendHistorian());
            newCh.setForceAlarm(ch.isForceAlarm());
            newCh.setVerifyDeviceBind(ch.isVerifyDeviceBind());

            newCh.setPostLaunchWebCtrl(ch.isPostLaunchWebCtrl());
            newCh.setChangeServerEmail(ch.isChangeServerEmail());
            newCh.setChangeMailSetup(ch.isChangeMailSetup());
            newCh.setChangePort(ch.isChangePort());
            newCh.setSecureTsl(ch.isSecureTsl());
            newCh.setAddMailUser(ch.isAddMailUser());
            newCh.setChangeEmailAddress(ch.isChangeEmailAddress());

            newCh.setTestSystemWithOwner(ch.isTestSystemWithOwner());
            newCh.setEmailNotification(ch.isEmailNotification());

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
            newCh.setDefaultRoute(ch.isDefaultRoute());
            newCh.setMakeBbmdDevice(ch.isMakeBbmdDevice());

            newCh.setAutomatedTestPotential(ch.isAutomatedTestPotential());
            newCh.setDbTrendSetting(ch.isDbTrendSetting());
            newCh.setRngTrendNo(ch.isRngTrendNo());
            newCh.setProgramToDownload(ch.isProgramToDownload());
            newCh.setCreateAlarm(ch.isCreateAlarm());
            newCh.setJordanToSoap(ch.isJordanToSoap());
            newCh.setAskSteveForAutoTest(ch.isAskSteveForAutoTest());

            newCh.setWebCtrlOwnerAction(ch.isWebCtrlOwnerAction());
            newCh.setDisableLdap(ch.isDisableLdap());
            newCh.setStopControllerConnection(ch.isStopControllerConnection());
            newCh.setSystemShutDown(ch.isSystemShutDown());
            newCh.setRunCloudTool(ch.isRunCloudTool());
            newCh.setDanDocSize(ch.isDanDocSize());
            newCh.setCopyAndRunTool(ch.isCopyAndRunTool());
            newCh.setCopyArtifact(ch.isCopyArtifact());
            newCh.setFileToEfs(ch.isFileToEfs());
            newCh.setNavigateToEsfFile(ch.isNavigateToEsfFile());
            newCh.setRunAwsS3(ch.isRunAwsS3());

            newCh.setImportAndConfigData(ch.isImportAndConfigData());
            newCh.setEditContainerProps(ch.isEditContainerProps());
            newCh.setStopWebCtrlTask(ch.isStopWebCtrlTask());

            newCh.setTestSystemWithStopConn(ch.isTestSystemWithStopConn());
            newCh.setVerifyAddons(ch.isVerifyAddons());
            newCh.setChangeProxySet(ch.isChangeProxySet());
            newCh.setCheckTrendExport(ch.isCheckTrendExport());
            newCh.setWalkThroughUi(ch.isWalkThroughUi());
            newCh.setClickStatisticBtn(ch.isClickStatisticBtn());
            newCh.setCheckOperator(ch.isCheckOperator());
            newCh.setViewAlarms(ch.isViewAlarms());
            newCh.setRunSecurity(ch.isRunSecurity());
            newCh.setViewOneTrend(ch.isViewOneTrend());
            newCh.setConfimServiceStatus(ch.isConfimServiceStatus());
            newCh.setExportTrend(ch.isExportTrend());
            newCh.setDanPingBbmd(ch.isDanPingBbmd());

            newCh.setChangeIpSetting(ch.isChangeIpSetting());
            newCh.setKeepOnlyPort(ch.isKeepOnlyPort());
            newCh.setForceRegistration(ch.isForceRegistration());
            newCh.setEnableDevice(ch.isEnableDevice());
            newCh.setDontUseBackUpBbmd(ch.isDontUseBackUpBbmd());
            newCh.setTuning(ch.isTuning());
            newCh.setTimeOut6s(ch.isTimeOut6s());
            newCh.setAttempts10(ch.isAttempts10());
            newCh.setSync72m(ch.isSync72m());
            newCh.setRegisterFd(ch.isRegisterFd());

            newCh.setStartConn(ch.isStartConn());

            newCh.setConfirmConnectivity(ch.isConfirmConnectivity());
            newCh.setSeeColors(ch.isSeeColors());
            newCh.setRunModstat(ch.isRunModstat());
            newCh.setSeeDataOnEquipment(ch.isSeeDataOnEquipment());
            newCh.setCaptureTrendCount(ch.isCaptureTrendCount());
            newCh.setShowDbValues(ch.isShowDbValues());
            newCh.setPointLockAlarm(ch.isPointLockAlarm());
            newCh.setConfigureTrend1m(ch.isConfigureTrend1m());
            newCh.setEnableTrendHistorian(ch.isEnableTrendHistorian());
            newCh.setForceAlarm(ch.isForceAlarm());
            newCh.setVerifyDeviceBind(ch.isVerifyDeviceBind());

            newCh.setPostLaunchWebCtrl(ch.isPostLaunchWebCtrl());
            newCh.setChangeServerEmail(ch.isChangeServerEmail());
            newCh.setChangeMailSetup(ch.isChangeMailSetup());
            newCh.setChangePort(ch.isChangePort());
            newCh.setSecureTsl(ch.isSecureTsl());
            newCh.setAddMailUser(ch.isAddMailUser());
            newCh.setChangeEmailAddress(ch.isChangeEmailAddress());

            newCh.setTestSystemWithOwner(ch.isTestSystemWithOwner());
            newCh.setEmailNotification(ch.isEmailNotification());

            checkListRepository.save(newCh);
        }
        return newCh;
    }

    @Override
    public void deleteMeetingCheckList(String id) {
        checkListRepository.deleteById(id);
    }
}
