
<script type="text/javascript" src="${pageContext.request.contextPath}/javascript/tableSorter/jquery.sort.js"></script>
<style type="text/css">
#tabDiv{
	display: none;
}
/* 无tab情况 */
#queryResultList{
	width: 100%;
}
/* 有tab情况 */
div div#queryResultList,div div#queryResultList2, div.queryResultList, div.tableTab{
	padding-top:0px;
	width: 100%;
}
table.tablesorter, table.tablesorter1, #alarmTableDivScroll table{
	width:100%;
	margin:0;
	padding:0;
	border:1px solid #668db0;
	border-collapse:collapse;
 	background: url('${pageContext.request.contextPath}/js/tableSorter/th_mid.png');

	
}
.ui-tabs div#queryResultList table.tablesorter,div.tableTab table.tablesorter,
.ui-tabs div#queryResultList2 table.tablesorter{margin-top: -5px;}

table.tablesorter thead tr th.th4{border-left: solid 1px #509db3;}
table.tablesorter thead tr th.th5{border-right: solid 1px #509db3}
table.tablesorter thead tr th.th1, table.tablesorter thead tr th.th2,table.tablesorter thead tr th.th3
, #alarmTableDivScroll table thead tr th.th1, #alarmTableDivScroll table thead tr th.th2, #alarmTableDivScroll table thead tr th.th3{
	text-align:center;
	padding: 0px 15px;
}
/**定义【table】样式**/
TABLE{
	width:100%;
	color:#000000;
　　 font-size:12px;
	padding:0;
	border:0;margin:0;
	border-collapse:collapse;
}
/**排序表格的th样式
备注: 
     1、 去掉了table-sorter插件对th的背景色设置为4B94EA,add by geliangfeng on 2011-10-12 15:04:01
*/
table.tablesorter1 thead tr th, table.tablesorter thead tr th,table.tablesorter thead tr, table.tablesorter thead, table.tablesorter tfoot tr th {
	width:auto;
	text-align:center; 
	padding:0;
	border:0;
	margin:0;
	border-collapse:collapse;

}
 
table.tablesorter tbody tr td, table.tablesorter tbody tr, table.tablesorter tbody {
	border:solid 1px #9ec8e1; border-left:0px; border-right:0px;border-left:1px solid #9ec8e1;	
}

table.tablesorter thead tr .header {
	background-image: url('${pageContext.request.contextPath}/js/tableSorter/bg.gif');
	background-repeat: no-repeat;
	background-position: center right;
	cursor: pointer;
}

table.tablesorter thead tr .headerSortUp {
	background-image: url('${pageContext.request.contextPath}/js/tableSorter/asc.gif');
}

table.tablesorter thead tr .headerSortDown {
	background-image: url('${pageContext.request.contextPath}/js/tableSorter/desc.gif');
}

/**
      点击某一列时，th的背景色  modify by geliangfeng  on 2011-10-12 17:26:50
*/
table.tablesorter thead tr th.headerSortDown, table.tablesorter thead tr th.headerSortUp {
	/*background:url(${pageContext.request.contextPath}/js/tableSorter/th_middj.png);*/
	background-color:#f7e4af;
}
table.ponTable{margin: 0px}
</style>

