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

package com.aliyuncs.green;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("ap-south-1", "green.ap-southeast-1.aliyuncs.com");
            put("eu-west-1", "green.ap-southeast-1.aliyuncs.com");
            put("ap-northeast-1", "green.ap-southeast-1.aliyuncs.com");
            put("cn-shenzhen-finance-1", "green.aliyuncs.com");
            put("me-east-1", "green.ap-southeast-1.aliyuncs.com");
            put("cn-chengdu", "green.aliyuncs.com");
            put("cn-north-2-gov-1", "green.aliyuncs.com");
            put("cn-qingdao", "green.aliyuncs.com");
            put("cn-shanghai-finance-1", "green.aliyuncs.com");
            put("cn-hongkong", "green.aliyuncs.com");
            put("cn-hangzhou-finance", "green.aliyuncs.com");
            put("ap-southeast-2", "green.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-3", "green.ap-southeast-1.aliyuncs.com");
            put("eu-central-1", "green.ap-southeast-1.aliyuncs.com");
            put("cn-huhehaote", "green.aliyuncs.com");
            put("ap-southeast-5", "green.ap-southeast-1.aliyuncs.com");
            put("us-east-1", "green.ap-southeast-1.aliyuncs.com");
            put("cn-zhangjiakou", "green.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
