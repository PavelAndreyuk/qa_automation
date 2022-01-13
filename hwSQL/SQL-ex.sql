--1
SELECT model, speed, hd
FROM pc
WHERE price < 500

--2
SELECT DISTINCT maker
FROM product
WHERE type = 'printer'

--3
SELECT model as MD, ram as RM, screen as NotSSD
FROM laptop
WHERE price > 1000

--4
SELECT *
FROM printer
WHERE color = 'y'

--5
SELECT model, speed, hd
FROM PC
WHERE (cd  = '12x' OR cd='24x') AND price < 600

--6
SELECT DISTINCT maker, speed
FROM Product
JOIN laptop
ON product.model = laptop.model
WHERE hd >= 10

--7
SELECT DISTINCT Product.model, Laptop.price
FROM Product
JOIN Laptop ON Laptop.model=Product.model
WHERE maker='B'

UNION

SELECT DISTINCT Product.model, PC.price
FROM Product
JOIN PC ON PC.model=Product.model
WHERE maker='B'

UNION

SELECT DISTINCT Product.model, Printer.price
FROM Product
JOIN Printer ON Printer.model=Product.model
WHERE maker='B'

--8
SELECT maker FROM product WHERE type ='pc'
EXCEPT
SELECT maker FROM product WHERE type ='laptop'

--9
SELECT DISTINCT Product.maker
FROM Product
JOIN PC ON PC.model=Product.model
WHERE speed >= '450'

--10
SELECT model, price
FROM Printer
WHERE price = (SELECT MAX(price)
               FROM Printer)

--11
SELECT AVG(speed) FROM PC

--12
SELECT AVG(speed) FROM laptop WHERE price > '1000'

--13
SELECT AVG(speed) AS Avg_speed
FROM PC
LEFT JOIN product ON product.model=PC.model
WHERE maker='A'

--14
SELECT Classes.class, Ships.name, Classes.country
FROM Classes
JOIN Ships ON Ships.class=Classes.class
WHERE numGuns >= '10'

--15
SELECT hd
FROM pc
GROUP BY hd
HAVING COUNT(hd) > 1

--16
SELECT DISTINCT A.model, B.model, A.speed, A.ram
FROM PC AS A, PC B
WHERE A.speed = B.speed AND A.ram = B.ram AND A.model > B.model

--17
SELECT DISTINCT type, laptop.model, speed
FROM Laptop
JOIN Product ON product.model = laptop.model
WHERE speed < ALL (Select min(speed) from PC)

--18
SELECT maker, price
FROM printer
JOIN product ON product.model = printer.model
WHERE color = 'y'
GROUP BY price, maker
HAVING price = (SELECT MIN(price) FROM printer WHERE color = 'y')

--19
SELECT maker, AVG(screen)
FROM laptop
JOIN product ON product.model=laptop.model
GROUP BY maker

--20
SELECT maker, COUNT(model)
FROM product
WHERE type = 'pc'
GROUP BY maker
HAVING COUNT(model)>=3

--21
SELECT maker, MAX(price)
FROM product
JOIN pc ON pc.model=product.model
GROUP BY maker