package com.geekwise.geekwiserestaurantapplication;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.geekwise.geekwiserestaurantapplication.dao.FoodDao;
import com.geekwise.geekwiserestaurantapplication.dao.UserDao;


@Controller
public class GeekwiseController {

@Autowired
UserDao userDao;
	
@Autowired
FoodDao foodDao;

@RequestMapping("/")
public ModelAndView landing() {
	return new ModelAndView("landing");
	}	

@RequestMapping("/login")
public ModelAndView showLogin() {
	return new ModelAndView("login");
}

@PostMapping("/login")
public ModelAndView submitLoginForm(@RequestParam("email") String email, @RequestParam("password") String password,
		HttpSession session, RedirectAttributes redir) {
	User user = userDao.findByEmail(email);
	if (user == null || !password.equals(user.getPassword())) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("message", "Invalid email or password.");
		return mav; 
	}

	session.setAttribute("user", user);
	return new ModelAndView("redirect:/order");
	
}

@RequestMapping("/logout")
public ModelAndView logout(HttpSession session, RedirectAttributes redir) {
	session.invalidate();
	return new ModelAndView("redirect:/");
}

@RequestMapping("/order")
public ModelAndView showOrder(@SessionAttribute("user") User user) {
	ModelAndView mav = new ModelAndView("order");
	return mav;
}


@PostMapping("/order")
public ModelAndView submitOrder(@SessionAttribute("user") User user, @RequestParam("menu") String menu, @RequestParam("quantity") int quantity) {
	Food food = new Food();
	food.setMenu(menu);
	food.setQuantity(quantity);
	food.setUser(user);
	foodDao.createFood(food);
	return new ModelAndView("vieworders");
}

@RequestMapping("/vieworders")
public ModelAndView viewOrders(@SessionAttribute("user") User user) {
	List<Food> food = foodDao.findByUser(user);
	return new ModelAndView("vieworders", "food", food);

}

}