# CS305_SoftwareSecurity_Portfolio
The culmination of my work in SNHU CS305 Software Security


    Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?

Artemis Financial is a consulting company that develops individualized financial plans for its customers -- including savings, retirement, investments, and insurance.  The company values software security and was looking to modernize its security operations.
    
    What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?

I did well identifying possible security vulnerabilities in the clients code.  As the course progressed, I became better at documenting and creating actionable recommendations for the vulnerabilities.  Secure software is both an ethical and legal responsibility.  Lack of security can damage a companies reputation, have steep financial penalties, and lead to criminal charges.
    
    Which part of the vulnerability assessment was challenging or helpful to you?

The vulnerability assessment diagram was helpful for me in that it helped me track the different domains of security I should consider.  The Oracle secure coding practices was also helpful for me in that it showed me practical examples of different insecure coding practices.  It was difficult to manage the vulnerability assessment in the context of Spring Boot.  Having to learn a framework at the same time as secure code added a layer of complexity to the course work.
    
    How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

In these projects, I added security through static and dynamic code analysis.  I also encrypted and verified data through a checksum and certificate.  In the future, I would assess secure code using OWASP and Oracle coding recommendations, reference legal security requirements, and approach outside data sources (user input, outside libraries, etc.) with a high degree of skepticism.
    
    How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

I was able to increase the security of these two projects by code review, using a static code analysis tool, and introducing encryption to the application.  More sophisticated projects would benefit from red team v blue team testing, logging and analytics, unit testing, and integration testing.  After modifying the code, I checked the security of my code with a code review and using the OWASP static code analysis tool.  In a production environment, it would also be prudent to have a second set of eyes review my code for anything I may have missed.  A security checklist may also be beneficial in these instances.
    
    What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

I have previously mentioned the importance of the Oracle coding practices website.  Owasp also sets recommendations that I referenced.  The national vulnerability database was also helpful.  I expect to use all three of these resources (or the equivalent site to the Oracle one for whichever language I happen to be writing in).
    
    Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

I would show employers artifacts that demonstrate I can successfully encrypt data and create a certificate.  I would also show employers artifacts that show I can analyze code for security defects.
