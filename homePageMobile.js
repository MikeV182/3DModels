let swipeIconContainer = document.getElementById("swipeIconContainer");
let swipeIcon = document.getElementById("swipeIcon");
let mobileMenuContainer = document.getElementById("mobileMenuContainer");
let opened = false;

function openMenu() {
    if (!opened) {
        swipeIconContainer.style.bottom = "50%";
        swipeIcon.src = "img/VectorDown.svg";
        mobileMenuContainer.style.top = "52%";
        opened = !opened;
    }
    else {
        swipeIconContainer.style.bottom = "20%";
        swipeIcon.src = "img/VectorUp.svg";
        mobileMenuContainer.style.top = "100%";
        opened = !opened;
    }
}
