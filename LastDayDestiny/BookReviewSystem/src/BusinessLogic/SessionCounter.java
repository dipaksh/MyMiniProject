package BusinessLogic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;



public class SessionCounter implements Serializable, HttpSessionListener{
	static int ActiveSessionNumber = 0;
	
	
	@Override
	public void sessionCreated(HttpSessionEvent e) {
		//System.out.println(e.getSession().getId());
		ActiveSessionNumber++;
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent e) {
		
		if(ActiveSessionNumber>0){
			ActiveSessionNumber--;
		}
		
		
	}
	public static int getActiveSessionNumber() {
		return ActiveSessionNumber;
	}

	

	

	
	
	
}