package CommandPatternExample;
//CommandPatternTest.java
public class CommandPatternTest {
 public static void main(String[] args) {
     // Receiver
     Light livingRoomLight = new Light();

     // Concrete commands
     Command lightOn = new LightOnCommand(livingRoomLight);
     Command lightOff = new LightOffCommand(livingRoomLight);

     // Invoker
     RemoteControl remote = new RemoteControl();

     // Turn on light
     remote.setCommand(lightOn);
     remote.pressButton();

     // Turn off light
     remote.setCommand(lightOff);
     remote.pressButton();
 }
}
