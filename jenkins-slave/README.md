## Add Jenkins Agent
####  Jenkins slave using SSH 
######  On Jenkins master
```
Manage Jenkins > Manage Nodes > New Node
```
![Image key](https://github.com/jnjam6681/jenkins-docker/blob/master/jenkins-slave/Screen%20Shot%202562-05-15%20at%2015.24.19.png)

![Image key](https://github.com/jnjam6681/jenkins-docker/blob/master/jenkins-slave/Screen%20Shot%202562-04-23%20at%2014.48.09.png)

#### Install jdk for connect to master
###### On Jenkins slave
```
sudo apt-get install openjdk-8-jdk
```
