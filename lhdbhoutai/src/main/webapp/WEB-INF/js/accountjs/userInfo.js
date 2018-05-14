var currentPage = 1;
jQuery(document).ready(function() {       
	var hour = 24;
	//初始化两个日期
	$("#start").val(moment().subtract('hours', hour).format('YYYY-MM-DD HH:mm:ss'));
    $("#end").val(moment().format('YYYY-MM-DD HH:mm:ss'));
	$('#reservationtimeadd').val(
			 moment().subtract('hours', hour).format('YYYY-MM-DD HH:mm:ss') + '至'
			 + moment().format('YYYY-MM-DD HH:mm:ss')); 
	$('#reservationtimeadd').daterangepicker({
        timePicker: true,
        timePickerIncrement: 10,
        format: 'YYYY-MM-DD HH:mm:ss'
      }, function(start, end, label) {
   	   console.log(start.toISOString(), end.toISOString(), label);
   	   $("#start").val(start.toDate().format("yyyy-MM-dd hh:mm:ss"));
   	   $("#end").val(end.toDate().format("yyyy-MM-dd hh:mm:ss"));
      });
	App.init();
	Search.init();//时间插件的调取
	$("#userid").val(getQueryString("userid"));
	search(1);
});
		
function serachData(){
	$("#userid").val("");
	search(1);
}

function search(currentPage){
	currentPage = currentPage;
	$("#table-data>tbody").html("");//清除旧表格数据
	showLoading("table-data");//显示进度条
	hideEmptyDesc();//删除没有查询结果的文字描述
	$.post("../account/search",{
		currentPage:currentPage,
		userId:$("#userid").val(),
		userName:$("#userName").val(),
		tel:$("#tel").val(),
		registerIp:$("#registerIp").val(),
		nickName:$("#nickName").val(),
		start:$("#start").val(),
		end:$("#end").val(),
		limit:30
		},function(resultObject){
			if(resultObject.success) {
					hideLoading();//隐藏进度条
					if(resultObject.data.length==0){
						showEmptyDesc("table-data");//显示没有查询结果的文字描述
						return;
					}
					//循环生成表格数据
					$.each(resultObject.data, function(key, val) {
						var trObj = $("<tr/>");
						trObj.append($("<td><input type='checkbox' name='checkbox' value='"+val.userId+"' onchange='changeSelect(this)' /></td>"));
						trObj.append($("<td>"+IsNotNull(val.userId)+"</td>"));
						trObj.append($("<td>"+(val.userName)+"</td>"));
						trObj.append($("<td>"+(val.name)+"</td>"));
						trObj.append($("<td>"+(val.userBank.score)+"</td>"));
						var isBlack = "否";
						if(val.state == 1){
							isBlack = "<span style='color:red'>是</span>";
						}
						trObj.append($("<td>"+isBlack+"</td>"));
						trObj.append($("<td>"+(val.tel)+"</td>"));
						trObj.append($("<td>"+(val.registerIp)+"</td>"));
						trObj.append($("<td>"+IsNotNull(val.nickName)+"</td>"));
						trObj.append($("<td>"+(val.birthday)+"</td>"));
						trObj.append($("<td>"+(val.registerDate)+"</td>"));
						trObj.append($("<td>"+(val.updateDate)+"</td>"));
						trObj.appendTo("#table-data>tbody");
					});
					
					//创建分页
					var pager = resultObject.params.pager;
					myBootstrapPaginator("bootstrapPaginator",pager);
				}else{
					hideLoading();//隐藏进度条
					alert(resultObject.message);//弹出错误信息
				}
	},'json');
		
}
//判断是否为空
function IsNotNull(data){
	if(data==null)
		return "";
	else
		return data;
}
function sendXydandJy(obj){
	if(obj==1){
		$("#xydandjy").html("赠送金币");
		$("#xfspan").html("获得金币：");
		$("#xfreason").html("赠送原因：");
		$("#btn_xydjy").attr("onclick","send_xyd()");
	}
}
function sendxf(obj){
	if(obj==1){
		$("#xydandjy").html("下分");
		$("#xfspan").html("下金币：");
		$("#xfreason").html("下分原因：");
		$("#btn_xydjy").attr("onclick","send_xf()");
	}
}
function sendFeng(){
	if(confirm("确定封号/解封")){
		$.post("../account/feng"+getParams(),{
   			},function(v){
   				if(v.success) {
					$("#sendxyd").modal("hide");
					// 刷新
					// 这里括号里面应该根据当前页面的页数 填写
					// 待修改
					search(currentPage);
					// 提示信息显示
					$.messager.alert("操作提示", "成功!");
				}else{
					alert(v.message);
				}
   			}
		);
	}
}
function setpwd(){
	$.post("../account/uppwd"+getUserIds(),{
		},function(v){
			if(v.success) {
				$("#updatePwd").modal("hide");
				// 刷新
				// 这里括号里面应该根据当前页面的页数 填写
				// 待修改
				search(currentPage);
				// 提示信息显示
				$.messager.alert("操作提示", "成功!");
			}else{
				alert(v.message);
			}
		}
	);
}
//function checkRMB(){
//	var rmbNum = $("#form_rmbNum").val().replace(/[^\- \d.]/g,'');
//	$("#form_rmbNum").val(rmbNum);
//	$("#form_xydNum").val(rmbNum*100);
//}
function send_xyd(){
	if($("#form_xydNum").val()!=0){
		$.post("../account/presentScoreForUserId"+getParams(),{
			addRmbNum:$("#form_rmbNum").val(),
			addNum:$("#form_xydNum").val(),
			reason:$("#form_msg").val()
   			},function(v){
				if(v.success) {
					$("#sendxyd").modal("hide");
					// 刷新
					// 这里括号里面应该根据当前页面的页数 填写
					// 待修改
					search(currentPage);
					// 提示信息显示
					$.messager.alert("操作提示", "赠送成功!");
				}else{
					alert(v.message);
				}
   			}
		);
	}else{
		$.messager.alert("操作提示", "请填写赠送数量!");
	}
}
//下分
function send_xf(){
	if($("#form_xydNum").val()!=0){
		$.post("../account/subScoreForUserId"+getParams(),{
			addRmbNum:$("#form_rmbNum").val(),
			addNum:$("#form_xydNum").val(),
			reason:$("#form_msg").val()
   			},function(v){
				if(v.success) {
					$("#sendxyd").modal("hide");
					// 刷新
					// 这里括号里面应该根据当前页面的页数 填写
					// 待修改
					search(currentPage);
					// 提示信息显示
					$.messager.alert("操作提示", "下分成功!");
				}else{
					alert(v.message);
				}
   			}
		);
	}else{
		$.messager.alert("操作提示", "请填写赠送数量!");
	}
}
function getParams(){
	var i = 0;
	var ids = '?';
	$("#itemContainer input:checked").each(function () {
		if(i>0){
			ids = ids+'&useridArray='+$(this).val();
		}else{
			ids = ids+'useridArray='+$(this).val();
		}
		i++;
	});
	return ids;
}
function getUserIds(){
	var i = 0;
	var ids = '?';
	$("#itemContainer input:checked").each(function () {
		if(i>0){
			ids = ids+'&userId='+$(this).val();
		}else{
			ids = ids+'userId='+$(this).val();
		}
		i++;
	});
	return ids;
}