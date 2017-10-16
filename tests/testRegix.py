import unittest
from utils import regix

class MyTestCase(unittest.TestCase):

    def setUp(self):
        self.regix = regix.regix()
    def test_matchStr(self):
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


if __name__ == '__main__':
    unittest.main()
