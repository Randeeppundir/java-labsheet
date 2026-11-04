# Lab Sheet-08 — Object Oriented Programming Using Java
**MCA III Semester | Last Date: 26-10-2026**

This ZIP contains Java source code for all 20 practical questions.

## Requirements
- JDK 11 or newer (JDK 17/21 recommended)
- Terminal / Command Prompt or VS Code / IntelliJ IDEA

## Compile all programs
Open a terminal in the extracted project folder:

```bash
cd src
javac *.java
```

Run a standalone program:
```bash
java StudentBeanDemo
java CircleBeanDemo
java NetworkInfo
```

## Question-to-file mapping

| Q.No. | Program / Class | File(s) |
|---:|---|---|
| 1 | StudentBean with getters/setters | `StudentBean.java` |
| 2 | RectangleBean area and perimeter | `RectangleBean.java` |
| 3 | Serializable EmployeeBean | `EmployeeBean.java` |
| 4 | Read-only currentDate | `DateBean.java` |
| 5 | Write-only password | `UserBean.java` |
| 6–7 | AccountBean property change listener/event | `AccountBean.java`, `AccountBeanDemo.java` |
| 8 | Introspector properties and methods | `StudentBeanIntrospection.java` |
| 9 | CarBean set/get demo | `CarBean.java`, `CarBeanDemo.java` |
| 10 | CircleBean calculated read-only properties | `CircleBean.java`, `CircleBeanDemo.java` |
| 11 | Host name and IP address | `NetworkInfo.java` |
| 12 | TCP server accepts connection | `HelloServer.java` |
| 13 | TCP client sends Hello Server | `HelloClient.java` |
| 14 | TCP server reads client message | `HelloServerRead.java` |
| 15 | TCP echo server and test client | `EchoServer.java`, `EchoClient.java` |
| 16 | UDP client sends Ping | `MessageSender.java` |
| 17 | UDP server receives message | `MessageReceiver.java` |
| 18 | Read webpage using URL | `WebReader.java` |
| 19 | Download file using URLConnection | `FileDownloader.java` |
| 20 | Multithreaded TCP server | `MultiClientServer.java`, `MultiClientClient.java` |

## How to run networking practicals

Run the server first in one terminal, then run its client in another terminal. Both programs use localhost by default.

### Q12–Q13: Basic TCP
Terminal 1:
```bash
java HelloServer
```
Terminal 2:
```bash
java HelloClient
```

### Q14: Receive and print client message
Terminal 1:
```bash
java HelloServerRead
```
Terminal 2:
```bash
java HelloClient
```

### Q15: Echo server
Terminal 1:
```bash
java EchoServer
```
Terminal 2:
```bash
java EchoClient
```
Type messages; enter `exit` to stop the client session.

### Q16–Q17: UDP
Terminal 1:
```bash
java MessageReceiver
```
Terminal 2:
```bash
java MessageSender
```

### Q20: Multiple TCP clients
Terminal 1:
```bash
java MultiClientServer
```
Terminal 2 (and other terminals):
```bash
java MultiClientClient Hello from client one
```

## URL exercises
```bash
java WebReader
java WebReader https://example.com
java FileDownloader https://www.example.com/sample.txt downloaded.txt
```
Internet access is required. The sample download URL may not host the named file; if so, provide another valid URL to `FileDownloader`.

## Notes
- Questions 12–15 and 20 use TCP port 5000. Run only one of these servers at a time.
- UDP exercises use port 6000.
- A firewall may ask permission for local network connections.
- `DateBean` exposes `currentDate` as a read-only property (getter only).
- `UserBean` exposes `password` as write-only (setter only); the demo intentionally does not reveal the password.
- All programs use standard Java libraries; no external dependencies are required.
