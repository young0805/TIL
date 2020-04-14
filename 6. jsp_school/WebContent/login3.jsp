<html>
INPUT ID:
<% 
	String uid = request.getParameter("ID");
	out.print(uid);
%>
</html>

<%-- jsp를 java로 변환. 
out.write("<html>");
out.write("INPUT ID"");

out.write("\r\n");
	String uid = request.getParameter("ID");
	out.print(uid);
out.write("\r\n");

out.write("<html>");
--%>

<%-- 
jsp를 html 변환
<html> input ID:
KIM
</html>
 --%>