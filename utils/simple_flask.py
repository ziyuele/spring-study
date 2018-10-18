#!/usr/bin/env python
# -*- coding: utf-8 -*-
# 2018/10/18 下午1:55
# Author : kangjian (kangjian03@baidu.com)
# simple_flask.py

from flask import Flask

app = Flask(__name__)

@app.route("/")
def index_page():
    """
    :return:
    """
    return "<h1>Flask Test Demo</h1>"



if __name__ == '__main__':
    """
    this is a simple flask demno
    """
    app.run("0.0.0.0", 8888)

