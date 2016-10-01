#!/bin/bash
for i in `find . -type f -name "*.md"`
do
  cp -p $i /home/yhy/blog/content/leetcode
done


