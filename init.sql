-- Создаем таблицу пользователей
CREATE TABLE IF NOT EXISTS users (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    latitude DOUBLE PRECISION,
    longitude DOUBLE PRECISION,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Создаем таблицу с данными
CREATE TABLE IF NOT EXISTS spatial_data (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    latitude DOUBLE PRECISION,
    longitude DOUBLE PRECISION,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Создаем индексы для производительности
CREATE INDEX IF NOT EXISTS idx_users_email ON users(email);
CREATE INDEX IF NOT EXISTS idx_spatial_data_coords ON spatial_data(latitude, longitude);

-- Вставляем тестовые данные (Москва, СПб, Казань)
INSERT INTO spatial_data (name, latitude, longitude) VALUES
    ('Москва', 55.7558, 37.6173),
    ('Санкт-Петербург', 59.9343, 30.3351),
    ('Казань', 55.7961, 49.1088)
ON CONFLICT DO NOTHING;

-- Вставляем тестовых пользователей
INSERT INTO users (name, email, latitude, longitude) VALUES
    ('Иван Иванов', 'ivan@example.com', 55.7558, 37.6173),
    ('Петр Петров', 'petr@example.com', 59.9343, 30.3351),
    ('Мария Сидорова', 'maria@example.com', 55.7961, 49.1088)
ON CONFLICT (email) DO NOTHING;