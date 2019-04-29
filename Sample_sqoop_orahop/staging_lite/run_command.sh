#!/usr/bin/env bash
echo " bash -f <<PASSWORDFILE>> <<EXECUTIONFILE>> "
PASSWORDFILE=$(pwd)/$1
EXECUTIONFILE=$(pwd)/$2
echo " |||| ----- EXECUTION PRINTED WITH CONNECTION SCTRING ----- |||| "
while IFS='' read -r line || [[ -n "$line" ]]; do
    LOCAL_PASSWORD="$line"
    bash -f $EXECUTIONFILE $LOCAL_PASSWORD
done < "$PASSWORDFILE"
