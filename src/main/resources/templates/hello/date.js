function GetTime() {
    const Target = document.getElementById("time");
    if (Target.innerText == "") {
        let today = new Date();
        Target.innerText = today.toString();
    }
    else Target.innerText = "";
}

function getTime() {
    const Target = document.getElementById("time");
    if (Target.innerText ==""){
        let today = new Date();
        Target.innerText = today.toString();
    }
    else Target.innerText = "";
}