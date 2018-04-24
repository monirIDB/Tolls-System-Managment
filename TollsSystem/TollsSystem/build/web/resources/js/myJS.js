
$('#myCarousel').carousel({interval: 2000});


//########## jQuery ###########//
$(document).ready(function () {

    $("#home").click(function () {
        $("#myCarousel").show(2000)
    });
    $("#logout").click(function () {
        $("#myCarousel").show(2000)
    });
    $("#tollsSystem").click(function () {
        $("#myCarousel").show(2000)
    });

    $("#vehicleRegistration").click(function () {
        $("#myCarousel").slideUp(2000);
    });

    $("#tollsCounter").click(function () {
        $("#myCarousel").slideUp(2000);
    });
    $("#tollsRate").click(function () {
        $("#myCarousel").slideUp(2000);
    });
    $("#counterAdmin").click(function () {
        $("#myCarousel").slideUp(2000);
    });
    $("#login").click(function () {
        $("#myCarousel").slideUp(2000);
    });

});