<nav class="navbar navbar-inverse my-dropdown">
    <div class="container-fluid">

        <div class="navbar-header">
            <a id="tollsSystem" class="navbar-brand" href="index.jsp">BD Toll System</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li ><a id="home" href="index.jsp">Home</a></li>
            <li><a id="vehicleRegistration" href="#vehicleReg.jsp">Registration</a></li>
            <li>
                    <a id="tollsCounter" href="#tollsLogin">Counter</a>
            </li>
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" > Admin
                    <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a id="tollsRate" href="#tollsLogin">Tolls Rate</a></li>
                    <li><a id="counterAdmin" href="#tollsLogin">Counter</a></li>
                </ul>
            </li>

            <li><a id="logout" href="#index.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
        </ul>
    </div>
</nav>