#! /bin/env bash

aws elasticbeanstalk create-application-version --application-name SpringBoot \
    --version-label SpringBootApp-v3.$TRAVIS_BUILD_NUMBER \
    --source-bundle S3Bucket="aws.ravikp.springboot",S3Key="distributions/SpringBootApp.zip"

