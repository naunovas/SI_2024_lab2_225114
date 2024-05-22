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
Има вкупно 5 тест случаи: <br>
1)Првиот тест е за RuntimeException ако allitems==null <br>
2)Вториот тест е кога нема внесено име па за име се става „unknown„ <br>
3)Треттиот тест е кога barcode==null <br>
4)Четвртиот тест е кога barcode==-1 <br>
5)Петиот тест е ако discount<0 <br>
# Објаснување на напишаните тестови според  Multiple Condition
if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) 
== '0').

T T T -> koga price>300 discount>0 charAt(0)=='0'<br>
F T T -> koga price<300 discount>0 charAt(0)=='0' <br>
T F T -> koga price>300 discount<0 charAt(0)=='0' <br>
T T F -> koga price>300 discount>0 charAt(0)=!'0' <br>
T F F -> koga price>300 discount<0 charAt(0)=!'0' <br> 
F T F -> koga price<300 discount>0 charAt(0)=!'0' <br>
F F T -> koga price<300 discount<0 charAt(0)=='0' <br>
F F F -> koga price<300 discount<0 charAt(0)=!'0' <br>

