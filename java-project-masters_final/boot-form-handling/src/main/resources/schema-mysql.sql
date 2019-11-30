/*DROP TABLE IF EXISTS employee;
*/
CREATE TABLE IF NOT EXISTS workshops (
  workid VARCHAR(10) NOT NULL,
  topic VARCHAR(100) NOT NULL,
  venue VARCHAR(100) NOT NULL,
  wsdate DATE,
  organiser VARCHAR(100) NOT NULL,
  location VARCHAR(100),
  PRIMARY KEY(workid)
);