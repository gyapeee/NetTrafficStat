# NetTrafficStat
- This project is created to have a simple application which makes monthly/weekly statistics about the data traffic on a computer
 - The motivation is to be sure that the data limitations of available wireless internet services(eg. 30GB, 60GB, 150GB telenor hipernet home+s ... home+l) are enough to work from a farm where wireless internet services are available.

-- Functional requirements:
 - The application shall collect data traffic from selectable ethernet ports. Eg eth1, eth2 or all.
 - The application shall create statistics about the upload and download traffic also for each selected eth and their sum also.
 - The application shall have an automatic run at OS startup option.
 
-- System modules:
 - UI: user interactions to schedule data traffic acquisition and display statistic  
 - StatisticCollector: runs, stops data traffic acquisition on configured ethernet ports.
 - Logger: logging events, operations for debugging released application

# Project Map
folders:
- install: contains the installer for WinPcap. official website is https://www.winpcap.org/
