<%@ tag language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ attribute name="title" description="" required="true" type="java.lang.String" %>
<%@ attribute name="content" fragment="true"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Flower Shop</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/assets/style.css" />
</head>
<body>
<div id="wrap">
  <div class="header">
    <div class="logo"><a href="${pageContext.request.contextPath }/home"><img src="${pageContext.request.contextPath }/assets/images/logo.gif" alt="" border="0" /></a></div>
    <div id="menu">
      <ul>
        <li class="selected"><a href="${pageContext.request.contextPath }/home">home</a></li>
        <li><a href="${pageContext.request.contextPath }/about">about us</a></li>
        <li><a href="category.html">flowers</a></li>
        <li><a href="specials.html">specials gifts</a></li>
        <li><a href="myaccount.html">my accout</a></li>
        <li><a href="register.html">register</a></li>
        <li><a href="details.html">prices</a></li>
        <li><a href="contact.html">contact</a></li>
      </ul>
    </div>
  </div>
  <div class="center_content">
    <div class="left_content">
      <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/assets/images/bullet1.gif" alt="" /></span>Featured products</div>
      <div class="feat_prod_box">
        <div class="prod_img"><a href="#"><img src="${pageContext.request.contextPath }/assets/images/prod1.gif" alt="" border="0" /></a></div>
        <div class="prod_det_box">
          <div class="box_top"></div>
          <div class="box_center">
            <div class="prod_title">Product name</div>
            <p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
            <a href="#" class="more">- more details -</a>
            <div class="clear"></div>
          </div>
          <div class="box_bottom"></div>
        </div>
        <div class="clear"></div>
      </div>
      <div class="feat_prod_box">
        <div class="prod_img"><a href="#"><img src="${pageContext.request.contextPath }/assets/images/prod2.gif" alt="" border="0" /></a></div>
        <div class="prod_det_box">
          <div class="box_top"></div>
          <div class="box_center">
            <div class="prod_title">Product name</div>
            <p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
            <a href="#" class="more">- more details -</a>
            <div class="clear"></div>
          </div>
          <div class="box_bottom"></div>
        </div>
        <div class="clear"></div>
      </div>
      <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/assets/images/bullet2.gif" alt="" /></span>New products</div>
      <div class="new_products">
        <div class="new_prod_box"> <a href="#">product name</a>
          <div class="new_prod_bg"> <span class="new_icon"><img src="${pageContext.request.contextPath }/assets/images/new_icon.gif" alt="" /></span> <a href="#"><img src="${pageContext.request.contextPath }/assets/images/thumb1.gif" alt="" class="thumb" border="0" /></a> </div>
        </div>
        <div class="new_prod_box"> <a href="#">product name</a>
          <div class="new_prod_bg"> <span class="new_icon"><img src="${pageContext.request.contextPath }/assets/images/new_icon.gif" alt="" /></span> <a href="#"><img src="${pageContext.request.contextPath }/assets/images/thumb2.gif" alt="" class="thumb" border="0" /></a> </div>
        </div>
        <div class="new_prod_box"> <a href="#">product name</a>
          <div class="new_prod_bg"> <span class="new_icon"><img src="${pageContext.request.contextPath }/assets/images/new_icon.gif" alt="" /></span> <a href="#"><img src="${pageContext.request.contextPath }/assets/images/thumb3.gif" alt="" class="thumb" border="0" /></a> </div>
        </div>
      </div>
      <div class="clear"></div>
    </div>
    <!--end of left content-->
    <div class="right_content">
      <div class="languages_box"> <span class="red">Languages:</span> <a href="#" class="selected"><img src="${pageContext.request.contextPath }/assets/images/gb.gif" alt="" border="0" /></a> <a href="#"><img src="${pageContext.request.contextPath }/assets/images/fr.gif" alt="" border="0" /></a> <a href="#"><img src="${pageContext.request.contextPath }/assets/images/de.gif" alt="" border="0" /></a> </div>
      <div class="currency"> <span class="red">Currency: </span> <a href="#">GBP</a> <a href="#">EUR</a> <a href="#" class="selected">USD</a> </div>
      <div class="cart">
        <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/assets/images/cart.gif" alt="" /></span>My cart</div>
        <div class="home_cart_content"> 3 x items | <span class="red">TOTAL: 100$</span> </div>
        <a href="cart.html" class="view_cart">view cart</a> </div>
      <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/assets/images/bullet3.gif" alt="" /></span>About Our Shop</div>
      <div class="about">
        <p> <img src="${pageContext.request.contextPath }/assets/images/about.gif" alt="" class="right" /> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud. </p>
      </div>
      <div class="right_box">
        <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/assets/images/bullet4.gif" alt="" /></span>Promotions</div>
        <div class="new_prod_box"> <a href="#">product name</a>
          <div class="new_prod_bg"> <span class="new_icon"><img src="${pageContext.request.contextPath }/assets/images/promo_icon.gif" alt="" /></span> <a href="#"><img src="${pageContext.request.contextPath }/assets/images/thumb1.gif" alt="" class="thumb" border="0" /></a> </div>
        </div>
        <div class="new_prod_box"> <a href="#">product name</a>
          <div class="new_prod_bg"> <span class="new_icon"><img src="${pageContext.request.contextPath }/assets/images/promo_icon.gif" alt="" /></span> <a href="#"><img src="${pageContext.request.contextPath }/assets/images/thumb2.gif" alt="" class="thumb" border="0" /></a> </div>
        </div>
        <div class="new_prod_box"> <a href="#">product name</a>
          <div class="new_prod_bg"> <span class="new_icon"><img src="${pageContext.request.contextPath }/assets/images/promo_icon.gif" alt="" /></span> <a href="#"><img src="${pageContext.request.contextPath }/assets/images/thumb3.gif" alt="" class="thumb" border="0" /></a> </div>
        </div>
      </div>
      <div class="right_box">
        <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/assets/images/bullet5.gif" alt="" /></span>Categories</div>
        <ul class="list">
          <li><a href="#">accesories</a></li>
          <li><a href="#">flower gifts</a></li>
          <li><a href="#">specials</a></li>
          <li><a href="#">hollidays gifts</a></li>
          <li><a href="#">accesories</a></li>
          <li><a href="#">flower gifts</a></li>
          <li><a href="#">specials</a></li>
          <li><a href="#">hollidays gifts</a></li>
          <li><a href="#">accesories</a></li>
          <li><a href="#">flower gifts</a></li>
          <li><a href="#">specials</a></li>
        </ul>
        <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath }/assets/images/bullet6.gif" alt="" /></span>Partners</div>
        <ul class="list">
          <li><a href="#">accesories</a></li>
          <li><a href="#">flower gifts</a></li>
          <li><a href="#">specials</a></li>
          <li><a href="#">hollidays gifts</a></li>
          <li><a href="#">accesories</a></li>
          <li><a href="#">flower gifts</a></li>
          <li><a href="#">specials</a></li>
          <li><a href="#">hollidays gifts</a></li>
          <li><a href="#">accesories</a></li>
        </ul>
      </div>
    </div>
    <!--end of right content-->
    <div class="clear"></div>
  </div>
  <!--end of center content-->
  <div class="footer">
    <div class="left_footer"><img src="${pageContext.request.contextPath }/assets/images/footer_logo.gif" alt="" /><br />
      <a href="http://csscreme.com"><img src="${pageContext.request.contextPath }/assets/images/csscreme.gif" alt="" border="0" /></a></div>
    <div class="right_footer"> <a href="#">home</a> <a href="#">about us</a> <a href="#">services</a> <a href="#">privacy policy</a> <a href="#">contact us</a> </div>
  </div>
</div>
</body>
</html>


