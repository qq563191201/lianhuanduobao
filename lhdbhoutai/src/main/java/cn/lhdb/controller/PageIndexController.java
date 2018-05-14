package cn.lhdb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageIndexController {
	
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request, HttpSession session,
			ModelMap model) {
		return "/login";
	}
	
	@RequestMapping(value = "/page")
	public String page(HttpServletRequest request, HttpSession session,
			ModelMap model) {
		return "/page/index";
	}
	
	@RequestMapping(value = "/main/adminInfo")
	public String adminInfo(HttpServletRequest request, HttpSession session,
			ModelMap model) {
		return "/page/adminInfo";
	}
	
	@RequestMapping(value = "/main/rolesInfo")
	public String rolesInfo(HttpServletRequest request, HttpSession session,
			ModelMap model) {
		return "/page/rolesInfo";
	}
	
	@RequestMapping(value = "/main/userInfo")
	public String userInfo(HttpServletRequest request, HttpSession session,
			ModelMap model) {
		return "/page/userInfo";
	}
	
	@RequestMapping(value = "/main/notice")
	public String notice(HttpServletRequest request, HttpSession session,
			ModelMap model) {
		return "/page/notice";
	}
	
	@RequestMapping(value = "/main/takeScoreLog")
	public String takeScoreLog(HttpServletRequest request, HttpSession session,
			ModelMap model) {
		return "/page/takeScoreLog";
	}
	
	@RequestMapping(value = "/main/stock")
	public String stock(HttpServletRequest request, HttpSession session,
			ModelMap model) {
		return "/page/stock";
	}
	
	@RequestMapping(value = "/main/online")
	public String online(HttpServletRequest request, HttpSession session,
			ModelMap model) {
		return "/page/online";
	}
	
	@RequestMapping(value = "/main/orderInfo")
	public String orderInfo(HttpServletRequest request, HttpSession session,
			ModelMap model) {
		return "/page/orderInfo";
	}
	
	@RequestMapping(value = "/main/orderDf")
	public String orderDf(HttpServletRequest request, HttpSession session,
			ModelMap model) {
		return "/page/orderDf";
	}
	
	@RequestMapping(value = "/main/jewelDown")
	public String jewelDown(HttpServletRequest request, HttpSession session,
			ModelMap model) {
		return "/page/jewelDown";
	}
	
	@RequestMapping(value = "/main/rebateLog")
	public String rebateLog(HttpServletRequest request, HttpSession session,
			ModelMap model) {
		return "/page/rebateLog";
	}
}
