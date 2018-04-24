angular.module("tollsApp")
        .config(function ($routeProvider) {
//    $routeProvider.when("/", {
//        // templateUrl : "carosol.jsp",
//    });
    $routeProvider.when("/vehicleReg.jsp", {
        templateUrl: "vehicleReg.jsp",
    });
     $routeProvider.when("/tollsLogin", {
        templateUrl: "loginAdmin.jsp",
     });
    $routeProvider.when('/tollsCounter', {
        resolve:{
            "check": function($location, $rootScope) {
                if(!$rootScope.adminLogged){
                    $location.path("/");
                }
            }
        },
        templateUrl: 'tollsCounter.jsp'
    });
     $routeProvider.when('/tollsRateAdmin', {
        resolve:{
            "check": function($location, $rootScope) {
                if(!$rootScope.adminLogged){
                    $location.path("/");
                }
            }
        },
        templateUrl: 'tollsRate.jsp'
    });
     $routeProvider.when('/tollsCounterAdmin', {
        resolve:{
            "check": function($location, $rootScope) {
                if(!$rootScope.adminLogged){
                    $location.path("/");
                }
            }
        },
        templateUrl: 'tollsCounterAdmin.jsp'
    });

});
