# NetTrafficStat project
Introduction
- This project is created to have a simple application which makes monthly/weekly statistics about the data traffic on a computer
 - The motivation is to be sure that the data limitations of available wireless internet services(eg. 30GB, 60GB, 150GB telenor hipernet home+s ... home+l) are enough to work from a farm where wireless internet services are available.


 System modules
 - UI: user interactions to schedule data traffic acquisition and display statistic  
 - StatisticCollector: runs, stops data traffic acquisition on configured ethernet ports.

 Third-party modules
 - Logger
 - Pcap4J
 - Native library for packet capture(eg. WinPcap, libpcap)
 - JavaFX

 Functional requirements
 - The application shall collect data traffic from selectable ethernet ports. Eg eth1, eth2 or all.
 - The application shall create statistics about the upload and download traffic also for each selected eth and their sum also.
 - The application shall have an automatic run at OS startup option.
 - The application shall create log entries about events, operations for debugging released or under development application
 
 Module requirements
 - StatisticCollector:
     - Module shall store the current amount of data(measured from the start of the acquisition).  

# Project Map
Folders
- doc: contains documentation about the system(eg. design)
- install: contains the installer of WinPcap. official website is https://www.winpcap.org/
- src/main/java: contains all the source files regarding this application
- target: contains the deployable or runnable application
