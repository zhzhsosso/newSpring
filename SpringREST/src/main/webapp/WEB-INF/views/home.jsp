<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	<hr>
	<input type="button" value="Create(글쓰기)" id="btnC">
	<input type="button" value="Read(글조회)" id="btnR">
	<input type="button" value="Read(글리스트)" id="btnL">
	<input type="button" value="Update(글수정)" id="btnU">
	<input type="button" value="Delete(글삭제)" id="btnD">
	
	<hr>
	<div id="read"></div>
	
	

	<script src="https://code.jquery.com/jquery-3.6.3.js"
		integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="
		crossorigin="anonymous"></script>
	
	<script type="text/javascript">
	  $(function(){
		  // 글쓰기 버튼 클릭시 - 글쓰기 동작
		  
		  $("#btnC").click(function(){
			  
			  // 글정보(객체)
			  var board = {
				 bno:"1",
				 title:"test1",
				 content:"content1",
				 writer:"admin1",
				 regdate:"2022-12-26",
				 viewcnt:10				 
			  };
			  
			  // ajax 사용해서 RestController 전달
			  // POST	 /boards+데이터
			  $.ajax({
				  type:"post",
				  url:"/boards",
				  contentType:"application/json",
				  data : JSON.stringify(board),
				  success:function(data){
					  alert("성공");
					  alert(" 글쓰기 여부 : "+data);
				  },error:function(data){
					  alert("에러");
					  console.log(data);
				  }
			  });// ajax
		  });//#btnC
		  
		  
		  // 글조회  GET		 /boards/100
		  $("#btnR").click(function(){
			  // ajax 사용 restcontroller에서 정보 받아오기
			  $.ajax({
				  type:'get',
				  url:'/boards/100',
				  success:function(data){
					  alert(" 조회 성공! ");
					  //alert(data);
					  console.log(data);
					  $("#read").append(
						 data.bno+"/"+data.title+"/"+data.content+"/"+data.writer	  
					  );
					  
				  }				  
			  });//ajax
			  
		  }); //#btnR
		  
		  
		  // 글 조회(list)   방식 : GET     주소URI : /boards/all 
		  $("#btnL").click(function(){
			 $.ajax({
				 type:"get",
				 url:"/boards/all",
				 success:function(list){
					 alert("리스트 성공");
					 console.log(list);
// 					 for(var vo in list){
// 						 //$("#read").append(vo+"<br>");
// 						 $("#read").append(list[vo].bno+"//"+list[vo].title+"<br>");
// 					 }
					$(list).each(function(idx,vo){
						 $("#read").append(vo.bno+"//"+vo.title+"<br>");
					});

					 
				 }				 
			 }); 			  
		  });	
		  
		  
		  // 수정 	PUT		 /boards/100+(수정할)데이터
		  /*
		  $.ajax({
				type:"put",
				url: "/boards/100",
				contentType:"application/json",
				data:JSON.stringify(board),
				success:function(){
					
				}
		  })
		  
		  */
		  // 삭제 	DELETE   /boards/100
		  /*
		  $.ajax({
			 type:'delete',
			 url:'/boards/100'
		  });
		  
		  */
		  
		  
		  
		  
	  });// jQuery	
	</script>




</body>
</html>
