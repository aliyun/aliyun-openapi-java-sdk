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

package com.aliyuncs.appmallsservice;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            endpointMap.put("cn-shenzhen", "appms.aliyuncs.com");
            endpointMap.put("cn-beijing", "appms.aliyuncs.com");
            endpointMap.put("ap-south-1", "appms.aliyuncs.com");
            endpointMap.put("eu-west-1", "appms.aliyuncs.com");
            endpointMap.put("ap-northeast-1", "appms.aliyuncs.com");
            endpointMap.put("me-east-1", "appms.aliyuncs.com");
            endpointMap.put("cn-chengdu", "appms.aliyuncs.com");
            endpointMap.put("cn-qingdao", "appms.aliyuncs.com");
            endpointMap.put("cn-shanghai", "appms.aliyuncs.com");
            endpointMap.put("cn-hongkong", "appms.aliyuncs.com");
            endpointMap.put("ap-southeast-1", "appms.aliyuncs.com");
            endpointMap.put("ap-southeast-2", "appms.aliyuncs.com");
            endpointMap.put("ap-southeast-3", "appms.aliyuncs.com");
            endpointMap.put("eu-central-1", "appms.aliyuncs.com");
            endpointMap.put("cn-huhehaote", "appms.aliyuncs.com");
            endpointMap.put("ap-southeast-5", "appms.aliyuncs.com");
            endpointMap.put("us-east-1", "appms.aliyuncs.com");
            endpointMap.put("cn-zhangjiakou", "appms.aliyuncs.com");
            endpointMap.put("us-west-1", "appms.aliyuncs.com");
            endpointMap.put("cn-hangzhou", "appms.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
