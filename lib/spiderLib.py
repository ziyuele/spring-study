import urllib
import urllib2
import cookielib
from Exceptions import *

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

    def doSpiderGet(self, url, args_dict=None):
        """

        :param url:do spider with requet https
        :param args_dict:dict form spider values
        :return:
        """
        url = "https://" + url
        if args_dict != None :
            requestData = urllib.urlencode(args_dict)
            url = url + "?" + requestData
        request = urllib2.Request(url)
        response = urllib2.urlopen(request)
        return response.read()

    def doSpiderPost(self, url, args_dict=None):
        """
        :param url: the url spider for
        :param args_dict: input post data
        :return: spider results
        """
        url = "https://" + url
        if args_dict != None:
            requestData = urllib.urlencode(args_dict)
            request = urllib2.Request(url,requestData)
            response = urllib2.urlopen(request)
        else:
            request = urllib2.Request(url)
            response = urllib2.urlopen(url)
        return response.read()

    def doSpiderHeaders(self, url, args_dict=None):
        """
        do spider useing setting headers
        :param url: the url spider for
        :param args_dict: args_dict = { "data" : "xxx",
                                        "headers" :{ "User_agent": "xxx"}
                                    }
        :return: query result
        """
        if args_dict is None:
            args_dict = {"values": "", \
                         "headers": ""}
        url = "https://" + url
        data = urllib.urlencode(args_dict["data"])
        headers = args_dict["headers"]
        request = urllib2.Request(url, data, headers)
        response = urllib2.urlopen(request, timeout=100)
        return response.read()

    def doSpiderProxy(self, url, args_dict=None ,proxy_enable=False):
        """
        used to do spider using proxy
        :param url: the url spider for
        :param args_dict: args_dict ={
            "headers":{"User_agent": "",
                       "***": "***"},
            "data":{"***": "***",
                    "***": "***",
                    ......}
            proxySetting : {"***": "*****"}
        }
        :return: spider results
        """
        if args_dict == None:
            return 1
        else:
            try:
                if proxy_enable == True:
                    proxy_header = urllib2.ProxyHandler(args_dict["proxySetting"])
                else:
                    proxy_header = urllib2.ProxyHandler({})

                opener = urllib2.build_opener(proxy_header)
                urllib2.install_opener(opener)
                res = self.doSpiderHeaders(url, args_dict)
                return res
            except Exception, e:
                print "argument error",e
                return -1

    def doSpiderPut(self, url, args_dict=None):
        """
         using to do spider using PUT
         put data with post
        :param url: the web url spider for
        :param args_dict: args_dict = {
                        "data" : {"***":"***"},
                        "headers" : {"***" :"****"}
                 }
        :return: spider results
        """
        # using proto https
        if url == "":
            raise UrlException("the url is not set,check it")
            #return -1
        if args_dict == None:
            return self.doSpider(url)
        url = "https://" + url
        data = urllib.urlencode(args_dict["data"])
        request = urllib2.Request(url, data)
        request.get_method = lambda : 'PUT'
        response = urllib2.urlopen(request)
        return response.read()

    def doSpiderURLError(self, url, args_dict=None):
        """
        using to deal with url Error
        :param url: the web url spider for
        :param args_dict: args_dict = {
                            "data" : {"***" : "***"},
                            "headers" : {"***" : "***"}
                            ......
                            }
        :return: spider results
        """
        if url == "" or url == None:
            raise UrlException("the url is not set,check it")
        else:
            url = "https://" + url
        try:
            if args_dict != None:
                data = urllib.urlencode(args_dict["data"])
                headers = args_dict["headers"]
                request = urllib2.Request(url, data, headers)
            else:
                request = urllib2.Request(url)
            response = urllib2.urlopen(request)
            return response.read()
        except urllib2.HTTPError, e:
            print "spider Error"
            print e.reason
            print e.code

    def doSpiderCookie(self, url, args_dict=None):
        """
        :param url: the url spide for
        :param args_dict:
        :return: the spider results
        """
        if url == "" or url == None:
            raise UrlException("url is not set, check it")
            return -1
        url = "http://" + url
        # save cookie to variable
        cookie = cookielib.CookieJar()
        # save cookie to file
        fileName = "cookies"
        cookie = cookielib.MozillaCookieJar(fileName)
        handers = urllib2.HTTPCookieProcessor(cookie)
        opener = urllib2.build_opener(handers)

        response = opener.open(url)
        #print cookie
        #for item in cookie:
        #   print item.name + ":" + item.value

        cookie.save(ignore_discard=True, ignore_expires=True)
        return fileName

    def doSpiderUseCookie(self, url1, url2, args_dict=None):
        """
        :param url1: the url spider for used to get cookie
        :param url2: the url spider for
        :param args_dict: pass
        :return: spider results
        """
        if url2 == "" or url2 == None:
            raise UrlException("spider url is not set,check it")
            return -1
        url2 = "http://" + url2
        fileName = self.doSpiderCookie(url1)
        # get cookie
        cookie = cookielib.MozillaCookieJar()
        cookie.load(fileName, ignore_discard=True, ignore_expires=True)

        handers = urllib2.HTTPCookieProcessor(cookie)
        #create request
        request = urllib2.Request(url2)
        #load cookie
        opener = urllib2.build_opener(handers)
        response = opener.open(request)
        return response.read()
