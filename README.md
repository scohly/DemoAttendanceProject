# DemoAttendanceProject

Greetings,

this is a basic attendance tracking app for logging attendance of various members
Our member object is comprosied of the following attributes: 
  Long id (given by the DB when entered)
  String name
  String email
  String uid (unique identifying number)
  Integer age(age of member)
  LocalDate attendanceDate (Date the member was present on)
  
The database used is postgres, note that this was done on a mac os so credential for databse was not required, may be required if testing on a windows machine
also note that the api endpoint was http://localhost8080/api/v1/member

to access the get members endpoint just use the aboce mentioned, otherwise for deletes,puts specifying memberiD is required 
    api/v1/member{memberId}
