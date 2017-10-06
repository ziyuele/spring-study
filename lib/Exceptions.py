
class SpiderException(Exception):
    pass

class UrlException(SpiderException):

    def __init__(self, message, status_code=None, payload=None):
        Exception.__init__(self)
        self.status_code = 400
        if status_code != None:
            self.status_code = status_code
        self.payload = payload
        self.message = message

class ArgumentException():

    def __init__(self, message, status_code=None, payload=None):
        Exception.__init__(self)
        self.status_code = 400
        if status_code != None:
            self.status_code = status_code
        self.payload = payload

