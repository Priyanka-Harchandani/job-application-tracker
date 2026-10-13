# Job Portal

## Overview
A full-stack job portal where registered users can explore job opportunities, apply for jobs, and manage their applications. Registered company accounts can post and manage job openings.

## MVP Features

### Authentication
- User registration and login.
- Two roles: `JOB_SEEKER` and `COMPANY`.
- Role-based access control.

### Job Seekers
- Browse and search available jobs after logging in.
- View job details.
- Apply for jobs.
- Track application status and application history.

### Companies
- Create and manage a company profile.
- Post job openings.
- Update and close their own job postings.
- View applications submitted for their jobs.

## Technology Stack

**Frontend**
- React
- JavaScript
- CSS

**Backend**
- Java
- Spring Boot
- Spring Data JPA
- REST APIs
- Spring Security (planned)

**Database**
- MySQL

## Initial Data Model

- `User` — registration, login, and user role.
- `Company` — company profile linked to its user account.
- `Job` — job details linked to the company that posted them.
- `JobApplication` — connects a job seeker with a job and tracks application status.

## Development Approach
The project is being built incrementally, starting with requirements and design, followed by backend development, frontend development, integration, and testing.

## Project Status
- Finalize entity design
- Implement authentication and authorization
- Implement job management APIs
- Implement job application APIs
- Build React frontend
- Integrate and test the application
