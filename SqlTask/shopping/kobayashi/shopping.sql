--�ۑ�1
insert into m_item_category(category_id,category_name,deleted) VALUES (1,'���',false);
insert into m_item_category(category_id,category_name,deleted) VALUES (2,'��',false);
insert into m_item_category(category_id,category_name,deleted) VALUES (3,'�َq',true);
insert into m_item_category(category_id,category_name,deleted) VALUES (4,'����',false);
select*from m_item_category;
insert into m_item(item_id,category_id,item_name,price) VALUES (1,1,'�Ȃ�',156);
insert into m_item(item_id,category_id,item_name,price) VALUES (2,1,'����',228);
insert into m_item(item_id,category_id,item_name,price) VALUES (3,1,'�L���x�c',198);
insert into m_item(item_id,category_id,item_name,price) VALUES (1,2,'�{����',78);
insert into m_item(item_id,category_id,item_name,price) VALUES (2,2,'�{������',128);
insert into m_item(item_id,category_id,item_name,price) VALUES (3,2,'������',198);
insert into m_item(item_id,category_id,item_name,price) VALUES (1,3,'�`���R',98);
insert into m_item(item_id,category_id,item_name,price) VALUES (2,3,'�X�i�b�N',100);
insert into m_item(item_id,category_id,item_name,price) VALUES (3,3,'�ӂ���',200);
insert into m_item(item_id,category_id,item_name,price) VALUES (1,4,'�~�b�N�X�W���[�X',110);
insert into m_item(item_id,category_id,item_name,price) VALUES (2,4,'��؃W���[�X',100);
insert into m_item(item_id,category_id,item_name,price) VALUES (3,4,'�G�i�W�[�h�����N',198);
select*from m_item;
--�ۑ�2
UPDATE m_item_category SET deleted=false WHERE category_id=3;
select*from m_item_category;
--�ۑ�3
select category_id,category_name,deleted FROM m_item_category WHERE category_name='���';
--�ۑ�4
select*from m_item;
--�ۑ�5
select item_id,category_id,item_name,price FROM m_item WHERE category_id=2;
--�ۑ�6
select*from m_item_category LEFT OUTER JOIN m_item ON m_item_category.category_id=m_item.category_id;
--�ۑ�7

delete from m_item_category from m_item_category left join m_item ON 
m_item_category.category_id=m_item.category_id
WHERE m_item.category_id=3;

