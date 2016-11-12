google.charts.load('current', {'packages':['bar']});

  google.charts.setOnLoadCallback(drawChart);
  
  function drawChart(videos) {
	  
	  var charData = prepareChartData(videos);
	  
	  var data = new google.visualization.DataTable();
	  data.addColumn('string', 'Video Name');
	  data.addColumn('number', 'Like Count');
	  data.addColumn('number', 'Dislike Count');
	  data.addRows(charData);

	  var options = {
		chart: {
			title: 'Videos Reviews',
			subtitle: 'Video name, like count, and dislike count',
		},
			height: 300
	  };

	  var chart = new google.charts.Bar(document.getElementById('columnchart_material'));

	  chart.draw(data, options);		 
}
  
  function prepareChartData(videos){
	  var chartData = [];
	  
	  for(i = 0; i < videos.length; i++){
		  var temp = [
			  videos[i].videoName,
			  parseInt(videos[i].likeCount),
			  -parseInt(videos[i].dislikeCount)
		  ];
		  
		  chartData.push(temp);
	  }
	  
	  return chartData;
  }