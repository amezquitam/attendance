
document.addEventListener("DOMContentLoaded", function() {
    const formulario = document.getElementById("miFormulario");
    const enviarBtn = document.getElementById("enviar");
  
    enviarBtn.addEventListener("click", function() {
      
      if (formulario.checkValidity()) {
        
        const nombre = document.getElementById("nombre").value;
        const edad = document.getElementById("edad").value;
        const email = document.getElementById("email").value;
  
        formulario.reset();
      } else {
        alert("Por favor, complete todos los campos correctamente.");
      }
    });
  });
  