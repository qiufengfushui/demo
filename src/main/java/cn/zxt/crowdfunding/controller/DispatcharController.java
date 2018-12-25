package cn.zxt.crowdfunding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DispatcharController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/main")
    public String main(){
        return "manage/main";
    }

    @RequestMapping("/logout")
    public String logout(){
        return "login";
    }

    @RequestMapping("/user")
    public String user(){
        return "manage/user";
    }

    @RequestMapping("/role")
    public String role(){
        return "manage/role";
    }

    @RequestMapping("/index")
    public String index(){
        return "member/index";
    }

    @RequestMapping("/permission")
    public String permission(){
        return "manage/permission";
    }

    @RequestMapping("/auth_adv")
    public String auth_adv(){
        return "manage/auth_adv";
    }

    @RequestMapping("/auth_cert")
    public String auth_cert(){
        return "manage/auth_cert";
    }

    @RequestMapping("/auth_project")
    public String auto_project(){
        return "manage/auth_project";
    }

    @RequestMapping("/cert")
    public String cert(){
        return "manage/cert";
    }

    @RequestMapping("/type")
    public String type(){
        return "manage/type";
    }

    @RequestMapping("/process")
    public String process(){
        return "manage/process";
    }

    @RequestMapping("/advertisement")
    public String advertisement(){
        return "manage/advertisement";
    }

    @RequestMapping("/message")
    public String message(){
        return "manage/message";
    }

    @RequestMapping("/project_type")
    public String project_type(){
        return "manage/project_type";
    }

    @RequestMapping("/tag")
    public String tag(){
        return "manage/tag";
    }

    @RequestMapping("/param")
    public String param(){
        return "manage/param";
    }

    @RequestMapping("/add")
    public String add(){
        return "manage/add";
    }

    @RequestMapping("/edit")
    public String edit(Integer id, Model model){
        model.addAttribute("id",id);
        return "manage/edit";
    }

    @RequestMapping("/assignRole")
    public String assignRole(){
        return "manage/assignRole";
    }

    @RequestMapping("/reg")
    public String reg(){
        return "reg";
    }

    @RequestMapping("/member")
    public String member(){
        return "member/member";
    }

    @RequestMapping("/minecrowdfunding")
    public String minecrowdfunding(){
        return "member/minecrowdfunding";
    }

    @RequestMapping("/accttype")
    public String accttype(){
        return "member/accttype";
    }

    @RequestMapping("/apply")
    public String apply(){
        return "member/apply";
    }

    @RequestMapping("/apply-1")
    public String apply_1(){
        return "member/apply-1";
    }

    @RequestMapping("/apply-2")
    public String apply_2(){
        return "member/apply-2";
    }

    @RequestMapping("/apply-3")
    public String apply_3(){
        return "member/apply-3";
    }

    @RequestMapping("/start")
    public String start(){
        return "member/start";
    }

    @RequestMapping("/project")
    public String project(){
        return "member/project";
    }

    @RequestMapping("/projects")
    public String projects(){
        return "member/projects";
    }
    @RequestMapping("/start-step-1")
    public String start_step_1(){
        return "member/start-step-1";
    }

    @RequestMapping("/start-step-2")
    public String start_step_2(){
        return "member/start-step-2";
    }

    @RequestMapping("/start-step-3")
    public String start_step_3(){
        return "member/start-step-3";
    }

    @RequestMapping("/start-step-4")
    public String start_step_4(){
        return "member/start-step-4";
    }
}
