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

package com.aliyuncs.webplus;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            endpointMap.put("cn-shenzhen", "webplus.cn-hangzhou.aliyuncs.com");
            endpointMap.put("cn-beijing", "webplus.cn-hangzhou.aliyuncs.com");
            endpointMap.put("ap-south-1", "webplus.aliyuncs.com");
            endpointMap.put("eu-west-1", "webplus.aliyuncs.com");
            endpointMap.put("ap-northeast-1", "webplus.aliyuncs.com");
            endpointMap.put("me-east-1", "webplus.aliyuncs.com");
            endpointMap.put("cn-chengdu", "webplus.aliyuncs.com");
            endpointMap.put("cn-qingdao", "webplus.aliyuncs.com");
            endpointMap.put("cn-shanghai", "webplus.cn-hangzhou.aliyuncs.com");
            endpointMap.put("cn-hongkong", "webplus.aliyuncs.com");
            endpointMap.put("ap-southeast-1", "webplus.aliyuncs.com");
            endpointMap.put("ap-southeast-2", "webplus.aliyuncs.com");
            endpointMap.put("ap-southeast-3", "webplus.aliyuncs.com");
            endpointMap.put("eu-central-1", "webplus.aliyuncs.com");
            endpointMap.put("cn-huhehaote", "webplus.aliyuncs.com");
            endpointMap.put("ap-southeast-5", "webplus.aliyuncs.com");
            endpointMap.put("us-east-1", "webplus.aliyuncs.com");
            endpointMap.put("cn-zhangjiakou", "webplus.cn-hangzhou.aliyuncs.com");
            endpointMap.put("us-west-1", "webplus.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
