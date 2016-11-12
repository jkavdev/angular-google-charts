angular
.module('videoManagement')
.controller('videoController', 
['$scope', 'videoService',
	function($scope, videoService) {
		videoService.getVideosByCategoryId(1)
		.success(function(response){
			$scope.videos = response.video;
		});
}]);


