FROM tomcat:jdk17

# antをインストール
RUN apt-get update && apt-get install -y ant

# ローカルのソースコードのマウントするディレクトリを作成
RUN mkdir /usr/local/tomcat/webapps/sample