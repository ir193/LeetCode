#!/bin/bash
p="$1"
name=$(basename "$p")
now="`date +%Y-%m-%d\ %H:%M:%S`"
cp -r $1 .

cat > $name/$name.md <<EOL
Title: Leetcode $name solution
Slug: $name
Date: $now
Tags: LeetCode,
Category: LeetCode
Author: ir193


## Leetcode $name solution
EOL



echo "starting on $1"
