package com.businessDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.businessDemo.domain.User;
import com.businessDemo.services.DataService;

@Controller
public class DataController {

	@Autowired
	DataService dataService;

	@RequestMapping("form")
	public ModelAndView getForm(@ModelAttribute User user) {
		return new ModelAndView("form");
	}

	@RequestMapping("register")
	public ModelAndView registerUser(@ModelAttribute User user) {
		dataService.insertRow(user);
		return new ModelAndView("redirect:list");
	}

	@RequestMapping("list")
	public ModelAndView getList() {
		List<User> userList = dataService.getList();
		return new ModelAndView("list", "userList", userList);
	}

	@RequestMapping("delete")
	public ModelAndView deleteUser(@RequestParam int id) {
		dataService.deleteRow(id);
		return new ModelAndView("redirect:list");
	}

	@RequestMapping("edit")
	public ModelAndView editUser(@RequestParam int id, @ModelAttribute User user) {
		User userObject = dataService.getRowById(id);
		return new ModelAndView("edit", "userObject", userObject);
	}

	@RequestMapping("update")
	public ModelAndView updateUser(@ModelAttribute User user) {
		dataService.updateRow(user);
		return new ModelAndView("redirect:list");
	}

	@RequestMapping("navbar")
	public ModelAndView getNavbar() {
		return new ModelAndView("navbar");
	}

}
