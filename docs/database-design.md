# Database Design — Job Portal MVP

## 1. User
Stores account and authentication information.

- `id`: Primary key
- `name`: Required
- `email`: Required and unique
- `password`: Required hashed password
- `role`: `JOB_SEEKER` or `COMPANY`
- `createdAt`: Account creation timestamp

## 2. Company
Stores a company's profile.

- `id`: Primary key
- `name`: Required
- `description`: Optional
- `website`: Optional
- `user`: Required reference to the owning user

A company user registers and logs in before completing their company profile. The profile must be complete before the company can post jobs.

## 3. Job
Stores job openings posted by companies.

- `id`: Primary key
- `title`: Required
- `description`: Required
- `requiredSkills`: Required
- `location`: Optional
- `workMode`: `ONSITE`, `REMOTE`, or `HYBRID`
- `jobType`: `FULL_TIME`, `PART_TIME`, or `CONTRACT`
- `salaryMin`: Optional
- `salaryMax`: Optional
- `status`: `OPEN` or `CLOSED`
- `postedAt`: Posting timestamp
- `company`: Required reference to the posting company

## 4. JobApplication
Records a candidate's application to a job.

- `id`: Primary key
- `job`: Required reference to a job
- `applicant`: Required reference to a user with the `JOB_SEEKER` role
- `status`: Application status
- `appliedAt`: Application timestamp

A job seeker must not apply to the same job more than once.

## Relationships
- One company user can own one company profile.
- One company can post many jobs.
- One job seeker can submit many applications.
- One job can receive many applications.
- Each application belongs to exactly one job and one applicant.

## Access Rules
- All users must register and log in before accessing job portal features.
- Only `COMPANY` users with a completed company profile can post jobs.
- Only `JOB_SEEKER` users can apply for jobs.
- Companies can manage only their own job postings.
- Passwords must be stored as hashes, never as plain text.
