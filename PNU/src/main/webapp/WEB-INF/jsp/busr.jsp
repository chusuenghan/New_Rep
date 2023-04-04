<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BusRoute</title>
<script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=uxcg7j4o6i"></script>

</head>
<body>
    <div id="map" style="width:100%;height:1200px;margin:0 auto;"></div>
    <script>
	var mapDiv = document.getElementById('map'); // 'map'으로 선언해도 동일

	//옵션 없이 지도 객체를 생성하면 서울 시청을 중심으로 하는 16 레벨의 지도가 생성됩니다.
	var map = new naver.maps.Map(mapDiv);
	//var mapOption = {
	//		center : new naver.maps.LatLng(37.504875, 126.939053),
	//		zoom:12
//	}
	//var map = new naver.maps.Map("map", mapOption);
</script>
</body>
</html>