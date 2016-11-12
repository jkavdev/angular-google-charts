angular
.module('videoManagement')
.factory('videoService',
['$http',
	function($http){
		var factory = {};
		
		factory.getAllCategories = function() {
			return $http({
				method: 'GET',
				url: '/angular-google-charts/category/getallcategories'
			});
		};
		
		factory.getVideosByCategoryId = function(categoryId) {
			return $http({
				method: 'GET',
				url: '/angular-google-charts/video/getvideosbycategoryid',
				header: {'Content-Type': 'application/json'},
				params: {
					categoryId: categoryId
				}
			});
		};
		
		return factory;
}]);