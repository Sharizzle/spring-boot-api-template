-- Setup
CREATE DATABASE student;
CREATE ROLE sharifkanaan;
ALTER ROLE "sharifkanaan" WITH LOGIN;
GRANT ALL PRIVILEGES ON DATABASE "student" to sharifkanaan;

-- Connection
\c student