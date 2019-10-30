/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 */

/*
 * Demonstrates a simple publish to a topic using Greengrass Core Java SDK
 * This lambda function will retrieve underlying platform information and send
 * a hello world message along with the platform information to the topic
 * 'hello/world'. The function will sleep for five seconds, then repeat.
 * Since the function is long-lived it will run forever when deployed to a
 * Greengrass core.
 */

package com.amazonaws.greengrass.examples;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class ShowNumber {
    public String handleRequest(int count, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("received : " + count);
        return String.valueOf(count);
    }
}

