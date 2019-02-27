var counter=0;
function openMenu() {
    if(counter==0) {
        document.getElementById("h-menu-item").style.display="block";
        counter=1;
    } else if(counter==1) {
        document.getElementById("h-menu-item").style.display="none";
        counter=0;
    }
}