--�ۑ�1
insert into m_item_category(category_id,category_name,deleted)values(1,'���',false);
insert into m_item_category(category_id,category_name,deleted)values(2,'��',false);
insert into m_item_category(category_id,category_name,deleted)values(3,'�َq',true);
insert into m_item_category(category_id,category_name,deleted)values(4,'����',false);
select*from m_item_category;   
insert into m_item(item_id,category_id,item_name,price)values(1,1,'�Ȃ�',156);
insert into m_item(item_id,category_id,item_name,price)values(2,1,'����',226);
insert into m_item(item_id,category_id,item_name,price)values(3,1,'�L���x�c',198);
insert into m_item(item_id,category_id,item_name,price)values(1,2,'������',78);
insert into m_item(item_id,category_id,item_name,price)values(2,2,'�{������',128);
insert into m_item(item_id,category_id,item_name,price)values(3,2,'������',198);
insert into m_item(item_id,category_id,item_name,price)values(1,3,'�`���R',98);
insert into m_item(item_id,category_id,item_name,price)values(2,3,'�X�i�b�N',100);
insert into m_item(item_id,category_id,item_name,price)values(3,3,'�ӂ���',200);
insert into m_item(item_id,category_id,item_name,price)values(1,4,'�~�b�N�X�W���[�X',110);
insert into m_item(item_id,category_id,item_name,price)values(2,4,'��؃W���[�X',100);
insert into m_item(item_id,category_id,item_name,price)values(3,4,'�G�i�W�[�h�����N',198);
select*from m_item; 
--�ۑ�2
update m_item_category set deleted=false WHERE category_id=3;
select*from m_item_category;
--�ۑ�3
select*from m_item_category where category_name='���';
--�ۑ�4
select item_id from m_item group by item_id;
select item_name from m_item group by item_name;
select price from m_item group by  price;
--�ۑ�5
select*from m_item where category_id=2;
--�ۑ�6
select m_item_category.category_name,m_item.item_name from m_item_category LEFT OUTER JOIN m_item ON m_item_category.category_id=m_item.category_id where m_item.category_id=2 ;
--�ۑ�7
delete from m_item where item_id=1 and category_id=2;
select*from m_item;
