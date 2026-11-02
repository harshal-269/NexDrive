# NexDrive 🚀
### Your Digital World, Safely Stored.

NexDrive is a cloud-drive-style file management application built using **Spring Boot Microservices** and **React**. It allows users to organize files and folders, upload and download files, and manage stored data through a modern web interface.

## ✨ Features

- Create and manage folders
- Upload files
- Download files
- Delete files and folders
- Browse files and folders
- Grid and list views
- File type identification
- Centralized file storage
- Microservices-based backend architecture
- React-based responsive frontend

## 🏗️ Architecture

NexDrive follows a microservices architecture with four independent Spring Boot services and a React frontend.

```text
                    React Frontend
                    (Port 5173)
                          |
                          v
                    Drive Service
                    (Port 8091)
                          |
              +-----------+-----------+
              |                       |
              v                       v
        Storage Service          Service Registry
          (Port 8092)              (Port 8761)
                                      |
                                      v
                                Admin Server
                                 (Port 1111)
```

### Backend Services

| Service | Port | Responsibility |
|---|---:|---|
| Service Registry | 8761 | Service discovery using Eureka |
| Admin Server | 1111 | Monitoring registered services |
| Storage Service | 8092 | File storage and retrieval |
| Drive Service | 8091 | File and folder management APIs |

## 🛠️ Tech Stack

**Backend**
- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Cloud Netflix Eureka
- Spring Boot Admin
- H2 Database
- Maven

**Frontend**
- React 19
- Vite
- JavaScript
- CSS

**Tools**
- IntelliJ IDEA
- Git and GitHub
- Postman

## 📁 Project Structure

```text
NexDrive/
│
├── Admin-Server/
├── Drive-Service/
├── Service-Registry/
├── Storage-Service/
│
├── drive-frontend/
│   ├── src/
│   ├── public/
│   ├── package.json
│   └── vite.config.js
│
├── .gitignore
└── README.md
```

## ⚙️ Getting Started

### Prerequisites

- Java 21 or later
- Node.js and npm
- Git

### 1. Clone the Repository

```bash
git clone https://github.com/harshal-269/NexDrive.git
cd NexDrive
```

### 2. Start Backend Services

Start the services in this order.

**Service Registry**

```bash
cd Service-Registry
.\mvnw.cmd spring-boot:run
```

**Admin Server**

```bash
cd Admin-Server
.\mvnw.cmd spring-boot:run
```

**Storage Service**

```bash
cd Storage-Service
.\mvnw.cmd spring-boot:run
```

**Drive Service**

```bash
cd Drive-Service
.\mvnw.cmd spring-boot:run
```

Run each service in a separate terminal.

### 3. Start Frontend

Open another terminal:

```bash
cd drive-frontend
npm install
npm run dev
```

Open the application:

http://localhost:5173

## 🔗 Service URLs

| Component | URL |
|---|---|
| React Frontend | http://localhost:5173 |
| Drive Service | http://localhost:8091 |
| Storage Service | http://localhost:8092 |
| Eureka Dashboard | http://localhost:8761 |
| Admin Server | http://localhost:1111 |

## 💾 Data Storage

- H2 file-based database is used by the Drive Service.
- The Storage Service stores uploaded file objects on the local filesystem.
- Local runtime data is excluded from Git.

**Note:** The default configuration is intended for local development. Production deployment requires appropriate persistent database and file storage configuration.

## 👨‍💻 Developer

**Harshal Darandale**

GitHub: [@harshal-269](https://github.com/harshal-269)

---

⭐ If you find this project interesting, consider giving the repository a star!