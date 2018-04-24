<div class="row my-row well" ng-controller="vehicleregCrtl">
    <div class="col-sm-7" >
        <h1 class="text-center" style="background-color: black; font-weight: bold;
            padding: 8px 5px; color: whitesmoke;">Vehicle Registration Form</h1>
        <div class="row">
            <form class="form-horizontal" name="vehicleReg" novalidate ng-submit="submitVehicle()" >
                <div class="form-group">
                    <label class="control-label col-sm-3" for="vehicleNo">Vehicle No.</label>
                    <div class="col-sm-9">
                        <input class="form-control" ng-model="vehicleForm.vehicleNo"
                               id="vehicleNo" required ng-pattern="vehicleNoRegex" name="vehicleNo" placeholder="AZ-12-1234" />
                        <div class="error" ng-show="vehicleReg.vehicleNo.$invalid && vehicleReg.vehicleNo.$dirty
                            " >
                            <span ng-show="vehicleReg.vehicleNo.$error.pattern">
                                Please Enter A Correct Vehicle No.(AZ-12-1234)
                            </span>
                            <span ng-show="vehicleReg.vehicleNo.$error.required">
                                Please Enter A Vehicle No.
                            </span>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3" for="vehicleType" >Vehicle Type</label>
                    <div class="col-sm-9">          
                        <input class="form-control" ng-model="vehicleForm.vehicleType" required ng-pattern="vehicleTypeRegex" 
                               id="vehicleType" name="vehicleType" placeholder="Motorcycle" />
                        <div class="error" ng-show="vehicleReg.vehicleType.$invalid && vehicleReg.vehicleType.$dirty" >
                            <span ng-show="vehicleReg.vehicleType.$error.pattern">
                                Please Enter A Correct Vehicle Name. (First must be letter)
                            </span>
                            <span ng-show="vehicleReg.vehicleType.$error.required">
                                Please Enter A Vehicle Name.
                            </span>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3" for="vehicleName" >Vehicle Name</label>
                    <div class="col-sm-9">          
                        <input class="form-control" ng-model="vehicleForm.vehicleName" id="vehicleName" name="vehicleName" placeholder="Toyota" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3" for="modelNo" >Model No</label>
                    <div class="col-sm-9">          
                        <input class="form-control" ng-model="vehicleForm.modelNo" required ng-pattern="modelNoRegex"
                               id="modelNo" name="modelNo" placeholder="DBIO AGB" />
                        <div class="error" ng-show="vehicleReg.modelNo.$invalid && vehicleReg.modelNo.$dirty" >
                            <span ng-show="vehicleReg.modelNo.$error.pattern">
                                Please Enter Correct Vehicle Model No. (DBIO AGB)
                            </span>
                            <span ng-show="vehicleReg.modelNo.$error.required">
                                Please Enter Your Vehicle Model No.
                            </span>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3" for="engineNo" >Engine No</label>
                    <div class="col-sm-9">          
                        <input class="form-control" ng-model="vehicleForm.engineNo" required ng-pattern="engineNoRegex"
                               id="engineNo" name="engineNo" placeholder="2H2XA59BWDY987665" />
                        <div class="error" ng-show="vehicleReg.engineNo.$invalid && vehicleReg.engineNo.$dirty" >
                            <span ng-show="vehicleReg.engineNo.$error.pattern">
                                Please Enter Correct Engine No. (2H2XA59BWDY987665)
                            </span>
                            <span ng-show="vehicleReg.engineNo.$error.required">
                                Please Enter Your Engine No.
                            </span>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3" for="ownerName" >Owner's Name</label>
                    <div class="col-sm-9">          
                        <input class="form-control" ng-model="vehicleForm.ownerName"  required ng-pattern="nameRegex"
                               id="ownerName" name="ownerName" placeholder="Rasel Ahmed" />
                        <div class="error" ng-show="vehicleReg.ownerName.$invalid && vehicleReg.ownerName.$dirty" >
                            <span ng-show="vehicleReg.ownerName.$error.pattern">
                                Please Enter Correct Owner's Name (Must be 5 Character)
                            </span>
                            <span ng-show="vehicleReg.ownerName.$error.required">
                                Please Enter Your Owner's Name
                            </span>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3" for="address" >Address</label>
                    <div class="col-sm-9">          
                        <textarea class="form-control" required ng-model="vehicleForm.address" id="address" name="address" placeholder="Address" ></textarea>
                        <div class="error" ng-show="vehicleReg.address.$invalid && vehicleReg.address.$dirty" >
                            <span ng-show="vehicleReg.address.$error.required">
                                Please Enter Your Address
                            </span>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3" for="phone" >Mobile No.</label>
                    <div class="col-sm-9">          
                        <input class="form-control" ng-model="vehicleForm.phone" required 
                               ng-pattern="mobileNoRegex" id="phone" name="phone" placeholder="+88-01815319013" />
                        <div class="error" ng-show="vehicleReg.phone.$invalid && vehicleReg.phone.$dirty" >
                            <span ng-show="vehicleReg.phone.$error.pattern">
                                Please Enter Correct Mobile No. (+88-01815319013)
                            </span>
                            <span ng-show="vehicleReg.phone.$error.required">
                                Please Enter Your Mobile No.
                            </span>
                        </div>
                    </div>

                </div>

                <div class="form-group">        
                    <div class="col-sm-12 text-right">
                        <button type="submit" ng-disabled="vehicleReg.$invalid" class="btn btn-primary btn-lg">Submit</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <div class="col-sm-5">
        <h1 class="text-center" style="background-color: black; font-weight: bold;
            padding: 8px 5px; color: whitesmoke;">Total Registered : {{vehicleregAll.length}}</h1>
        <div class="table-responsive">
            <table class="table table-bordered table-striped table-reflow">
                <tr>
                    <th>Vehicle No.</th>
                    <td>{{ vehiclereg.vehicleNo}}</td>
                </tr>
                <tr>
                    <th>Vehicle Type</th>
                    <td>{{ vehiclereg.vehicleType}}</td>
                </tr>
                <tr>
                    <th>Vehicle Name</th>
                    <td>{{ vehiclereg.vehicleName}}</td>
                </tr>
                <tr>
                    <th>Model No</th>
                    <td>{{ vehiclereg.modelNo}}</td>
                </tr>
                <tr>
                    <th>Engine No</th>
                    <td>{{ vehiclereg.engineNo}}</td>
                </tr>
                <tr>
                    <th>Owner Name</th>
                    <td>{{ vehiclereg.ownerName}}</td>
                </tr>
                <tr>
                    <th>Address</th>
                    <td>{{ vehiclereg.address}}</td>
                </tr>

                <tr>
                    <th>Mobile No.</th>
                    <td>{{ vehiclereg.phone}}</td>
                </tr>
                <tr>
                    <th class="text-center" style="font-size: 24px; font-weight: bold;">Action</th>
                    <td><a ng-click="editVehicle(vehiclereg)" class="button btn btn-success btn-lg btn-block">Edit</a></td>
                </tr>

            </table>

        </div>
    </div>
</div>