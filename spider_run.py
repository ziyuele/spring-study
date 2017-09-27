from lib import configuration

if __name__ == "__main__":
    """ """
    cfg  = configuration.configuration()
    res = cfg.getConfig("spider","SPIDER.URL")
    print res
