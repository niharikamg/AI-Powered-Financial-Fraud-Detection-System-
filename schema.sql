CREATE TABLE transactions (
    id SERIAL PRIMARY KEY,
    amount DOUBLE PRECISION NOT NULL,
    transaction_type VARCHAR(50),
    location VARCHAR(255),
    fraud_label BOOLEAN DEFAULT FALSE
);