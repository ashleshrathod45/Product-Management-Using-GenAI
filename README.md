# 🛍️ Product Management Application

This is a full-fledged **Product Management** backend system built using **Spring Boot**. The application supports **role-based access** for managing products and provides secure JWT-based authentication.

> ⚡ This entire project was developed using **GitHub Copilot** in **VS Code**, following a systematic **Software Development Life Cycle (SDLC)** approach, with **prompts stored and documented in the repository**.

---

## 📌 Table of Contents

- [📖 Project Overview](#project-overview)
- [🧑‍💻 Roles & Permissions](#roles--permissions)
- [🧠 SDLC Approach with GitHub Copilot](#sdlc-approach-with-github-copilot)
- [📁 Project Structure](#project-structure)
- [🚀 Getting Started](#getting-started)
- [📬 API Endpoints](#api-endpoints)
- [📊 UML Diagrams](#uml-diagrams)
- [📜 Prompt Logs](#prompt-logs)
- [🛠️ Tech Stack](#tech-stack)


---

## 📖 Project Overview

This application provides a secure backend for managing products. It features:

- JWT-based login and registration
- Role-based authorization (Admin & Manager)
- CRUD operations for products
- Data initialization on first run
- H2 in-memory database
- Full SDLC traceability with design artifacts

---

## 🧑‍💻 Roles & Permissions

| Role    | Capabilities                             |
|---------|-------------------------------------------|
| Admin   | Add, Update, View, Delete Products        |
| Manager | Add, Update, View Products (no delete)    |

---

## 🧠 SDLC Approach with GitHub Copilot

This project was created **entirely using GitHub Copilot** through structured **SDLC phases**:

1. **Requirement Gathering**  
   Prompts were written to define system needs like user roles, endpoints, authentication, etc.

2. **UML Design Generation**  
   - Class Diagram  
   - Use Case Diagram  
   - ER Diagram  
   - Sequence Diagram  
   These were generated using `draw.io` compatible XML code suggested by Copilot.

3. **Microservice Development**  
   Spring Boot application structure, entities, repositories, services, security config, and controllers were scaffolded and refined using GitHub Copilot suggestions.

4. **Prompt Documentation**  
   All development prompts used to build this project are saved in the [`PromptsLogs/`](./PromptsLogs) directory.

---

## 📁 Project Structure

GenAI/
├── Microservice/ # Spring Boot backend code
│ └── productservice/
├── PromptsLogs/ # Prompt conversations for each SDLC step
├── Diagrams/ # UML design files (draw.io + XML)


📬 API Endpoints
🔐 Authentication
Method	Endpoint	Description
POST	/api/auth/register	Register user
POST	/api/auth/login	Login & get token
GET	/api/auth/me	Get current user

📦 Product Management
Method	Endpoint	Role(s)
GET	/api/products	ADMIN, MANAGER
GET	/api/products/{id}	ADMIN, MANAGER
POST	/api/products	ADMIN, MANAGER
PUT	/api/products/{id}	ADMIN, MANAGER
DELETE	/api/products/{id}	ADMIN only

📜 Prompt Logs
Prompts and conversations with GitHub Copilot have been documented step-by-step:

PromptsLogs/1_Prompts_RequiementGathering.txt

PromptsLogs/2_Prompts_UMLDiagrams.txt

PromptsLogs/3_Prompts_MicroServiceCreation.txt

These ensure complete transparency and traceability of how the application evolved using GenAI.

🛠️ Tech Stack
Java 17

Spring Boot

Spring Security + JWT

MySQL Database

Maven

GitHub Copilot (in VS Code)

Draw.io for diagrams