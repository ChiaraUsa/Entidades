function registrarInter(){

    let datos = {}

    datos.nombre = "inter"
    datos.correo = "inter@gmail.com"
    datos.password = 123
$.ajax({
    url:"/api/inter/registrar",
    type:"POST",
    dataType:"json",
    contentType:"application/json",
    data:JSON.stringify(datos),

    success: function(rta) {
        alert(rta["respuesta"])
    },
    error: function(xhr, status) {
        alert('Disculpe, existió un problema');
    },
    complete: function(xhr, status) {
        //alert('Petición realizada');
    }
});
}
