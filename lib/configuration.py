import ConfigParser
import os

class configuration():
    """ this class is usered to get config
        files from dict conf
    """
    def __init__(self):
        """init function"""
        path = "conf/spider.conf"
        self.config = ConfigParser.ConfigParser()
        self.cfg = self.config.readfp(open(path))

    def __del__(self):
        """ """

    def getConfig(self, sections,option):
        """
        :param sections:select section from conf
        :param option: select options from conf
        :return:
        """
        elements = self.config.get(sections,option)
        return elements
