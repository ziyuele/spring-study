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
        if "!--STATUS OK--" in res:
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
        print res

if __name__ == '__main__':
    unittest.main()
