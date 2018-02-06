# audit-practice
Projects to learn audit using database triggers, hibernate envers and spring data jpa

1. audit-hibernate
Used hibernate-envers library to audit CRUD operations on BAR table
BAR - Table to be audited
  Columns:
    1. BAR_ID
    2. BAR_NAME
BAR_AUD - Audit details of BAR table
  Columns:
    1. REV      : REV
    2. REVTYPE  : 0 - Insert, 1- Update 
    3. BAR_ID   : ID of BAR(Column of BAR table with updated value)
    4. BAR_NAME : NAME of BAR(Column of BAR table with updated value)
REVINFO - A row is inserted into this table on each new revision, that is, on each commit of transactions that change audited data. 
  Columns:
    1. REV      : Auto generated primary key
    2. REVTSTMP : Value of this property will be automatically set by envers.
