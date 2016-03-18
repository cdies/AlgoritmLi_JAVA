Необходимо разработать консольное приложение.
Имеется регулярная сетка. Некоторые ячейки являются препятствиями, остальные свободны.
Имеется начальная и конечная точка. Необходимо вывести координаты точек маршрута, соединяющего начало и конец.
Размер сетки и координаты препятствий считываются из файла. Координаты начала и конца - с клавиатуры.

Консольное приложение разработано, размер сетки и координаты препятствий считываются из файла data.xml

Программа написана в среде Eclipse Mars .2 (Eclipse IDE for Java Developers) JavaSE-1.8

Описание и пример результата работы с описанием:  
В основе работы прогрммы реализован волновой алгоритм (алгоритм Ли).  
Вначале работы программа выводит таблицу(регулярную сетку) с размером, считанным из файла,   
где 99 - обозначение препятствия, а -1 - свободной клетки.  
	
	   0  1  2  3  4  5  6  7  8  9  10 11 12 13 14     
	0  99 99 99 99 99 99 99 99 99 99 99 99 99 99 99   
	1  99 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 99   
	2  99 99 99 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 99   
	3  99 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 99   
	4  99 -1 -1 -1 99 99 -1 -1 -1 99 99 99 -1 -1 99   
	5  99 99 -1 -1 99 99 -1 -1 -1 -1 -1 99 99 99 99   
	6  99 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 99   
	7  99 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 99   
	8  99 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 99 -1 99   
	9  99 -1 -1 -1 -1 -1 -1 -1 -1 99 -1 -1 99 -1 99   
	10 99 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 99   
	11 99 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 99 -1 99   
	12 99 -1 -1 99 -1 -1 -1 -1 -1 -1 -1 99 -1 -1 99   
	13 99 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 99   
	14 99 99 99 99 99 99 99 99 99 99 99 99 99 99 99   
	
Далее алгоритм предлагает ввести координаты начальной и конечной точек (от 1 до 13 по x и по y для данного примера).  
	
	Введите x начала
	1
	Введите y начала
	1
	Введите x конца
	13
	Введите y конца
	13
	
После ввода программа выводит на консоль таблицу, в которой нулями показан путь от начальной до конечной точек.  
	
	   0  1  2  3  4  5  6  7  8  9  10 11 12 13 14   
	0  99 99 99 99 99 99 99 99 99 99 99 99 99 99 99   
	1  99 0  0  0  0  0  0  0  0  -1 -1 -1 -1 -1 99   
	2  99 99 99 -1 -1 -1 -1 -1 0  -1 -1 -1 -1 -1 99   
	3  99 -1 -1 -1 -1 -1 -1 -1 0  -1 -1 -1 -1 -1 99   
	4  99 -1 -1 -1 99 99 -1 -1 0  99 99 99 -1 -1 99   
	5  99 99 -1 -1 99 99 -1 -1 0  0  0  99 99 99 99   
	6  99 -1 -1 -1 -1 -1 -1 -1 -1 -1 0  0  0  0  99   
	7  99 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 0  99   
	8  99 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 99 0  99   
	9  99 -1 -1 -1 -1 -1 -1 -1 -1 99 -1 -1 99 0  99   
	10 99 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 0  99   
	11 99 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 99 0  99   
	12 99 -1 -1 99 -1 -1 -1 -1 -1 -1 -1 99 -1 0  99   
	13 99 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 0  99   
	14 99 99 99 99 99 99 99 99 99 99 99 99 99 99 99   
	
И в конце координаты точек маршрута, соединяющего начало и конец.  
	
	x = 1, y = 1  
	x = 2, y = 1  
	x = 3, y = 1  
	x = 4, y = 1  
	x = 5, y = 1  
	x = 6, y = 1  
	x = 7, y = 1  
	x = 8, y = 1  
	x = 8, y = 2  
	x = 8, y = 3  
	x = 8, y = 4  
	x = 8, y = 5  
	x = 9, y = 5  
	x = 10, y = 5  
	x = 10, y = 6  
	x = 11, y = 6  
	x = 12, y = 6  
	x = 13, y = 6  
	x = 13, y = 7  
	x = 13, y = 8  
	x = 13, y = 9  
	x = 13, y = 10  
	x = 13, y = 11  
	x = 13, y = 12  
	x = 13, y = 13  
	