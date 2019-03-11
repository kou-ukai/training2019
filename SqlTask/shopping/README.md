# 商品の課題

### 前提条件
DBMSはPostgres9.7以上

## テーブル一覧

商品マスタ
~~~
CREATE TABLE public.m_item
(
    item_id integer NOT NULL,
    category_id integer NOT NULL,
    item_name character varying(40),
    price integer,
    CONSTRAINT m_item_pkey PRIMARY KEY (item_id)
);
COMMENT ON TABLE m_item
    IS '商品マスタ';
COMMENT ON COLUMN m_item.item_id
    IS '商品ID';
COMMENT ON COLUMN m_item.category_id
    IS 'カテゴリID';
COMMENT ON COLUMN m_item.item_name
    IS '商品名';
COMMENT ON COLUMN m_item.price
    IS '価格';
~~~
商品カテゴリマスタ
~~~
CREATE TABLE public.m_item_category
(
    category_id integer NOT NULL,
    category_name character varying(20),
    deleted boolean DEFAULT false,
    CONSTRAINT m_item_category_pkey PRIMARY KEY (category_id)
);
COMMENT ON TABLE m_item_category
    IS '商品カテゴリマスタ';
COMMENT ON COLUMN m_item_category.category_id
    IS 'カテゴリID';
COMMENT ON COLUMN m_item_category.category_name
    IS 'カテゴリ名';
COMMENT ON COLUMN m_item_category.deleted
    IS '削除フラグ';
~~~

## 例題
テーブル「商品マスタ」のレコードを全て抽出する

### 例題解答
`select * from m_item;`

## 課題1
テーブル「商品カテゴリマスタ」に次の商品カテゴリを登録するSQLを作成してください。

| カテゴリID | カテゴリ名 | 削除フラグ |
|---:|----|:----:|
| 1 | 野菜 | false |
| 2 | 肉 | false |
| 3 | 菓子 | true |
| 4 | 飲料 | false |


## 課題2

## 課題3
