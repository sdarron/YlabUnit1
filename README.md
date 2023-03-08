# YlabUnit1
Задачи

●	Stars. Программе передается 3 параметра: количество строк, количество столбцов, произвольный симов. 
Необходимо вывести вывести фигуру,
состоящую из заданного списка строк и заданного количества столбцов, 
и каждый элемент в которой равен указанному символу.
Ввод: n m c
Вывод: фигура
Пример:
Ввод: 
2 3 $
Вывод:
$ $ $
$ $ $

●	Pell. Pell numbers Числа Пелля задаются следующим соотношением:
На вход подается число n (0 <= n <= 30), необходимо распечатать n-e число Пелля
Пример:
Ввод: 
5
Вывод:
29

●	MultTable. На вход ничего не подается, необходимо распечатать таблицу умножения чисел от 1 до 9 (включая)
Пример:
Вывод:
1 x 1 = 1
1 x 2 = 2
…
<часть вывода пропущена>
…
9 x 9 = 81

●	Guess. Игра угадайка. При запуске программа загадывает число от 1 до 99 (включительно) и 
дает пользователю 10 попыток отгадать. Далее пользователь начинает вводить число.
И тут возможен один из следующих вариантов:
- Пользователь отгадал число. В таком случае выводится строка 
“Ты угадал с N попытки”, где N - номер текущей попытки пользователя
- Пользователь ввел число, меньше загаданного.
  В таком случае выводится сообщение “Мое число больше! У тебя осталось M попыток” где M - количество оставшихся попыток
- Пользователь ввел число, больше загаданного. 
  В таком случае выводится сообщение “Мое число меньше! У тебя осталось M попыток” где M - количество оставшихся попыток
- У пользователя закончились попытки и число не было угадано. 
  В таком случае выводится сообщение “Ты ну угадал” 