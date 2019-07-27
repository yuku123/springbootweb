
function f() {
    console.log("吃饭吃饭")
}

function clickButton() {
    var userName = "aa"
    var password = "bb"
    window.location.href='main?username='+userName+"&password="+password;
    console.log(userName+":"+password)
}

window.onload=function(){
    var a  = window.document.getElementById("submit")
    a.addEventListener("click",clickButton,false)

}




