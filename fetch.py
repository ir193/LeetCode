#!/bin/python

#import json
import requests
import os
#import re

r = requests.get("https://leetcode.com/api/problems/algorithms/")
r = r.json()
for q in r['stat_status_pairs']:
    title = q['stat']['question__title_slug']
    id = q['stat']['question_id']
    dir = 'TODO/' + str(id) + '-' + title
    if(not os.path.exists(dir)):
        os.mkdir(dir)
    open(dir + '/Solution.java', 'w')
    #url = "https://leetcode.com/problems/"+title
    #content = requests.get(url).content
    #re.findall("'value': 'java'")
