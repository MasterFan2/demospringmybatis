<html>

<script>
    function selectUser() {

        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function () {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                document.getElementById("test").innerHTML = xmlhttp.responseText;
            }
        };
        xmlhttp.open("POST", "user/selectUser", true);
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xmlhttp.send("id=1");
    }
</script>
<body>

<p id="test">Hello World!</p>
<button type="button" onclick="selectUser()">onclick test</button>

</body>
</html>
