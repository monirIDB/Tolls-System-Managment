<div class="row well my-row" ng-controller="tollsRateCtrl">
    <div class="col-sm-7" >
        <table class="table table-striped table-bordered">
            <tr >
                <th>ID</th>
                <th >Transport Name</th>
                <th class="text-center">Rate</th>
                <th class="text-center">Actions</th>
            </tr>

            <tr ng-repeat="tollsRate in tollsRates">
                <td>{{$index + 1}}</td>
                <td>{{ tollsRate.transportName}}</td>
                <td class="text-right">{{ tollsRate.rate | currency }}</td>
                <td class="text-center"><a ng-click="editTollsRate(tollsRate)" class="button btn btn-primary">Edit</a> | <a ng-click="removeTollsRate(tollsRate)" class="button btn btn-danger">Remove</a></td>
            </tr>

        </table>
    </div>
    <div class="col-sm-5">
        <div class="row">
            <form class="form-horizontal" name="tollsRateForm" ng-submit="submitRate()" >
                <div class="form-group">
                    <label class="control-label col-sm-3" for="transportName">Transport Name</label>
                    <div class="col-sm-9">
                        <input class="form-control" ng-model="rateForm.transportName" id="vehicleNo" name="transportName" placeholder="Transport Name" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3" for="rate" >Rate</label>
                    <div class="col-sm-9">          
                        <input class="form-control" ng-model="rateForm.rate" id="rate" name="rate" placeholder="Rate" />
                    </div>
                </div>
                
                <div class="form-group">        
                    <div class="col-sm-12 text-right">
                        <button type="submit" class="btn btn-success">Submit</button>
                    </div>
                </div>
            </form>
        </div>
        
    </div>
</div>