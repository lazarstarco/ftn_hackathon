CREATE TABLE answers
(
    id          INTEGER NOT NULL,
    answer      VARCHAR(255),
    question_id INTEGER,
    is_correct  BOOLEAN,
    CONSTRAINT pk_answers PRIMARY KEY (id)
);

CREATE TABLE game_props
(
    id               INTEGER NOT NULL,
    player_one_score INTEGER,
    player_two_score INTEGER,
    is_open          BOOLEAN,
    is_completed     BOOLEAN,
    CONSTRAINT pk_game_props PRIMARY KEY (id)
);

CREATE TABLE games
(
    id            INTEGER NOT NULL,
    player_one_id INTEGER,
    player_two_id INTEGER,
    game_props_id INTEGER,
    CONSTRAINT pk_games PRIMARY KEY (id)
);

CREATE TABLE questions
(
    id       INTEGER NOT NULL,
    topic_id INTEGER,
    CONSTRAINT pk_questions PRIMARY KEY (id)
);

CREATE TABLE students
(
    id                INTEGER NOT NULL,
    name              VARCHAR(255),
    surname           VARCHAR(255),
    username          VARCHAR(255),
    password          VARCHAR(255),
    email             VARCHAR(255),
    associated_school VARCHAR(255),
    CONSTRAINT pk_students PRIMARY KEY (id)
);

CREATE TABLE teachers
(
    id                INTEGER NOT NULL,
    name              VARCHAR(255),
    surname           VARCHAR(255),
    username          VARCHAR(255),
    password          VARCHAR(255),
    email             VARCHAR(255),
    associated_school VARCHAR(255),
    CONSTRAINT pk_teachers PRIMARY KEY (id)
);

CREATE TABLE topics
(
    id         INTEGER NOT NULL,
    topic_name VARCHAR(255),
    CONSTRAINT pk_topics PRIMARY KEY (id)
);

CREATE TABLE topics_per_student
(
    student_id INTEGER NOT NULL,
    topic_id   INTEGER NOT NULL,
    CONSTRAINT pk_topics_per_student PRIMARY KEY (student_id, topic_id)
);

ALTER TABLE answers
    ADD CONSTRAINT FK_ANSWERS_ON_QUESTION FOREIGN KEY (question_id) REFERENCES questions (id);

ALTER TABLE games
    ADD CONSTRAINT FK_GAMES_ON_GAME_PROPS FOREIGN KEY (game_props_id) REFERENCES game_props (id);

ALTER TABLE questions
    ADD CONSTRAINT FK_QUESTIONS_ON_TOPIC FOREIGN KEY (topic_id) REFERENCES topics (id);

ALTER TABLE topics_per_student
    ADD CONSTRAINT FK_TOPICS_PER_STUDENT_ON_STUDENT FOREIGN KEY (student_id) REFERENCES students (id);

ALTER TABLE topics_per_student
    ADD CONSTRAINT FK_TOPICS_PER_STUDENT_ON_TOPIC FOREIGN KEY (topic_id) REFERENCES students (id);