#!/bin/bash

# Verifica se foi informado o nome do projeto
if [ $# -lt 2 ]; then
    echo "Uso: ./novo-projeto.sh <groupId> <artifactId>"
    exit 1
fi

GROUP_ID=$1
ARTIFACT_ID=$2

# Cria o projeto
mvn archetype:generate \
-DgroupId=$GROUP_ID \
-DartifactId=$ARTIFACT_ID \
-DarchetypeArtifactId=maven-archetype-quickstart \
-DarchetypeVersion=1.5 \
-DinteractiveMode=false

# Entra na pasta do projeto
cd $ARTIFACT_ID || exit

# Procura a classe principal
MAIN=$(find src/main/java -name "*.java" \
| sed 's#src/main/java/##' \
| sed 's#/#.#g' \
| sed 's#.java##' \
| head -1)

# Insere o plugin no pom.xml
sed -i "/<\/plugins>/i\\
<plugin>\n\
<groupId>org.codehaus.mojo</groupId>\n\
<artifactId>exec-maven-plugin</artifactId>\n\
<version>3.6.1</version>\n\
<configuration>\n\
<mainClass>$MAIN</mainClass>\n\
</configuration>\n\
</plugin>" pom.xml

echo "Projeto criado."
echo "Classe principal: $MAIN"
