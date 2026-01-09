Search Server

A Java Spring Boot server implementing search-related features.
Handles interfaces defined in an IDL.

## Run on your local

1. Clone this repository.
2. Set the following properties in `.gradle/gradle.properties`:
   ```
   gpr.user=your_github_username
   gpr.key=your_github_token
   ```
3. Run:
   ```
   ./gradlew bootRun
   ```
4. Access the server at `http://localhost:8080/`. Also, access the gRPC server at `http://localhost:9090`.