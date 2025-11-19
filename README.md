# minikube-helm-demo
Пример деплоя Spring Boot микросервиса с PostgreSQL в Kubernetes используя Helm

Для современного микросервиса на Spring Boot 3+ рекомендую следующие зависимости:

## 🎯 Обязательные зависимости:

### 1. **Spring Web** ⭐
```
Spring Web
```
- REST API endpoints
- Встроенный Tomcat
- MVC архитектура

### 2. **Spring Data JPA** ⭐
```
Spring Data JPA
```
- Работа с PostgreSQL
- Repository pattern
- Миграции и управление схемой

### 3. **PostgreSQL Driver** ⭐
```
PostgreSQL Driver
```
- Драйвер для подключения к БД
- Обязательно для работы с PostgreSQL

## 🔧 Дополнительные (рекомендуемые):

### 4. **Spring Boot DevTools**
```
Spring Boot DevTools
```
- Hot reload для разработки
- Автоматический restart
- Улучшает developer experience

### 5. **Lombok** ⭐
```
Lombok
```
- Автогенерация геттеров/сеттеров
- Уменьшение boilerplate кода
- `@Data`, `@NoArgsConstructor`, etc.

### 6. **Validation**
```
Validation
```
- Валидация входных данных
- `@NotNull`, `@Size`, `@Email` аннотации
- Обработка ошибок

### 7. **Configuration Processor**
```
Configuration Processor
```
- Подсказки в application.yaml
- Автодополнение настроек
- Лучше для работы с конфигурацией

## 🚀 Полный список зависимостей для ввода:

```
Spring Web
Spring Data JPA
PostgreSQL Driver
Lombok
Validation
Spring Boot DevTools
Configuration Processor
```

## 📋 Настройки Spring Initializr:

### Project:
- **Gradle - Kotlin** (более современный) или **Maven**

### Language:
- **Java** (стандарт для enterprise)

### Spring Boot:
- **3.5.7** (стабильная версия)

### Project Metadata:
- **Group**: `com.prosoft`
- **Artifact**: `minikube-helm-demo`
- **Name**: `minikube-helm-demo`
- **Description**: `Demo project for Spring Boot with Kubernetes and Helm`
- **Package name**: `com.prosoft.minikube-helm-demo`
- **Packaging**: `Jar`
- **Java**: `21` (LTS версия)

## 🎯 Почему именно этот набор:

### Для микросервиса:
✅ **Spring Web** - REST API  
✅ **Spring Data JPA** + **PostgreSQL** - работа с данными  
✅ **Validation** - надежность API  
✅ **Lombok** - чистота кода

### Для разработки:
✅ **DevTools** - быстрая разработка  
✅ **Configuration Processor** - удобная конфигурация

### Для продакшена:
✅ **Spring Boot 3.5.7** - стабильная версия  
✅ **Java 21** - LTS с лучшей производительностью

## 🔄 Альтернатива для минимальной конфигурации:

**Только самое необходимое:**
```
Spring Web
Spring Data JPA  
PostgreSQL Driver
Lombok
```

Этот набор покрывает 95% потребностей микросервиса и оставляет минимальный footprint! 🚀