#jasper-report-test
## 启动步骤
### 1、拉取项目
### 2、添加字体依赖
idea中右键resources下的fonts.jar,点击add as library。  
### 3、修改文件路径
com/zixi/SpringBootTestApplicationTests.java中的每个测试方法中(如 File inFile = new File("D:\\company-project\\jasper-report\\jasper-report-test\\src\\main\\resources\\template\\检测报告光学分度头(盖章).jasper");)  
都是绝对路径,需要修改。之后直接运行对应案例即可！！！
