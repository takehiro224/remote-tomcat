FROM tomcat:jdk17

# tomcatのホットリロードを有効化(開発時のみ利用する)
COPY server.xml /usr/local/tomcat/conf/server.xml

# antをインストール
RUN apt-get update && apt-get install -y ant

# Dockerの公式Tomcatイメージではセキュリティ勧告により、Webアプリはwebapps.distに格納されています
RUN rm -r /usr/local/tomcat/webapps
# 既存のWebappsディレクトリは空になっています。ですので、Dockerfileにてそれを削除し、.distを名称変更しています。
RUN mv /usr/local/tomcat/webapps.dist /usr/local/tomcat/webapps

# ローカルのソースコードのマウントするディレクトリを作成
RUN mkdir /usr/local/tomcat/webapps/sample