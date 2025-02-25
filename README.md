# 🛡️ AI-Powered Financial Fraud Detection System

## 📌 Overview
This project is a **machine learning-based financial fraud detection system** built with **Spring Boot, Python (ML), and PostgreSQL**. It detects fraudulent transactions using AI and provides a REST API for integration.

## 🚀 Features
- ✅ **Real-time Fraud Detection** – Detects suspicious transactions instantly.
- ✅ **Machine Learning (AI Model)** – Trained using **RandomForestClassifier**.
- ✅ **Spring Boot API** – RESTful API for transaction analysis.
- ✅ **PostgreSQL Database** – Stores transaction history.
- ✅ **Docker Support** – Easily deploy using Docker Compose.

## 🏗️ Tech Stack
- **Backend:** Java (Spring Boot)  
- **Machine Learning:** Python (Scikit-learn, Pandas)  
- **Database:** PostgreSQL  
- **Containerization:** Docker & Docker Compose  
- **API Security:** JWT Authentication (Future Update)  

## 📂 Project Structure
```
├── backend/
│   ├── src/main/java/com/fraudDetection/
│   │   ├── Application.java
│   │   ├── controller/FraudDetectionController.java
│   │   ├── service/FraudDetectionService.java
│   │   ├── service/MLModelService.java
│   │   ├── model/Transaction.java
│   │   ├── config/SecurityConfig.java
│   ├── resources/application.properties
├── database/
│   ├── schema.sql
├── ml_model/
│   ├── train_fraud_detection.py
├── docker-compose.yml
├── README.md
```

## 🛠️ Setup & Installation
### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/YOUR_GITHUB_USERNAME/AI-Powered-Financial-Fraud-Detection-System.git
cd AI-Powered-Financial-Fraud-Detection-System
```

### **2️⃣ Run the Backend (Spring Boot)**
```bash
cd backend
./mvnw spring-boot:run
```

### **3️⃣ Run the Machine Learning Model Training (Optional)**
```bash
cd ml_model
python train_fraud_detection.py
```

### **4️⃣ Run Everything Using Docker (Recommended)**
```bash
docker-compose up --build
```

## 📡 API Endpoints (Spring Boot)
| Method | Endpoint              | Description                        |
|--------|----------------------|------------------------------------|
| POST   | `/api/fraud/detect`  | Detects fraud in a transaction    |

### **Example API Request**
```json
POST /api/fraud/detect
{
  "amount": 10000.50,
  "transactionType": "Credit Card",
  "location": "New York"
}
```
#### **Example API Response**
```json
{
  "message": "Fraudulent Transaction Detected!"
}
```

## 📝 Future Enhancements
- 🔒 **JWT Authentication** for API security  
- 📊 **Visualization Dashboard** for fraud trends  
- 📈 **Better AI Model** with Deep Learning (LSTM)  

---

💡 **Author:** [Your Name]  
🔗 **GitHub:** [Your GitHub Link]  
📧 **Contact:** [Your Email]  

🚀 **Like this project? Star it on GitHub!** ⭐  
