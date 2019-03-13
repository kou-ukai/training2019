--課題1
insert into m_item_category(category_id,category_name,deleted) VALUES (1,'野菜',false);
insert into m_item_category(category_id,category_name,deleted) VALUES (2,'肉',false);
insert into m_item_category(category_id,category_name,deleted) VALUES (3,'菓子',true);
insert into m_item_category(category_id,category_name,deleted) VALUES (4,'飲料',false);
select*from m_item_category;
insert into m_item(item_id,category_id,item_name,price) VALUES (1,1,'なす',156);
insert into m_item(item_id,category_id,item_name,price) VALUES (2,1,'白菜',228);
insert into m_item(item_id,category_id,item_name,price) VALUES (3,1,'キャベツ',198);
insert into m_item(item_id,category_id,item_name,price) VALUES (1,2,'鶏胸肉',78);
insert into m_item(item_id,category_id,item_name,price) VALUES (2,2,'鶏もも肉',128);
insert into m_item(item_id,category_id,item_name,price) VALUES (3,2,'ささみ',198);
insert into m_item(item_id,category_id,item_name,price) VALUES (1,3,'チョコ',98);
insert into m_item(item_id,category_id,item_name,price) VALUES (2,3,'スナック',100);
insert into m_item(item_id,category_id,item_name,price) VALUES (3,3,'ふがし',200);
insert into m_item(item_id,category_id,item_name,price) VALUES (1,4,'ミックスジュース',110);
insert into m_item(item_id,category_id,item_name,price) VALUES (2,4,'野菜ジュース',100);
insert into m_item(item_id,category_id,item_name,price) VALUES (3,4,'エナジードリンク',198);
select*from m_item;
--課題2
UPDATE m_item_category SET deleted=false WHERE category_id=3;
select*from m_item_category;
--課題3
select category_id,category_name,deleted FROM m_item_category WHERE category_name='野菜';
--課題4
select*from m_item;
--課題5
select item_id,category_id,item_name,price FROM m_item WHERE category_id=2;
--課題6
select*from m_item_category LEFT OUTER JOIN m_item ON m_item_category.category_id=m_item.category_id;
--課題7
delete from m_item where category_id=2;
select*from m_item;
