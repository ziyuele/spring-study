__author__ = 'kangjian'
# -*- coding:utf-8 -*-

import re

class regix():
    """
    this moudle is used to regix for spider results
    """
    def __init__(self):
        """init function"""
        pass
    def __del__(self):
        """del function"""
        pass

    def matchStr(self, str, ruleStr):
        """
        this function used to regix str use match
        :param str: the dest str
        :param ruleStr:regix rule
        :return: regix results
        """
        pattern = re.compile(r''+ruleStr)
        # if not regix res=None
        res = re.match(pattern, str)
        if res:
            return res.group()
        else:
            return -1

    def searchStr(self, str, ruleStr):
        """
        this function used to regix use search
        :param str: the dest str
        :param ruleStr: regix rule
        :return: regix results
        """
        partten = re.compile(r''+ruleStr)
        res = re.search(partten, str)
        if res:
            return res.group()
        else:
            return -1

    def splitStr(self, str, ruleStr):
        """
        this functon used to regix use split
        :param str: the dest str
        :param ruleStr: regix rule
        :return: regix results
        """
        pattern = re.compile(r''+ ruleStr)
        res = re.split(pattern, str)
        if res:
            return res
        else:
            return -1

    def findallStr(self, str,rultStr):
        """
        this function used to regix use finndall
        :param str: the dest str
        :param rultStr: regix rule
        :return: regix results
        """
        pattern = re.compile(r''+ rultStr)
        res = re.findall(pattern, str)
        if res:
            return res
        else:
            return  -1

