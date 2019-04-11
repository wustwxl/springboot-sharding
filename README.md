#Springboot + Mybatis + sharding-jdbc 实现分库分表

##简述分库分表模式:
1. client模式
CLIENT模式代表有阿里的TDDL,
开源社区的sharding-jdbc（sharding-jdbc的3.x版本即sharding-sphere已经支持了proxy模式）,
架构见 static/client-arch.png

2. proxy模式
PROXY模式代表有阿里的cobar,
民间组织的MyCAT,
架构见 static/proxy-arch.png


无论是CLIENT模式,还是PROXY模式,
几个核心的步骤是一样的：SQL解析,重写,路由,执行,结果归并;
本文以client模式为例。


参考链接:
https://mp.weixin.qq.com/s/clQrAnxuxX_al7k6TPpgzw

