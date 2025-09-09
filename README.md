# Step Tracker

**Module: Personal Fitness Step Counter**  
*A console-based Java application for recording and analyzing daily steps.*

---

## Overview

This module helps users track their physical activity by recording daily steps,  
setting personal goals, and generating monthly statistics.

---

## Features

- Record daily steps
- Set and update daily step goals
- View monthly statistics:
  - Total steps
  - Maximum steps in a day
  - Average steps
  - Days meeting daily goal

---

## Architecture

- **`StepTrackerApp`** – Console application entry point
- **`StepTracker`** – Manages user interactions and goals
- **`MonthData`** – Stores step data per month and day
- **`StatisticsService`** – Generates monthly reports

---

## Usage

Compile and run:

```bash
javac src.main.java.StepTrackerApp.java src.main.java.StepTracker.java src.main.java.MonthData.java src.main.java.StatisticsService.java
java src.main.java.Main
```

Menu options:

```
1 - Record steps for a specific day
2 - Change daily step goal
3 - Show monthly statistics
0 - Exit
```

---

## Example Output

```
Добро пожаловать!
Какая Ваша цель кол-ва шагов в день?
> 10000

Выберите действие: 
1 - Ввести пройденные шаги за день
2 - Изменить цель кол-ва шагов в день
3 - Показать статистику за месяц
0 - Выход
> 1

Выполняется команда 1

Введите кол-во шагов:
> 11000

За какой месяц хотите занести:
1-Январь
2-Февраль
3-Март
4-Апрель
5-Май
6-Июнь
7-Июль
8-Август
9-Сентябрь
10-Октябрь
11-Ноябрь
12-Декабрь
> 1

Введите за какой день месяца хотите занести (1-31):
> 3

День 3-й, Месяц Январь.
Вы прошли 11000 шагов.

Выберите действие: 
1 - Ввести пройденные шаги за день
2 - Изменить цель кол-ва шагов в день
3 - Показать статистику за месяц
0 - Выход
> 3

Выполняется команда 3

За какой месяц хотите узнать статистику?
1-Январь
2-Февраль
3-Март
4-Апрель
5-Май
6-Июнь
7-Июль
8-Август
9-Сентябрь
10-Октябрь
11-Ноябрь
12-Декабрь
> 1

--- Отчёт за месяц ---
Всего шагов: 11000
Максимальное кол-во шагов в день: 11000
Среднее кол-во шагов в день: 354,84
Кол-во дней с достигнутой целью шагов (цель: 10000): 1
```

---

## Requirements

- Java 17+  
- No external dependencies (pure standard library)

---

## License

Released under the **MIT License**.
