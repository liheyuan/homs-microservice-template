#!/bin/sh

DIR=`cd \`dirname ${BASH_SOURCE[0]}\`/.. && pwd`

protoc HomsTemplate.proto --java_out=${DIR}/homs-template-client/src/main/java --proto_path=${DIR}/homs-template-client/src/main/java/com/coder4/homs/template/
protoc HomsTemplate.proto --plugin=protoc-gen-grpc-java=`which protoc-gen-grpc-java` --grpc-java_out=${DIR}/homs-template-client/src/main/java --proto_path=${DIR}/homs-template-client/src/main/java/com/coder4/homs/template/
