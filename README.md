# Dining Reviews API (Spring Boot) (in development)

Este proyecto incluye tareas de alto nivel el cual consiste en construir una RESTful web API con data persistence utilizando Spring Boot y Spring Data JPA. 

El proyecto consiste en que un restaurant tendrá una serie de opiniones basadas en las enviadas por los usuarios. En una escala el 1 al 5, donde 5 sería la mejor. Un restaurant tendra puntajes individuales para una serie de alergias alimenticias. 

Cada puntaje individual será el promedio de todos los puntajes enviados para esa categoria determinada. En ausencia de una puntuación enviada, la puntuación de una categoria individual tendrá un valor nulo.

Un restaurant también tendrá un puntaje general, que será el promedio de todos los puntajes enviados en todas las categorias. Posteriormente, un usuario puede buscar restaurants en función de estos puntajes.

La aplicación se ejecutará en la ruta `localhost:8080` y el endpoint inicial es `/plants`.

### Endpoints
- #### `/users` [POST]
Este endpoint permite crear un nuevo usuario con los datos entregados en el body y asignar un ID unico.  
Tipo de request HTTP: `Create`

- #### `/users` [GET]
Este endpoint permite listar todos las usuarios que existen en la base de datos.  
Tipo de request HTTP: `Read`

- #### `/users/{displayName}` [PUT]
Este endpoint permite actualizar un usuario en la base de datos.  
Tipo de request HTTP: `Update`
