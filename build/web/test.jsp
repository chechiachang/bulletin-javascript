<%-- 
    Document   : test
    Created on : May 4, 2015, 1:55:55 PM
    Author     : davidchang
--%>

<%@page import="org.json.JSONObject"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            final String DB_URL = "jdbc:mysql://localhost:3306/wulian";
            final String DRIVER_MANAGER = "com.mysql.jdbc.Driver";
            final String USER = "wulian";
            final String PASS = "wulian";
            Connection conn = null;
            PreparedStatement ps = null;
            ResultSet rs;
            
            String devType = "17";
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            //id list by devType
            ps = conn.prepareStatement("SELECT DISTINCT `devID` FROM `devices_data` WHERE `devType` = ? ");

            ps.setString(1, devType);
            rs = ps.executeQuery();
            List<String> idList = new ArrayList<>();

            while (rs.next()) {
                idList.add(rs.getString("devID"));
            }
            //data list by devID
            HashMap<String, String> devData = new HashMap<>();
            for (String id : idList) {
                ps = conn.prepareStatement("SELECT `devDataText` FROM `devices_data` WHERE `devID` = ? ");
                ps.setString(1, id);
                rs = ps.executeQuery();
                while (rs.next()) {
                    devData.put(id, rs.getString("devDataText"));
                }
            }

            JSONObject json = new JSONObject(devData);

            out.print(json);
        %>
    </body>
</html>
