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

    def matchStr(self, str, ruleStr):
        """
        this function used to regix str use match
        :param str: the dest str
        :param ruleStr:regix ful
        :return: regix results
        """
        pattern = re.compile(r''+ruleStr)
        res = re.match(pattern, str)
        if res:
            return res.group()
        else:
            return -1
