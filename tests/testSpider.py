import unittest
from lib import spiderLib


class MyTestCase(unittest.TestCase):


    def setUp(self):
        """
        set up for unitest
        """
        self.spider = spiderLib.spiderLib()
        pass

    def tearDown(self):
        """
        :return:
        """
        pass

    def test_doSpider(self):
        """
        this UT is used to test function dispider
        :return: null
        """
        url = "www.baidu.com"
        res = self.spider.doSpider(url)
        if "!--STATUS OK--" in res:
            flag = True
        else:
            flag = False
        self.assertEqual(flag, True, "do spider test fail")

    def test_doSpiderRequert(self):
        """
        this UT is used to test function dosSpiderRequest
        :return:null
        """
        url = "www.baidu.com"
        res = self.spider.doSpider(url)
        if "html" in res:
            flag = True
        else:
            flag = False
        self.assertEqual(flag, True, "do spider test fail")

    def test_doSpiderGet(self):
        """
        this UT used to test GET method for spider
        :return:
        """
        url = "passport.csdn.net/account/login"
        args_dict = {
            "userName":"2429362606@qq.com",
             "password" : "******"
        }
        res = self.spider.doSpiderGet(url, args_dict)
        if "html" in res:
            flag = True
        else:
            flag = False
        self.assertEqual(flag, True, "do spider test fail")
        res = self.spider.doSpiderGet(url)
        if "html" in res:
            flag = True
        else:
            flag = False
        self.assertEqual(flag, True, "do spider tet fail")

    def test_doSpiderPost(self):
        """
        this UT used to test POST method for sipder
        :return:
        """
        url = "passport.csdn.net/account/login"
        args_dict = {
            "userName":"2429362606@qq.com",
             "password" : "******"
        }
        res = self.spider.doSpiderPost(url, args_dict)
        if "html" in res:
            flag = True
        else:
            flag = False
        self.assertEqual(flag, True, "do spider tet fail")
        res = self.spider.doSpiderPost(url)
        if "html" in res:
            flag = True
        else:
            flag = False
        self.assertEqual(flag, True, "do spider tet fail")

    def test_doSpiderHeaders(self):
        """
        this UT used to test function doSpiderHeaders
        """
        url = "passport.csdn.net/account/login"
        args_dict = {
            "data":{
            "userName":"2429362606@qq.com",
             "password" : "******"},
            "headers":{ "User-agent":"Mozilla/4.0 (compatible; MSIE 5.5; Windows NT)"}
        }
        res = self.spider.doSpiderHeaders(url, args_dict)
        if "html" in res:
            flag = True
        else:
            flag = False
        self.assertEqual(flag, True, "do spider tet fail")

    def test_doSpiderProxy(self):
        """
        this UT used to test function doSpiderProxy
        """
        url = "passport.csdn.net/account/login"
        args_dict = {"headers":{},
                     "data":{},
                     "proxySetting":""}
        res = self.spider.doSpiderProxy(url, args_dict)
        print res



if __name__ == '__main__':
    print unittest.main()
