# audit-practice
Audit tables capture dml changes made to the tables. These projects illustrates 3 of the many ways we can create audit tables:
1. Using database triggers
2. Hibernate envers
3. Spring data jpa.

1. audit-hibernate
Used hibernate-envers library to audit CRUD operations on BAR table
  1. BAR - Table to be audited
    Columns:
      i. BAR_ID
      ii. BAR_NAME
  2. BAR_AUD - Audit details of BAR table
    Columns:
      i. REV      : REV
      ii. REVTYPE  : 0 - Insert, 1- Update 
      ii. BAR_ID   : ID of BAR(Column of BAR table with updated value)
      iv. BAR_NAME : NAME of BAR(Column of BAR table with updated value)
  3. REVINFO - A row is inserted into this table on each new revision, that is, on each commit of transactions that change audited data. 
    Columns:
      i. REV      : Auto generated primary key
      ii. REVTSTMP : Value of this property will be automatically set by envers.
TODO:
  1. Change spring.jpa.hibernate.ddl-auto from create to none 
      Done: Used liquibase to create table and database versioning

2. audit-jpa
Used @CreatedDate, @LastModifiedDate, @CreatedBy, @LastModifiedBy and @EntityListeners
Implement Audtitor<> to provide the author name for createdBy and modifiedBy

TODO: 
  1. Add audit tables

3. audit4j-practice
Used audit4J library
TODO: 
  1. Update build.gradle to get the audit4j dependencies
      Done

Reference: http://www.baeldung.com/database-auditing-jpa
