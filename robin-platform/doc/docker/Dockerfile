FROM openjdk:17-jdk-slim
# author
MAINTAINER kld

# 挂载目录
VOLUME /home/robin-platform
# 创建目录
RUN mkdir -p /home/robin-platform

# 指定路径
WORKDIR /home/robin-platform
# 复制jar文件到路径
COPY ./target/robin-platform.jar /home/robin-platform/robin-platform.jar
# 启动网关服务
ENTRYPOINT ["java","-jar","robin-platform.jar"]