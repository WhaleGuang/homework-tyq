<%--
  Created by IntelliJ IDEA.
  User: 大棋
  Date: 2018/8/23
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <div id="hello">
      <input type="checkbox" />苹果
      <input type="checkbox" />香蕉
      <input type="checkbox" />雪梨
      <input type="button" value="点击按钮" id="btn">
    </div>

    <script src="/js/jquery-1.11.3.min.js" ></script>

    <script>
      //不能让两个复选框同时选中
      // $("#hello input").click(function(){
      //     $("#hello input:checked").prop("checked",false);
      //     $(this).prop("checked",true);
      // })
      $("#hello input").click(function(){
          var res=[];
          document.querySelectorAll("body input:checked").forEach((e)=>{
              if(e.checked){
              res.push(e.value());
          }
      });
          alert(res.join("/"));
      })





      /**
       *      function box() {
          var res = [];
          document.querySelectorAll("body input:checked").forEach((e)=>{
              if(e.checked){
              res.push(e.value);
          }
      });
          console.log(res.join("/"));
      }
       */
    </script>
  </body>
</html>
