var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
	clicked=function (){
	alert("Creating PDF");
		 $http.get("http://localhost:8080/ITEXT_Proj/info")
		 .then(function successCallback(response) {
			 $scope.Msg = response.data;
			  }, function errorCallback(response) {
			      alert("PDF Created and Downloaded!!");				 
			  });
	}
});
