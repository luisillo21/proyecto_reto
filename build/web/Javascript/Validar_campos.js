window.addEventListener('load', function (){
    document.getElementById('btniniciar').addEventListener('click',function(){
        var nombre = document.getElementById('user').value;
        var contra = document.getElementById('pass').value;
        var bandera = false;
        if (nombre.length > 0 && contra.length > 0){
            bandera = true;
        }
        if (bandera){
            document.getElementById('form_inicio').submit();
        }else{
            alert('porfavor llene todos los campos');
        }
    });
    });
    
    window.addEventListener('load', function (){
            document.getElementById('btn-actualizar').addEventListener('click',function(){
        var nombre = document.getElementById('nombre').value;
        var apellido = document.getElementById('apellido').value;
        var cedula = document.getElementById('cedula').value;
        var usuario = document.getElementById('usuario').value;
        var contra = document.getElementById('contra').value;
        var bandera = false;
        if (nombre.length > 0 && apellido.length > 0 
            && cedula.length >0 && usuario.length > 0
            && contra.length >0){
            bandera = true;
        }
        if (bandera){
            document.getElementById('form_inicio').submit();
        }else{
            alert('porfavor llene todos los campos para completar el registro');
        }
    });
    
    });
    
    
    window.addEventListener('load', function (){
            document.getElementById('btn-editarpregunta').addEventListener('click',function(){
        var pregunta = document.getElementById('pregunta').value;
        var respuesta = document.getElementById('respuesta').value;
        var estado = document.getElementById('estado').value;
        var bandera = false;
        if (pregunta.length > 0 && respuesta.length > 0 
            && estado.length >0){
            bandera = true;
        }
        if (bandera){
            document.getElementById('form_inicio').submit();
            alert('PREGUNTA AGREGADA');
        }else{
            alert('porfavor llene todos los campos para completar el registro');
        }
    });
    
    });
    