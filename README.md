# 🏋️‍♂️ AI-Powered Fitness Application

This is a **full-stack AI-integrated fitness management system** built using **Spring Boot Microservices** and **React.js**. The application helps users manage their workout plans, monitor daily activities, and receive personalized AI-based recommendations for diet and fitness goals.

![Java](https://img.shields.io/badge/Backend-Java%2017-blue.svg)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-brightgreen)
![React](https://img.shields.io/badge/Frontend-React-blue)
![Docker](https://img.shields.io/badge/Container-Docker-blue)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

---

## 🚀 Features

- 🔐 **Secure Authentication & Authorization**  
  Role-based login using JWT and Spring Security.

- ⚙️ **Modular Microservices**  
  Separate services for users, workouts, nutrition, and AI integration.

- 🤖 **AI Recommendations**  
  AI/LLM-generated suggestions based on user goals and activity logs using Spring AI.

- 📊 **User Dashboard**  
  Interactive dashboard to view fitness progress and nutrition analysis.

- 📦 **Dockerized Deployment**  
  Containerized using Docker & orchestrated using Docker Compose.

- 🌐 **RESTful APIs**  
  Cleanly designed and documented endpoints for all core features.

---

## 🛠️ Tech Stack

### Backend
- Java 17
- Spring Boot (Web, Data JPA, Security)
- Spring Cloud / Spring AI
- JWT for authentication
- MySQL/PostgreSQL (configurable)

### Frontend
- React.js (with Axios for API calls)
- TailwindCSS or Bootstrap (optional styling)
- Redux (if applicable)

### DevOps
- Docker, Docker Compose
- Git, GitHub Actions (for CI/CD)

---

## 📁 Microservice Modules

| Module           | Description                                       |
|------------------|---------------------------------------------------|
| `user-service`   | Handles user registration, login, profile updates |
| `workout-service`| Manages daily workout logs, schedules             |
| `diet-service`   | Logs meals and integrates with AI suggestions     |
| `ai-service`     | Uses LLM prompts to suggest personalized plans    |
| `gateway-service`| API Gateway for routing requests (optional)       |

---

## ⚙️ Getting Started

### Prerequisites
- Java 17
- Node.js (v18+)
- Docker & Docker Compose
- MySQL or PostgreSQL running locally or via Docker

### Clone the Repository

```bash
git clone https://github.com/Gunajee/Fitness-Application.git
cd Fitness-Application
| Method | Endpoint         | Description                |
| ------ | ---------------- | -------------------------- |
| POST   | /api/auth/signup | Register new user          |
| POST   | /api/auth/login  | Login user and receive JWT |
| GET    | /api/workouts    | Fetch workout list         |
| POST   | /api/diet/ai     | Get AI-generated diet plan |
