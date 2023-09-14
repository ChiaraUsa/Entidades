function registrarAdmin(){

    let datos = {}

    datos.name = "sabas"
    datos.email = "sebas@gmail.com"
    datos.password = "123"

    $.ajax({
        url:"/api/admin/registrar",
        type:"POST",
        contentType:"application/json",
        dataType:"json",
        data:JSON.stringify(datos),
        success: function(rta) {
            alert(rta['respuesta'])
        },
        error: function(xhr, status) {
            alert('no funciono')
        },
        complete: function(xhr, status) {
            //alert('Petición realizada');
        }
    });
}