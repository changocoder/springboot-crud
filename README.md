# test-spring-boot
## CRUD API RESTful
### Requirementes
* Docker

### Initialize Database

```shell
docker-compose up -d
```

### Request
#### Productos
```
curl --location --request GET 'http://localhost:8080/api/productos/v1/all'
```
```
curl --location --request POST 'http://localhost:8080/api/productos/v1/add' \
--header 'Content-Type: application/json' \
--data-raw ' {
        "id": 1,
        "nombre": "thinkpad t480",
        "marca": "lenovo",
        "numeroSerie": "sadasdasd",
        "categoria": {
            "id": 1,
            "nombre": "Impresoras",
            "descripcion": null
        }
 }'
```

#### Categorias

```
curl --location --request POST 'http://localhost:8080/api/categoria/v1/add' \
--header ': ' \
--header 'Content-Type: application/json' \
--data-raw '{
 
                    "nombre": "Sonido",
                    "descripcion": "lalalla"
}'
```

```
curl --location --request GET 'http://localhost:8080/api/categoria/v1/all'

```

