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

package com.aliyuncs.cusanalytic_sc_online;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "cusanalytic.aliyuncs.com");
            put("cn-beijing", "cusanalytic.aliyuncs.com");
            put("ap-south-1", "cusanalytic.aliyuncs.com");
            put("eu-west-1", "cusanalytic.aliyuncs.com");
            put("ap-northeast-1", "cusanalytic.aliyuncs.com");
            put("cn-shenzhen-finance-1", "cusanalytic.aliyuncs.com");
            put("me-east-1", "cusanalytic.aliyuncs.com");
            put("cn-chengdu", "cusanalytic.aliyuncs.com");
            put("cn-north-2-gov-1", "cusanalytic.aliyuncs.com");
            put("cn-qingdao", "cusanalytic.aliyuncs.com");
            put("cn-shanghai", "cusanalytic.aliyuncs.com");
            put("cn-shanghai-finance-1", "cusanalytic.aliyuncs.com");
            put("cn-hongkong", "cusanalytic.aliyuncs.com");
            put("cn-hangzhou-finance", "cusanalytic.aliyuncs.com");
            put("ap-southeast-1", "cusanalytic.aliyuncs.com");
            put("ap-southeast-2", "cusanalytic.aliyuncs.com");
            put("ap-southeast-3", "cusanalytic.aliyuncs.com");
            put("eu-central-1", "cusanalytic.aliyuncs.com");
            put("cn-huhehaote", "cusanalytic.aliyuncs.com");
            put("ap-southeast-5", "cusanalytic.aliyuncs.com");
            put("us-east-1", "cusanalytic.aliyuncs.com");
            put("cn-zhangjiakou", "cusanalytic.aliyuncs.com");
            put("us-west-1", "cusanalytic.aliyuncs.com");
            put("cn-hangzhou", "cusanalytic.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "central";
}
