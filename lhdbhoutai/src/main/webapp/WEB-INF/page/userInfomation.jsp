<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String userid = request.getParameter("userid");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1">
	<meta content="width=device-width, initial-scale=1.0" name="viewport" />
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
	<meta content="" name="description" />
<jsp:include page="public/css.jsp"></jsp:include>
</head>
<body>
	<div style="padding: 15px;">
			<div>
				<div class="row-fluid">
					<div class="span12">
						<!--表格 begin-->
						<div class="portlet box blue">
							<!--显示内容信息的标题 begin-->
							<div class="portlet-title">
								<div class="caption">
									<i class="icon-globe"></i>用户基本信息
								</div>
							</div>
							<!--显示内容信息的标题 end-->
						   
						    <div class="portlet-body">
						    <div id="table-data">
								<div class="showAllInfo" >
								   <!--财富信息-->
									<div class="row-fluid  portlet-body" >
										<div class="span2 responsive mapheight" data-desktop="span2" >
											<table  class="table tableall">
											<tbody>
												<tr>
													<td rowspan=7 align="right"><img alt="" id="headpic" src=""></td>
											  	</tr>
											</tbody>
											</table>
											<iframe id="mapIframe" src="baidu.jsp?userid=<%=userid %>" width="260%" height="300%"></iframe>
										</div>
										<div class="span5 responsive" data-desktop="span5">
											<table id="" class="table tableall">
											<tbody>
												  <tr>
													<td align="right">电话：+<span id="phone"></span></td>
												  </tr>
												  <tr>
													<td align="right">昵称：<span id="username"></span></td>
												  </tr>
												  <tr>
													<td align="right">姓名：<span id="name"></span></td>
												  </tr>
												  <tr>
													<td align="right">在线时间：<span id="online"></span></td>
												  </tr>
												  <tr>
													<td align="right"><a id="contactSearch" class="a-hover" href="javascript:search();">通讯录</a></td>
													<td><a id="deviceSearch" href="javascript:searchDeviceRecord();">设备记录</a></td>
												  </tr>
												  <!-- <tr>
													<td align="right"><a>IP记录</a></td>
													<td><a id="deviceSearch" href="javascript:searchDeviceRecord();">设备记录</a></td>
												  </tr> -->
												  <tr>
													<td align="right">
													<a id="onlineGps" href="javascript:void(0);">实时开关</a><span id="gpsdw"></span>&nbsp;<select class="select-gps" id="time" onchange="changeGpsTime();">
														<option value=5000 selected>5秒</option>
														<option value=10000>10秒</option>
														<option value=20000>20秒</option>
														<option value=30000>30秒</option>
														<option value=60000>60秒</option>
														<option value=120000>120秒</option>
														</select>
														<input type="checkbox" id="location" checked>
													<a id="refresh" href="javascript:void(0);">刷新</a>
													</td>
													<td>
														<a id="gpsSearch" href="baidu.jsp?userid=<%=userid %>&guiji=1" target=blank_<%--  onclick="openNewWin('baidu.jsp?userid=<%=userid %>&guiji=1','null',1250,600)" --%>>运动轨迹</a>
													</td>
												  </tr>
											</tbody>
											</table>
										</div>
										<div class="span5 responsive" data-desktop="span5">
											<table id="table-onlineUser" class="table table-striped  table-hover table-full-width" >
												<tbody id="itemContainer">
											</tbody>
											</table>
											<!--分页 开始-->
											<div class="row-fluid pagelist" id="bootstrapPaginator">
			
											</div>
											<!--分页 结束-->
										</div>
								    </div>									
								</div>
								</div>
							</div>
						</div>
						<!--表格 end-->
					</div>
				</div>
			</div>
	</div>
	<jsp:include page="public/js.jsp"></jsp:include>
</body>
<script src="../js/accountjs/userInfoBase.js?5"></script> 
</html>