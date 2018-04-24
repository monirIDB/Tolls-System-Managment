<div class="well my-row" ng-controller="tollcounterCtrl">
    <div class="row">
        <div class="col-sm-7">
            <div class="row">
                <form class="form-horizontal" name="counterForm" novalidate ng-submit="submitRateCounter()" >
                    <div class="form-group">
                        <label class="control-label col-sm-3" for="vehicleNo">Vehicle No.</label>
                        <div class="col-sm-9">
                            <input class="form-control" id="vehicleNo" required ng-pattern="vehicleNoRegex"
                                   ng-model="tollsCounterForm.vehicleNo" name="vehicleNo" placeholder="AZ-12-1234" />
                            
                            <div class="error" ng-show="counterForm.vehicleNo.$invalid && counterForm.vehicleNo.$dirty" >
                                <span ng-show="counterForm.vehicleNo.$error.pattern">
                                    Please Enter A Correct Vehicle No.(AZ-12-1234)
                                </span>
                                <span ng-show="counterForm.vehicleNo.$error.required">
                                    Please Enter A Vehicle No.
                                </span>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3" for="vehicleType">Vehicle Type:</label>
                        <div class="col-sm-9">
                            <select class="form-control" required ng-model="tolls" 
                                    ng-options="item.transportName for item in tollsrate" >
                                <option value="">Please Select Vehicle</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-3" for="cost" >Cost</label>
                        <div class="col-sm-9">          
                            <input class="form-control" value="{{tolls.rate}}" required id="phone" name="cost" placeholder="Cost" disabled />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3" for="payment" >Payment</label>
                        <div class="col-sm-9">          
                            <input id="input-1" ng-model="tollsCounterForm.payment" required class="payment" type="checkbox">
                        </div>
                    </div>

                    <div class="form-group">        
                        <div class="col-sm-offset-2 col-sm-3 text-right">
                            <button type="submit" ng-disabled="counterForm.$invalid" class="btn btn-primary">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div class="col-sm-5">
            <h3>Total Vehicle : <b>{{tollsCounter.length}}</b></h3>
            <h3>Total Catch : <b>{{getTotal() | currency}}</b></h3>
            
            <table class="table table-striped table-bordered">
                <tr >
                    <th>ID</th>
                    <th>Vehicle</th>
                    <th >Time</th>
                    <th class="text-center">Rate</th>
                </tr>

                <tr ng-repeat="counter in tollsCounter | limitTo : -5">
                    <td>{{ $index +1 }}
                    <td>{{ counter.vehicleNo }}
                    <td >{{ counter.vehicleTime | date : 'mediumTime'}}</td>
                    <td class="text-right">{{ counter.rate | currency}}</td>
                </tr>
                
            </table>
        </div>
    </div>
</div>