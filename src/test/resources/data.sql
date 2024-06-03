INSERT INTO professor (name, department)values('John Smith', 'Computer Science');


INSERT INTO professor (name, department)values('Mary Johnson', 'Physics');


INSERT INTO professor (name, department)values('David Lee', 'Mathematics');


INSERT INTO student (name, email)values('Alice Johnson', 'alice@example.com');


INSERT INTO student (name, email)values('Bob Davis', 'bob@example.com');


INSERT INTO student (name, email)values('Eva Wilson', 'eva@example.com');


INSERT INTO course (name, credits, professorId)values('Introduction to Programming', 3, 1);


INSERT INTO course (name, credits, professorId)values('Quantum Mechanics', 4, 2);


INSERT INTO course (name, credits, professorId)values('Calculus', 4, 3);


INSERT INTO course_student (courseId, studentId)values(1,1);


INSERT INTO course_student (courseId, studentId)values(1,2);



INSERT INTO course_student (courseId, studentId)values(2,2);



INSERT INTO course_student (courseId, studentId)values(2, 3);



INSERT INTO course_student (courseId, studentId)values(3, 1);



INSERT INTO course_student (courseId, studentId)values(3, 3);

