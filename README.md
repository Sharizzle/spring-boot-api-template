# API Endpoints

These are the endpoints for the `STUDENT` object. Uses **PostgreSQL** as the database.

All endpoints are prefixed with `api/v1`

|          Name | Endpoint |  HTTP Verb  | Description                                                                                                                                                           |
| -------------:|:--------:|:-------:| --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
|     **INDEX** | `/students` | GET  |Get all students.                                                                    |
|     **CREATE** | `/students` | POST  | Create a new student.                                                                     |
|     **SHOW** | `/students/studentId` | GET  | Show details of one student.                                                                    |
|     **UPDATE** | `/students/studentId` | PUT  | Update details of a student.                                                                     |
|     **DESTROY** | `/students/studentId` | DELETE  | Delete a student.                                                                    |
