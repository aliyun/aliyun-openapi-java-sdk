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

package com.aliyuncs.metering;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "pai.cn-shenzhen.aliyuncs.com");
            put("cn-beijing", "pai.cn-beijing.aliyuncs.com");
            put("ap-south-1", "pai.ap-south-1.aliyuncs.com");
            put("me-east-1", "pai.me-east-1.aliyuncs.com");
            put("cn-shanghai", "pai.cn-shanghai.aliyuncs.com");
            put("cn-hongkong", "pai.cn-hongkong.aliyuncs.com");
            put("ap-southeast-1", "pai.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-2", "pai.ap-southeast-2.aliyuncs.com");
            put("ap-southeast-3", "pai.ap-southeast-3.aliyuncs.com");
            put("eu-central-1", "pai.eu-central-1.aliyuncs.com");
            put("ap-southeast-5", "pai.ap-southeast-5.aliyuncs.com");
            put("us-east-1", "pai.us-east-1.aliyuncs.com");
            put("us-west-1", "pai.us-west-1.aliyuncs.com");
            put("cn-hangzhou", "pai.cn-hangzhou.data.aliyun.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
