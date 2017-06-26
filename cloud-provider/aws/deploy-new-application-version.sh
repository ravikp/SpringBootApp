#! /bin/env bash

aws elasticbeanstalk update-environment --application-name SpringBoot \
    --environment-name springboot-env --version-label SpringBootApp-v3.$TRAVIS_BUILD_NUMBER
