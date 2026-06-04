# ATM Simulator System

A desktop ATM Simulator built with Java Swing and MySQL. Simulates 
real ATM operations including account registration, cash transactions, 
PIN management, and statement generation through a full graphical interface.

## Features

- **User Registration** — 3-page signup form (personal info, additional 
  details, account type selection)
- **Login** — Card number and PIN authentication
- **Deposit** — Add funds to your account
- **Cash Withdrawal** — Withdraw a custom amount
- **Fast Cash** — One-click withdrawal with preset amounts 
  (100, 500, 1000, 2000, 5000, 10000 AED)
- **PIN Change** — Update your 4-digit PIN
- **Balance Enquiry** — View your current account balance
- **Mini Statement** — Full transaction history with dates and amounts

## Tech Stack

- **Language:** Java
- **GUI:** Java Swing & AWT
- **Database:** MySQL
- **Connectivity:** JDBC (MySQL Connector/J)

## Project Structure
ATM Simulator System/
├── src/
│   ├── Login.java            # Entry point — login screen
│   ├── SignupOne.java        # Registration page 1: Personal details
│   ├── SignupTwo.java        # Registration page 2: Additional details
│   ├── SignupThree.java      # Registration page 3: Account & card setup
│   ├── Transactions.java     # Main transaction menu
│   ├── Deposit.java          # Deposit screen
│   ├── Withdrawl.java        # Withdrawal screen
│   ├── FastCash.java         # Fast cash screen
│   ├── PinChange.java        # PIN change screen
│   ├── BalanceEnquiry.java   # Balance display
│   ├── MiniStatement.java    # Transaction history
│   └── connection.java       # DB connection (excluded from repo — see setup)
├── database.sql              # MySQL schema
└── README.md

## Setup & Installation

### Prerequisites
- Java JDK 17 or above
- MySQL Server
- MySQL Connector/J (JDBC Driver)

### Step 1 — Database Setup
Import the schema into MySQL:
```sql
source database.sql;
```

### Step 2 — Configure Database Connection
Create `src/connection.java` with your own MySQL credentials:
```java
import java.sql.*;

public class connection {
    Connection c;
    Statement s;
    public connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bankmanagementsystem",
                "YOUR_DB_USERNAME",
                "YOUR_DB_PASSWORD"
            );
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

### Step 3 — Run
Open the project in VS Code with the Java Extension Pack installed 
and run `Login.java` — that is the entry point.

## Author

**Soham Dande** — [GitHub](https://github.com/SohamDande)

*First Java project — built as part of learning Java Swing and MySQL.*
