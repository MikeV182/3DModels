let passwordEyeIcon = document.getElementById("passwordEyeIcon");
let passwordField = document.getElementById("password");
let hidePassword = true;

let imageIndex = 0;
let changingPointIndex = 0;
let imageSrcs = ["img/SignUpPicture1.jpg", "img/SignUpPicture2.jpg", "img/SignUpPicture3.jpg"];
let pointIds = ["point0", "point1", "point2"];
let thumbImage = document.getElementById("thumbImage");
let currentPoint = document.getElementById(pointIds[changingPointIndex]);

function showHidePassword() {
    if (hidePassword) {
        passwordEyeIcon.src = "img/passwordShowIcon.svg";
        passwordField.type = "text";
        hidePassword = !hidePassword;
    }
    else {
        passwordEyeIcon.src = "img/passwordHideIcon.svg";
        passwordField.type = "password";
        hidePassword = !hidePassword;
    }
}

setInterval (function() {
    if (imageIndex == imageSrcs.length) {
        imageIndex = 0;
    }
    setTimeout(() => thumbImage.style.filter = "brightness(40%)", 600);
    setTimeout(() => thumbImage.src = imageSrcs[imageIndex++], 500);
    
    currentPoint.style.width = "40px";
    currentPoint.style.backgroundColor = "rgba(255, 255, 255, 0.5)";

    changingPointIndex++;
    if (changingPointIndex == pointIds.length) {
        changingPointIndex = 0;
    }
    currentPoint = document.getElementById(pointIds[changingPointIndex]);

    currentPoint.style.width = "80px";
    currentPoint.style.backgroundColor = "rgba(255, 255, 255, 1)";

    thumbImage.style.filter = "brightness(0%)";
}, 4000);