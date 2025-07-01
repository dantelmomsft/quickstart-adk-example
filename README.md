# Multi-Tool Agent Project

This is a simple Java Maven project using Java 17 that demonstrates a multi-tool agent using Google's Agent Development Kit (ADK).

## Project Structure

```
quickstart-example/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── agents/
│   │           └── multitool/
│   │               └── MultiToolAgent.java
│   └── test/
│       └── java/
└── README.md
```

## Features

The `MultiToolAgent` provides:
- **Time Tool**: Get current time for any city
- **Weather Tool**: Get weather information (currently only supports New York)

## Requirements

- Java 17
- Maven 3.6+

## Building the Project

```bash
mvn clean compile
```

## Running the Agent

```bash
mvn exec:java -Dexec.mainClass="agents.multitool.MultiToolAgent"
```

## Usage

Once running, you can interact with the agent by typing questions like:
- "What time is it in London?"
- "What's the weather in New York?"
- Type "quit" to exit

## Dependencies

- Google ADK Core (google-adk) v0.1.0
- Google ADK Dev UI (google-adk-dev) v0.1.0
