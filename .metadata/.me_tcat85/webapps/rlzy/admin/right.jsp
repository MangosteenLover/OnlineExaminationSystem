<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="sun.management.ManagementFactory" %>
<%@ page import="com.sun.management.OperatingSystemMXBean" %>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />

		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"4038",secure:"4047"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>

	<body leftmargin="2" topmargin="9" background='<%=path %>/img/allbg.gif' data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-25" data-genuitec-path="/rlzy/WebRoot/admin/right.jsp">
	    <table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-25" data-genuitec-path="/rlzy/WebRoot/admin/right.jsp">
		  <tr bgcolor="#EEF4EA">
		    <td colspan="2" background="<%=path %>/img/wbg.gif" class='title'><span>系统基本信息</span></td>
		  </tr>
		  <tr bgcolor="#FFFFFF">
		    <td width="25%" bgcolor="#FFFFFF" align="right">操作系统版本：</td>
		    <td width="75%" bgcolor="#FFFFFF"><%=System.getProperty("os.name") %>&nbsp;&nbsp;<%=System.getProperty("os.version") %></td>
		  </tr>
		  <tr bgcolor="#FFFFFF">
		    <td width="25%" bgcolor="#FFFFFF" align="right">操作系统类型：</td>
		    <td><%=System.getProperty("os.arch") %><!-- x32,x86 --></td>
		  </tr>
		  <tr bgcolor="#FFFFFF">
		    <td width="25%" bgcolor="#FFFFFF" align="right">用户,目录,临时目录：</td>
		    <td><%=application.getRealPath("/")%></td>
		  </tr>
		  <tr bgcolor="#FFFFFF">
		    <td width="25%" bgcolor="#FFFFFF" align="right">JDK版本：</td>
		    <td><%=System.getProperty("java.version") %></td>
		  </tr>
		  <tr bgcolor="#FFFFFF">
		    <td width="25%" bgcolor="#FFFFFF" align="right">JKD安装目录：</td>
		    <td><%=System.getProperty("java.home") %></td>
		  </tr>
		  <tr bgcolor="#FFFFFF">
		    <td width="25%" bgcolor="#FFFFFF" align="right">总内存/剩余内存：</td>
		    <td>
                <% OperatingSystemMXBean osmb = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();%>
				<b><%=osmb.getTotalPhysicalMemorySize() / 1024/1024 %></b>MB&nbsp;&nbsp;/&nbsp;&nbsp;<b><%=osmb.getFreePhysicalMemorySize() / 1024/1024 %></b>MB
            </td>
		  </tr>
		</table>
	</body>
</html>
