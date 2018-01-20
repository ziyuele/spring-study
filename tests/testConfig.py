import unittest
from lib import configuration

class MyTestCase(unittest.TestCase):
    def test_get_conf_file(self):
        expect_res = "www.baidu.com"
        cfg = configuration.configuration("./conf/spider.conf")
        res = cfg.getConfig("spider","SPIDER.URL")
        self.assertEqual(res, expect_res,"get config is not rigth test-->TFALL")

    def test_exception_conf(self):
        cfg = configuration.configuration("./conf/spider.conf")
        res = cfg.getConfig("spider", "SPIDER.UPL")
        self.assertEqual(res, None , "result if not expect -->TFAIL")

if __name__ == '__main__':
    unittest.main()


