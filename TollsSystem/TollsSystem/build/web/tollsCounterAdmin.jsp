<div class="well my-row" ng-controller="tollcounterAdminCtrl">
    <div class="row">
        <p class="text-center">Please Input <b>yyyy-MM-dd</b> or <b>yyyy</b> or <b>MM-dd</b> or <b>dd</b> or <b>MM</b> search</p>
        <div class="col-sm-4"></div>
        <div class="col-sm-4">
            <form class="login-form form-group" > 
                <div class="input-group">
                    <input class="form-control" ng-model="cusdate" placeholder="yyyy-MM-dd" >
                    <span class="input-group-addon"><button class="btn btn-secondary" ng-click="customDateFilter(cusdate)" type="button"><i class="fa fa-search"></i></button></span>
                </div>
            </form>
        </div>
        <div class="col-sm-4"></div>

    </div>

    <div class="row">
        <div class="col-sm-12">

            <table class="table table-striped table-bordered">
                <tr >
                    <th>ID</th>
                    <th>Vehicle</th>
                    <th >Date</th>
                    <th >Time</th>
                    <th class="text-center">Rate</th>
                </tr>
                
                <tr ng-repeat="counter in resultValue=(tollsCounters | filter: { vehicleDate : customDate})">
                    <td>{{ $index + 1}}
                    <td>{{ counter.vehicleNo}}
                    <td >{{ counter.vehicleDate | date : 'yyyy-MM-dd' }}</td>
                    <td >{{ counter.vehicleTime | date : 'mediumTime'}}</td>
                    <td class="text-right">{{ counter.rate | currency}}</td>
                </tr>
                <tr style="background-color: black; font-size: 24px;
                        font-weight: bold; color: white;">
                    <th colspan="4" class="text-center" >Total</th>
                    <th class="text-right"><strong>{{resultValue | sumOfValue :'rate' | currency}}</strong></th>
                </tr>
            </table>
        </div>
    </div>
</div>