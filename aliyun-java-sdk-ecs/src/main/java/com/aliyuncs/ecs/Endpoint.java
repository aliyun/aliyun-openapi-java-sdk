/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ecs;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "ecs-cn-hangzhou.aliyuncs.com");
            put("cn-beijing", "ecs-cn-hangzhou.aliyuncs.com");
            put("cn-shenzhen-finance-1", "ecs-cn-hangzhou.aliyuncs.com");
            put("cn-north-2-gov-1", "ecs.aliyuncs.com");
            put("cn-qingdao", "ecs-cn-hangzhou.aliyuncs.com");
            put("cn-shanghai", "ecs-cn-hangzhou.aliyuncs.com");
            put("cn-shanghai-finance-1", "ecs-cn-hangzhou.aliyuncs.com");
            put("cn-hongkong", "ecs-cn-hangzhou.aliyuncs.com");
            put("cn-hangzhou-finance", "ecs.aliyuncs.com");
            put("ap-southeast-1", "ecs-cn-hangzhou.aliyuncs.com");
            put("us-east-1", "ecs-cn-hangzhou.aliyuncs.com");
            put("us-west-1", "ecs-cn-hangzhou.aliyuncs.com");
            put("cn-hangzhou", "ecs-cn-hangzhou.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
