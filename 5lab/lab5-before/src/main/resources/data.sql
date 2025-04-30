-- Вставка пользователей
INSERT INTO users (id, name, email) VALUES
(1, 'John Doe', 'john@example.com'),
(2, 'Alice Smith', 'alice@example.com'),
(3, 'Bob Johnson', 'bob@example.com');

-- Вставка заказов
INSERT INTO orders (product_name, price, user_id) VALUES
('Laptop', 1200.00, 1),
('Keyboard', 80.00, 1),
('Monitor', 300.00, 2),
('Mouse', 45.00, 3),
('Desk', 200.00, 1),
('Chair', 150.00, 3);
