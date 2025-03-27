Once we begin developing the app, we'll fill this README with information pertaining to the code. For now, we've included the proposal information.

Semester App Design Project Proposal

Concept: 
A customizable wireless game controller with saveable/loadable button configurations, motion control integration, and voice recognition for verbal control. 

Device Types:
Single-screen Android phones and Android Tablets

Purpose: 
An app that should let a user create multiple fully custom game controller layouts on their device. Users should be able to pick types (buttons, joysticks, etc.), quantities, and locations of inputs. They should then be able to map each input source to a keyboard signal. This lets a user not only create a game controller suited exactly to their preferences but also create multiple controller layouts tailored to different games or to other individuals who might share the device. 

Additionally, this app will give users the option to enable controls based on device orientation, device movement, and voice commands. This makes the app far more accessible as it allows users with limited fine motor skills or an inability to use a standard controller to play games through voice commands. 

Database: 
Google Firebase

We will use this database service to store users’ controller layouts. Not only does this persist the data but, as Firebase is a cloud-based database, it allows a user to easily transfer their controllers across devices. In addition, Firebase has existing compatibility with Android Studio so it will be relatively easy to implement. 

APIs: 
Android voice to text API: allows voice controls
Android bluetooth HID API: allows wireless connection to PC
Google Sign-In API: allows users to sign into the app through their Google account
