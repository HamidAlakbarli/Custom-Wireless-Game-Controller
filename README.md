📌 Customizable Wireless Game Controller with Reddit-Sourced Control Schemes and Voice Input

📖 Concept

Our project is a fully customizable mobile game controller for PC games that allows users to create, save, and modify controller layouts. The app emulates a Bluetooth keyboard to send game inputs directly from the phone to the PC. Additionally, it integrates voice commands for in-game actions and utilizes Reddit's API to fetch community-created control schemes for various games.

🎯 Purpose

Traditional game controllers lack flexibility, and many players have unique preferences for button mappings. Our app solves this by allowing users to:
✅ Create a custom game controller layout on their phone.
✅ Use keyboard emulation to send inputs to PC games.
✅ Import community-sourced control schemes from Reddit.
✅ Use voice commands (via IBM Watson API) to trigger in-game actions.
✅ Improve accessibility by supporting gesture and voice-based controls.

By leveraging Reddit's API, the app scrapes and organizes control layouts shared by gamers, allowing users to import and adjust popular configurations instead of starting from scratch.

🛠 How It Works (User Flow)

🔹 Step 1: User Selects a Game

The user launches the app and searches for a game they want to play.

The app queries Reddit’s API (e.g., /r/gaming or /r/controllerlayouts) for control schemes related to that game.

The user chooses a recommended control scheme or creates a custom one from scratch.

🔹 Step 2: User Customizes the Controller Layout

A drag-and-drop interface lets users:

Add buttons (e.g., Jump, Shoot, Reload).

Configure joysticks for movement.

Assign gestures or voice commands to actions.

The app saves the layout locally and syncs it with Firebase for multi-device access.

🔹 Step 3: User Connects the Phone to a PC

The phone registers as a Bluetooth keyboard.

When the user presses a button in the app, the phone sends a corresponding keystroke to the PC.

Example: Pressing the "Jump" button in the app sends the Spacebar key to the PC.

The PC recognizes the input as a real keyboard press, and the game reacts accordingly.

🔹 Step 4: Voice Commands (Optional Feature)

Users can speak a command (e.g., "Reload").

The app sends the voice data to IBM Watson's Speech-to-Text API.

The API converts speech into text, and the app maps it to an in-game action.

Example: Saying "Reload" triggers the "R" key for reloading in a shooter game.

🔹 Step 5: Playing the Game

The user plays their game with a fully customized controller layout on their phone.

The app continues to send keyboard inputs over Bluetooth in real time.

Users can adjust the layout mid-game if needed.

💻 Technologies Used

Component

Technology

Database for Layout Storage

Google Firebase

External API (for control schemes)

Reddit API

External API (for voice commands)

IBM Watson Speech-to-Text

External API (Console Input)

XInput Game Controller

PC Input Method

Bluetooth Keyboard Emulation

UI Framework

Jetpack Compose (Android UI)

🚀 Key Features

✅ Fully Customizable Controller – Drag-and-drop buttons, joysticks, gestures.
✅ Community-Sourced Control Layouts – Uses Reddit API to fetch real-world game layouts.
✅ Bluetooth Keyboard Emulation – Sends game inputs as keyboard presses to PC.
✅ Voice Commands (IBM Watson API) – Play games using spoken commands.
✅ Firebase Syncing – Save and load layouts across multiple devices.
