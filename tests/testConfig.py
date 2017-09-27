import unittest
from lib import configuration

class MyTestCase(unittest.TestCase):
    def test_something(self):
        cfg  = configuration.configuration()
        res = cfg.getConfig("SPIDER.URL")
        print res
        #self.assertEqual(True, False)


if __name__ == '__main__':
    unittest.main()
