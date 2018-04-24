<div class="row my-row text-center login-img-body" ng-controller="tollsLoginCtrl">

    <div class="col-sm-4" ></div>
    <div class="col-sm-4" >

        <form class="login-form form-group" ng-submit="submitLoginFrom()" > 
            <div class="login-wrap">
                <p class="login-img"><i class="fa fa-lock fa-lg" style="font-size:60px; color: #262626"></i></p>
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-user-circle"></i></span>
                    <input type="text" class="form-control" ng-model="tollsLoginForm.loginId" placeholder="Username" autofocus>
                </div><br/>
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-key"></i></span>
                    <input type="password" class="form-control" ng-model="tollsLoginForm.loginPassword" placeholder="Password">
                </div>
                <label class="checkbox">
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
                <button class="btn btn-primary btn-lg btn-block" type="submit">Login</button>
            </div>
        </form>

    </div>
    <div class="col-sm-4">

    </div>
</div>