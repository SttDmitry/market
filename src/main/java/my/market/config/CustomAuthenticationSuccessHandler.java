package my.market.config;

import my.market.entities.User;
import my.market.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
public class CustomAuthenticationSuccessHandler  {
    private UserService userService;

    @Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

//	@Override
//	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
//			throws IOException, ServletException {
//		System.out.println("\n\nIn customAuthenticationSuccessHandler\n\n");
//		String userName = authentication.getName();
//		System.out.println("userName=" + userName);
//		User theUser = userService.findByUserName(userName);
//		HttpSession session = request.getSession();
//		session.setAttribute("user", theUser);
//		response.sendRedirect(request.getContextPath() + "/");
//	}
}
