<%@page import="com.springbook.biz.user.UserDAO"%>
<%@page import="com.springbook.biz.user.UserVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>

<%
	//1. ����� �Է� ���� ����
	String id = request.getParameter("id");
	String password = request.getParameter("password");

	System.out.println("complete");
	//2. DB ���� ó��
	UserVO vo = new UserVO();
	vo.setId(id);
	vo.setPassword(password);
	
	UserDAO userDAO = new UserDAO();
	UserVO user = userDAO.getUser(vo);
	
	System.out.println("complete");
	//3. ȭ�� �׺���̼�
	if(user != null){
		response.sendRedirect("getBoardList.jsp");
	}else{
		response.sendRedirect("login.jsp");
	}

%>