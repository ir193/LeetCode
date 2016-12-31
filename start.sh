#!/bin/bash
p="$1"
name=$(basename "$p")
now="`date +%Y-%m-%d\ %H:%M:%S`"
mkdir -p $2
cp -r $1 $2
cat $1/Solution.java >> $2/README.md
sed -i 's/\\\\/- \[ \]/g' $2/README.md
echo "Starting fishing on $1"
