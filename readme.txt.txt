Human Resource Officer Portal:

All points listed in the Assignment1.pdf are covered.

Brief:
-> CRUD, photo upload & view, and search operations will work.
-> All changes are committed and pushed to GitHub.
-> Proper validations (empty, data type, and regex) are done on all the fields.
-> Alignments are handled.

Portal usage:
Left side panel -> create, view, and update features.
Right side panel -> view table, search, drag data from right to left panel on click of "view" and delete features.

Note:
For the portal unique key is "Employee Id".
A lot of code optimization is done like eliminating repetitive code, dividing the code into modular levels, and proper validations taken care of.

Create:
-> Fill in the text fields and create an employee profile.
-> Validations: Empty fields, Wrong data type, Regex validations are done.
-> Can't create a new employee with the same employee id.

Update:
-> On the Right side panel, once the employee profiles are created select one row and click view to drag the selected data to the left panel.
-> Make the necessary changes and click on update.
-> Validations: Empty fields, Wrong data type, Regex validations are done.

Delete & View:
-> Select an employee row and click on delete.
-> On click of delete or view without selecting a row will throw an error.

Search:
-> Enter any text or partial text from any fields like Name, Employee Id, Age...etc, and click on the search button.
-> You'll get a filtered employee profile table list.
-> To see the non-search table data, remove the search text and click on the search button.

Photo upload:
Click on the upload button and then upload the image once uploaded immediately you can see the uploaded image below.
In the table, you can't view the image but can see the text called -> Uploaded [to view the image again click on the view button below the table]
The image is not displayed since the table size is huge.