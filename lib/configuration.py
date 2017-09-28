import ConfigParser
import os

class configuration():
    """ this class is usered to get config
        files from dict conf
    """
    def __init__(self, path=""):
        """init function"""
        try:
            if path == "":
                path = "conf/spisder.conf"
            self.config = ConfigParser.ConfigParser()
            self.cfg = self.config.readfp(open(path))
        except :
            homepath = os.getcwd()
            print "read file err,check if the file exists path: %s/conf/spider.conf"\
                        % homepath

    def __del__(self):
        """ """

    def getConfig(self, sections,option):
        """
        :param sections:select section from conf
        :param option: select options from conf
        :return:
        """
        elements = self.config.get(sections,option)
        try:
            elements = self.config.get(sections,option)
            return elements
        except:
            return -1
