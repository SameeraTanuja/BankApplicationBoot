package com.capgemini.bankapplication.controller;

	import javax.servlet.http.HttpServletRequest;

	import org.springframework.web.bind.annotation.ControllerAdvice;
	import org.springframework.web.bind.annotation.ExceptionHandler;

	import com.capgemini.bankapplication.exception.InsufficientBalanceException;
	import com.capgemini.bankapplication.exception.UserNotFoundException;

	@ControllerAdvice
	public class ExceptionController {

//		@ExceptionHandler(value = Exception.class)
//		public String handleError(HttpServletRequest request, Exception exception) {
//			System.out.println(exception);
//			request.setAttribute("success", false);
//			request.setAttribute("error", exception.getMessage() + request.getRequestURI());
//			return "success";
//		}

		@ExceptionHandler(value = UserNotFoundException.class)
		public String handlheError(HttpServletRequest request, UserNotFoundException exception) {
			System.out.println(exception);
			//request.setAttribute("success", false);
			request.setAttribute("error", exception);
			System.out.println(exception.getCause());
			return "success";
		}

		@ExceptionHandler(value = InsufficientBalanceException.class)
		public String handlheErrorf(HttpServletRequest request, InsufficientBalanceException exception) {
			System.out.println(exception);
			//request.setAttribute("success", false);
			request.setAttribute("error", exception);
			System.out.println(exception.getCause());
			return "success";
		}
	}



