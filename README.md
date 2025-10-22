# Project
練習


#### 一、專案結構
GroupBuyingShopSystem/
│
├── pom.xml             # Maven 管理設定
│
├── src/main
│   ├── controller/     # UI控制層 (Swing)
│   │   ├── GroupBuyingShop.java
│   │   ├── MemberLogin.java
│   │   ├── GoBetweenLogin.java
│   │   └── GoBetweenManage.java
│   │
│   ├── service/        
│   │   └── ShopService.java
│   │
│   ├── dao/            # 資料庫存取層
│   ├── MemberDao.java
│   │   ├── ProductDao.java
│   │   ├── GoBetweenDao.java
│   │   └── impl/       # 實作類別
│   │       ├── MemberDaoImpl.java
│   │       └── GoBetweenDaoImpl.java
│   │
│   ├── po/             # 實體類別 (Model)
│   │   ├── Member.java
│   │   ├── Product.java
│   │   ├── GroupItem.java
│   │   └── GoBetween.java
│   │
│   └── util/           # 共用工具類
│       ├── DbConnection.java
│       ├── ExcelExporter.java
└──     ├── ExceptionHandler.java




#### 二、主要功能說明
- 團購主登入/商品維護(新增、刪除、修改）
- 會員註冊、登入與購物
- 購物車、結帳與找零功能
- 匯出購物清單至Excel檔案(.xls)
- MySQL資料庫資料持久化



| Column 1 | Column 2 | Column 3 |
| -------- | -------- | -------- |
| Text     | Text     | Text     |

*****
[google](http://www.google.com)

![JPG1](/Picture/JPG1.png) 

*****

\_ \* \+

This is an H1
=============

This is an H2
-------------

*   Red
*   Green
*   Blue

*****

1.  Bird
2.  McHale
3.  Parish
   

*   A list item with a blockquote:

    > This is a blockquote
    > inside a list item.




