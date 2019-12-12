SERVER_PATH="/c/Program Files/Apache Software Foundation/Tomcat 9.0"
PROJECT_PATH=/c/Users/emmanuel.kuatsidzo/source/repos/Java/eclipse-workspace/jsp
PROJECT_NAME=JSP_Demos

##copy external lib files 
echo "copying external libs"
cp $PROJECT_PATH/lib/*.jar "$SERVER_PATH/lib/"


##create project directory if it does not exist
if [ ! -d "$SERVER_PATH/webapps/$PROJECT_NAME" ]; then
	echo "creating project directory"
	mkdir "$SERVER_PATH/webapps/$PROJECT_NAME"
	mkdir "$SERVER_PATH/webapps/$PROJECT_NAME/WEB-INF"
fi

##copy web files
echo "copying web files"
cp $PROJECT_PATH/web/*.jsp "$SERVER_PATH/webapps/$PROJECT_NAME/"
cp $PROJECT_PATH/web/*.html "$SERVER_PATH/webapps/$PROJECT_NAME/"

##copy deployment descriptors 
echo "copying deployment descriptors..."
cp $PROJECT_PATH/etc/web.xml "$SERVER_PATH/webapps/$PROJECT_NAME/WEB-INF/"

##compile java files
echo "compiling java files"
javac -classpath "$SERVER_PATH/lib/servlet-api.jar:$SERVER_PATH/lib/javax.json-1.1.4.jar" -d $PROJECT_PATH/classes $PROJECT_PATH/src/com/jsp/**/*.java

##create class packages
echo "removing existing packages"
rm -rf "$SERVER_PATH/webapps/$PROJECT_NAME/WEB-INF/classes"

echo "creating class packages directories..."
mkdir "$SERVER_PATH/webapps/$PROJECT_NAME/WEB-INF/classes"
mkdir "$SERVER_PATH/webapps/$PROJECT_NAME/WEB-INF/classes/com"
mkdir "$SERVER_PATH/webapps/$PROJECT_NAME/WEB-INF/classes/com/jsp"
mkdir "$SERVER_PATH/webapps/$PROJECT_NAME/WEB-INF/classes/com/jsp/model"
mkdir "$SERVER_PATH/webapps/$PROJECT_NAME/WEB-INF/classes/com/jsp/web"

##copy class files
echo "copying class files"
cp $PROJECT_PATH/classes/com/jsp/web/*.class "$SERVER_PATH/webapps/$PROJECT_NAME/WEB-INF/classes/com/jsp/web/"
cp $PROJECT_PATH/classes/com/jsp/model/*.class "$SERVER_PATH/webapps/$PROJECT_NAME/WEB-INF/classes/com/jsp/model/"

##stop and start tomcat service
net stop Tomcat9
net start Tomcat9