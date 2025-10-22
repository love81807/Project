# Project
練習


#### 一、專案結構

GroupBuyingShopSystem/





#### 二、主要功能說明
- 團購主登入/商品維護(新增、刪除、修改）
- 會員註冊、登入與購物
- 購物車、結帳與找零功能
- 匯出購物清單至Excel檔案(.xls)
- MySQL資料庫資料持久化

*****

|   類 別   |  技 術         | 
| --------  | --------      |
語言        |  Java 8
框架        |  Maven Project
UI          |  Swing
資料庫      |  MySQL 8.x
連線方式    |  JDBC
匯出功能    |  Apache POI (HSSF for .xls)
架構模式    |  MVC + DAO

| 建議                     | 說明                                                |
| ---------------------- | ------------------------------------------------- |
| 💡 使用 `service` 層做邏輯處理 | 減少 `controller` 與 `dao` 直接耦合                      |
| 💡 DAO 命名規範            | 每個表格對應一個 DAO，例如 `MemberDaoImpl`, `ProductDaoImpl` |
| 💡 避免 Swing 內直接呼叫 SQL  | 改由 `service` 層呼叫 `dao`                            |
| 💡 匯出功能封裝於 `util`      | 保持程式結構乾淨且易於維護                                     |







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




