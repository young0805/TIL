<% out.print("<html>"); %>
Input ID:

<%
String str= request.getParameter("id");
str+= "</html>";
out.print(str);
%>

<%--jsp를 java로 변환
out.write("<html>");
out.write("INPUT ID: ");


out.write("\r\n");
String str= request.getParameter("id");
str+= "</html>";
out.print(str);
out.write("\r\n");
%-->

<%--
<html>Input ID:
Kim</html>
%-->