## Ports for microservices
 ### Fronius:
```
id: fronius-service
uri: http://localhost:8081
predicates:
- Path=/fronius/**
filters:
- StripPrefix=1
```

### Kostal:
```
id: kostal-service
uri: http://localhost:8082
predicates:
  - Path=/kostal/**
filters:
  - StripPrefix=1
```

### Shelly:
```
id: shelly-service
uri: http://localhost:8083
predicates:
  - Path=/shelly/**
filters:
  - StripPrefix=1
```

### Forecasting:
```
id: forecasting-service
uri: http://localhost:8084
predicates:
  - Path=/forecasting/**
filters:
  - StripPrefix=1

```

### Newsfeed:
```
id: newsfeed-service
uri: http://localhost:8085
predicates:
  - Path=/newsfeed/**
filters:
  - StripPrefix=1
```

### Weatherservice:
```
id: weatherservice-service
uri: http://localhost:8086
predicates:
  - Path=/weatherservice/**
filters:
  - StripPrefix=1
```
