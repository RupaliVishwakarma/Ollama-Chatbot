# 🧠 Local AI Chatbot — Setup Guide (Spring Boot + Ollama)

This project is a simple, offline AI Chatbot that runs locally using the **Ollama LLM engine** and a **Spring Boot REST API**. It enables private, low-latency conversations with powerful open-source models like Mistral or LLaMA.

---

## 🚀 Step-by-Step Setup

### ✅ 1. Prerequisites

Make sure the following are installed on your machine:

- Java 17+
- Maven
- Git
- Ollama (https://ollama.com/download)

---

### ⚙️ 2. Install and Run Ollama

#### 🔽 Install Ollama (if not already)
```bash
# For Mac or Linux
curl -fsSL https://ollama.com/install.sh | sh

# For Windows: Download from https://ollama.com/download
```

#### 📥 Pull a Model
```bash
ollama pull mistral
```

#### ▶️ Start Ollama Server
```bash
ollama serve
```

This starts the server at: `http://localhost:11434`

---

### 📁 3. Clone the Project

```bash
git clone https://github.com/RupaliVishwakarma/Ollama-Chatbot.git
cd Ollama-Chatbot
```

---

### 🛠️ 4. Configure Application

Edit `src/main/resources/application.properties`:

```properties
ollama.api.url=http://localhost:11434/api/generate
ollama.model-name=llama3.2
```

---

### 🧪 5. Run the Spring Boot App

```bash
mvn spring-boot:run
```

App runs on: `http://localhost:8080`

---

### 💬 6. Test the Chat API

Use Postman, Swagger UI, or curl:

#### 🟣 Endpoint:
```
POST http://localhost:8080/api/chat
```

#### 🟢 Request Body:
```json
{
  "message": "Explain polymorphism in Java."
}
```

#### 🔵 Sample Response:
```json
{
  "reply": "Polymorphism in Java refers to the ability of an object to take many forms..."
}
```

---

## ✅ You're All Set!

Now you have a working local AI chatbot using Ollama and Spring Boot. 🎉

---

## 🧠 Bonus Ideas

- Add a React frontend
- Store chat history in a database
- Add authentication
- Use it as a personal assistant or educational tutor

---

## 📄 License

MIT
