

//######## Vehicle Registration ########
angular.module('tollsApp')
        .controller("vehicleregCrtl", function ($scope, $http) {
            $scope.vehicleregAll = [];
            $scope.vehiclereg = [];

            $scope.vehicleForm = {
                vehicleId: -1,
                vehicleNo: "",
                vehicleType: "",
                vehicleName: "",
                modelNo: "",
                engineNo: "",
                ownerName: "",
                address: "",
                phone: ""
            }

            _refreshPageData();

            $scope.submitVehicle = function () {

                var method = "";
                var url = "";
                if ($scope.vehicleForm.vehicleId == -1) {
                    method = "POST";
                    url = 'tolls/vehiclereg';
                } else {

                    method = "PUT";
                    url = 'tolls/vehiclereg/' + $scope.vehicleForm.vehicleId;
                }

                $http({
                    method: method,
                    url: url,
                    data: angular.toJson($scope.vehicleForm),
                    headers: {
                        'Content-Type': 'application/json'
                    }
                }).then(_success, _error);
            };


            $scope.removeVehicle = function (vehicle) {
                $http({
                    method: 'DELETE',
                    url: 'tolls/vehiclereg/' + vehicle.vehicleId,
                }).then(_success, _error);
            };

            $scope.editVehicle = function (vehicle) {
                $scope.vehicleForm.vehicleId = vehicle.vehicleId,
                        $scope.vehicleForm.vehicleNo = vehicle.vehicleNo,
                        $scope.vehicleForm.vehicleType = vehicle.vehicleType,
                        $scope.vehicleForm.vehicleName = vehicle.vehicleName,
                        $scope.vehicleForm.modelNo = vehicle.modelNo,
                        $scope.vehicleForm.engineNo = vehicle.engineNo,
                        $scope.vehicleForm.ownerName = vehicle.ownerName,
                        $scope.vehicleForm.address = vehicle.address,
                        $scope.vehicleForm.phone = vehicle.phone
            };

            function _refreshPageData() {
                $http({
                    method: 'GET',
                    url: 'http://localhost:8084/TollsSystem/tolls/vehiclereg'
                }).then(function successCallback(response) {
                    $scope.vehicleregAll = response.data;
                }, function errorCallback(response) {
                    console.log(response.statusText);
                });
            }

            function _success(response) {
                $scope.vehiclereg = response.data;
                _refreshPageData();
                _clearForm()
            }
            function _error(response) {
                console.log(response.statusText);
            }
            //Clear the form
            function _clearForm() {
                $scope.vehicleForm.vehicleId = -1,
                        $scope.vehicleForm.vehicleNo = "",
                        $scope.vehicleForm.vehicleType = "",
                        $scope.vehicleForm.vehicleName = "",
                        $scope.vehicleForm.modelNo = "",
                        $scope.vehicleForm.engineNo = "",
                        $scope.vehicleForm.ownerName = "",
                        $scope.vehicleForm.address = "",
                        $scope.vehicleForm.phone = ""
            }

            // Regular expression 
            $scope.vehicleNoRegex = /^[A-Za-z]{2}-\d{2}-\d{4}$/;
            $scope.vehicleTypeRegex = /^[A-Za-z]{1}[A-Za-z0-9\s]*$/;
            $scope.modelNoRegex = /^[A-Za-z0-9]{1}[A-Za-z0-9\s]*$/;
            $scope.engineNoRegex = /^[A-Za-z0-9]{10}[A-Za-z0-9]*$/;
            ;
            $scope.nameRegex = /^[A-Za-z]{1}[A-Za-z0-9\s]{4,}$/;
            ;
            $scope.mobileNoRegex = /^(\+\88{1,2}[- ])\d{11}$/;
            ;

        })

// #### Tolls Rate ###########

        .controller("tollsRateCtrl", function ($scope, $http) {

            $scope.tollsRates = [];
            $scope.rateForm = {
                rateId: -1,
                transportName: "",
                rate: 0.0
            }
            _refreshPageData();

            $scope.submitRate = function () {

                var method = "";
                var url = "";
                if ($scope.rateForm.rateId == -1) {
                    method = "POST";
                    url = 'tolls/tollsrate';
                } else {
                    method = "PUT";
                    url = 'tolls/tollsrate/' + $scope.rateForm.rateId;
                }

                $http({
                    method: method,
                    url: url,
                    data: angular.toJson($scope.rateForm),
                    headers: {
                        'Content-Type': 'application/json'
                    }
                }).then(_success, _error);
            };

            $scope.removeTollsRate = function (tollsRate) {
                $http({
                    method: 'DELETE',
                    url: 'tolls/tollsrate/' + tollsRate.rateId,
                }).then(_success, _error);
            };

            function _refreshPageData() {
                $http({
                    method: 'GET',
                    url: 'http://localhost:8084/TollsSystem/tolls/tollsrate'
                }).then(function successCallback(response) {
                    $scope.tollsRates = response.data;
                    console.log($scope.tollsRates);
                }, function errorCallback(response) {
                    console.log(response.statusText);
                });
            }
            function _success(response) {
                _refreshPageData();
                _clearForm()
            }
            function _error(response) {
                console.log(response.statusText);
            }


            $scope.editTollsRate = function (tollsRate) {
                $scope.rateForm.rateId = tollsRate.rateId;
                $scope.rateForm.transportName = tollsRate.transportName;
                $scope.rateForm.rate = tollsRate.rate;

            }
            function _clearForm() {
                $scope.rateForm.rateId = -1;
                $scope.rateForm.transportName = "";
                $scope.rateForm.rate = 0.0;
            }
        })


/// ######## Angular Tolls Counters ###############

        .controller('tollcounterCtrl', function ($scope, $http) {
            $scope.tollsrate = [];
            $scope.tollsCounter = [];

            _refreshTollRateData();
            _refreshPageData();


            $scope.getTotal = function () {
                var total = 0;
                for (var i = 0; i < $scope.tollsCounter.length; i++) {
                    var product = $scope.tollsCounter[i];
                    total += product.rate;
                }
                return total;
            }


            $scope.tollsCounterForm = {
                tollsId: -1,
                payment: false,
                rate: 0.0,
                transportName: "",
                vehicleNo: "",
            }

            function _counterIntialize() {
                $scope.tollsCounterForm.rate = $scope.tolls.rate,
                        $scope.tollsCounterForm.transportName = $scope.tolls.transportName
            }

            $scope.submitRateCounter = function () {
                _counterIntialize();
                var method = "";
                var url = "";
                if ($scope.tollsCounterForm.tollsId == -1) {
                    method = "POST";
                    url = 'tolls/tollscounter';
                } else {
                    method = "PUT";
                    url = 'tolls/tollscounter/' + $scope.tollsCounterForm.tollsId;
                }

                $http({
                    method: method,
                    url: url,
                    data: angular.toJson($scope.tollsCounterForm),
                    headers: {
                        'Content-Type': 'application/json'
                    }
                }).then(_success, _error);
            };

            $scope.removeTollsCounter = function (counter) {
                $http({
                    method: 'DELETE',
                    url: 'tolls/tollscounter/' + counter.tollsId,
                }).then(_success, _error);
            };

            function _refreshPageData() {
                $http({
                    method: 'GET',
                    url: 'http://localhost:8084/TollsSystem/tolls/tollscounter/byDate'
                }).then(function successCallback(response) {
                    $scope.tollsCounter = response.data;
                }, function errorCallback(response) {
                    console.log(response.statusText);
                });
            }
            function _success(response) {
                _refreshTollRateData();
                _refreshPageData();
                _clearForm();
            }
            function _error(response) {
                console.log(response.statusText);
            }


            $scope.editTollsCounter = function (counter) {
                $scope.tollsCounterForm.tollsId = counter.tollsId,
                        $scope.tollsCounterForm.payment = counter.payment,
                        $scope.tollsCounterForm.rate = counter.rate,
                        $scope.tollsCounterForm.transportName = counter.transportName,
                        $scope.tollsCounterForm.vehicleNo = counter.vehicleNo
            }

            function _clearForm() {
                $scope.tollsCounterForm.tollsId = -1,
                        $scope.tollsCounterForm.payment = false,
                        $scope.tollsCounterForm.rate = 0.0,
                        $scope.tollsCounterForm.transportName = "",
                        $scope.tollsCounterForm.vehicleNo = ""
            }




            function _refreshTollRateData() {
                $http({
                    method: 'GET',
                    url: 'http://localhost:8084/TollsSystem/tolls/tollsrate'
                }).then(function successCallback(response) {
                    $scope.tollsrate = response.data;

                }, function errorCallback(response) {
                    console.log(response.statusText);
                });
            }

            // Regular expression 
            $scope.vehicleNoRegex = /^[A-Za-z]{2}-\d{2}-\d{4}$/;

        })



/// ######## Angular Tolls Counters ###############

        .controller('tollsLoginCtrl', function ($scope, $window, $http, $location, $rootScope) {
            $scope.tollsLogin = [];

            $scope.tollsLoginForm = {
                id: -1,
                loginId: "",
                loginPassword: ""
            }

            $scope.submitLoginFrom = function () {
                var method = "";
                var url = "";
                if ($scope.tollsLoginForm.id == -1) {
                    method = "POST";
                    url = 'http://localhost:8084/TollsSystem/tolls/tollslogin/userlogin';
                }

                $http({
                    method: method,
                    url: url,
                    data: angular.toJson($scope.tollsLoginForm),
                    headers: {
                        'Content-Type': 'application/json'
                    }
                }).then(_success, _error);
            };
            function _success(response) {
                $scope.tollsLogin = response.data.loginId;

                if ($scope.tollsLogin != null) {
                    $rootScope.userLogged = true;
                    $location.path("/loginCounter");
                } else {
                    $window.alert("Your user name and password worng!!!!!!! ");
                    _clearForm();
                }

            }
            function _error(response) {
                console.log(response.statusText);
            }

            function _clearForm() {
                $scope.tollsLoginForm.loginPassword = ""
            }

        })
        
        
        .controller('tollsAdminLoginCtrl', function ($scope, $window, $http, $location, $rootScope) {
            $scope.tollsLogin = [];

            $scope.tollsLoginForm = {
                id: -1,
                loginId: "",
                loginPassword: ""
            }

            $scope.submitLoginFrom = function () {
                var method = "";
                var url = "";
                if ($scope.tollsLoginForm.id == -1) {
                    method = "POST";
                    url = 'http://localhost:8084/TollsSystem/tolls/tollslogin/userlogin';
                }

                $http({
                    method: method,
                    url: url,
                    data: angular.toJson($scope.tollsLoginForm),
                    headers: {
                        'Content-Type': 'application/json'
                    }
                }).then(_success, _error);
            };
            function _success(response) {
                $scope.tollsLogin = response.data.loginFor;

                if ($scope.tollsLogin == "tolls rate")
                {
                    $rootScope.adminLogged = true;
                    $location.path("/tollsRateAdmin");
                }
                else if ($scope.tollsLogin == "counter admin")
                {
                    $rootScope.adminLogged = true;
                    $location.path("/tollsCounterAdmin");
                }
                else if ($scope.tollsLogin == "counter") 
                {
                    $rootScope.adminLogged = true;
                    $location.path("/tollsCounter");
                }
                else {
                    $window.alert("Your user name and password worng!!!!!!! ");
                    _clearForm();
                }

            }
            function _error(response) {
                console.log(response.statusText);
            }

            function _clearForm() {
                $scope.tollsLoginForm.loginPassword = ""
            }

        })
        

        .controller('tollcounterAdminCtrl', function ($scope, $http) {
            $scope.tollsCounters = [];
            _refreshTollRateData();

            function _refreshTollRateData() {
                $http({
                    method: 'GET',
                    url: 'http://localhost:8084/TollsSystem/tolls/tollscounter'
                }).then(function successCallback(response) {
                    $scope.tollsCounters = response.data;

                }, function errorCallback(response) {
                    console.log(response.statusText);
                });
            }
            ;

            $scope.customDate = new Date();

            $scope.customDateFilter = function (custonDate) {
                $scope.customDate = custonDate;
            }

        });