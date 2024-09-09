let passwordEyeIcon = document.getElementById("passwordEyeIcon");
let passwordField = document.getElementById("PasswordField");
let hidePassword = true;

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