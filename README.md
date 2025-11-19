# minikube-helm-demo
Пример деплоя Spring Boot микросервиса с PostgreSQL в Kubernetes используя Helm

# 🗺️ Дорожная карта проекта: Minikube Helm Demo

## 🎯 Цель проекта
**Создать полноценный пример современного микросервиса на Spring Boot с полным циклом деплоя в Kubernetes используя Helm, применяя лучшие практики.**

---

## 📋 Фаза 1: Подготовка и настройка (Текущая)

### 1.1. Создание репозитория и структуры
- [x] ✅ Создать GitHub репозиторий `minikube-helm-demo`
- [x] ✅ Разработать структуру проекта
- [x] ✅ Создать ветку `feature/springboot-backend`
- [ ] 🔄 Сгенерировать Spring Boot проект на start.spring.io
- [ ] 🔄 Настроить базовую конфигурацию

### 1.2. Spring Boot приложение
- [ ] 🔄 Создать User entity и JPA репозиторий
- [ ] 🔄 Реализовать Service слой
- [ ] 🔄 Создать REST контроллеры
- [ ] 🔄 Добавить валидацию и обработку ошибок
- [ ] 🔄 Настроить health checks и метрики

---

## 🐳 Фаза 2: Контейнеризация

### 2.1. Docker
- [ ] 🔄 Создать multi-stage Dockerfile
- [ ] 🔄 Настроить .dockerignore
- [ ] 🔄 Оптимизировать образ (Alpine, слои)
- [ ] 🔄 Настроить security context

### 2.2. Локальная разработка
- [ ] 🔄 Создать docker-compose для локальной разработки
- [ ] 🔄 Настроить PostgreSQL в контейнере
- [ ] 🔄 Добавить health checks в compose

---

## ☸️ Фаза 3: Kubernetes манифесты

### 3.1. Базовые ресурсы
- [ ] 🔄 Создать Deployment для приложения
- [ ] 🔄 Настроить Service (ClusterIP/NodePort)
- [ ] 🔄 Создать ConfigMap для конфигурации
- [ ] 🔄 Настроить Secrets для чувствительных данных

### 3.2. Stateful компоненты
- [ ] 🔄 Создать StatefulSet для PostgreSQL
- [ ] 🔄 Настроить PersistentVolumeClaim
- [ ] 🔄 Конфигурировать Service для БД

### 3.3. Надежность
- [ ] 🔄 Добавить liveness и readiness пробы
- [ ] 🔄 Настроить resource limits/requests
- [ ] 🔄 Конфигурировать security context

---

## 📦 Фаза 4: Helm charts

### 4.1. Создание chart
- [ ] 🔄 Инициализировать Helm chart структуру
- [ ] 🔄 Создать шаблоны для всех ресурсов
- [ ] 🔄 Настроить values.yaml с default значениями
- [ ] 🔄 Добавить helpers и named templates

### 4.2. Конфигурация окружений
- [ ] 🔄 Создать values-minikube.yaml
- [ ] 🔄 Подготовить values-production.yaml
- [ ] 🔄 Настроить условия для разных окружений

### 4.3. Управление зависимостями
- [ ] 🔄 Интегрировать PostgreSQL как subchart
- [ ] 🔄 Настроить условия включения/выключения

---

## 🚀 Фаза 5: Деплой и тестирование

### 5.1. Minikube настройка
- [ ] 🔄 Установить и настроить Minikube
- [ ] 🔄 Настроить локальный registry
- [ ] 🔄 Проверить доступность kubectl и helm

### 5.2. Деплой pipeline
- [ ] 🔄 Создать скрипты деплоя
- [ ] 🔄 Настроить автоматическую сборку образов
- [ ] 🔄 Реализовать health checks

### 5.3. Тестирование
- [ ] 🔄 Протестировать все endpoints
- [ ] 🔄 Проверить работу с БД
- [ ] 🔄 Протестировать масштабирование
- [ ] 🔄 Проверить отказоустойчивость

---

## 🔧 Фаза 6: Дополнительные фичи

### 6.1. Мониторинг и логи
- [ ] 🔄 Настроить Spring Boot Actuator
- [ ] 🔄 Добавить метрики для Prometheus
- [ ] 🔄 Настроить централизованное логирование

### 6.2. Безопасность
- [ ] 🔄 Настроить network policies
- [ ] 🔄 Добавить security context
- [ ] 🔄 Настроить RBAC если нужно

### 6.3. CI/CD подготовка
- [ ] 🔄 Создать GitHub Actions workflow
- [ ] 🔄 Настроить автоматическое тестирование
- [ ] 🔄 Подготовить скрипты для продакшена

---

## 📚 Фаза 7: Документация

### 7.1. Техническая документация
- [ ] 🔄 Написать подробный README.md
- [ ] 🔄 Создать инструкции по установке
- [ ] 🔄 Добавить troubleshooting guide

### 7.2. Образовательные материалы
- [ ] 🔄 Создать код ревью лучших практик
- [ ] 🔄 Добавить комментарии в код
- [ ] 🔄 Подготовить примеры использования

---

## 🎯 Критерии успеха

### ✅ Функциональные
- [ ] Приложение работает в Minikube
- [ ] Все endpoints отвечают корректно
- [ ] Данные сохраняются при перезапуске
- [ ] Helm chart переиспользуем

### ✅ Технические
- [ ] Соответствует best practices
- [ ] Безопасная конфигурация
- [ ] Оптимизированные образы
- [ ] Полная документация

### ✅ Образовательные
- [ ] Понятная структура проекта
- [ ] Комментарии в коде
- [ ] Примеры конфигураций
- [ ] Готово для портфолио

---

## 🎪 Текущий статус: **Фаза 1.1** ✅

**Следующий шаг:** Генерация Spring Boot проекта на start.spring.io с выбранными зависимостями

**Готовы продолжить?** 🚀

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