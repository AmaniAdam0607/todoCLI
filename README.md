## TASK TRACKER

Sample solution for the [task-tracker](https://roadmap.sh/projects/task-tracker) challenge from [roadmap.sh](https://roadmap.sh/)

### How to run

Clone the repo and run the following command:

```
cd src
javac -cp ..\lib\gson-2.11.0.jar App.java Todo.java TodoProgress.java
java -cp ".;..\lib\gson-2.11.0.jar" App -help
```

The above comand will list all possible commands for the cli.

The project uses [gson](https://github.com/google/gson) because java have no direct support for handling JSON, this is contrary to the project instructions which limit usages of libraries ( I assume the creator of the project description assumed solutions in python and javascript which have that capability )
