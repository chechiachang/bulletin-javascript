<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
Document   : room
Created on : May 4, 2015, 11:34:06 AM
Author     : davidchang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>環境資訊顯示看板</title>

        <script src="assets/jquery/jquery-1.11.2.min.js"></script>
        <!-- Latest compiled and minified CSS -->
        <link href="assets/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!-- Optional theme -->
        <link href="assets/bootstrap-3.3.5-dist/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <!-- Latest compiled and minified JavaScript -->
        <link href="assets/bootstrap-3.3.5-dist/js/bootstrap.min.js" rel="stylesheet" type="text/css"/>
        <!-- Font-awesome -->
        <link href="assets/font-awesome-4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <!-- JQuery UI -->
        <link href="assets/jquery-ui-1.11.4.custom/jquery-ui.min.css" rel="stylesheet" type="text/css"/>
        <script src="assets/jquery-ui-1.11.4.custom/jquery-ui.min.js" type="text/javascript"></script>

        <style>
            h1{
                text-align:center;
            }
            body{
                background: #090930;
                color: white;
            }
            .form-control{
                text-align:center;
                color:black;
                background-color: black;
                height: 80px;
            }
            div.input-group-addon{
                font-size:2em;
                border:none !important;
                background-color:rgba(0,0,0,0) !important;
                color:white !important;
            }
            input{
                background-color:rgba(0,0,0,0) !important;
                border:none !important;
            }
            input.yellow{
                font-weight: bold;
                color:yellow !important;
                font-size: 2em;
            }
            input.measure{
                font-weight: normal;
                color:red !important;
                font-size: 4em;
            }
            input.comfort{
                font-weight: normal;
                //color:springgreen !important;
                font-size: 3em;
            }
            div.color-badge-active{
                opacity:1 !important;
                font-size:3em;
                //border-color: white;
                //border-style: solid;
                //border-width: 5px;
            }
            div.color-badge{
                text-align: center;
                alignment-adjust: middle;
                opacity:0.5;
                position:relative;
                height:30px;
                width:50px;
                //color: rgba(255,0,0,1);
                float:left;
            }
            .comfort-green{
                color: rgba(0,255,0,1);
            }
            .comfort-yellowgreen{
                color: rgba(122,255,0,1);
            }
            .comfort-yellow{
                color: rgba(255,255,0,1);
            }
            .comfort-redyellow{
                color: rgba(255,122,0,1);
            }
            .comfort-red{
                color: rgba(255,0,0,1);
            }
        </style>
    </head>
    <body>
        <c:import url="GetRoomInfoAction"></c:import>
            <div class="container-fluid">
                <div class="row" style="margin-top:50px;">
                    <div class="col-lg-10 col-lg-offset-1">

                        <h1>環境資訊顯示看板</h1>
                        <div class="row">
                            <div class="col-lg-4">
                                <div class="input-group">
                                    <div class="input-group-addon">民國</div>
                                    <input class="form-control yellow" id="fullYear">
                                    <div class="input-group-addon">年</div>
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="input-group">
                                    <input class="form-control yellow" id="month">
                                    <div class="input-group-addon">月</div>
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="input-group">
                                    <input class="form-control yellow" id="date">
                                    <div class="input-group-addon">日</div>
                                </div>                 
                            </div>
                            <div class="col-lg-2">
                                <div class="input-group">
                                    <div class="input-group-addon">星期</div>
                                    <input class="form-control yellow" id="weekDay">
                                </div>
                            </div>
                        </div>
                        <br/>
                        <div class="row form-inline">
                            <div class="col-lg-2">
                                <div class="input-group">
                                    <input class="form-control yellow" id="hours">
                                    <div class="input-group-addon">時</div>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="input-group">
                                    <input class="form-control yellow" id="minutes">
                                    <div class="input-group-addon">分</div>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="input-group">
                                    <input class="form-control yellow" id="seconds">
                                    <div class="input-group-addon">秒</div>
                                </div>
                            </div>                            
                            <div class="col-lg-5">
                                <div class="input-group has-warning">
                                    <div class="input-group-addon">室內溫度</div>
                                    <input class="form-control measure" id="temp" value="${bulletin.temp}">
                                <div class="input-group-addon">℃</div>
                            </div>
                            <div class="col-lg-1">
                                <img src="images/thermometer.png" alt="" style="color:white;height:150px;position:absolute;top:-150px;left:500px;">
                            </div>
                        </div>
                    </div>
                    <br/>
                    <div class="row">
                        <div class="col-lg-1">
                            <img src="images/CO2.png" alt="" style="height:150px;">
                        </div>
                        <div class="col-lg-5">
                            <div class="input-group has-success">
                                <div class="input-group-addon">二氧化碳</div>
                                <input class="form-control measure" id="CO2" value="${bulletin.CO2}">
                                <div class="input-group-addon">ppm</div>
                            </div>
                            <div class="input-group">
                                <div class="input-group-addon">空氣品質</div>
                                <input class="form-control comfort" id="CO2Comfort" placeholder="計算中">
                            </div>
                            <div id="CO2BadgeContainer" class="row">
                                <div style="position:relative;height:30px;width:175px;background-color: rgba(0,0,0,0);float:left;"></div>
                                <div class="color-badge comfort-red"><i class="fa fa-smile-o"></i></div>
                                <div class="color-badge comfort-redyellow"><i class="fa fa-smile-o"></i></div>
                                <div class="color-badge comfort-yellow"><i class="fa fa-smile-o"></i></div>
                                <div class="color-badge comfort-yellowgreen"><i class="fa fa-smile-o"></i></div>
                                <div class="color-badge comfort-green"><i class="fa fa-smile-o"></i></div>
                            </div>
                        </div>
                        <div class="col-lg-5">
                            <div class="input-group has-error">
                                <div class="input-group-addon">相對濕度</div>
                                <input class="form-control measure" id="humid" value="${bulletin.humid}">
                                <div class="input-group-addon">％</div>
                            </div>
                            <div class="input-group">
                                <div class="input-group-addon">舒適指標</div>
                                <input class="form-control comfort" id="humidComfort" placeholder="計算中">
                            </div>
                            <div id="THBadgeContainer" class="row">
                                <div style="position:relative;height:30px;width:175px;color: rgba(0,0,0,0);float:left;"><i class="fa fa-smile-o"></i></div>
                                <div class="color-badge comfort-red"><i class="fa fa-smile-o"></i></div>
                                <div class="color-badge comfort-yellow"><i class="fa fa-smile-o"></i></div>
                                <div class="color-badge comfort-green"><i class="fa fa-smile-o"></i></div>
                                <div class="color-badge comfort-yellow"><i class="fa fa-smile-o"></i></div>
                                <div class="color-badge comfort-red"><i class="fa fa-smile-o"></i></div>
                            </div>
                        </div>
                        <div class="col-lg-1">
                            <img src="images/humid.png" alt="" style="height:150px;">    
                        </div>
                    </div> <!--row-->
                </div><!-- col-lg-10 -->
            </div>
        </div><!-- container -->
        <script src="bulletin.js"></script>
    </body>
</html>
