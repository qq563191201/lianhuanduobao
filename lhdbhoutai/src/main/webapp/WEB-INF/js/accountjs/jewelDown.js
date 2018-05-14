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
	$.post("../jewel/search",{
		currentPage:currentPage,
		userId:$("#userId").val(),
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
						var scoreList = val.scoreList;
						var jewelList = "";
						for(var i=0;i<scoreList.length;i++){
							jewelList += "<td>";
							if(scoreList[i].size != 0){
								jewelList += "<img width=25px src=../media/image/jewel/ico_"+scoreList[i].id+".png>X"
							}
							jewelList += scoreList[i].size+"<br>奖励："+scoreList[i].score+"</td>";
							var cellList = scoreList[i].cellList;
							jewelList += "<td><div class=\"jewelWith\">";
							jewelList += "<div class=\"rotate90 rotate-top\">";
							for(var j=0;j<cellList.length;j++){
								var arr = cellList[j];
								console.log(arr);
								for(var y=0;y<arr.length;y++){
									jewelList += "<img class=\"rotate-add90\" width=25px src=../media/image/jewel/ico_"
										+arr[y]+".png>";
								}
								jewelList +="<br>";
							}
							jewelList += "</div></div></td>";
						}
						trObj.append($("<td>用户id："+val.userId+"<br>"+"注单号:"+val.id+"<br>"
								+"时间:"+val.time+"<br>下注金额:单线"+val.stakeScore+",共"+val.multiple+"线,总共"+val.stakeScore*val.multiple
								+"<p>总计:"+val.fetchScore+"</p>"+jewelList));
						trObj.append($("</td>"));
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