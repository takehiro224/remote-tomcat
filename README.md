## ベーシックなプロジェクト構成を作成
mkdir jsp && mkdir WEB-INF && mkdir -p WEB-INF/classes && mkdir -p WEB-INF/jsp && mkdir -p WEB-INF/lib && mkdir -p WEB-INF/tags && touch WEB-INF/web.xml

project
project/jsp
project/META-INF
project/servlets
project/WEB-INF
project/WEB-INF/classes/
project/WEB-INF/jsp/
project/WEB-INF/lib/
project/WEB-INF/tags/
project/WEB-INF/web.xml
project/websocket
project/index.html

## Tomcat再起動
cd /usr/local/tomcat/bin && ./shutdown.sh && ./startup.sh