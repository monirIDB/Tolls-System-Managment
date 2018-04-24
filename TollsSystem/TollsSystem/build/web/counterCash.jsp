<h1>Tolls Rate</h1>
<div class="row well my-row" ng-controller="vehcileCash">
        <h1>{{tollsRates.length}}</h1>
    <div class="col-sm-7" >
        <table class="table table-striped table-bordered">
            <tr >
                <th>ID</th>
                <th >Transport Name</th>
                <th class="text-center">Rate</th>
                <th class="text-center">Actions</th>
            </tr>

            <tr ng-repeat="tollsRate in tollsRates">
                <td>{{ tollsRate.rateId}}</td>
                <td>{{ tollsRate.transportName}}</td>
                <td class="text-right">{{ tollsRate.rate | currency }}</td>
                <td class="text-center"><a ng-click="editTollsRate(tollsRate)" class="button">Edit</a> | <a ng-click="removeTollsRate(tollsRate)" class="button">Remove</a></td>
            </tr>

        </table>
    </div>
    <div class="col-sm-5">
        <div class="row">
            <form class="form-horizontal" name="tollsRateForm" ng-submit="submitRate()" >
                <div class="form-group">
                    <label class="control-label col-sm-3" for="vehicleNo">Transport Name</label>
                    <div class="col-sm-9">
                        <input class="form-control" ng-model="rateForm.transportName" id="vehicleNo" name="vehicleNo" placeholder="Vehicle No." />
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3" for="rate" >Rate</label>
                    <div class="col-sm-9">          
                        <input class="form-control" ng-model="rateForm.rate" id="rate" name="rate" placeholder="Rate" />
                    </div>
                </div>
                
                <div class="form-group">        
                    <div class="col-sm-offset-2 col-sm-3">
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </div>
            </form>
        </div>
        
    </div>
</div>