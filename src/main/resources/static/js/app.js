var app = angular.module('bbcard', ['ngResource', 'ui.router', 'ngMaterial']);

app.config(function($stateProvider, $urlRouterProvider, $mdThemingProvider) {
	  $mdThemingProvider
	  	.theme('default')
		    .primaryPalette('blue-grey', {
		      'default': '500',
		      'hue-1': '50'
		    })
	    	.accentPalette('pink');
	 ;
	
	$urlRouterProvider.otherwise("/");	
	
	$stateProvider
		.state('home', {
			url: '/',
			templateUrl: 'partials/page1.html'
		})
		;
})