# Rada

1. #ІВАН - Class Deputy - містить List з депутатами, з відповідними значеннями імя, стать, вік, фракція, хабарником (числове значення для присвоєння суми хабаря з клавіартури, хардкодом довільно розставити значення, декільком поставити 0 - це і буде означати, що він не хабарник).


2. #ЮРА Class UserMenu. - меню з вибором:

1. Вивести весь список депутатів з прізвищем і іменем, фракцію до якої належить.
2. Дати хабар депутату. 
-Якщо він бере хабар передає значення в class Bribe і виводить повідомлення про ув'язнення.
-Якщо не бере хабаря, вивести повідомлення, що він чесний).
3. Вивести всіх депутатів хабарників однієї фракції.
4. Вивести найбільшого хабарника фракції.
5. Вивести всіх депутатів хабарників всієї ради.
4. Вивести найбільшого хабарника ради.


3. #АНАСТАСІЯ Class Rada має бути сінглтон (лінивий сінглтон). Бере з class Deputy список всіх депутатів.
1. Передає всіх хабарників ради.
2. Передає найбільшого хабарника ради.


4. #ТІМУР Class Bribe - викликає клас Deputy, змінює  значення харабя (числове) депутата у лісті.
Після кожного запису сортує список депутатів по спаданню значення хабаря. 

5. #Я Main.
