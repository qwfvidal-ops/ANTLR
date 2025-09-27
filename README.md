# ANTLR4 Basic Lexer Setup Guide

This guide will walk you through setting up ANTLR4 with a basic lexer grammar and demonstrate tokenization with error handling.

## Prerequisites

- Java JDK installed (version 8 or higher)
- Command Prompt or PowerShell access

### Verify Java JDK Installation

Before starting, verify that Java JDK is properly installed:

```cmd
java -version
javac -version
```

**Expected output** (example):
```
java version "11.0.16" 2022-07-19 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.16+11-LTS-199)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.16+11-LTS-199, mixed mode)

javac 11.0.16
```

If you see "command not found" errors, download and install Java JDK from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/).

## Complete Setup Process

### Step 1: Download ANTLR4

1. **Download ANTLR4**:
   - Go to [https://www.antlr.org/download.html](https://www.antlr.org/download.html)
   - Download the latest ANTLR4 JAR file (e.g., `antlr-4.13.1-complete.jar`)

### Step 2: Extract and Setup

1. **Create a project directory**:
   ```cmd
   mkdir C:\antlr-demo
   cd C:\antlr-demo
   ```

2. **Place the JAR file**:
   - Copy the downloaded `antlr-4.13.1-complete.jar` to your project directory (`C:\antlr-demo\`)
   - Rename it to `antlr4.jar` for simplicity

3. **Extract the runtime classes**:
   ```cmd
   jar -xf antlr4.jar
   ```
   This will extract all the ANTLR4 runtime classes into your directory. After extraction, you will see:
   - **`META-INF/`** folder - Contains metadata and manifest files
   - **`org/`** folder - Contains all the ANTLR4 runtime class files
   - Various `.stg` template files and other resources

### Step 3: Create All Project Files

**Important**: All files should be created in your project directory (`C:\antlr-demo\`):

1. **Create grammar file** (`C:\antlr-demo\BasicLex.g4`):
   ```cmd
   notepad BasicLex.g4
   ```
   Copy and paste the grammar content (see Step 1 below).

2. **Create input files**:
   ```cmd
   notepad input.txt
   notepad error_input.txt
   notepad advanced_input.txt
   notepad activity_input.txt
   ```
   Copy and paste the respective content for each file.

3. **Create batch files**:
   ```cmd
   notepad antlr4.bat
   notepad grun.bat
   ```
   Copy and paste the respective batch file content.

4. **Verify all files are created**:
   ```cmd
   dir *.g4 *.txt *.bat
   ```
   You should see:
   ```
   BasicLex.g4
   antlr4.bat
   grun.bat
   input.txt
   error_input.txt
   advanced_input.txt
   activity_input.txt
   ```

### Step 4: Set Up Command Path

1. **Add to PATH (Temporary - for current session)**:
   ```cmd
   set PATH=%PATH%;%CD%
   ```

2. **Or Add to PATH (Permanent)**:
   - Right-click "This PC" → Properties → Advanced System Settings
   - Click "Environment Variables"
   - Under "System Variables", find and select "Path", then click "Edit"
   - Click "New" and add your project directory path (e.g., `C:\antlr-demo`)
   - Click "OK" to save all changes
   - **Restart Command Prompt** for changes to take effect

3. **Verify ANTLR4 setup**:
   ```cmd
   java -cp antlr4.jar org.antlr.v4.Tool
   ```
   You should see ANTLR4 usage information without errors.

4. **Check ANTLR4 version**:
   ```cmd
   java -cp antlr4.jar org.antlr.v4.Tool -version
   ```
   This will display the ANTLR4 version number.

5. **Verify extracted files**:
   ```cmd
   dir
   ```
   You should see:
   - `antlr4.jar`
   - `META-INF/` folder
   - `org/` folder
   - Various `.stg` files

## Step 5: Create the Grammar File

Create a file named `BasicLex.g4` with the following content:

```antlr
lexer grammar BasicLex;

// Tokens
INT    : 'int';
ID     : [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER : [0-9]+;
ASSIGN : '=';
SEMI   : ';';
WS     : [ \t\r\n]+ -> skip;
```

**Explanation:**
- `lexer grammar BasicLex;` - Defines a lexer-only grammar named BasicLex
- `INT: 'int';` - Recognizes the keyword 'int'
- `ID: [a-zA-Z_][a-zA-Z0-9_]*;` - Recognizes identifiers (letters/underscore followed by letters/digits/underscores)
- `NUMBER: [0-9]+;` - Recognizes one or more digits
- `ASSIGN: '=';` - Recognizes the assignment operator
- `SEMI: ';';` - Recognizes semicolons
- `WS: [ \t\r\n]+ -> skip;` - Skips whitespace characters

## Step 6: Create Input Files

Create test input files:

**input.txt** (valid input):
```
int x = 10;
```

**error_input.txt** (input with error):
```
int x = 10$;
```

## Step 7: Create Batch Files

**antlr4.bat** (ANTLR4 code generator):
```batch
@echo off
java -Xmx500M -cp antlr4.jar org.antlr.v4.Tool %*
```

**grun.bat** (ANTLR4 test rig):
```batch
@echo off
java -cp .;antlr4.jar org.antlr.v4.gui.TestRig %*
```

## Step 8: Generate and Compile Java Files

1. **Generate Java files from grammar:**
   ```cmd
   antlr4 BasicLex.g4
   ```
   or
   ```cmd
   .\antlr4.bat BasicLex.g4
   ```

2. **Compile the generated Java files:**
   ```cmd
   javac -cp . BasicLex*.java
   ```

## Step 9: Test Tokenization

### Test with valid input:
```cmd
grun BasicLex tokens -tokens input.txt
```

**Expected output:**
```
[@0,0:2='int',<'int'>,1:0]
[@1,4:4='x',<ID>,1:4]
[@2,6:6='=',<'='>,1:6]
[@3,8:9='10',<NUMBER>,1:8]
[@4,10:10=';',<';'>,1:10]
[@5,13:12='<EOF>',<EOF>,2:0]
```

### Test error handling:
```cmd
grun BasicLex tokens -tokens error_input.txt
```

**Expected output:**
```
[@0,0:2='int',<'int'>,1:0]
[@1,4:4='x',<ID>,1:4]
[@2,6:6='=',<'='>,1:6]
[@3,8:9='10',<NUMBER>,1:8]
[@4,11:11=';',<';'>,1:11]
[@5,14:13='<EOF>',<EOF>,2:0]
line 1:10 token recognition error at: '$'
```

## Understanding the Output

The tokenization output format is:
```
[@token_index,start:end='text',<token_type>,line:column]
```

Where:
- `token_index` - Sequential number of the token
- `start:end` - Character positions in the input
- `text` - The actual text that was tokenized
- `token_type` - The type of token (INT, ID, NUMBER, etc.)
- `line:column` - Line and column position in the input

## Common Commands

| Command | Purpose |
|---------|---------|
| `antlr4 BasicLex.g4` | Generate Java files from grammar |
| `javac -cp . BasicLex*.java` | Compile generated Java files |
| `grun BasicLex tokens -tokens input.txt` | Tokenize input file |
| `grun BasicLex tokens -tree input.txt` | Show parse tree |
| `grun BasicLex tokens -gui input.txt` | Show parse tree in GUI |

## Error Handling

The BasicLex grammar demonstrates ANTLR4's default error handling behavior:
- **Stops on Error**: When an unexpected character is encountered, the lexer stops and reports an error
- **Error Message**: Shows the line, column, and problematic character
- **Partial Results**: Still shows tokens that were successfully recognized before the error

## Troubleshooting

1. **"grun not recognized"**: Add current directory to PATH or use `.\grun.bat`
2. **"Grammar has no rules"**: Ensure your grammar has at least one lexer rule
3. **Class files not found**: Make sure to compile the generated Java files
4. **CLASSPATH issues**: Ensure ANTLR runtime classes are in your CLASSPATH

## File Structure

After complete setup, your directory should contain:
```
C:\antlr-demo\
├── antlr4.jar           # ANTLR4 JAR file
├── BasicLex.g4          # Grammar file
├── input.txt            # Valid test input
├── error_input.txt      # Invalid test input
├── advanced_input.txt   # Complex test input
├── activity_input.txt   # Activity test input
├── antlr4.bat           # ANTLR4 batch file
├── grun.bat             # Test rig batch file
├── BasicLexLexer.java   # Generated lexer
├── BasicLex.tokens      # Generated token definitions
├── *.class              # Compiled Java files
├── org\                 # Extracted ANTLR4 runtime classes
├── META-INF\            # Metadata files
└── README.md            # This guide
```

## Quick Start

### For First-Time Setup:
1. **Download and extract ANTLR4** (see Complete Setup Process above)
2. **Create the grammar and input files** (see steps above)
3. **Create the batch files** (see step above)
4. **Run the commands**:
   ```cmd
   antlr4 BasicLex.g4
   javac -cp . BasicLex*.java
   grun BasicLex tokens -tokens input.txt
   ```

### For Subsequent Uses:
1. Run: `antlr4 BasicLex.g4`
2. Run: `javac -cp . BasicLex*.java`
3. Run: `grun BasicLex tokens -tokens input.txt`

### Test Different Inputs:
```cmd
grun BasicLex tokens -tokens input.txt          # Basic test
grun BasicLex tokens -tokens error_input.txt    # Error handling test
grun BasicLex tokens -tokens activity_input.txt # Complex code test
```

## Final Verification

After complete setup, run this comprehensive test to verify everything is working:

```cmd
# Test 1: Check Java and ANTLR4 versions
java -version
java -cp antlr4.jar org.antlr.v4.Tool -version

# Test 2: Generate and compile grammar
antlr4 BasicLex.g4
javac -cp . BasicLex*.java

# Test 3: Run tokenization
grun BasicLex tokens -tokens input.txt

# Test 4: Check error handling
grun BasicLex tokens -tokens error_input.txt

# Test 5: Check complex input
grun BasicLex tokens -tokens activity_input.txt
```

If all tests pass without errors, your ANTLR4 setup is complete and ready to use!

Enjoy exploring ANTLR4 lexer tokenization!
