#!/bin/bash

runId=$1
token=$2

artefactoId="$(
curl -H "Accept: application/vnd.github+json" \
-H "Authorization: token $token" \
https://api.github.com/repos/diego-sh/cicddemojar/actions/runs/$runId/artifacts | jq '.artifacts[] | .id' 2>&1
)"

echo "datos"
echo $artefactoId

curl -L -O \
            -H "Accept: application/vnd.github+json" \
            -H "Authorization: Bearer $token" \
            -H "X-GitHub-Api-Version: 2022-11-28" \
            https://api.github.com/repos/diego-sh/cicddemojar/actions/artifacts/$artefactoId/zip

if [ ! -f "zip" ];
then
 echo "no existe archivo"
else
 unzip zip
fi