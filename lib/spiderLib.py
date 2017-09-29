import urllib
import urllib2
import configuration
class spiderLib():
    """
    thie class used to get files by urllib,urllib2
    """

    def __init__(self):
        """

        """
        pass

    def __del__(self):
        """

        :return:  0
        """
        return 0

    def doSpider(self, url):
        """
        :url: the web url to do spider
        :return: return spider results
        """
        url = "http://" + url
        respose = urllib2.urlopen(url)
        res = respose.read()
        return res

    def doSpiderRequert(self, url):
        """
        do spider with request use https
        :param url:the wob url to do  spider
        :return: return spider results
        """
        url = "https://" + url
        request = urllib2.Request(url)
        response = urllib2.urlopen(url)
        res = response.read()
        return  res

    def doSpiderGet(self, url, args_dict=""):
        """

        :param url:do spider with requet https
        :param args_dict:dict form spider values
        :return:
        """
        url = "https://" + url
        if args_dict != "" :
            requestData = urllib.urlencode(args_dict)
            url = url + "?" + requestData
        request = urllib2.Request(url)
        response = urllib2.urlopen(request)
        return response

