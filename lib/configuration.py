import ConfigParser
import os

class configuration():
    """ this class is usered to get config
        files from dict conf
    """
    def __init__(self, path=""):
        """init function"""
	homepath = os.getcwd()
        try:
            if path == "":
                path = homepath + "/conf/spisder.conf"
            self.config = ConfigParser.ConfigParser()
            self.cfg = self.config.readfp(open(path))
        except Exception as e:
	    print e.message
            #print "read file err,check if the file exists path: %s"\
            #            % ( path )

    def __del__(self):
        """ """

    def getConfig(self, sections,option):
        """
        :param sections:select section from conf
        :param option: select options from conf
        :return:
        """
        try:
            elements = self.config.get(sections,option)
            return elements
        except:
            return None
