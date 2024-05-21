# Втора лабораториска вежба по Софтверско инженерство
# Симона Наунова, бр. на индекс 225114
# Control Flow Graph
![cfg](https://github.com/naunovas/SI_2024_lab2_225114/assets/150629204/f2dc3d24-3edc-4c02-9afd-acce84dffab2)

# Цикломатска комплексност
Цикломатската комплексност ја пресметав како бројот на loops +1, односно региони во Control Flow Graph-от, и добив 10. 
Или според формулата : 36 - 28 + 2 = 10 ( број на ребра - број на јазли + 2)
# Every Branch
![everybranch](https://github.com/naunovas/SI_2024_lab2_225114/assets/150629204/7c64c7a0-1e1f-42ad-975d-790a43f6e97a)

# Тест случаи според критериумот EveryBranch
Има вкупно 5 тест случаи:
1)Првиот тест е за RuntimeException ако allitems==null
2)Вториот тест е кога нема внесено име па за име се става „unknown„
3)Треттиот тест е кога barcode==null
4)Четвртиот тест е кога barcode==-1
5)Петиот тест е ако discount<0
# Тест случаи според критериумот Multiple Condition
if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0)
== '0').

T T T -> koga price>300 discount>0 charAt(0)=='0'
F T T -> koga price<300 discount>0 charAt(0)=='0'
T F T -> koga price>300 discount<0 charAt(0)=='0'
T T F -> koga price>300 discount>0 charAt(0)=!'0'
T F F -> koga price>300 discount<0 charAt(0)=!'0'
F T F -> koga price<300 discount>0 charAt(0)=!'0'
F F T -> koga price<300 discount<0 charAt(0)=='0'
F F F -> koga price<300 discount<0 charAt(0)=!'0'

# Објаснување на напишаните unit tests
