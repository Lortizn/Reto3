const BASE_URL = 'http://132.226.254.45:8081'
//const BASE_URL = 'http://localhost:8081'


//categoria----------------------------------------------
function guardarInformacionCategory(){

    $("#resultadoCategory").empty();
    let myData ={name:$("#nameCategory").val(),description:$("#descripcionCategory").val(),}
    let dataToSend = JSON.stringify(myData);

    $.ajax ({
        url: BASE_URL +'/api/Category/save',
        type: 'POST',
        data:  dataToSend,
        datatype: "JSON",
        contentType: 'application/json',
        success: function(respuesta){
        console.log(respuesta);
        alert("Inserción exitosa");
        },
        error: function(xhr,status){
        alert('Operacion no satisfactoria,'+ xhr.status );
            }
        }
    );
}

function traerInformacionCategory(){
    $.ajax({
            url:BASE_URL +'/api/Category/all',
            type:"GET",
            datatype:"JSON",
            success:function(respuesta){
            pintarRespuestaCategory(respuesta); 
                         
            }                                 
        }              
    );
}

function pintarRespuestaCategory(items){

    $("#resultadoCategory").empty();

    let myTable="<table border=3>";
    myTable += "<tr><th>Id</th><th>Name</th><th>Description</th></tr>";
   for(i=0;i<items.length;i++){
       myTable+="<tr>";
       myTable+="<td>"+items[i].id+"</td>";
       myTable+="<td>"+items[i].name+"</td>";
       myTable+="<td>"+items[i].description+"</td>";                             
        //myTable+="<td><button onclick='borrarCategory("+items[i].id+")'>Borrar</button>";
       //myTable+="<td><button onclick='actualizarCategory("+items[i].id+")'>Actualizar</button>";
       myTable+="</tr>";
       
   }
   myTable +="</table>";
   $("#resultadoCategory").append(myTable);
}


// CLIENT------------------------------------------
function guardarInformacionClient(){

    $("#resultadoClient").empty();
    let myData ={email:$("#emailClient").val(),password:$("#passwordClient").val(),name:$("#nameClient").val(),age:$("#ageClient").val(),}
    let dataToSend = JSON.stringify(myData);

    $.ajax ({
        url: BASE_URL +'/api/Client/save',
        type: 'POST',
        data:  dataToSend,
        datatype: "JSON",
        contentType: 'application/json',
        success: function(respuesta){
        console.log(respuesta);
        alert("Se ha guardado exitosamente en la Base de datos!");
        },
        error: function(xhr,status){
        alert('Operacion no satisfactoria,'+ xhr.status );
            }
        }
    );
}

function traerInformacionClient(){
    $.ajax({
            url:BASE_URL +'/api/Client/all',
            type:"GET",
            datatype:"JSON",
            success:function(respuesta){
            pintarRespuestaClient(respuesta); 
                         
            }                                 
        }              
    );
}

function pintarRespuestaClient(items){

    $("#resultadoClient").empty();

    let myTable="<table border=3>";
    myTable += "<tr><th>Id</th><th>Email</th><th>Password</th><th>Name</th><th>Age</th></tr>";
   for(i=0;i<items.length;i++){
       myTable+="<tr>";
       myTable+="<td>"+items[i].idClient+"</td>";
       myTable+="<td>"+items[i].email+"</td>";
       myTable+="<td>"+items[i].password+"</td>"; 
       myTable+="<td>"+items[i].name+"</td>";    
       myTable+="<td>"+items[i].age+"</td>";                        
        //myTable+="<td><button onclick='borrarClient("+items[i].id+")'>Borrar</button>";
       //myTable+="<td><button onclick='actualizarClient("+items[i].id+")'>Actualizar</button>";
       myTable+="</tr>";
       
   }
   myTable +="</table>";
   $("#resultadoClient").append(myTable);
}


// Motorbike--------------------
function guardarInformacionMotorbike(){

    $("#resultadoMotorbike").empty();
    let myData ={brand:$("#brand").val(),year:$("#year").val(),name:$("#name").val(),description:$("#description").val()}
    let dataToSend = JSON.stringify(myData);

    $.ajax ({
        url: BASE_URL +'/api/Motorbike/save',
        type: 'POST',
        data:  dataToSend,
        datatype: "JSON",
        contentType: 'application/json',
        success: function(respuesta){
        console.log(respuesta);
        alert("Se ha guardado exitosamente en la Base de datos!");
        },
        error: function(xhr,status){
        alert('Operacion no satisfactoria,'+ xhr.status );
            }
        }
    );
}

function traerInformacionMotorbike(){
    $.ajax({
            url:BASE_URL +'/api/Motorbike/all',
            type:"GET",
            datatype:"JSON",
            success:function(respuesta){
            pintarRespuestaMotorbike(respuesta); 
                         
            }                                 
        }              
    );
}

function pintarRespuestaMotorbike(items){

    $("#resultadoMotorbike").empty();

    let myTable="<table border=3>";
    myTable += "<tr><th>id</th><th>brand</th><th>year</th><th>description</th><th>name</th></tr>";
   for(i=0;i<items.length;i++){
       myTable+="<tr>";
       myTable+="<td>"+items[i].id+"</td>";
       myTable+="<td>"+items[i].brand+"</td>";
       myTable+="<td>"+items[i].year+"</td>"; 
       myTable+="<td>"+items[i].description+"</td>";    
       myTable+="<td>"+items[i].name+"</td>";                        
        //myTable+="<td><button onclick='borrarMotorbike("+items[i].id+")'>Borrar</button>";
       //myTable+="<td><button onclick='actualizarMotorbike("+items[i].id+")'>Actualizar</button>";
       myTable+="</tr>";
       
   }
   myTable +="</table>";
   $("#resultadoMotorbike").append(myTable);
}

//-------Message----------------

function guardarInformacionMessage(){

    $("#resultadoMessage").empty();
    let myData ={messageText:$("#messageText").val()}
    let dataToSend = JSON.stringify(myData);

    $.ajax ({
        url: BASE_URL +'/api/Message/save',
        type: 'POST',
        data:  dataToSend,
        datatype: "JSON",
        contentType: 'application/json',
        success: function(respuesta){
        console.log(respuesta);
        alert("Se ha guardado exitosamente en la Base de datos!");
        },
        error: function(xhr,status){
        alert('Operacion no satisfactoria,'+ xhr.status );
            }
        }
    );
}

function traerInformacionMessage(){
    $.ajax({
            url:BASE_URL +'/api/Message/all',
            type:"GET",
            datatype:"JSON",
            success:function(respuesta){
            pintarRespuestaMessage(respuesta); 
                         
            }                                 
        }              
    );
}

function pintarRespuestaMessage(items){

    $("#resultadoMessage").empty();

    let myTable="<table border=3>";
    myTable += "<th>messageText</th>";
   for(i=0;i<items.length;i++){
       myTable+="<tr>";
       myTable+="<td>"+items[i].messageText+"</td>";
                              
        //myTable+="<td><button onclick='borrarMessage("+items[i].id+")'>Borrar</button>";
       //myTable+="<td><button onclick='actualizarMessage("+items[i].id+")'>Actualizar</button>";
       myTable+="</tr>";
       
   }
   myTable +="</table>";
   $("#resultadoMessage").append(myTable);
}

// Reservation----------------------------------------------

function guardarInformacionReservation(){

    $("#resultadoReservation").empty();
    let myData ={startDate:$("#startDate").val(),devolutionDate:$("#devolutionDate").val(),}
    let dataToSend = JSON.stringify(myData);

    $.ajax ({
        url: BASE_URL +'/api/Reservation/save',
        type: 'POST',
        data:  dataToSend,
        datatype: "JSON",
        contentType: 'application/json',
        success: function(respuesta){
        console.log(respuesta);
        alert("Se ha guardado exitosamente en la Base de datos!");
        },
        error: function(xhr,status){
        alert('Operacion no satisfactoria,'+ xhr.status );
            }
        }
    );
}

function traerInformacionReservation(){
    $.ajax({
            url:BASE_URL +'/api/Reservation/all',
            type:"GET",
            datatype:"JSON",
            success:function(respuesta){
            pintarRespuestaReservation(respuesta); 
                         
            }                                 
        }              
    );
}

function pintarRespuestaReservation(items){

    $("#resultadoReservation").empty();

    let myTable="<table border=3>";
    myTable += "<tr><th>idReservation</th><th>startDate</th><th>devolutionDate</th>";
       for(i=0;i<items.length;i++){
       myTable+="<tr>";
       myTable+="<td>"+items[i].idReservation+"</td>";
       myTable+="<td>"+items[i].startDate+"</td>";
       myTable+="<td>"+items[i].devolutionDate+"</td>"; 
       
                               
        //myTable+="<td><button onclick='borrarReservation("+items[i].id+")'>Borrar</button>";
       //myTable+="<td><button onclick='actualizarReservation("+items[i].id+")'>Actualizar</button>";
       myTable+="</tr>";
       
    }
   myTable +="</table>";
   $("#resultadoReservation").append(myTable);
}

