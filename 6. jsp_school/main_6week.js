<%
    String uid = String session.getAttribute("uid");
    if (uid == null){
        out.print("로그인 정보가 없습니다");
    }
    else {
        out.print("메인페이지입니다");
        Session.setAttribute("uid", uid);
    }

%>