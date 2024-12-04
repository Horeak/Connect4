# Connect4

Connect4 is a Java-based implementation of the classic two-player board game, developed as an early practice project to explore Java programming and graphical user interface (GUI) design. Players take turns dropping colored discs into a grid, aiming to connect four in a row horizontally, vertically, or diagonally.

## Table of Contents

- [About](#about)
- [Features](#features)
- [Installation](#installation)
  - [Prerequisites](#prerequisites)
  - [Setup](#setup)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## About

This project was created as a learning exercise to gain experience with Java Swing and basic game logic implementation. It demonstrates object-oriented programming principles and provides a functional example of a two-player game.

## Features

- **Graphical User Interface**: Play the game with an intuitive GUI built using Java Swing.
- **Two-Player Gameplay**: Supports local matches between two players.
- **Real-Time Updates**: Displays the game state dynamically as players take their turns.
- **Win Detection**: Automatically detects when a player wins or when the game ends in a draw.

## Installation

### Prerequisites

- **Java Development Kit (JDK)**: Ensure JDK 8 or higher is installed on your system.
- **Git**: Required to clone the repository.

### Setup

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/Horeak/Connect4.git
   cd Connect4
   ```

2. **Compile the Code**:

   Navigate to the `src` directory and compile all Java source files:

   ```bash
   javac Connect4/src/**/*.java
   ```

3. **Run the Application**:

   Execute the game by running the compiled `Main` class:

   ```bash
   java -cp Connect4/src Main
   ```

## Usage

1. Start the game using the command above.
2. Use the GUI to take turns:
   - Players alternate turns by clicking on the columns where they want to drop their discs.
   - The game board updates dynamically.
3. The game automatically detects a winner or a draw and displays the result.

## Contributing

As this repository is archived and read-only, contributions are no longer accepted. However, feel free to fork the repository for personal exploration and learning.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
