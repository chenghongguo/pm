

# [PM 流程制作管理平台](https://github.com/cminirice/pm)

## 依赖三方组件：
    zookeeper-3.4.6
    rabbitmq-3.1.5
    jdk 7

## 技术：
    springboot	
    zookeeper	
    Rpc:zookeeper, protostuff,spring,netty	
    Gooflow	
    Jsp+jquery	

## 系统优点：	
    实现与业务完全脱离，功能全部由组件和流程决定
    平台无数据库，用到的数据全部存储在zookeeper上，平台和容器天生支持集群部署	
    支持多种类型的组件
    组件产生的中间数据可以放在MQ上或者内存中，切换时修改流程配置，不需要修改代码，目前支持的MQ有rabbitMQ、zookeeper、kaffka、进程内部队列。
    容器定时上报心跳信息，方便平台监控容器的状态，心跳异常邮件	
    组件开发简单，降低开发人员门槛	

## 支持功能：	
    按照一个固定流程执行的业务，功能可以分解成一个个小的功能模块		
    定时执行一个功能	
    循环执行的功能，可以用于处理日志数据等	
    发布一个HTTP接口
