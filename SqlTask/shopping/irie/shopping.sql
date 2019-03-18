--課題1
insert into m_item_category(category_id,category_name,deleted)values(1,'野菜',false);
insert into m_item_category(category_id,category_name,deleted)values(2,'肉',false);
insert into m_item_category(category_id,category_name,deleted)values(3,'菓子',true);
insert into m_item_category(category_id,category_name,deleted)values(4,'飲料',false);
select*from m_item_category;   
insert into m_item(item_id,category_id,item_name,price)values(1,1,'なす',156);
insert into m_item(item_id,category_id,item_name,price)values(2,1,'白菜',226);
insert into m_item(item_id,category_id,item_name,price)values(3,1,'キャベツ',198);
insert into m_item(item_id,category_id,item_name,price)values(1,2,'鳥胸肉',78);
insert into m_item(item_id,category_id,item_name,price)values(2,2,'鶏もも肉',128);
insert into m_item(item_id,category_id,item_name,price)values(3,2,'ささみ',198);
insert into m_item(item_id,category_id,item_name,price)values(1,3,'チョコ',98);
insert into m_item(item_id,category_id,item_name,price)values(2,3,'スナック',100);
insert into m_item(item_id,category_id,item_name,price)values(3,3,'ふがし',200);
insert into m_item(item_id,category_id,item_name,price)values(1,4,'ミックスジュース',110);
insert into m_item(item_id,category_id,item_name,price)values(2,4,'野菜ジュース',100);
insert into m_item(item_id,category_id,item_name,price)values(3,4,'エナジードリンク',198);
select*from m_item; 
--課題2
update m_item_category set deleted=false WHERE category_id=3;
select*from m_item_category;
--課題3
select*from m_item_category where category_name='野菜';
--課題4
select item_id from m_item group by item_id;
select item_name from m_item group by item_name;
select price from m_item group by  price;
--課題5
select*from m_item where category_id=2;
--課題6
select m_item_category.category_name,m_item.item_name from m_item_category LEFT OUTER JOIN m_item ON m_item_category.category_id=m_item.category_id where m_item.category_id=2 ;
--課題7
delete from m_item where item_id=1 and category_id=2;
select*from m_item;
