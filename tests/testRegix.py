import unittest
from utils import regix

class MyTestCase(unittest.TestCase):

    def setUp(self):
        """setUp"""
        self.regix = regix.regix()

    def tearDown(self):
        """tearDown"""
    def test_matchStr(self):
        """
        this function use to test function matchStar
        """
        regixStr = "hello"
        str = "hello word"
        res = self.regix.matchStr(str, regixStr)
        self.assertEqual(res, "hello", "get regix res not right:%s\
                                expect:%s" % (str, res))
        str1 = "asdfa"
        res = self.regix.matchStr(str1, regixStr)
        print res
        self.assertEqual(res, -1, "get regix res not right:%s\
                                expect:%d" % (str, res))

    def test_searchStr(self):
        """
        this fuctin use to test function searchStr
        """
        regixStr = "hello"
        str = "hello word,hellooo"
        res = self.regix.searchStr(str, regixStr)
        self.assertEqual(res, "hello", "get regix res not right:%s\
                                expect:%s" % (str, res))
        str1 = "asdfa"
        res = self.regix.searchStr(str1, regixStr)
        print res
        self.assertEqual(res, -1, "get regix res not right:%s\
                               expect:%d" % (str, res))

    def test_splitStr(self):
        """
        this function use to test function splitStr
        """
        regixStr = "\d+"
        str = "kangjian001jiangxiangni2kangjian"
        res = self.regix.splitStr(str, regixStr)
        expect = ["kangjian","jiangxiangni","kangjian"]
        self.assertEqual(len(res),len(expect),
            "get reuslt err")
        for enu in range(len(res)):
            print enu
            self.assertEqual(res[enu],expect[enu], \
                    "get result err" + res[enu] + "expect:" + expect[enu])


if __name__ == '__main__':
    unittest.main()
