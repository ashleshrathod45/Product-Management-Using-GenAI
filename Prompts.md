## THE PROMPTS WHICH I USED TO CREATE THIS WHOLE APPLICATION ARE AS FOLLOWS
## I have used the steps of SDLC (Software Development Lifecycle) with which I achieved Requirement Gathering, Product Design(UML Diagrams) and Backend Microservice.

## 1. Requirement Gathering
Prompts for Requirement Gathering

P1-
I am building a Java full-stack product management system.
Help me write functional and non-functional requirements, list of actors, and use cases.

A1-
Functional Requirements

The system shall allow users to create, view, update, and delete products.
The system shall support user authentication and authorization.
The system shall allow users to assign categories and tags to products.
The system shall provide search and filter functionality for products.
The system shall enable users to track product inventory levels.
The system shall generate reports on product sales and inventory.
The system shall allow administrators to manage user accounts and roles.

Non-Functional Requirements

The system shall respond to user actions within 2 seconds.
The system shall support at least 100 concurrent users.
The system shall ensure data security and privacy.
The system shall be available 99.9% of the time.
The system shall be compatible with major browsers (Chrome, Firefox, Edge).
The system shall provide audit logs for all product changes.
The system shall be scalable to support future growth.

Actors

Product Manager
Administrator
Sales Staff
Inventory Manager
System User (authenticated)
Guest User (limited access)
Use Cases

Create Product: Product Manager adds a new product to the catalog.
Update Product: Product Manager modifies product details.
Delete Product: Administrator removes a product from the system.
View Product List: Sales Staff views available products.
Search Products: System User searches for products by name, category, or tag.
Manage Inventory: Inventory Manager updates stock levels.
Generate Reports: Administrator generates sales and inventory reports.
User Authentication: System User logs in to access features.
Assign Roles: Administrator assigns roles to users.
Audit Changes: Administrator reviews audit logs for product changes.

## 2. Product Design
P1-
Generate a textual description of a UML Use Case Diagram for a Product Management System. 
List actors and their interactions with use cases.

A1-
Textual Description of UML Use Case Diagram for Product Management System

Actors:

Product Manager
Administrator
Sales Staff
Inventory Manager
System User (authenticated)
Guest User (limited access)
Use Cases and Actor Interactions:

Product Manager

Create Product
Update Product
Assign Categories/Tags
Administrator

Delete Product
Manage User Accounts and Roles
Generate Reports
Audit Changes
Sales Staff

View Product List
Search Products
Inventory Manager

Manage Inventory
System User (authenticated)

User Authentication
View Product List
Search Products
Guest User

View Product List (limited access)
Search Products (limited access)
Summary:
Each actor interacts with specific use cases relevant to their role. 
Product Managers handle product creation and updates. 
Administrators manage users, reports, and audits. 
Sales Staff and System Users view and search products. 
Inventory Managers update stock levels. 
Guest Users have restricted access to viewing and searching products.

P2-
Generate Draw.io XML for a UML use case diagram with: 
- Actors: Admin, Manager
- Use cases: Add Product, View Product, Delete Product, Generate Report

Error Encountered in VS Code:
> Not a diagram file (error on line 2 at column 6: XML declaration allowed only at the start of the document)

Fix:
- Ensured the XML declaration `<?xml version="1.0"?>` is the first line with no whitespace before it.
- Saved file with UTF-8 encoding (without BOM) using VS Code command: `Change File Encoding`.

P3-
Generate Draw.io XML for a UML Class Diagram for a Java-based Product Management System. Include the following classes:
product, admin, manager and product service. also make sure label the diagrama and border it

P4-
Generate Draw.io XML for an ER Diagram for a Product Management System.
Entities: Product, Admin, Manager
Relationships: Admin can manage many Products, Manager can view many Products
Use standard ERD and make a border and give labeling to this diagram

P5-
Generate Draw.io XML for a UML Sequence Diagram for the scenario: "Admin adds a product". Involve these objects: Admin UI ProductService Database Show method calls like: enterProductDetails(), validate(), addProduct(), saveToDB().
Include lifelines and activation bars.


## 3. MicroService Creation

P1-
as per the requirement gathered, generate me the codes for the product management in spring maven. i have used initializer and created a file called productservice. it has all the necessary dependencies. use sql for the datbase. also make sure to providde me full backend with package names and class names

P2-
Next i want to proceed with implementing the security part. give me codes so that i can easily use spring security and jwt toekenisation to verify and login.
Then we can complete the backend part

P3-
provide me proper authcontroller with all the @PreAuthrize and incomplete parts
also provide me securityconfig again as i am getting some follwoing warnings and errors
[{
	"resource": "/g:/Codings/GenAI/Microservice/productservice/src/main/java/com/productmanagement/security/SecurityConfig.java",
	"owner": "_generated_diagnostic_collection_name_#5",
	"code": "67110275",
	"severity": 4,
	"message": "The method csrf() from the type HttpSecurity has been deprecated since version 6.1 and marked for removal",
	"source": "Java",
	"startLineNumber": 18,
	"startColumn": 14,
	"endLineNumber": 18,
	"endColumn": 18,
	"tags": [
		2
	],
	"origin": "extHost1"
},{
	"resource": "/g:/Codings/GenAI/Microservice/productservice/src/main/java/com/productmanagement/security/SecurityConfig.java",
	"owner": "_generated_diagnostic_collection_name_#5",
	"code": "67110275",
	"severity": 4,
	"message": "The method authorizeHttpRequests() from the type HttpSecurity has been deprecated since version 6.1 and marked for removal",
	"source": "Java",
	"startLineNumber": 19,
	"startColumn": 14,
	"endLineNumber": 19,
	"endColumn": 35,
	"tags": [
		2
	],
	"origin": "extHost1"
},{
	"resource": "/g:/Codings/GenAI/Microservice/productservice/src/main/java/com/productmanagement/security/SecurityConfig.java",
	"owner": "_generated_diagnostic_collection_name_#5",
	"code": "67110275",
	"severity": 4,
	"message": "The method and() from the type AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry has been deprecated since version 6.1 and marked for removal",
	"source": "Java",
	"startLineNumber": 23,
	"startColumn": 14,
	"endLineNumber": 23,
	"endColumn": 17,
	"tags": [
		2
	],
	"origin": "extHost1"
},{
	"resource": "/g:/Codings/GenAI/Microservice/productservice/src/main/java/com/productmanagement/security/SecurityConfig.java",
	"owner": "_generated_diagnostic_collection_name_#5",
	"code": "67110275",
	"severity": 4,
	"message": "The method sessionManagement() from the type HttpSecurity has been deprecated since version 6.1 and marked for removal",
	"source": "Java",
	"startLineNumber": 24,
	"startColumn": 14,
	"endLineNumber": 24,
	"endColumn": 31,
	"tags": [
		2
	],
	"origin": "extHost1"
},{
	"resource": "/g:/Codings/GenAI/Microservice/productservice/src/main/java/com/productmanagement/security/SecurityConfig.java",
	"owner": "_generated_diagnostic_collection_name_#6",
	"code": "JAVA_LAMBDA_DSL",
	"severity": 2,
	"message": "Consider switching to 'HttpSecurity' Lambda DSL syntax",
	"source": "vscode-spring-boot",
	"startLineNumber": 18,
	"startColumn": 9,
	"endLineNumber": 24,
	"endColumn": 43,
	"origin": "extHost1"
},{
	"resource": "/g:/Codings/GenAI/Microservice/productservice/src/main/java/com/productmanagement/security/SecurityConfig.java",
	"owner": "_generated_diagnostic_collection_name_#6",
	"code": "JAVA_LAMBDA_DSL",
	"severity": 2,
	"message": "Consider switching to 'HttpSecurity' Lambda DSL syntax",
	"source": "vscode-spring-boot",
	"startLineNumber": 18,
	"startColumn": 9,
	"endLineNumber": 24,
	"endColumn": 43,
	"origin": "extHost1"
}]
