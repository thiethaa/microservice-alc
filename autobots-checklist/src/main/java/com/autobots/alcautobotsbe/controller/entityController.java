package com.autobots.alcautobotsbe.controller;

import com.autobots.alcautobotsbe.entity.CheckList;
import com.autobots.alcautobotsbe.service.CheckListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class entityController {
    @Autowired
    CheckListService checkListService;

   @GetMapping("/meeting-checklist")
    public List<CheckList> getMeetingCheckList(){
       return checkListService.getMeetingCheckList();
   }
   @GetMapping("/meeting-checklist/{id}")
    public CheckList getMeetingCheckListById(@PathVariable("id") String id){
       return checkListService.getMeetingChecklistById(id);
   }
   @PostMapping("/add-meeting")
    public CheckList addMeetingCheckList(@RequestBody CheckList ch){
       return checkListService.addNewMeetingChecklist(ch);
   }

   @PutMapping("/edit-checklist/{id}")
    public CheckList editmeetingCheckList(@RequestBody CheckList ch,@PathVariable ("id") String id){
       return checkListService.editExistingMeetingCheckList(ch,id);
   }
   @DeleteMapping("/delete-checklist/{id}")
    public void deleteMeeting(@PathVariable("id")String id){
       checkListService.deleteMeetingCheckList(id);
   }
}
