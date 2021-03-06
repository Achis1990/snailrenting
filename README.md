# snailrenting

## 房屋租赁项目演示文档
前台：jsp，javascript，bootstrap  + 后台：Java，Spring Boot框架，Idea，Maven，MySQL

## 项目的开发环境：
* 硬件环境：
1. CPU：英特尔 i5
2. 内存：8g
3. 	硬盘：500g
* 软件环境：
1. 操作系统：Windows系统
2. 开发工具：Idea
3. 数据库系统：MySQL

## 	系统功能设计
要实现用户对该商品网站的正常使用，需要将用户的基本信息和本网站的信息整合起来，并为所有用户建立一张关系网。

## 6.1 前台
### 6.1.1 账号模块设计实现
（1）登陆。已注册的用户可以根据注册的账号和密码登入网站，如果信息有误，系统提示用户密码错误或用户名不存在。
（2）注册。用户填写登入信息，如果信息有误，提示用户已存在。信息无误，注册成功。
该模块界面展示图片如下图6-1和6-2所示：
 ![图 6-1 用户登录界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/web/6-1.png)  
图 6-1 用户登录界面
 ![图 6-2 用户注册界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/web/6-2.png)  
图 6-2 用户注册界面
### 6.1.2 条件搜索设计实现
可以不同条件，如：租房类型、卧室数量、浴室数量、价格区间、地址小区名称等关键词信息在该网站进行针对性条件搜索房源，搜索成功跳转房源列表界面。
该模块界面展示图片如下图6-3所示：
  ![图 6-3 房源条件搜索理界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/web/6-3.png)  
图 6-3 房源条件搜索理界面
### 6.1.3 房源模块设计实现
（1）房源列表。展示该网站平台发布的全部房源信息介绍，可以点击跳转查看详情界面。
（2）房源详情展示。详细展示房源的环境信息、配置信息、室友信息。
（3）VR展示。房源信息的VR实景展示，详细了解房间构造和布局。
该模块界面展示图片如下图6-4和6-5所示：
 ![图 6-4 房源列表界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/web/6-4.png)  
图 6-4 房源列表界面
 ![图 6-5 房源详情界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/web/6-5.png)  
图 6-5 房源详情界面
### 6.1.4 VR实景设计实现
房源信息的VR实景展示，可以通过鼠标拖拽进行360°实景预览，鼠标滚轮可以进行放大缩小操作查看细节。根据提示的信息可以前往其他房间，详细了解房间构造和布局。
该模块界面展示图片如下图6-6和6-7所示：
  ![图 6-6 VR实景客厅界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/web/6-6.png)  
图 6-6 VR实景客厅界面
  ![图 6-7 VR实景卧室界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/web/6-7.png)  
图 6-7 VR实景卧室界面
### 6.1.5 签约设计实现
（1）签约。已登录网站的用户，可以点击签约按钮，跳转当前房源的签约界面，自动生成唯一合同号，填写完善信息，确认信息无误可以完成线上自助签约，成功自动跳转签约展示界面。
（2）签约展示。已登录网站用户并且在网站进行了签约，可以查看签约的详细信息。
该模块界面展示图片如下图6-8和6-9所示：
  ![图 6-8签约房源界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/web/6-8.png)  
图 6-8签约房源界面
  ![图 6-9签约信息界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/web/6-9.png)  
图 6-9签约信息界面
### 6.1.6 消息模块的设计实现
（1）发布消息。已登录网站的用户，可以点击发布消息按钮，跳转发布消息界面，填写需要发布的消息内容，点击发布按钮，信息无误消息发布成功，自动跳转消息列表查看发布的消息。
（2）点赞消息。用户点击我要点赞按钮，为当前消息点赞，点赞数量加一并显示。
（3）回复消息。可以点击我要回复按钮，跳转回复消息界面，填写回复内容，点击回复按钮，信息无误消息回复成功，自动跳转消息列表查看回复的消息。
该模块界面展示图片如下图6-10所示：
  ![图 6-10消息界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/web/6-10.png)  
图 6-10消息界面
### 6.1.7 服务模块设计实现
（1）个人信息。已登录网站的用户，可以点击发布消息按钮，跳转发布消息界面，填写需要发布的消息内容，点击发布按钮，信息无误消息发布成功，自动跳转消息列表查看发布的消息。
（2）我的业务。已登录网站用户，可以查看提交相关服务的办理进度情况。可以进行服务的取消操作，已完成服务可以进行删除操作。
（3）我的签约。已登录网站用户并且在网站进行了签约，可以查看签约的详细信息。
（4）服务/售后。已登录网站用户，打开信息录入界面，可以填写信息，信息无误，点击提交，成功后自动跳转我的业务界面可以查看办理进度。
（5）房东认证。完善个人详细信息，点击提交按钮完成房东认证。
（6）发布房源。已登录网站用户并成功完成房东身份认证，打开信息录入界面，可以填写房源详细信息，信息无误，点击提交，完成房源发布。
该模块界面展示图片如下图6-11、6-12和6-13所示：
  ![图 6-11 服务选择界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/web/6-11.png)  
图 6-11 服务选择界面
  ![图 6-12 填写服务界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/web/6-12.png)  
图 6-12 填写服务界面
  ![图 6-13 业务展示界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/web/6-13.png)  
图 6-13 业务展示界面
## 6.2 后台
### 6.2.1 管理员登录设计实现
（1）管理员通过输入用户名和密码，登录进入房屋后台管理系统。如果信息有误，会提示用户名不存在或密码错误。
（2）退出。点击退出按钮，退出后台管理系统。
该模块界面展示图片如下图6-14所示：
  ![图 6-14 登陆界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/admin/6-14.png)  
图 6-14 登陆界面
### 6.2.2 房源管理设计实现
（1）列表展示。展示全部列表信息，可以选择类别，包括：全部房源、合租房源、整租房源，选择性查看列表信息。
（2）添加。添加界面填写相关信息内容，点击添加房源按钮，输入信息无误，提示添加房源成功。
（3）删除。点击删除按钮，删除当前的房源数据信息。
（4）修改。修改界面回显原有的信息内容，更新内容，点击修改按钮，输入信息无误，提示修改房源成功。
（5）变更状态。管理人员可以根据实际房源情况，点击停用或者启动按钮变更当前房源的状态信息。
该模块界面展示图片如下图6-15、6-16和6-17所示：
  ![图 6-15房源管理界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/admin/6-15.png)  
图 6-15房源管理界面
  ![图 6-16房源添加界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/admin/6-16.png)  
图 6-16房源添加界面
  ![图 6-17房源添加子界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/admin/6-17.png)  
图 6-17房源添加子界面
### 6.2.3 消息管理设计实现
（1）列表展示。展示全部列表信息，可以点击菜单栏的不同类别选择性的查看不同列表信息。
（2）删除。点击删除按钮，删除当前消息数据信息。
该模块界面展示图片如下图6-18所示：
  ![图 6-18 消息管理界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/admin/6-18.png)  
图 6-18 消息管理界面
### 6.2.4 业务管理设计实现
（1）列表展示。展示全部列表信息，可以选择类别，包括：定制房源、预约看房、售后服务、退租、其他问题，选择性查看列表信息。
（2）添加。添加界面填写相关信息内容，点击添加业务按钮，输入信息无误，提示添加业务的成功。
（3）删除。点击删除按钮，删除当前业务数据信息。
（4）修改。修改界面回显原有的信息内容，更新内容，点击修改按钮，输入信息无误，提示修改业务成功。
（5）业务处理。管理员根据实际情况，点击按钮进行当前状态的变更。
该模块界面展示图片如下图6-19和6-20所示：
  ![图 6-19业务管理界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/admin/6-19.png)  
图 6-19业务管理界面
  ![图 6-20业务添加界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/admin/6-20.png)  
图 6-20业务添加界面
### 6.2.5 签约管理设计实现
（1）列表展示。展示全部列表信息，可以选择类别，包括：全部签约、待审核、已审核、未通过，选择性查看列表信息。
（2）删除。点击删除按钮，删除当前签约数据信息。
（3）修改。修改界面回显原有的信息内容，更新内容，点击修改按钮，输入信息无误，提示修改签约信息成功。
（4）审核。管理员根据实际情况，对当前的签约信息进行审核通过和未通过判定。
该模块界面展示图片如下图6-21所示：
  ![图 6-21签约管理界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/admin/6-21.png)  
图 6-21签约管理界面
### 6.2.6 用户管理设计实现
（1）列表展示。展示全部列表信息，可以点击菜单栏的不同类别选择性的查看不同列表信息，类别包括全部用户、房东、租客。
（2）添加。添加界面填写相关信息内容，点击添加用户按钮，输入信息无误，提示添加用户成功信息。
（3）删除。点击删除按钮，删除当前用户数据信息。
（4）修改。修改界面回显原有的信息内容，更新内容，点击修改按钮，输入信息无误，提示修改用户成功。
该模块界面展示图片如下图6-22和6-23所示：
  ![图 6-22 用户管理界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/admin/6-22.png)  
图 6-22 用户管理界面
  ![图 6-23添加用户界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/admin/6-23.png)  
图 6-23添加用户界面
### 6.2.7 广告位管理设计实现
（1）列表展示。展示全部列表信息，可以选择类别，包括：全部房源、优惠房源、推荐房源，选择性查看列表信息
（2）添加。点击加入广告位按钮，从前台网站相应栏目加入当前房源的展示，如果广告位数量已满，提示当前类别的广告位数量已满无法加入。 
（3）移除。点击移除按钮，从前台网站相应栏目移除当前房源的展示。 
该模块界面展示图片如下图6-24和6-25所示：
  ![图 6-24 广告位管理界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/admin/6-24.png)  
图 6-24 广告位管理界面
  ![图 6-25广告位添加界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/admin/6-25.png)  
图 6-25广告位添加界面
### 6.2.8 统计分析设计实现
平台数据的统计分析，根据平台的实际数据信息和数据量进行计算统计，展示相关信息。
该模块界面展示图片如下图6-26所示：
  ![图 6-26统计分析界面](https://github.com/alienYalien/snailrenting/blob/master/Results/img/admin/6-26.png)  
图 6-26统计分析界面

##	系统运行
本系统为JAVA编写的B/S结构的WEB项目，运行步骤如下。
1.运行windows操作系统。
2.由于本系统是由JAVA编写所以需要安装JDK1.8JAVA虚拟机器，安装方法为：运行JDK1.8安装文件，选择路径进行安装。
3.安装MySQL数据库，导入表结构的SQL脚本，启动数据库实例服务。
4.启动项目。
5.打开浏览器并且输入如下网址。
http://localhost:8081/admin/Admin_login
http://localhost:8081/index/Web_index
系统需也要一些日常管理：包括日志的查看，服务器的维护等。
