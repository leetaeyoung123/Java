<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en" class="h-100">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.101.0">
    <title>Cafe Home</title>
    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/cover/">
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.min.css'/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/homecss/cover.css'/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/homecss.css'/>"/>
	
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .b-example-divider {
        height: 3rem;
        background-color: rgba(0, 0, 0, .1);
        border: solid rgba(0, 0, 0, .15);
        border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -.125em;
        fill: currentColor;
      }

      .nav-scroller {
        position: relative;
        z-index: 2;
        height: 2.75rem;
        overflow-y: hidden;
      }

      .nav-scroller .nav {
        display: flex;
        flex-wrap: nowrap;
        padding-bottom: 1rem;
        margin-top: -1px;
        overflow-x: auto;
        text-align: center;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
      }
    </style>

    
    <!-- Custom styles for this template -->
  </head>
  <body class="d-flex h-100 text-center backgounrdcolor">
    
<div class="cover-container d-flex w-100 p-3 mx-auto flex-column maincolor">
  <header>
    <div class="imgsize">
      <h3 class="float-md-start mb-0"><a href=home><img src=<c:url value='/resources/css/img/logo/javalogo.jpg'/>></a></h3>
      <nav class="nav nav-masthead justify-content-center float-md-end">
        <a class="nav-link fw-bold py-1 px-0 active" aria-current="page" href="home">Home</a>
        <a class="nav-link fw-bold py-1 px-0" href="select/highCate" style="margin-right: 2px;">Menu</a>
     	<a href=root/login><img class="root" src=<c:url value='/resources/css/img/logo/root_icon.png'/>></a>
      </nav>
    </div>
  </header>

  <main>
      <a href="select/highCate" class="button">주문</a>
  </main>

  <footer class="mt-auto text-white-50">
  </footer>
</div>


    
  </body>
</html>
