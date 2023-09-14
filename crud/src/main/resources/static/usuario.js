function resgistrarUsuario(){

    let info = {}

    info.name = "Jorge"
    info.email = "joger@gmail.com"
    info.password = "1234"

    $.ajax({
        url:"/api/user/registrar",
        type:"POST",
        contentType:"application/json",
        dataType:"json",
        data:JSON.stringify(info),
        success: function(rta) {
            alert(rta['respuesta'])
        },
        error: function(xhr, status) {
            alert('sin exito');
        },
        complete: function (xhr, status){

        }
    });
}