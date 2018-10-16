#!/usr/bin/env python
# -*- coding: utf-8 -*-
# 2018/10/16 上午11:26
# Author : kangjian (kangjian03@baidu.com)
# encode_change.py

# !/usr/bin/env python
# -*- coding: utf-8 -*-
# 2018/10/16 上午10:44
# Author : kangjian (kangjian03@baidu.com)
# text_encoders.py

import sys

def usage():
    """

    :return:
    """
    print \
        """
    usage:
        python text_encoders.py <sourceEncodertype> <destEncoderType> <encoderfile>

        (if source and dest encode is not set default is <source gbk> <dest utf-8>)
        """


def do_encode(file, souece="gbk", sink="utf-8"):
    """

    :param souece:
    :param sink:
    :param file:
    :return:
    """
    sf = open(file)
    f = sf.read()
    a = f.decode(souece)
    b = a.encode(sink)
    ff = open(file, "w")
    ff.write(b)
    ff.close()


if __name__ == "__main__":
    """
    encoders 
    """

    if len(sys.argv) < 2 or len(sys.argv > 4):
        usage()
        exit(-1)

    if len(sys.argv) == 2:
        do_encode(sys.argv[1])

    if len(sys.argv) == 3:
        destEncode = str(sys.argv[1]).lower()
        do_encode(sys.argv[2], destEncode)

    if len(sys.argv) == 4:
        destEncode = str(sys.argv[1]).lower()
        souceEncode = str(sys.argv[2]).lower()
        do_encode(sys.argv[3], souceEncode, destEncode)
