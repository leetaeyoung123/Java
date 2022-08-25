<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	<script type="text/javascript">
		google.charts.load('current', {'packages' : [ 'bar', 'corechart' ] });
		google.charts.setOnLoadCallback(drawChart);
		google.charts.setOnLoadCallback(testChart);
		

		function drawChart() {
			//for Bar
			var data = google.visualization.arrayToDataTable([
					[ 'Project Team', 'Collaborative-Effort', 'Selfish-Motive', 'Frequent-Communication' ],
					[ 'Team A', 0.3, 0.5, 0.9 ], [ 'Team B', 0.6, 0.8, 0.3 ],
					[ 'Team C', 0.4, 0.6, 0.7 ], [ 'Team D', 0.5, 0.6, 0.6],
					[ 'Team E', 0.8, 0.6, 0.3 ], [ 'Team F', 0.5, 0.4, 0.8] ]);

			var options = {
				chart : {
					title : 'Analysis of Team Mind',
					subtitle : '',
				}
			};

			var chart = new google.charts.Bar(document.getElementById('barchart-section'));
			chart.draw(data, google.charts.Bar.convertOptions(options));
			
			//for PI
			var data = google.visualization.arrayToDataTable([
		          ['Atmosphere', 'Stress strength'],
		          ['Smoking Relationship',        8.2],
		          ['Fetch and Nice Students',    58],
		          ['Frequency of Room-Out',      11],
		          ['Compliance of Instructions', 6.5],
		          ['Sleeping without Reasons',    5.0],
		          ['Concentration of Learning',  11.3]
		        ]);

		        var options = {
		          title: 'Atmosphere of My class',
		          is3D: true,
		        };

		        var chart = new google.visualization.PieChart(document.getElementById('piechart-section'));

		        chart.draw(data, options);
		}
		
		function testChart() {
			//for Bar
			var data = google.visualization.arrayToDataTable([
					[ 'name', 'age', 'height', 'smoking rate' ],
					[ '이태영', 0.6, 0.8, 1 ], [ '박상규', 0.5, 0.6, 1 ],
					[ '이성호', 1, 0.6, 1 ], [ '백기열', 0.8, 0.6, 1],
					[ '한태우', 0.4, 1, 1 ]]);

			var options = {
				chart : {
					title : 'Analysis of Team Mind',
					subtitle : '',
				}
			};

			var chart = new google.charts.Bar(document.getElementById('barchart-section2'));
			chart.draw(data, google.charts.Bar.convertOptions(options));
			
			//for PI
			var data = google.visualization.arrayToDataTable([
				  ['nodata','nodata'],
		          ['EssECHANGE',        50.0],
		          ['EssEGRAM',    20.0],
		          ['MALBORO',      10.5],
		          ['BOHAM', 10.5],
		          ['FRANCHBLACK',    6.0],
		          ['NOSMOKE',  3.0]
		        ]);

		        var options = {
		          title: 'Types of cigarettes',
		          is3D: true,
		        };

		        var chart = new google.visualization.PieChart(document.getElementById('piechart-section2'));

		        chart.draw(data, options);
		}
	</script>
</head>
<body>
	<div id="barchart-section" style="width: 800px; height: 500px;"></div>
	<div id="piechart-section" style="width: 900px; height: 500px;"></div>
	<div id="barchart-section2" style="width: 800px; height: 500px;"></div>
	<div id="piechart-section2" style="width: 900px; height: 500px;"></div>
</body>
</html>