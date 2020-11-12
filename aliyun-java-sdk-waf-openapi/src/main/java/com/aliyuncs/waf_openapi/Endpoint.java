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

package com.aliyuncs.waf_openapi;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "wafopenapi.cn-hangzhou.aliyuncs.com");
            put("cn-beijing", "wafopenapi.cn-hangzhou.aliyuncs.com");
            put("cn-wulanchabu", "wafopenapi.cn-hangzhou.aliyuncs.com");
            put("ap-south-1", "wafopenapi.ap-southeast-1.aliyuncs.com");
            put("eu-west-1", "wafopenapi.ap-southeast-1.aliyuncs.com");
            put("cn-shenzhen-finance-1", "wafopenapi.cn-hangzhou.aliyuncs.com");
            put("me-east-1", "wafopenapi.ap-southeast-1.aliyuncs.com");
            put("cn-chengdu", "wafopenapi.cn-hangzhou.aliyuncs.com");
            put("cn-north-2-gov-1", "wafopenapi.cn-hangzhou.aliyuncs.com");
            put("cn-qingdao", "wafopenapi.cn-hangzhou.aliyuncs.com");
            put("cn-shanghai", "wafopenapi.cn-hangzhou.aliyuncs.com");
            put("cn-shanghai-finance-1", "wafopenapi.cn-hangzhou.aliyuncs.com");
            put("cn-hongkong", "wafopenapi.ap-southeast-1.aliyuncs.com");
            put("cn-heyuan", "wafopenapi.cn-hangzhou.aliyuncs.com");
            put("ap-southeast-1", "wafopenapi.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-2", "wafopenapi.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-3", "wafopenapi.ap-southeast-1.aliyuncs.com");
            put("eu-central-1", "wafopenapi.ap-southeast-1.aliyuncs.com");
            put("cn-huhehaote", "wafopenapi.cn-hangzhou.aliyuncs.com");
            put("ap-southeast-5", "wafopenapi.ap-southeast-1.aliyuncs.com");
            put("us-east-1", "wafopenapi.ap-southeast-1.aliyuncs.com");
            put("cn-zhangjiakou", "wafopenapi.cn-hangzhou.aliyuncs.com");
            put("us-west-1", "wafopenapi.ap-southeast-1.aliyuncs.com");
            put("cn-hangzhou", "wafopenapi.cn-hangzhou.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
