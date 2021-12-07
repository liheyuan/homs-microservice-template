#!/bin/bash

if [ x"$#" != x"1" ];then
	echo "Usage $0 <project-name>"
	exit -1
fi

PROJECT_NAME=$1
PROJECT_NAME_CAMEL=$(echo $PROJECT_NAME | gsed -r 's/(^|-)([a-z])/\U\2/g')
PROJECT_P1=$(echo $PROJECT_NAME | awk -F '-' '{print $1}')
PROJECT_P2=$(echo $PROJECT_NAME | awk -F '-' '{print $2}')

rm -rf $PROJECT_NAME
cp -rf homs-template $PROJECT_NAME

# move files
mv $PROJECT_NAME/homs-template-client $PROJECT_NAME/${PROJECT_NAME}-client
mkdir -p $PROJECT_NAME/${PROJECT_NAME}-client/src/main/java/com/coder4/$PROJECT_P1/$PROJECT_P2
mv $PROJECT_NAME/${PROJECT_NAME}-client/src/main/java/com/coder4/homs/template/* $PROJECT_NAME/${PROJECT_NAME}-client/src/main/java/com/coder4/$PROJECT_P1/$PROJECT_P2
rm -rf $PROJECT_NAME/${PROJECT_NAME}-client/src/main/java/com/coder4/homs/template

mv $PROJECT_NAME/homs-template-server $PROJECT_NAME/${PROJECT_NAME}-server
mkdir -p $PROJECT_NAME/${PROJECT_NAME}-server/src/main/java/com/coder4/$PROJECT_P1/$PROJECT_P2
mv $PROJECT_NAME/${PROJECT_NAME}-server/src/main/java/com/coder4/homs/template/* $PROJECT_NAME/${PROJECT_NAME}-server/src/main/java/com/coder4/$PROJECT_P1/$PROJECT_P2
rm -rf $PROJECT_NAME/${PROJECT_NAME}-server/src/main/java/com/coder4/homs/template

find $PROJECT_NAME -type file -exec gsed -i "s/HomsTemplate/$PROJECT_NAME_CAMEL/g" {} +
find $PROJECT_NAME -type file -exec gsed -i "s/homs\.template/$PROJECT_P1\.$PROJECT_P2/g" {} +
find $PROJECT_NAME -type file -exec gsed -i "s/homs-template/$PROJECT_P1-$PROJECT_P2/g" {} +
for file in $(find $PROJECT_NAME -type file);do
	target=$(echo $file|sed -e "s/HomsTemplate/$PROJECT_NAME_CAMEL/g")
	mv $file $target
done
