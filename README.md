# 📌 Documentación de la API

## 🚀 Endpoints de la API

### 1️⃣ Obtener todos los buses  
**URL:** `https://retospring-crudbus-api-production.up.railway.app/buses`  
**Método:** `GET`  
**Descripción:** Obtiene la lista de todos los buses registrados.  
**Respuesta exitosa (200 OK):**
```json
[
    {
        "id": 40,
        "placa": "ASD-68",
        "caracteristicas": "wifi, tele",
        "marca": {
            "id": 16,
            "nombre": "Scania"
        },
        "activo": true,
        "numero_bus": 123,
        "fecha_creacion": "2025-04-02T04:20:11.47"
    }
]
```

### 1️⃣ Obtener bus por ID  
**URL:** `https://retospring-crudbus-api-production.up.railway.app/buses/{id}`  
**Método:** `GET`  
**Descripción:** Obtiene el objeto del ID del bus registrado.  
**Respuesta exitosa (200 OK):**
```json
{
    "id": 34,
    "placa": "AED-098",
    "caracteristicas": "wifi, 3 baños, 3 teles por piso\n",
    "marca": {
        "id": 1,
        "nombre": "Fiat"
    },
    "activo": false,
    "numero_bus": 234,
    "fecha_creacion": "2025-04-02T02:31:31.011"
}
