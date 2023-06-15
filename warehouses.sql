INSERT INTO nike
	(clothing_id, color, size, style, quantity, price)
VALUES 
	( 28145632, 'gray', 'XL', 'Pants', 25, 43.50),
    ( 92573910, 'yellow', 'S', 'Shorts', 89, 62.80),
    ( 19674586, 'blue', 'XS', 'Shirts', 45, 24.75),
    ( 13702489, 'gray', 'M', 'Tank Tops', 108, 91.20),
    ( 60421597, 'purple', 'M', 'Pants', 15, 36.90),
    ( 87654126, 'black', '2X', 'Tank Tops', 62, 77.60);
    
SELECT * FROM nike;

INSERT INTO old_navy
	(clothing_id, color, size, style, quantity, price)
VALUES 
	( 87340521, 'black', '3X', 'Skirts', 128, 28.73),
    ( 21938465, 'green', 'XS', 'Shorts', 98, 63.52),
    ( 75869142, 'blue', 'S', 'Trousers', 63, 41.89),
    ( 54673218, 'blue', 'L', 'Button-up', 24, 79.24),
    ( 92618753, 'white', 'L', 'Shirts', 78, 52.17),
    ( 37284569, 'yellow', 'M', 'Tank Tops', 140, 17.96),
    ( 61493527, 'purple', 'XL', 'Button-up', 64, 68.45),
    ( 48917632, 'orange', 'M', 'Trousers', 104, 36.81);
    
SELECT * FROM old_navy;

INSERT INTO patagonia
	(clothing_id, color, size, style, quantity, price)
VALUES 
	( 53986247, 'orange', 'S', 'Hoodies', 43, 102.36),
    ( 41625738, 'black', '4X', 'Pants', 108, 74.89),
    ( 82374651, 'red', 'XL', 'Shorts', 96, 118.57),
    ( 29714835, 'gray', 'M', 'Tank Tops', 127, 167.92),
    ( 65493127, 'blue', 'XS', 'Shirts', 215, 85.14),
    ( 78154063, 'green', 'L', 'Pants', 89, 191.75),
    ( 36579241, 'black', 'M', 'Hoodies', 56, 56.23);
    
SELECT * FROM patagonia; 

INSERT INTO hot_topic
	(clothing_id, color, size, style, quantity, price)
VALUES 
	( 35479286, 'red', 'XL', 'Shirts', 154, 32.75),
    ( 81723645, 'gray', 'S', 'Pants', 93, 84.23),
    ( 92683571, 'yellow', 'S', 'Shorts', 38, 12.58),
    ( 64897123, 'purple', 'M', 'Hoodies', 108, 76.91),
    ( 19376548, 'red', '2X', 'Hoodies', 94, 58.37),
    ( 57243189, 'blue', 'XS', 'Pants', 67, 18.92),
    ( 43981276, 'orange', 'M', 'Shirts', 88, 92.10),
    ( 28645793, 'black', 'L', 'Pants', 109, 67.43);
    
SELECT * FROM hot_topic;

UPDATE hot_topic
SET clothing_id = 121
WHERE clothing_id = 35479286;

UPDATE hot_topic
SET clothing_id = 122
WHERE clothing_id = 81723645;

UPDATE hot_topic
SET clothing_id = 124
WHERE clothing_id = 92683571;

UPDATE hot_topic
SET clothing_id = 125
WHERE clothing_id = 64897123;

UPDATE hot_topic
SET clothing_id = 126
WHERE clothing_id = 19376548;

UPDATE hot_topic
SET clothing_id = 127
WHERE clothing_id = 57243189;

UPDATE hot_topic
SET clothing_id = 128
WHERE clothing_id = 43981276;

UPDATE hot_topic
SET clothing_id = 129
WHERE clothing_id = 28645793;

UPDATE nike
SET clothing_id = 221
WHERE clothing_id = 28145632;

UPDATE nike
SET clothing_id = 222
WHERE clothing_id = 92573910;

UPDATE nike
SET clothing_id = 223
WHERE clothing_id = 19674586;

UPDATE nike
SET clothing_id = 224
WHERE clothing_id = 13702489;

UPDATE nike
SET clothing_id = 225
WHERE clothing_id = 60421597;

UPDATE nike
SET clothing_id = 226
WHERE clothing_id = 87654126;

UPDATE old_navy
SET clothing_id = 321
WHERE clothing_id = 87340521;

UPDATE old_navy
SET clothing_id = 322
WHERE clothing_id = 21938465;

UPDATE old_navy
SET clothing_id = 323
WHERE clothing_id = 75869142;

UPDATE old_navy
SET clothing_id = 324
WHERE clothing_id = 54673218;

UPDATE old_navy
SET clothing_id = 325
WHERE clothing_id = 92618753;

UPDATE old_navy
SET clothing_id = 326
WHERE clothing_id = 37284569;

UPDATE old_navy
SET clothing_id = 327
WHERE clothing_id = 61493527;

UPDATE old_navy
SET clothing_id = 328
WHERE clothing_id = 48917632;

UPDATE patagonia
SET clothing_id = 421
WHERE clothing_id = 53986247;

UPDATE patagonia
SET clothing_id = 422
WHERE clothing_id = 41625738;

UPDATE patagonia
SET clothing_id = 423
WHERE clothing_id = 82374651;

UPDATE patagonia
SET clothing_id = 424
WHERE clothing_id = 29714835;

UPDATE patagonia
SET clothing_id = 425
WHERE clothing_id = 65493127;

UPDATE patagonia
SET clothing_id = 426
WHERE clothing_id = 78154063;

UPDATE patagonia
SET clothing_id = 427
WHERE clothing_id = 36579241;


SELECT * FROM nike;
SELECT * FROM old_navy;
SELECT * FROM patagonia;
SELECT * FROM hot_topic;
