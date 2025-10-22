*   # Group

    > 會員才能購買並享有優惠價格，
    > 有權限的團購主才能登入後台管理商品


### 一、專案結構

GroupBuyingShopSystem/
│
├── pom.xml                     # Maven 管理設定
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controller/     # UI控制層 (Swing)
│   │   │   │   ├── GroupBuyingShop.java
│   │   │   │   ├── MemberLogin.java
│   │   │   │   ├── GoBetweenLogin.java
│   │   │   │   └── GoBetweenManage.java
│   │   │   │
│   │   │   ├── service/        # 業務邏輯層
│   │   │   │   └── ShopService.java
│   │   │   │
│   │   │   ├── dao/            # 資料庫存取層
│   │   │   │   ├── MemberDao.java
│   │   │   │   ├── ProductDao.java
│   │   │   │   ├── GoBetweenDao.java
│   │   │   │   └── impl/       # 實作類別
│   │   │   │       ├── MemberDaoImpl.java
│   │   │   │       └── GoBetweenDaoImpl.java
│   │   │   │
│   │   │   ├── po/             # 實體類別 (Model)
│   │   │   │   ├── Member.java
│   │   │   │   ├── Product.java
│   │   │   │   ├── GroupItem.java
│   │   │   │   └── GoBetween.java
│   │   │   │
│   │   │   └── util/           # 共用工具類
│   │   │       ├── DbConnection.java
│   │   │       ├── ExcelExporter.java
│   │   │       └── ExceptionHandler.java
│   │   │
│   │   └── resources/          # 資源檔
│   │       └── log4j2.xml (可選)
│   │
│   └── test/                   # 單元測試
│
└── target/                     # Maven 編譯輸出


### 二、主要功能說明
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







