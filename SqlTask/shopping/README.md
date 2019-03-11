# 商品の課題

### 前提条件
- DBMSはPostgres9.6以上
- SQL Fiddleをお借りしてSQLを実行してください。

http://sqlfiddle.com

## テーブル一覧

商品マスタ
~~~
CREATE TABLE public.m_item
(
    item_id integer NOT NULL,
    category_id integer NOT NULL,
    item_name character varying(40),
    price integer,
    CONSTRAINT m_item_pkey PRIMARY KEY (item_id, category_id)
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

テーブル「商品マスタ」に次の商品を登録するSQLを作成してください。

| 商品ID | カテゴリID | 商品名 | 価格 |
|---:|----:|----|----:|
| 1 | 1 | なす | 156 |
| 2 | 1 | 白菜 | 228 |
| 3 | 1 | キャベツ | 198 |
| 1 | 2 | 鶏胸肉 | 78 |
| 2 | 2 | 鶏もも肉 | 128 |
| 3 | 2 | ささみ | 198 |
| 1 | 3 | チョコ | 98 |
| 2 | 3 | スナック | 100 |
| 3 | 3 | ふがし | 200 |
| 1 | 4 | ミックスジュース | 110 |
| 2 | 4 | 野菜ジュース | 100 |
| 3 | 4 | エナジードリンク | 198 |

## 課題2
テーブル「商品カテゴリマスタ」のカテゴリIDが3であるレコードの削除フラグをfalseに更新するSQLを作成してください。

## 課題3
テーブル「商品カテゴリマスタ」から商品名が"野菜"であるレコードを抽出するSQLを作成してください。

## 課題4
テーブル「商品マスタ」から全て列「商品ID」「商品名」「価格」のデータを抽出するSQLを作成してください。

## 課題5
テーブル「商品マスタ」からカテゴリIDが2である商品を抽出するSQLを作成してください。

## 課題6
テーブル「商品マスタ」とテーブル「商品カテゴリマスタ」からカテゴリIDが2である商品とカテゴリー名を抽出するSQLを作成してください。

## 課題7
テーブル「商品マスタ」から商品IDが"1"、かつ商品カテゴリが"肉"であるデータを削除するSQLを作成してください。

