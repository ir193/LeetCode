#!/bin/python

#import json
import requests
import os
#import re

r = requests.get("https://leetcode.com/api/problems/algorithms/")
r = r.json()
for q in r['stat_status_pairs']:
    title = q['stat']['question__title_slug']
    if(not os.path.exists('TODO/' + title)): os.mkdir('TODO/' + title)
    open('TODO/' + title + '/Solution.java', 'w')
    #url = "https://leetcode.com/problems/"+title
    #content = requests.get(url).content
    #re.findall("'value': 'java'")
